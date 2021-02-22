pipeline {
    agent any

    tools {
        maven 'gradle6'
        jdk 'jdk8'
    }

    stages {

        stages {
                stage("Compilar test") {
                    steps {
                       echo 'Ejecucion automaticadddd'
                       sh "./gradlew clean build -x test"

                    }
                }


            }
    }