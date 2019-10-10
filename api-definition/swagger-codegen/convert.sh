#!/usr/bin/env bash

ARTIFACT_URI="io.swagger:swagger-codegen-cli:2.2.2"
SWAGGER_FILE="swagger-codegen-cli.jar"
API_V3_FILE=../api.yaml
API_V2_FILE=../api.v2.yaml
LANG="scalatra"
FOLDER="out/$LANG"
DIR=$(pwd)

echo "Cleaning up"
rm -rf "out" "models"

if [ ! -f "$SWAGGER_FILE" ]; then
  echo "Downloading swagger-codegen"
  mvn dependency:copy -Dartifact=$ARTIFACT_URI -DoutputDirectory=. -Dmdep.stripVersion=true
fi

echo "Converting from OpenAPI 3.0 to Swagger 2.0"
api-spec-converter \
  --from openapi_3 \
  --to swagger_2 \
  --syntax yaml $API_V3_FILE >$API_V2_FILE

echo -e "\n\n"

echo "Showing swagger-codegen language options"
java -jar $SWAGGER_FILE config-help \
  -l $LANG

echo "Generate scala case classes from api"
java -jar $SWAGGER_FILE generate \
  -i "$API_V2_FILE" \
  -l $LANG \
  -c $LANG-config.json \
  -o $FOLDER

mkdir models
(
  cd $FOLDER/src/main/scala || exit
  cp --parents -r de/patagona/scheduler/generated/model/ $DIR/models
)
