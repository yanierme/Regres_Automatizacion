pipeline {
    agent any
    stages {
        stage("Compilar") {
            steps {
               echo 'Ejecucion de prufffeba'
               sh "./gradlew clean build -x test"


            }
        }

    }
}