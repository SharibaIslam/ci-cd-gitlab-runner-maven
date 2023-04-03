#!/bin/bash

user="shariba"
pass="tusi@007!"
ip="182.163.102.68"
app_version="release_stg_4"
tomcat="/usr/share/apache-tomcat-8.5.33-6060/webapps"


warName="mockService##"$app_version".war"


mv target/mockService_qa-0.0.1.war target/$warName
warLocation="target/$warName"
echo $warLocation

echo "war file:"
ls
ls -als target

sshpass -p "$pass" scp -r -o StrictHostKeyChecking=no -p 2222 $warLocation "$user"@"$ip":/home/$user
execCommand="cp '/home/$user/$warName' '$tomcat/$warName'"
echo $execCommand
sshpass -p "$pass" ssh "$user"@"$ip" "$execCommand"
