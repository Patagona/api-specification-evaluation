## Instructions
```shell script
sbt compile
```

## Converts
- RAML :arrow_right: TypeScript
    - no framework
- RAML :arrow_right: Scala
    - scala-play
    - Uses traits
    - creates client
    - Dependencies!
        - `"com.ning" % "async-http-client" % "1.9.40"`
        - `"com.typesafe.play" %% "play-json" % "2.5.14"`

## Problems
- Hierarchies are not exported correctly
    - Because? https://github.com/atomicbits/scraml-test-scala/issues/5
- Uses play! json a lot

## Generic typing in json-schema and RAML 1.0
>
> Officially, there is no generic typing possible neither in json-schema, nor in RAML 1.0! Scraml, however supports a way around using language extensions that should not break the existing specs.

[Source](https://github.com/atomicbits/scraml/blob/develop/documentation/scaladocumentation.adoc#generic-typing-in-json-schema-and-raml-10)

## Notes
- The RAML file needs to be in the `src/main/resources` folder and can NOT be placed outside the project.
     - (soft) symlinks are working
     
## Example
```scala
package de.patagona.schema

import play.api.libs.json._
import de.patagona.scheduler.dsl.scalaplay.json.TypedJson._

case class ShopIntegrationStartShopSyncJob(action: String, component: String) extends BaseJob

object ShopIntegrationStartShopSyncJob {

  val jsonFormatter: Format[ShopIntegrationStartShopSyncJob] = Json.format[ShopIntegrationStartShopSyncJob]

  implicit val jsonFormat: Format[ShopIntegrationStartShopSyncJob] =
    TypeHintFormat(
      "type",
      ShopIntegrationStartShopSyncJob.jsonFormatter.withTypeHint("ShopIntegrationStartShopSyncJob"))

}
```


```typescript
export interface BaseJob  {
  "action": string,
  "component": string
}
       

export interface BaseJob  {
  "action": string,
  "component": string,
  "type": "BaseJob" | "ShopIntegrationStartShopSyncJob" | "ShopIntegrationUpdateProductsJob",
}
       

export interface Execution  {
  "node_name": string,
  "success": boolean,
  "finished_at": string,
  "job_name": string,
  "started_at": string,
  "output": string
}
       

export interface ShopIntegrationStartShopSyncJob extends BaseJob {
  "type": "ShopIntegrationStartShopSyncJob",
}
       

export interface ShopIntegrationUpdateProductsJob extends BaseJob {
  "type": "ShopIntegrationUpdateProductsJob",
}
```