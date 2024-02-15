pipeline {
  agent any
  tools {
    maven "Maven 3.9.6"
  }

  stages {
    stage('Build Artifcat') {
      steps {
        sh "mvn clean package -DskipTests=true"
        archive 'target/*.jar'
           }
         } 
