FROM openjdk:8-jdk-alpine

EXPOSE 8080

VOLUME /tmp

ARG JAR_FILE=target/transaction-api-0.0.2-SNAPSHOT.jar

ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]