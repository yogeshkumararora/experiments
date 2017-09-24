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

//acme.name = 'Alice'
//echo acme.name /* prints: 'Alice' */
//acme.caution 'The queen is angry!' /* prints: 'Hello, Alice. CAUTION: The queen is angry!' */

sayHello 'Joe'
sayHello() /* invoke with default arguments */

mac {
    sh "man ls"
}

