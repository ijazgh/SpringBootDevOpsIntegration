FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/spring-devops.jar spring-devops.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "/app/spring-devops.jar"]