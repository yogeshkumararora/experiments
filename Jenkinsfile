pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        echo 'Start of the pipeline'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }
  }
}