pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url:'https://github.com/sindhu844/JavaApp.git', branch:'main'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                 withSonarQubeEnv('MySonarQube') {  
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
            }
        }
    }
}
