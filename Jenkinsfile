pipeline {
    agent any

    tools {
        maven "MAVEN"
        jdk "JDK"
    }
    environment {
         GITHUB_REPO_URL = 'https://github.com/secy2520/calc.git'
    }

    stages {
          stage('Checkout') {
            steps {
                script {
                    // Checkout the code from the GitHub repository
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }

        stage('Initialize'){
            steps{
                echo "PATH = ${M2_HOME}/bin:${PATH}"
                echo "M2_HOME = /opt/maven"
            }
        }
        stage('Build') {
            steps {
                script {
                dir("/var/lib/jenkins/workspace/New_maven/calc_t/") {
                sh 'mvn clean package' 
                sh 'mvn clean test'
                }
            
            }
        }
       
     }
    }    
    post {
       always {
           junit '**/reports/junit/*.xml'
      }
   } 
}
