# Build tools example project

Project to learn 'Gradle' and 'Maven' building tools

___
## Build and Run application
```shell script
# Clone project
git clone https://github.com/sealiv/builders.git

# download gradle wrapper
gradle wrapper

# project build
gradlew clean build instalDist

# run Admin service
gradlew run 

# run tests
gradlew test 

# copy war-file to a Project folder (from {project_folder}/web/build/libs)
gradlew getWar
```

## Run war-module
1. copy war-file ('builders-web-1.0.0.war') to a {tomcat_install_dir}/webapps/
2. run tomcat-server ({tomcat_install_dir}/bin/startup.bat)
3. open in your browser https://localhost/builders-web-1.0.0

