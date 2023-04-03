#!/bin/bash

user="shariba"
pass="tusi@007!"
ip="10.9.0.77"
app_version="release_stg_jenkins"
tomcat="/usr/share/apache-tomcat-8.5.33-6060/webapps"



chmod +x ${WORKSPACE}/*


warLocation="${WORKSPACE}/target/$warName"
echo $warLocation

echo "war file:"
cd ${WORKSPACE}/target
ls
ls -als ${WORKSPACE}/target

which sshpass

/usr/bin/ssshpass -p "$pass" scp -r -o StrictHostKeyChecking=no -p $warLocation "$user"@"$ip":/home/$user
execCommand="cp -r '/home/$user/$warName' '$tomcat/$warName'"
echo $execCommand
/usr/bin/ssshpass -p "$pass" ssh "$user"@"$ip" "$execCommand"