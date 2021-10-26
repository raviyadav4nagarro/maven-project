# pull the image for tomcat 9 from dockerhub
FROM tomcat:9
# provide any lable info
LABEL app=maven-project-demo
# provide the maintainer info
MAINTAINER Ravi_Yadav <ravi.yadav02@nagarro.com>
# copy the war file form source to target location 
COPY target/*.war /usr/local/tomcat/webapps/myweb.war