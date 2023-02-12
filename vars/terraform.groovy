//def call() {
//  pipeline {
//      agent {
//          node {
//              label 'workstation'
//          }
//      }
//      parameters {
//          string(name: 'INFRA_ENV', defaultvalue: '', description: 'Enter env like dev or prod')
//      }
//
//      stages {
//          stage('terraform init')
//          steps {
//              sh "terraform init -backend-config=env-${INFRA_ENV}/state.tfvars"
//          }
//      }
//  }
//}