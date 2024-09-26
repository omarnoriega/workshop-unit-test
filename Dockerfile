FROM amazoncorretto:11-alpine-jdk
#COPY target/workshop-unit-test-0.0.1-SNAPSHOT.jar workshop-unit-test-0.0.1.jar
#ENTRYPOINT ["java","-jar","/workshop-unit-test-0.0.1.jar"]

# Usa una imagen base de OpenJDK
#FROM openjdk:11-jre-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR de tu aplicación al contenedor
COPY target/workshop-unit-test-0.0.1-SNAPSHOT.jar /app/workshop-unit-test-0.0.1-SNAPSHOT.jar

# Expone el puerto en el que tu aplicación escucha
EXPOSE 8080

# Define el comando para ejecutar tu aplicación
CMD ["java", "-jar", "workshop-unit-test-0.0.1-SNAPSHOT.jar"]
