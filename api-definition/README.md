# API Documentation
## Display
- https://github.com/mulesoft/api-console
    - build times...
- https://github.com/nidi3/raml-doc
    - hierarchy is not shown
    - oneOf hierarchies are lost

## Specifications

### JSON Schema 
https://json-schema.org/

- Used to define JSON formats
- Type hiearchies through
    - allOf
- inheritance
    - oneOf
    - union types

```json
{
  "id": "http://atomicbits.io/schema/BaseJob.json",
  "type": "object",
  "properties": {
    "action": {
      "type": "string"
    },
    "component": {
      "type": "string"
    }
  },
  "required": [
    "action",
    "component"
  ]
}
```

### OpenAPI
- Specification: https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.2.md
- Uses JSON schema
- Used to define an API specification
- Can be written in YAML and JSON
- Good resource: https://openapi.tools/
- Converters
    - openapi-generator
    - https://openapi-generator.tech/
    - Based on Java
    - Converts to
    - Scala
    - scala-finch
    - scala-lagom-server
    - scala-play-server
    - scalatra
    - TypeScript
    - typescript-angularjs
    - …
- PROBLEMS
    - does not handle allOf/oneOf right
    - type hierarchies are not reflected through extends/implements…

### RAML

- Specification: https://github.com/raml-org/raml-spec/blob/master/versions/raml-10/raml-10.md
- Uses JSON schema (and types defined “inline”)
- Can be written in YAML and JSON
