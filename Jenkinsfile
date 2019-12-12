pipeline{
    agent any
    tools {
        maven "m3"
    }
    trigger {
        pollSCM("* * * * *")
    }
    stages {
        stage('Compile'){
            steps{
                sh "mvn clean compile"
            }
        }
        stage('build') {
            steps {
                sh "mvn test"
            }
        }
        stage('Package') {
            steps{
                sh "mvn package"
            }
        }
    }
    post {
        success {
            sh "echo HURRAY"
        }
    }
}