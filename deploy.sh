gradle
gradle test
rm ./build/libs/*.war
gradle war
rm -fr /Library/Tomcat/webapps/caller-server-1.0-SNAPSHOT*
cp build/libs/*.war /Library/Tomcat/webapps/
/Library/Tomcat/bin/shutdown.sh
/Library/Tomcat/bin/startup.sh
