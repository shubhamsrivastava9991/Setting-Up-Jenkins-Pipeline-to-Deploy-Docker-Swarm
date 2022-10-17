pipeline {
  environment {
    registry = "shubhamsrivastava9/docker_automation"
    registryCredential = 'dockerhub'
    dockerImage = ''
  }
  agent any
  stages {
    stage('Build Maven') {
      steps {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/shubhamsrivastava9991/Setting-Up-Jenkins-Pipeline-to-Deploy-Docker-Swarm.git']]])
        bat 'mvn clean install'
      }
    }
    stage('Building image'){
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy Image'){
      steps{
         script {
            docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
          }
        }
      }
    }
    stage('Remove Unused docker image') {
      steps{
        bat "docker rmi $registry:$BUILD_NUMBER"
      }
    }
  }
}