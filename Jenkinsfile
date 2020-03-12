pipeline {
    
    agent any
    
    stages {
        
        stage("Checkout") {
            steps {
                git url: "https://github.com/langhus2020/calculator.git"
            }
        }
        
        stage("compile") {
            
            steps {
                sh "./gradlew compileJava"
                
            }
            
            
        }
    stage("Unit test") {
        steps {
            sh "./gradlew test"
        }
    }        
    }
}
