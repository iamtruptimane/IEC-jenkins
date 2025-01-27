node {  
    stage('pull') { 
         echo 'pull suceed'
    }
    stage('Build') { 
         echo 'build is succeed'
    }
    stage('Test') { 
         echo 'Test cases going well'
    }
    stage('Deploy') { 
         echo 'yahoo!! application deployed successfully'
    }
}
