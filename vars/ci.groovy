
pipeline{
    agent{
        label 'workstation'
    }
    stages{
        stage('Compile/Build') {
            steps{
                echo 'Compile'
            }
        }
        stage('Unit tests') {
            steps{
                echo 'unit test'
            }
        }
        stage('Quality Control') {
            steps{
                echo 'Quality control'
            }
        }
        stage('Upload code to centralized place') {
            steps{
                echo 'upload'
            }
        }
    }

}