# sensor-cloud

## Architecture

Every service runs in its own docker container 

Discovery Server

Sensor-Service <-> Temp-Service (scalable with Feign) <-> RabbitMQ <-> DB-Service <-> MongoDB

openjdk image is only available vor arm64 not arm32v7