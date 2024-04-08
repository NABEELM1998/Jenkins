pipeline{
 agent any
 tools{
    maven "maven"
 }
 stages{
  stage()"SCM Checkout"){
     steps{
        checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/NABEELM1998/Jenkins.git']])
      }
  }
 stage("run maven build process"){
    steps{
           script{
            sh 'mvn clean install'

           }

    }
 }
}
}