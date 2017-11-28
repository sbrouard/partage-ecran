'''
Return the ma length od an udp packet (int)
'''
def getMaxPacketLength():
    try:
        f = open("/proc/sys/net/core/rmem_max",'r')
    except IOError:
        print "Impossible to get the udp packet max length"

    with f:
        length = (f.readline())
        f.close()
        return int(length)


