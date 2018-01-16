Projection ecran PC et Android via Wifi 
=======================================================

Le but de ce projet est de créer une  appplication pour PC permettant à un utilisateur de projetter son écran sans connection filaire.
Le PC communique par l'intermédaire du Wifi avec un raspberry pi connecté au projecteur.


Les scripts utilisés se trouvent dans le dossier `scripts`.
Les sources pour le serveur sur trouvent dans le dossier `src/server`

Pour démarrer le cast l'appareil doit se connecter au réseau wifi de la Raspberry (rasp-webgui mdp : ChangeMe) puis

javac src/server/CastServer.java

java src/server/CastServer


Installation
------------

* Le serveur doit installer ffmpeg
* Le client doit installer mplayer
