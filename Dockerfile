FROM openjdk:8
EXPOSE 8080
ADD target/rest-0.0.1-SNAPSHOT.jar rest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/rest-0.0.1-SNAPSHOT.jar"]
