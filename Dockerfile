FROM openjdk:17-jdk-slim

WORKDIR /app

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/tpc-api.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "tpc-api.jar"]