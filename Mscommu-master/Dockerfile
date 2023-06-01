FROM openjdk:17-jdk-slim as build

#Information around who maintains the image
MAINTAINER eazybytes.com

# Add the application's jar to the container
COPY target/Hostel_Boot_Project-0.0.1-SNAPSHOT.jar Hostel_Boot_Project-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/Hostel_Boot_Project-0.0.1-SNAPSHOT.jar"]