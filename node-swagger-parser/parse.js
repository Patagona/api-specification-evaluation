const API_FILE = '../api-definition/openapi/api.yaml';
const SwaggerParser = require("swagger-parser");

main();

async function main() {
    const parsed = await SwaggerParser.parse(API_FILE);
    console.log(parsed)
}
