pipeline {
    agent any

    tools {
        maven 'Maven 3.9.9'
    }

    environment {
        MAVEN_OPTS = '-Xms512m -Xmx1024m' // Cấu hình bộ nhớ cho Maven
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/DzungNguyen513/demo-jenkins.git'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Triển khai thành công ứng dụng Spring Boot!'
            }
        }
    }

    post {
        success {
            echo 'Build và triển khai thành công!'
        }
        failure {
            echo 'Build hoặc triển khai thất bại!'
        }
    }
}
