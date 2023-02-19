def call() {
    pipeline {

        agent {
            node {
                label 'workstation'
            }
        }

        parameters {
            string(name: 'INFRA_ENV', defaultValue: '', description: 'Enter Env like Dev or Prod')
        }

        stages {
            stage('Terraform init') {
                steps {
                    sh "terraform init -backend-config=env-${INFRA_ENV}/state.tfvars"
                }

            }
        }
    }
}