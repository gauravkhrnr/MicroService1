FROM openjdk:11-slim as build
MAINTAINER test.com
COPY target/service1-0.0.1-SNAPSHOT.jar service1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/service2-0.0.1-SNAPSHOT.jar"]