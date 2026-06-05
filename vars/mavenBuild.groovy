def call() {
    sh '''
        pwd
        ls -la
        mvn clean package
    '''
}
