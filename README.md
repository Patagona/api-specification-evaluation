[OpenAPI converters](https://openapi.tools/#converters)


## ToDo

[Argus](https://github.com/aishfenton/Argus)

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