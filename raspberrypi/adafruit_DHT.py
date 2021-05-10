#!/usr/bin/python

import sys
import Adafruit_DHT
import json
import httplib

sensor_args = {'11': Adafruit_DHT.DHT11,
               '22': Adafruit_DHT.DHT22,
               '2302': Adafruit_DHT.AM2302}


def measure_send(type, pin):
    print("type {} pin {}".format(type, pin))
    if type in sensor_args:
        sensor = sensor_args[type]
        print('Sensor %s' % sensor)
    else:
        sys.exit(1)

    # Try to grab a sensor reading.  Use the read_retry method which will retry up
    # to 15 times to get a sensor reading (waiting 2 seconds between each retry).
    # Note that sometimes you won't get a reading and
    # the results will be null (because Linux can't
    # guarantee the timing of calls to read the sensor).
    humidity, temperature = Adafruit_DHT.read_retry(sensor, pin)
    if temperature is not None:
        print('Temp={0:0.1f}*  Humidity={1:0.1f}%'.format(temperature, humidity))
        _send_py2(temperature)
    else:
        print('Failed to get reading. Try again!')

    return humidity, temperature


def _send_py2(temperature):
    url = 'sensor-service/temperature'
    payload = {'celsius': temperature}
    hdr = {"content-type": "application/json"}
    connection = httplib.HTTPConnection(url)
    connection.request('POST', '/api/Html', json.dumps(payload), hdr)
    response = conn.getresponse()
    data = response.read()


def _send_py3(temperature):
    url = 'sensor-service/temperature'
    payload = {'celsius': temperature}
    # response = requests.post(url, data=payload)
    print(response)
