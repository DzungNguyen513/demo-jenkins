pipeline {
    agent any
    tools {
        maven 'Maven 3.9.9'
        jdk 'JDK - 22' 
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/DzungNguyen513/demo-jenkins.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    stage('Deploy') {
        steps {
        echo 'Deploy success'
        }
    }
    }
    post {
        success {
            echo 'Deployment succeeded!'
        }
        failure {
            echo 'Deployment failed!'
        }
    }
}