from PIL import Image


from getScreenShot import getScreenShot 


size, pixels = getScreenShot();
img = Image.new('RGB', size)
img.putdata(list(pixels))
img.show()

print pixels
