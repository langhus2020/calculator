pipeline {
    
    agent any
    
    triggers {
        
        pollSCM("* * * * *")
    }
    
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
    
    stage("Code coverage") {

               steps {

                    sh "./gradlew jacocoTestReport"

                    publishHTML(target: [
                    
                      reportDir: "build/reports/jacoco/test/html",
                      reportFiles: "index.html",
                      reportName:"Jacoco Report"
                    ])
                    
                    sh "./gradlew jacocoTestCoverageVerification"
                    }

             }
    
    
    
      stage("Static code analysis") {
        
        steps {
            sh "./gradlew checkstyleMain"
        }
    }
        
        
        
 }

    
    
}
