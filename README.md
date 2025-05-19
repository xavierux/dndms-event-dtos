# D&D Microservices - Event DTOs (`dndms-event-dtos`)

Este repositorio contiene los Data Transfer Objects (DTOs) compartidos, representando los contratos de eventos utilizados en el sistema de microservicios D&D.

## Propósito
Centralizar las definiciones de los eventos para asegurar la consistencia entre los microservicios productores y consumidores.

## Uso
Este repositorio está destinado a ser consumido como un **Git Submodule** por los microservicios individuales.

## Eventos Definidos
* `AventuraCreadaEvent.java`: Evento publicado cuando una nueva aventura es generada por `dndms-ms1-adventure-forge`.
  * `adventureId` (String)
  * `challengeType` (String)
  * `environment` (String)
  * `numEncounters` (int)
  * `goldRewardTier` (String)
* *(Más eventos se añadirán aquí a medida que se definan)*