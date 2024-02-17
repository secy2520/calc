pipeline {
    agent any

    tools {
        maven "MAVEN"
        jdk "JDK"
        git "GIT"
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
                sh 'mvn test'
         
                }
            
            }
        }
        }
     stage('Pushing jar file to GitHub') {
            steps {
                script {
                    def gitHubCredentials = credentials('git_pass1')  // Use the credentials ID you created
                    def gitHubRepoURL = 'https://github.com/secy2520/calc.git'
            
    withCredentials([usernamePassword(credentialsId: 'git_pass1', usernameVariable: 'GIT_USERNAME', passwordVariable: 'GIT_PASSWORD')]) {
    sh '''
    git config --global user.name "${GIT_USERNAME}"
    git config --global user.password "${GIT_PASSWORD}"
    'cp /var/lib/jenkins/workspace/jens_pipeline/scientific_calc/target/*.jar .'
    'git add scientific_calc-1.0-SNAPSHOT.jar'
    'git commit -m "Adding new JAR file"'
    'git push origin main'"
    '''
}


                    // Copy the JAR file to the cloned repository
                    sh 'cp /var/lib/jenkins/workspace/jens_pipeline/scientific_calc/target/*.jar .'

                    // Commit and push changes
                    //sh 'git add scientific_calc-1.0-SNAPSHOT.jar'
                    //sh 'git commit -m "Adding new JAR file"'
                    //sh 'git push origin main'
                }
            }
        }
    
       
     }
    }    
    

