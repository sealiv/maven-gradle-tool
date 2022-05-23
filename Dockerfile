# the first stage of our build will use a maven 3.6.3 parent image
FROM maven:3.6.3-jdk-11 AS MAVEN_BUILD

# copy the pom and src code to the container
COPY ./ ./

# package our application code
RUN mvn clean package

# the second stage of our build will use open jdk 11 on alpine 3.9
FROM openjdk:11.0.7-jdk-slim

# copy only the artifacts we need from the first stage and discard the rest
COPY --from=MAVEN_BUILD /admin/target/admin-1.0.0.jar /admin-1.0.0.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/admin-1.0.0.jar"]