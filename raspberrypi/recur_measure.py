import time
from adafruit_DHT import measure

def recur():
  humidity, temperature = measure(2302, 4)
  # send data
  time.sleep(60)

if __name__ == "__main__":
  while True:
    recur()