# [swagger-codegen](https://github.com/swagger-api/swagger-codegen)

```shell script
npm install
./convert.sh
```

## Converts
- From OpenAPI 3.0 :arrow_right: to Swagger 2.0 :arrow_right: to Scala

## Problems
- needs to convert OpenAPI 3.0 to Swagger 2.0
    - but... works automatically (using `api-spec-converter`)
- No hierarchy

## Example
```scala
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


case class MonitoringPipelineJob (
  /* The name of the action to be executed on the component.  **Note:** This actions are fixed and **MUST** be defined in `patagona-scheduler`.  */
  action: String,
  /* The name of the component where the job should be scheduled.  **Note:** The components are fixed and **MUST** be defined in `patagona-scheduler`.  */
  component: String,
  /* Used to identify the different job types.  */
  jobType: String,
  /* How many times the request should be retried when failing.  */
  retries: Option[Int],
  /* Contains a [CRON specification](https://en.wikipedia.org/wiki/Cron) of a schedule.  */
  schedule: String,
  /* Generated by the `patagona-scheduler`. Used to identify a specific job.  **Note:** Clients **NEVER** generate UUIDs themselves.  */
  uuid: Option[String],
  data: Option[MonitoringPipelineJob_data]
)

```