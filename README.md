# Build tools example project

Project to learn 'Gradle' and 'Maven' building tools

# Gradle:
### Build and Run application
```shell script
# Clone project
git clone https://github.com/sealiv/maven-gradle-tool.git

# download gradle wrapper
gradle wrapper

# build project with default version
gradlew clean build

# build project with auto-generated version and environment = 'LOCALE'
# plugin 'getversion.gradle' must be uncommented on 'build.gradle' in line #1 and #9
gradlew clean build

# build project with auto-generated version and environment = 'RELEASE' for Jenkins 
# plugin 'getversion.gradle' must be uncommented on 'build.gradle' in line #1 and #9
gradlew clean build -PenvDescription=RELEASE

# run Admin service
gradlew run 

# run tests
gradlew test 

# copy war-file to a Project folder (from {project_folder}/web/build/libs)
gradlew getWar
```

### Run war-module
1. copy war-file ('builders-web-{majorVersion}.{minorVersion}-{envDescription}.war') to a {tomcat_install_dir}/webapps/
2. run tomcat-server ({tomcat_install_dir}/bin/startup.bat)
3. open in your browser https://localhost/builders-web-{majorVersion}.{minorVersion}-{envDescription}
4. majorVersion and minorVersion you can find in gradle.properties, envDescription can be one of two values: 'RELEASE' or 'LOCAL'

___

# Maven
### Build and Run application
```shell script
# Clone project
git clone https://github.com/sealiv/maven-gradle-tool.git

# build project
mvn clean package

# run Admin service
java -jar output/admin-1.0.0.jar 

# run tests
mvn test 
```

### Run war-module
1. copy war-file from 'web/target/builders-web-1.0.0.war' to a {tomcat_install_dir}/webapps/
2. run tomcat-server ({tomcat_install_dir}/bin/startup.bat)
3. open in your browser https://localhost/builders-web-1.0.0