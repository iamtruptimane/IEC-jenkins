pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                echo 'pull suceed'
            }
        }
        stage('Build') {
            steps {
                echo 'build is succeed'
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