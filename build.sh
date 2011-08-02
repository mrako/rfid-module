mkdir -p build
cd build

FILES=`find ../ -name "*.java"`

javac -d . -Xlint:unchecked -cp ../lib/RXTXcomm.jar $FILES
jar -cf onsignal_rfid.jar org
cp onsignal_rfid.jar ../library
echo
echo "Build done; .jar file put in library/"

if [ "`which hg`" != "" ]; then
  F=onsignal-rfid-`date +%Y%m%d`.zip
  hg archive -t zip -p onsignal_rfid $F
  echo "Created $F."
fi

