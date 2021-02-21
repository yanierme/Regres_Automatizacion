pipeline {
    agent any
    stages {
        triggers {
            pollSCM('* * * * *')
        }
        stage("Compilar") {
            steps {
               echo 'Verificar ejecucion automatica'
               sh "./gradlew clean build -x test"


            }
        }

    }
}