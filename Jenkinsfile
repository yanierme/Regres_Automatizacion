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
                subject: "Pruebas de notificacion",
                body: "Se termino la compilacion"
            }
        }
}