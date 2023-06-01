FROM openjdk:17-jdk-slim as build

#Information around who maintains the image
MAINTAINER eazybytes.com

# Add the application's jar to the container
COPY target/spring-boot-docker.jar spring-boot-docker.jar

#execute the application
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]