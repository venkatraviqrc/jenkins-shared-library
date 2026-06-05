pipeline {
    agent any

    stages {
        stage('Maven Build') {
            steps {
                mavenBuild()
            }
        }
    }
}
