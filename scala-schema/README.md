# [scala-schema](https://github.com/Opetushallitus/scala-schema)

[Main code](src/main/scala/Main.scala)

```shell script
sbt run
```


## Converts
- Scala :arrow_right: JSON schema

## Example
```json
{
  "type" : "object",
  "properties" : {
    "cat" : {
      "$ref" : "#/definitions/cat"
    },
    "dog" : {
      "$ref" : "#/definitions/dog"
    }
  },
  "id" : "#container",
  "additionalProperties" : false,
  "title" : "Container",
  "required" : [ "cat", "dog" ],
  "definitions" : {
    "cat" : {
      "type" : "object",
      "properties" : {
        "name" : {
          "type" : "string",
          "minLength" : 1
        },
        "isNice" : {
          "type" : "boolean",
          "description" : "The cat name"
        }
      },
      "id" : "#cat",
      "additionalProperties" : false,
      "title" : "Cat",
      "required" : [ "name", "isNice" ]
    },
    "dog" : {
      "type" : "object",
      "properties" : {
        "name" : {
          "type" : "string",
          "minLength" : 1
        },
        "breed" : {
          "type" : "string",
          "minLength" : 1,
          "description" : "The dog name"
        }
      },
      "id" : "#dog",
      "additionalProperties" : false,
      "title" : "Dog",
      "required" : [ "name", "breed" ]
    }
  }
}

```
