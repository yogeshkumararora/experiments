@Library('utils@master') import org.foo.Utilities
def utils = new Utilities(this)
node {
  println "utils: " + utils
  //utils.checkOutFrom 'experiments.git'
  utils.mvn 'clean package'
}
