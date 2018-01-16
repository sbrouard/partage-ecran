#!/bin/bash

while true
do
  ping 10.3.141.50 -c 3
  if [ $? == 0 ] 
	then
	    sh ./client.sh 10.3.141.50 9000 &
	    echo $?
   fi
   sleep 1
done
