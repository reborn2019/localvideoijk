#!/bin/bash
#第一个参数是文件夹

DEST_DIR=${1}-replace
mkdir -p $DEST_DIR


while read line
do
    echo $line
    file=$(basename ${line})
    #echo $file
    convert $line test.png -gravity northeast -geometry +2+2 -composite $DEST_DIR/$file
done< <(find $1 -type f -name "*.png")

