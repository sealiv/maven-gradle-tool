# Build tools example project

Project to learn 'Gradle' and 'Maven' building tools

# Gradle:
### Build and Run application
```shell script
# Clone project
git clone https://github.com/sealiv/builders.git

# download gradle wrapper
gradle wrapper

# build project
gradlew clean build instalDist

# run Admin service
gradlew run 

# run tests
gradlew test 

# copy war-file to a Project folder (from {project_folder}/web/build/libs)
gradlew getWar
```

### Run war-module
1. copy war-file ('builders-web-1.0.0.war') to a {tomcat_install_dir}/webapps/
2. run tomcat-server ({tomcat_install_dir}/bin/startup.bat)
3. open in your browser https://localhost/builders-web-1.0.0

___

# Maven
### Build and Run application
```shell script
# Clone project
git clone https://github.com/sealiv/builders.git

# build project
mvn clean package

# run Admin service
java -jar admin/target/admin-1.0.0.jar 

# run tests
mvn test 
```

### Run war-module
1. copy war-file from 'web/target/builders-web-1.0.0.war' to a {tomcat_install_dir}/webapps/
2. run tomcat-server ({tomcat_install_dir}/bin/startup.bat)
3. open in your browser https://localhost/builders-web-1.0.0