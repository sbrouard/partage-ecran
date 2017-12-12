import mss
#from PIL import Image



# Return the size of the image and the pixels in an array of (R,G,B)
def getPixels():

    with mss.mss() as sct:
        # Get a screenshot of the 1st monitor
        sct_img = sct.grab(sct.monitors[1])

        # Create an Image
        #img = Image.new('RGB', sct_img.size) #to do by rasp

        # Best solution: create a list(tuple(R, G, B), ...) for putdata()
        pixels = zip(sct_img.raw[2::4],
                     sct_img.raw[1::4],
                     sct_img.raw[0::4])
        
        #img.putdata(list(pixels)) #to do by rasp

        return sct_img.size, pixels
