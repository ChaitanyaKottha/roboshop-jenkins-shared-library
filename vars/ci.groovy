def call() {
    try {
        pipeline {

            agent {
                label 'workstation'
            }

            stages {

                stage('Compile/Build') {
                    steps {
                        script {
                            common.compile()
                        }
                    }
                }

                stage('Unit Tests') {
                    steps {
                        script {
                            common.unittests()
                        }
                    }
                }

                stage('Quality Control') {
                    steps {
                        sh 'sonar-scanner -Dsonar.host.url=http://172.31.11.186:9000 -Dsonar.login=admin -Dsonar.password=admin123 -Dsonar.projectKey=cart'
                    }
                }

                stage('Upload Code to Centralized Place') {
                    steps {
                        echo 'Upload'
                    }
                }


            }

        }
    } catch(Exception e) {
        common.email("Failed")
    }
}