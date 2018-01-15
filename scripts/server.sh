#!/bin/bash


if [ "$#" -ne 2 ]; then
    echo "Use: ./server.sh screenWidth screenHeight"
else

screenSize="$1x$2"  #1600x900
frameRate="30"
input=":1"
if [ $DISPLAY ]; then
    input=$DISPLAY
fi

codecVideo="libx264"
pixelFormat="yuv444p"
compressionRate="20" #between 0 and 51 ; Higher values mean more compression, but quality degradation.
maximumBitRate="10000"
bufferSize="100"

port="9000"

ffmpeg -f x11grab -s $screenSize -framerate $frameRate -i $input -c:v $codecVideo -preset veryfast -tune zerolatency -pix_fmt $pixelFormat -x264opts crf=$compressionRate:vbv-maxrate=$maximumBitRate:vbv-bufsize=$bufferSize:intra-refresh=1:keyint=30:slice-max-size=1500:ref=1 -f mpegts - | nc -l -p $port 

fi

# -f format (x11grab: screen capture)
# -s size
# -i input file (echo $DISPLAY)
# -c:v codec (v for video, codec is the encoding method)
# -pix_fmt (pixel encoding format)
# -f mpegts (output format)
# crf
