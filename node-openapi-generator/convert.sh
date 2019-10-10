#!/usr/bin/env bash

set -e

FILE="../api-definition/openapi/api.yaml"

rm -rf generated

npx \
  openapi-generator \
  generate \
  --input-spec "$FILE" \
  --generator-name typescript-angularjs \
  --output generated/typescript-angularjs \
  --additional-properties=supportsES6=true

npx \
  openapi-generator \
  generate \
  --input-spec "$FILE" \
  --generator-name scalatra \
  --output generated/scalatra \
  --additional-properties=apiPackage=de.patagona.scheduler.api,modelPackage=de.patagona.scheduler.model,skipStubs=true,useSwaggerUI=false
