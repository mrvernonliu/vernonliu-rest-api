FROM openjdk:8-jdk-alpine

RUN mkdir -p /vernonliu-rest-api
WORKDIR vernonliu-rest-api

COPY /build /vernonliu-rest-api

EXPOSE 8080

CMD ["java", "-jar", "libs/rest-api-0.1.0.jar"]