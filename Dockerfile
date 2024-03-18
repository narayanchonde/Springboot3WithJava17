#Start with a base image containing Java runtime
FROM openjdk:17.0.2-jdk-slim

#Information around who maintains the image
MAINTAINER narayan.com

# Add the application's jar to the image
COPY target/Springboot3WithJava17-0.0.1-SNAPSHOT.jar Springboot3WithJava17-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "Springboot3WithJava17-0.0.1-SNAPSHOT.jar"]