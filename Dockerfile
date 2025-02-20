FROM openjdk:21
EXPOSE 9090
ADD target/spring-devops.jar spring-devops.jar
ENTRYPOINT [ "java", "-jar", "/spring-devops.jar" ]