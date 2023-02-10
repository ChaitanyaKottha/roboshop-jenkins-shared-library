def call() {
  pipeline {
      agent {
          node {
              label 'workstation'
          }
      }
      parameters {
          string(name: 'INFRA_ENV', defaultvalue: '', description: 'Enter env like dev or prod')
      }

      stages {
          stage ()
      }
  }
}