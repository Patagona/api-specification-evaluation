# [sbt-contraband](https://github.com/sbt/contraband)

```shell script
sbt generateContrabands generateJsonCodecs
```


## Converts
- Contraband DSL :arrow_right: TypeScript
    - no framework
- Contraband DSL :arrow_right: Scala

## Problems
- DSL to define types
    - https://www.scala-sbt.org/contraband/code-generation.html
    - https://www.scala-sbt.org/contraband/schema.html
- Creates `final class`

## Example

```scala
package com.example
final class ShopIntegrationStartSyncJob private (
  name: String,
  val data: Option[Int]) extends com.example.Job(name) with Serializable {
  
  override def equals(o: Any): Boolean = o match {
    case x: ShopIntegrationStartSyncJob => (this.name == x.name) && (this.data == x.data)
    case _ => false
  }
  override def hashCode: Int = {
    37 * (37 * (37 * (17 + "com.example.ShopIntegrationStartSyncJob".##) + name.##) + data.##)
  }
  override def toString: String = {
    "ShopIntegrationStartSyncJob(" + name + ", " + data + ")"
  }
  private[this] def copy(name: String = name, data: Option[Int] = data): ShopIntegrationStartSyncJob = {
    new ShopIntegrationStartSyncJob(name, data)
  }
  def withName(name: String): ShopIntegrationStartSyncJob = {
    copy(name = name)
  }
  def withData(data: Option[Int]): ShopIntegrationStartSyncJob = {
    copy(data = data)
  }
  def withData(data: Int): ShopIntegrationStartSyncJob = {
    copy(data = Option(data))
  }
}
object ShopIntegrationStartSyncJob {
  
  def apply(name: String, data: Option[Int]): ShopIntegrationStartSyncJob = new ShopIntegrationStartSyncJob(name, data)
  def apply(name: String, data: Int): ShopIntegrationStartSyncJob = new ShopIntegrationStartSyncJob(name, Option(data))
}

```