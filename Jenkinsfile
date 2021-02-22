pipeline {
    agent any
    stages {
        stage("Compilar test") {
            steps {
               echo 'Ejecucion automaticadddd'
               sh "./gradlew clean build -x test"

            }
        }


    }
       post {
            always {
                mail to: 'yanierme@gmail.com',
                subject: "Se completo el pipeline: ${currentBuild.fullDisplayName}",
                body: "Se termino la compilacion"
            }
        }
}