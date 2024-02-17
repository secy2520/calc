pipeline {
    agent any

    tools {
        maven "MAVEN"
        jdk "JDK"
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
                sh 'mvn clean test'
         
                }
            
            }
        }
        }
     stage('Pushing jar file to GitHub') {
            steps {
                script {
                    def gitHubCredentials = credentials('git_pass')  // Use the credentials ID you created
                    def gitHubRepoURL = 'https://github.com/secy2520/calc.git'

                    // Copy the JAR file to the cloned repository
                    sh 'cp /var/lib/jenkins/workspace/jens_pipeline/scientific_calc/target/scientific_calc-1.0-SNAPSHOT.jar .'

                    // Commit and push changes
                    sh 'git add scientific_calc-1.0-SNAPSHOT.jar'
                    sh 'git commit -m "Adding new JAR file"'
                    sh 'git push origin main'
                }
            }
        }
    
       
     }
    }    
    
}
