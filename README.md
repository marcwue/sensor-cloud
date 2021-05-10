# sensor-cloud

## Architecture

Every service runs in its own docker container 

Discovery Server

Sensor-Service <-> Temp-Service (scalable with Feign) <-> RabbitMQ <-> DB-Service <-> MongoDB
