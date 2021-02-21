pipeline {
    agent any
    stages {
        stage("Clonar Repositorio") {
                    steps {
                       echo 'Stage para clonar proyecto de GitHub'
                       git poll: true, url: 'git@github.com:yanierme/Regres_Automatizacion.git'
                    }
                }
        stage("Compilar") {
            steps {
               echo 'Verificar ejecucion automatica'
               sh "./gradlew clean build -x test"


            }
        }

    }
}