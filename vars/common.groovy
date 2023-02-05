def compile() {
    if (app_lang == 'nodejs') {
        sh 'npm install'
    }
    if (app_lang == 'maven') {
        sh 'mvn package'
    }
    if (app_lang == 'golang') {
        sh 'go mod init dispatch'
        sh 'go get'
        sh 'go build'
    }
}
def unittests() {
    if (app_lang == 'nodejs') {
        // developer is missing unit test cases in our project. Hence we are skipping to proceed
        sh 'npm test'
    }
    if (app_lang == 'maven') {
        sh 'mvn test'
        //sh 'echo Test cases'
    }
    if (app_lang == 'python') {
        sh 'python -m unittest'
        //sh 'echo Test cases'
    }
}

def email(email_note){
    println email_note
}