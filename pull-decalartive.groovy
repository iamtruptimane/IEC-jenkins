pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                git branch: 'main', url: 'https://github.com/iamtruptimane/provisioning-ESC-cluster-using-terraform.git'
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