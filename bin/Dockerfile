FROM openjdk:11
EXPOSE 8080
ADD target/fibonacci-docker.jar fibonacci-docker.jar
ENTRYPOINT ["java","-jar","/fibonacci-docker.jar"]
