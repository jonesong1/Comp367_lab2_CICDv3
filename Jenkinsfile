pipeline {
    agent any
    triggers { pollSCM 'H/5 * * * *'}
    tools {
    maven "apache-maven"
    jdk "JDK"
    }
    
    stages {
    stage('Checkout')
    {
    steps {
    git branch: 'main', url: 'https://github.com/jonesong1/Comp367_lab2_CICD.git'
            }
        }
    stage('Maven Build') {
    steps {
                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
    bat "mvn clean compile"
            }
        }
    }
}