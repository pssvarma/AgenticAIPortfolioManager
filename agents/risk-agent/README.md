# risk-agent
Specialist agent. Depends on contracts in `/contracts`.

- Use Python (pandas/numba etc.).
- Produce/consume Kafka topics defined in `contracts/events/asyncapi.yaml`.
- Adhere to schemas in Avro when publishing events.
