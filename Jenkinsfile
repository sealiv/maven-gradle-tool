pipeline {
    agent none
    stages {
        stage('Build') {
            agent { docker 'maven:3.6.3-jdk-11' }
            steps {
                echo 'Hello, Maven'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Run') {
            agent { docker 'openjdk:11.0.7-jdk-slim' }
            steps {
                echo 'Hello, JDK'
                sh 'java -jar admin/admin-1.0.0.jar'
            }
        }
    }
}