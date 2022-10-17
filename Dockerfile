#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -Dmaven.test.skip=true

#
# Package stage
#
FROM openjdk:11
ARG JAR_FILE=/home/app/target/*.jar
COPY --from=build ${JAR_FILE} /src/app/api-pet.jar
EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","/src/app/api-pet.jar"]