#!/bin/bash

if [ $(which rainbow) ]
then
  MVN="rainbow --config=mvn mvn"
else
  MVN="mvn"
fi

$MVN clean

rm -f *.so
rm -f *.h

$MVN compile

cd src/main/java/
javah -o ../../../native.h fr.odeblic.CWrapper
cd -

INCLUDES='-I/usr/lib/jvm/java-8-openjdk-amd64/include -I/usr/lib/jvm/java-8-openjdk-amd64/include/linux'

#gcc -fPIC -shared $INCLUDES native.c -E > x.c

gcc -fPIC -shared $INCLUDES native.c -o libnative.so

export LD_LIBRARY_PATH=.

java -classpath target/classes/ -Djava.library.path=. fr.odeblic.Main

