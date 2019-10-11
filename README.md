# API Documentation: Evaluation

This repository contains different libraries to convert from/to OpenAPI and RAML.

See READMEs in the different subfolders.

The used API spec resides in [`api-definition`](api-definition/README.md).

## ToDo

[Argus](https://github.com/aishfenton/Argus)

[openapi3](https://github.com/Dorthu/openapi3)

## Ideas
- Convert from
    - OpenAPI :arrow_right: TypeScript/Scala
    - Scala :arrow_right: OpenAPI :arrow_right: TypeScript
    - Custom DSL :arrow_right: TypeScript/Scala

    
## Notes
- JSON Schema
    - > It is important to note that the schemas listed in an allOf, anyOf or oneOf array know nothing of one another. While it might be surprising, allOf can not be used to “extend” a schema to add more details to it in the sense of object-oriented inheritance.
    
        - Source: https://json-schema.org/understanding-json-schema/reference/combining.html#allof
        - ... but is used throughout libraries as extensions
        - ... and https://swagger.io/docs/specification/data-models/inheritance-and-polymorphism/