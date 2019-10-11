# [scala-jsonschema](https://github.com/andyglow/scala-jsonschema)

```shell script
sbt run
```


## Converts
- Scala :arrow_right: JSON Schema
    - Classes to be converted must be defined manually
```scala
import json._
import json.schema.Version.Draft04
implicit val shopIntegrationStartSyncShopJob: Schema[Job.ShopIntegrationStartSyncShopJob] = Json.schema[Job.ShopIntegrationStartSyncShopJob]

println(JsonFormatter
  .format(
    AsValue.schema(shopIntegrationStartSyncShopJob, Draft04())
  )
)
```

## Problems
- does not create hierarchies
    - should work in principle?
        - https://github.com/andyglow/scala-jsonschema#definitionsreferences

## Example
```json
{
  "$schema": "http://json-schema.org/draft-04/schema#",
  "description": "ShopIntegrationStartSyncShopJob2",
  "type": "object",
  "additionalProperties": false,
  "properties": {
    "retries": {
      "type": "integer"
    },
    "uuid": {
      "type": "string"
    },
    "debugValue": {
      "type": "string"
    },
    "jobType": {
      "type": "string"
    },
    "schedule": {
      "type": "string"
    },
    "component": {
      "type": "string"
    },
    "action": {
      "type": "string"
    }
  },
  "required": [
    "action",
    "component",
    "debugValue",
    "schedule",
    "jobType"
  ]
}
```