# app_rate_java
java version

IDE run: --spring.profiles.active=local
MVN run: spring-boot:run -Dapp.active.profile=local

docker build -t app_rate_java.jar .
docket image ls
docker run -p 9090:8080 docker app_rate_java.jar
