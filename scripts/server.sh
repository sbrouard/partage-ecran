#!/bin/bash




ffmpeg -f x11grab -s 1600x900 -framerate 30 -i :1 -c:v libx264 -preset veryfast -tune zerolatency -pix_fmt yuv444p -x264opts crf=20:vbv-maxrate=3000:vbv-bufsize=100:intra-refresh=1:slice-max-size=1500:keyint=30:ref=1 -f mpegts - | nc -l -p 9000



# -f format (x11grab: capture ecran)
# -s size
# -i input file (echo $DISPLAY)
# -c ???
