This directory contains the scripts used for the project

Installation
-------------

*The server need to have ffmpeg installed
*The clien need to have mplayer installed

Utilisation
------------

### Server

Run `./server.sh` on the device whose screen you want to stream

### Client

Run `./client.sh ip port` on the device to use to see server's screen.
With 'ip' and 'port' the server ip and server port used for the screen streaming

### Important note

Run the server before the client, otherwise, the client won't be able to connect to the server and will exit immediatly.




TODO
=====

-Comprendre tous les arguments de la ligne de commande du script server.sh
-Automatiser (valeur en argument du script plutot qu'en dur, puis detecter les valeurs adéquates automatiquement)
-Adapter: rendre tout ca compatible avec le plus d'appareils possible
-Creer un app: transformer les scripts en code (parce que 2-3 scripts c'est pas une app d'après ~fmorandat)


NOTES
=====
-Lancer un scrit au boot:
	Dans /etc/rc.local ajouter `bash /absulutepath/script' &`