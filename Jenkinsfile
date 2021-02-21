pipeline {
    agent any
    stages {
        stage("Compilar test") {
            steps {
               echo 'Ejecucion automaticadddd'
               sh "./gradlew clean build -x test"

            }
        }
        post {
            success {
              mail to: yanierme@gmail.com, subject: ‘The Pipeline success :)‘
            }
          }

    }
}