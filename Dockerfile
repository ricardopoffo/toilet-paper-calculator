FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/toilet-paper-calculator-0.0.1-SNAPSHOT.jar.original /app/tpc-api.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "tpc-api.jar"]