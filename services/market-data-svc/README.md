# market-data-svc
Contracts-first service. Implement according to OpenAPI in `/contracts/rest/market-data-svc.yaml`.

## Getting started
- Generate server stubs via OpenAPI generator (Spring).
- Add Flyway migrations from `/contracts/db`.
- Wire Kafka according to `/contracts/events/asyncapi.yaml`.
