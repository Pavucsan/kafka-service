FROM openjdk:8-jdk-alpine

COPY target/*.jar /kafka-service.jar

CMD ["java", "-jar", "/kafka-service.jar"]
