pipeline {
    agent {
          docker {
            image 'ictu/sshpass'
            image 'rvancea/maven-chrome-jdk8:latest'
          }
        }
    environment {
            basePath = "${workspace}"
            user= "tusi"
            pass= "tusi@007!"
            version="releaseStq_001"
            warName="mockService##releaseStg_001.war"

        }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                script{
                sh 'mvn clean'
                sh 'mvn -DskipTests=true package'
                sh 'ls -als target'
                }
            }
            post {

                success {
                     mail cc: "${env.ATTENDENCE_EMAIL_TUSI}", body: "<b>Attendance Check-in/out successfully from pipeline</b><br>Build Number: ${env.BUILD_NUMBER}<br>Build URL: ${env.BUILD_URL}", bcc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "Office Check-in/out notification from pipeline", to: "shariba@surecash.net";

                }

                failure {
                             mail bcc: "${env.ATTENDENCE_EMAIL_TUSI}", body: "<b></b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br>Build URL: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "ERROR CI: Project name -> ${env.JOB_NAME}", to: "shariba@surecash.net";
                         }

            }

        }
        stage('Rename_war') {
                    steps {
                         script {
                                sh "mv target/mockService_qa-0.0.1.war target/${warName}"
                                sh 'chmod -R 777 target/*'
                                sh 'ls -als target'


                            }

                    }
                    post {
                        failure {
                            mail bcc: '', body: "<b>CD War Rename Failed.</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br>Build URL: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "ERROR CI: Project name -> ${env.JOB_NAME}", to: "${env.ATTENDENCE_EMAIL_TUSI}";
                        }
                    }
                }

        stage('Deploy') {
                            steps {

                                    script {
                                        sh 'echo ${WORKSPACE}'
                                        sh 'pwd'
                                        sh 'chmod +x ${WORKSPACE}/jenkins_deploy.sh'
                                        sh '${WORKSPACE}/jenkins_deploy.sh'

                                    }

                            }
                            post {
                                failure {
                                    mail bcc: '', body: "<b>CD War Rename Failed.</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br>Build URL: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "ERROR CI: Project name -> ${env.JOB_NAME}", to: "${env.ATTENDENCE_EMAIL_TUSI}";
                                }
                            }
                        }
    }
}
