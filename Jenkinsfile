pipeline {
    agent any
    stages {
        triggers {
            pollSCM('5 * * * *')
        }
        stage("Compilar") {
            steps {
               echo 'Verificar ejecucion automatica'
               sh "./gradlew clean build -x test"


            }
        }

    }
}