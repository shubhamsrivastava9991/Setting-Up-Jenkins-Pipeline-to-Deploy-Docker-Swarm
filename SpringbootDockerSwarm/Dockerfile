FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=/target/*.jar 
ADD ${JAR_FILE} springdockerphase5.jar
ENTRYPOINT ["java","-jar","/springdockerphase5.jar"]