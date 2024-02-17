pipeline {
    agent any

    tools {
        maven "MAVEN"
        jdk "JDK"
        git "Default"
    }
    environment {
         DOCKER_IMAGE_NAME = 'scientific_calculator'
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
        stage('Build and Test') {
            steps {
                script {
                dir("/var/lib/jenkins/workspace/jens_pipeline/scientific_calc") {
                sh 'mvn clean package' 
                //sh 'mvn test'
         
                }
            
            }
        }
        }
     stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }
        stage('Push Docker Images') {
            steps {
                script{
                    docker.withRegistry('', 'docker') {
                    sh 'docker tag scientific_calculator secy2520/scientifc_calculator:latest'
                    sh 'docker push secy2520/scientific_calculator:latest'
                    }
                 }
            }
        }
    
       
     }
    }    
    

