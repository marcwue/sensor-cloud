# Code for the raspberry pi

This is the code to read the metrics from
* Adafruit DHT sensor

## Problems

The raspberry pi has python version 2.7 running

## Configuration

### Raspberrypi OS

Technically it means to update libseccomp to version 2.4.2 or higher

https://github.com/AdoptOpenJDK/openjdk-docker/issues/469
https://stackoverflow.com/questions/67346333/how-to-solve-gradle-docker-image-freezing-on-raspberry-pi-with-warning-about-mon

sudo dpkg -i ./libseccomp2_asdf.deb
