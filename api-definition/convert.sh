#!/usr/bin/env bash

rm -rf generated

npx \
  openapi-generator \
  generate \
  --input-spec api.yaml \
  --generator-name typescript-angularjs \
  --output generated/typescript-angularjs \
  --additional-properties=supportsES6=true

npx \
  openapi-generator \
  generate \
  --input-spec api.yaml \
  --generator-name scalatra \
  --output generated/scalatra \
  --additional-properties=apiPackage=de.patagona.scheduler.api,modelPackage=de.patagona.scheduler.model,skipStubs=true,useSwaggerUI=false
