FROM openjdk:8-jdk-alpine

EXPOSE 8080

VOLUME /tmp

ARG JAR_FILE

COPY ${JAR_FILE} transaction-api-0.0.2-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","transaction-api-0.0.2-SNAPSHOT.jar"]