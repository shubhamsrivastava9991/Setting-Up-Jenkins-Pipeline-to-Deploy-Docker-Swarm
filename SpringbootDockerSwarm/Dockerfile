FROM openjdk:8
EXPOSE 8080
ARG JAR_FILE=target/springdockerphase5.jar
ADD ${JAR_FILE} springdockerphase5.jar
ENTRYPOINT ["java","-jar","/springdockerphase5.jar"]