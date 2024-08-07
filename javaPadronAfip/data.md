# Comando xjc para crear las clases para el xml desde sl xsd
xjc -d xsdxml/app/src/main/java/org/example/models TAR.xsd 

# wsdl2java
set JAVA_HOME
## en el mismo terminal en donde vamos a correr el comando
export JAVA_HOME="/usr/lib/jvm/java-19-openjdk-amd64"

## agregar el path 
export PATH="/usr/share/java/axis2-1.8.2/bin:$PATH"

## instalado en 
/usr/share/java/axis2-1.8.2/bin

## comando
### para personaServiceA%
./wsdl2java.sh -uri https://aws.afip.gov.ar/sr-padron/webservices/personaServiceA5?wsdl -p wsAfip.wsdl -d adb -s -o ~/source/wsaa

### para loginTicket
./wsdl2java.sh -uri https://wsaa.afip.gov.ar/ws/services/LoginCms?WSDL -p wsAfip.wsdl -d adb -s -o ~/source/wsaa

