FROM openjdk:7

EXPOSE 8080

ADD target/transaction-api-0.0.1-SNAPSHOT.jar transaction-api-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", "-jar", "transaction-api-0.0.1-SNAPSHOT.jar" ]