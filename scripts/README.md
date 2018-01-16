This directory contains the scripts used for the project

Installation
-------------

* The server need to have ffmpeg installed
* The client need to have mplayer installed

Utilisation
------------

### Server

Run `./server.sh` on the device whose screen you want to stream

### Client

Run `./client.sh ip port` on the device to use to see server's screen.
With 'ip' and 'port' the server ip and server port used for the screen streaming

You can also run `./screen.sh` if you want it to be ran continiously (you need to make shure your device is correctly configured for that)

### Important note

If you use `client.sh`, run the server before the client, otherwise, the client won't be able to connect to the server and will exit immediatly.
