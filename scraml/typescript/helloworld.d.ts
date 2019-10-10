

export interface BaseJob  {
  "action": string,
  "component": string
}
       

export interface BaseJob  {
  "action": string,
  "component": string,
  "type": "BaseJob" | "ShopIntegrationStartShopSyncJob" | "ShopIntegrationUpdateProductsJob",
}
       

export interface ShopIntegrationStartShopSyncJob extends BaseJob {
  "type": "ShopIntegrationStartShopSyncJob",
}
       

export interface ShopIntegrationUpdateProductsJob extends BaseJob {
  "type": "ShopIntegrationUpdateProductsJob",
}
       