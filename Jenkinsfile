pipeline {
    agent any
    stages {
        stage("Compilar") {
            steps {
               echo 'Verificar ejecucion automatica'
               sh "./gradlew clean build -x test"


            }
        }

    }
}