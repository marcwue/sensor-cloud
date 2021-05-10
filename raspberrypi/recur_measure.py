#!/usr/bin/python

import time
from adafruit_DHT import measure_send


def recur_measure():
    print('loop start')
    humidity, temperature = measure_send('2302', 4)
    time.sleep(60)


if __name__ == "__main__":
    print('start program')
    while True:
        recur_measure()
