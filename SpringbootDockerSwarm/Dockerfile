FROM openjdk:8-jdk-alpine
EXPOSE 8080
WORKDIR /target/springdockerphase5
ARG JAR_FILE=C:/Users\hp/.jenkins/workspace/SpringbootDockerSwarmPhase5/SpringbootDockerSwarm/target/springdockerphase5.jar 
ADD ${JAR_FILE} springdockerphase5.jar
ENTRYPOINT ["java","-jar","/springdockerphase5.jar"]