```shell script
sbt compile
```

## Converts
- RAML :arrow_right: TypeScript
    - no framework
- RAML :arrow_right: Scala
    - no framework
    - final classes?

## Problems
- Hierarchies are not exported correctly
    - Because? https://github.com/atomicbits/scraml-test-scala/issues/5

## Generic typing in json-schema and RAML 1.0
>
> Officially, there is no generic typing possible neither in json-schema, nor in RAML 1.0! Scraml, however supports a way around using language extensions that should not break the existing specs.

[Source](https://github.com/atomicbits/scraml/blob/develop/documentation/scaladocumentation.adoc#generic-typing-in-json-schema-and-raml-10)