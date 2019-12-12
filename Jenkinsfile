pipeline{
    agent any
    tools {
        jdk "JDK8"
        maven "m3"
    }
    triggers {
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