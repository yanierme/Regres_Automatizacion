pipeline {
    agent any
    stages {
        stage("Compilar") {
            steps {
               echo 'Ejecucion automatica'
               sh "./gradlew clean build -x test"


            }
        }

    }
}