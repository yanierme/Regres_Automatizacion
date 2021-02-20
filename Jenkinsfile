pipeline {
    agent any

    tools {
        maven 'gradle6'
        jdk 'jdk8'
    }

    options {
    	buildDiscarder(logRotator(numToKeepStr: '5'))
    }

    environment {
        groupId = readMavenPom().getGroupId()
	    artifactId = readMavenPom().getArtifactId()
	    version = readMavenPom().getVersion()
    }

    stages {

        stage ('Initialize') {
                    steps {
                        sh '''
                            echo "yanier"
                            echo "mestra"
                        '''
                    }
                }

        }
    }