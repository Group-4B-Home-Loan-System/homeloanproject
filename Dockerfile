FROM openjdk:8
ADD target/homeloanproject-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","app.jar"]
