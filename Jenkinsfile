node{
    stage('compile'){
        //def mvnHome=tool name:'DEFAULT_MAVEN', type:'maven'
        //def mvnCMD="${mvnHome}/bin/mvn"
        bat 'mvn clean compile'
        //mvn clean package"
        
        }
    stage('Maven package'){
        //def mvnHome=tool name:'DEFAULT_MAVEN', type:'maven'
        //def mvnCMD="${mvnHome}/bin/mvn"
        bat 'mvn clean package -DskipTests'
        //mvn clean package"
        
        }

    stage('install'){
        //def mvnHome=tool name:'DEFAULT_MAVEN', type:'maven'
        //def mvnCMD="${mvnHome}/bin/mvn"
        bat 'mvn clean install -DskipTests'
        //mvn clean package"
        
        }
    }
