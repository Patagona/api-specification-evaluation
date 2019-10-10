/**
 * patagona-scheduler
 * This API wraps the [dKron](https://dkron.io/v1.2/api/#/) scheduling service and provides an easier interface/isolation.  **Note:** The actions which can be scheduled on a specific component are defined in the `patagona-scheduler`. Scheduling actions unknown to the `patagona-scheduler` will result in errors. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.patagona.scheduler.generated.model


case class MonitoringPipelineJob_data (
  debugValue: Option[String]
)
