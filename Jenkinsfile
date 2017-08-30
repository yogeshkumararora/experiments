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
        withMaven(globalMavenSettingsConfig: 'MyGlobalMavenSettings', maven: '/Users/yogeshkumararora/mywork/apache-maven-3.2.3', mavenLocalRepo: '/Users/yogeshkumararora/.m2/repository', jdk: '/Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home', globalMavenSettingsFilePath: '/Users/yogeshkumararora/mywork/apache-maven-3.2.3/config')
      }
    }
  }
}