# sensor-cloud

## Architecture

Every service runs in its own docker container 

Discovery Server

Sensor-Service <-> Temp-Service (scalable with Feign) <-> RabbitMQ <-> DB-Service <-> MongoDB

openjdk image is only available vor arm64 not arm32v7

## MongoDB in live

You have to install yourself.

* sudo apt-get install mongodb
* sudo systemctl daemon-reload
* sudo systemctl enable mongodb
* mongo
* db.addUser( see init-mongo.js )
* exit
