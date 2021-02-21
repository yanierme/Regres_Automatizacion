pipeline {
    agent any
    stages {
        stage("Compilar test") {
            steps {
               echo 'Ejecucion automatica'
               sh "./gradlew clean build -x test"

            }
        }

    }
}