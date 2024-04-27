FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/toilet-paper-calculator-0.0.1-SNAPSHOT.jar /app/tpc-api.jar

ENTRYPOINT ["java", "-jar", "tpc-api.jar"]