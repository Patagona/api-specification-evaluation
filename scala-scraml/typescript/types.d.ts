

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
       