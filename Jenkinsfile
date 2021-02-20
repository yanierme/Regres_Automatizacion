pipeline {
    agent any
    stages {
        stage("Compilar") {
            steps {

              if (isUnix()) --> sh "./gradlew compileJava"
                 else --> bat "./gradlew compileJava"

            }
        }

    }
}