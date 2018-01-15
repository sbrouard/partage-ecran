#!/bin/bash

if [ "$#" -ne 2 ]; then
    echo "Use: ./client.sh ip port"
else
    nc $1 $2 | mplayer -fs - 
fi
