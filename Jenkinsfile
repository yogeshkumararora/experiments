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
        sh '"\'${mvnHome}/bin/mvn\' -Dmaven.test.failure.ignore clean package"'
      }
    }
  }
}