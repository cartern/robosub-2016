# robosub-2016
2016 AUV software for Danger 'Zona and more.

The software is split into standalone programs, with Apache Thrift used for both message passing and remote function calls.

## Vision
The vision server is implemented in Python and requires OpenCV 2.X/3.0, along with the OpenCV python bindings.

To run, start the vision server:
```
python server.py
```

Test the server with the test client script:
```
python test.py
```

## Logging
The logging server is implemented in Python. This is the central logging service for all programs - outputs should be redirected as messages to this service if they are important enough to be logged for the end-user.
