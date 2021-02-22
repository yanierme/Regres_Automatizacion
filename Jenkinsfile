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
                body: "Se ha terminado la compilación, porfavor revisa: ${env.BUILD_URL}"
            }
        }
}