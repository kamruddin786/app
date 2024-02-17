FROM eclipse-temurin:latest
LABEL authors="kamruddin"
COPY build/libs/app-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]