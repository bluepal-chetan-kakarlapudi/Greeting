FROM tomcat:9.0
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
