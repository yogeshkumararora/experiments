@Library('utils@master') import org.foo.Utilities
def utils = new Utilities(this)
node {
  stage('Git checkout') {
    utils.checkOutFrom 'experiments.git'
  }
  stage('Maven Build') {
    utils.mvn 'clean package'
  }
}
