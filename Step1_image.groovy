pipeline {
    agent any
    
    stages {
        stage('Build Image') {
            steps {
                script {
                    // Paso 1: Construir la imagen
                    dir('/home/ubuntu/Java_test') {
                        sh 'docker build -t hello-world-fernando .'
                    }
                }
            }
        }
    }
}