import socket,sys,cPickle
#import sys 

from getScreenShot import getPixels
from getConfig import getMaxPacketLength

# create dgram udp socket
try:
    s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
except socket.error:
    print 'Failed to create socket'
    sys.exit()
 
host = '172.20.6.66'
port = 8888
udpLength = getMaxPacketLength()
 
while(1) :

    # Get the size and pixels of the screen
    size,pixels = getPixels()

    # Serialize it, to send it y the socket
    arr = ((size[0],size[1]),pixels)
    msg = cPickle.dumps(arr)
    
    try :
        #Set the message
        s.sendto(msg, (host, port))

     
    except socket.error, msg:
        print 'Error Code : ' + str(msg[0]) + ' Message ' + msg[1]
        sys.exit()

