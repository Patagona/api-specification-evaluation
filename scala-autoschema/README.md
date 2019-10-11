# [autoschema](https://github.com/coursera/autoschema)
```shell script
sbt run
```

## Converts
- Scala :arrow_right: JSON Schema

## Problems
- No hierarchy
- Classes to be converted must by defined in code
    - ```scala
        AutoSchema.createSchema[Job]
      ```

## Example

```json
{
   "title":"Job",
   "type":"object",
   "required":[
      "abc",
      "schedule",
      "jobType",
      "component",
      "action"
   ],
   "properties":{
      "abc":{
         "type":"string"
      },
      "action":{
         "type":"string"
      },
      "component":{
         "type":"string"
      },
      "jobType":{
         "type":"string"
      },
      "retries":{
         "type":"number",
         "format":"number"
      },
      "schedule":{
         "type":"string"
      },
      "uuid":{
         "type":"string"
      }
   }
}
```