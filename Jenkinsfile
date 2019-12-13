pipeline{
    agent any
    tools{
        maven "m3"
    }
    triggers{
        pollSCM("* * * * *")
    }
    stages{
        stage('Compile'){
            steps{
                sh "mvn clean compile"
            }
        }
        stage('Build'){
            steps{
                sh "mvn test"
            }
        }
        stage('Package'){
            steps{
                sh "mvn package"
            }
        }
        stage('Install'){
            steps{
                sh "mvn install"
            }
        }
        stage('SonarQube'){
            steps{
                sh "mvn sonar:sonar"
            }
        }
    }
    post{
        success{
            sh "echo PROJECT IS SUCCESSFUL"
        }
    }
}