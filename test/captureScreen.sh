#!/bin/bash

ffmpeg -video_size 1600x900 -framerate 30 -f x11grab -i :1 -c:v libx264 -qp 0 -preset ultrafast capture.mkv
