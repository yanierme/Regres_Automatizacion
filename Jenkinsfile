pipeline {
    agent any
    stages {
        stage("Compilar") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("Probar") {
            steps {
                sh "./gradlew test"
            }
        }
    }
}