FROM openjdk:15
EXPOSE 8080
ADD target/app_rate_java.jar app_rate_java.jar
ENTRYPOINT ["java","-jar","/app_rate_java.jar"]