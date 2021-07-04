FROM openjdk:11
ADD target/fibonacci-docker.jar fibonacci-docker.jar
EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","/fibonacci-docker.jar"]
