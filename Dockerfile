FROM openjdk:8
EXPOSE 8082
ADD target/APP-0.0.1-SNAPSHOT.jar APP-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/APP-0.0.1-SNAPSHOT.jar]