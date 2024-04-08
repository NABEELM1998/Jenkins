pipeline{
 agent any
 tools{
    maven "maven"
 }
 stages{"SCM Checkout"}{
  steps{
    checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/NABEELM1998/Jenkins.git']])

  }
 }
 stages("run maven build process"){
    steps{
           script{
            sh 'mvn clean install'

           }

    }
 }
}