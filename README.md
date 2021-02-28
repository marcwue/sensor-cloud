# sensor-cloud

Discovery Server

## Architecture

Sensor-Service
    |
Temp-Service (scalable with Feign)
    |           |
RabbitMQ        |
    |           |
DB-Service
    |
MongoDB

## Configuration
...