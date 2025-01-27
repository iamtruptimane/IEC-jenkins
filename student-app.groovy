pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                git 'https://github.com/iamtruptimane/student-app.git'
            }
        }
        stage('Build') {
            steps {
                sh '/opt/apache-maven/bin/mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Test cases going well'
            }
        }
        stage('Deploy') {
            steps {
                echo 'yahoo!! application deployed successfully'
            }
        }
    }
}