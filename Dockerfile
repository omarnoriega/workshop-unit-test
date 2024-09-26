FROM amazoncorretto:11-alpine-jdk
COPY target/workshop-unit-test-0.0.1-SNAPSHOT.jar workshop-unit-test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/workshop-unit-test-0.0.1-SNAPSHOT.jar"]