import socket 
import sys 
 
# create dgram udp socket
try:
    s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
except socket.error:
    print 'Failed to create socket'
    sys.exit()
 
host = '172.20.6.66';
port = 8888;
 
while(1) :
    msg = '--- TEST --- Ca marche !!!'
     
    try :
        #Set the message
        s.sendto(msg, (host, port))

     
    except socket.error, msg:
        print 'Error Code : ' + str(msg[0]) + ' Message ' + msg[1]
        sys.exit()
