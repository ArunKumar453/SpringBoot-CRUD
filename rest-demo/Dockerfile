# Use a base image with Java 11 pre-installed
FROM adoptopenjdk/openjdk11:alpine-jre

# Set the working directory inside the container
WORKDIR /opt/app

# Copy the Spring Boot JAR file from the target directory to the container
COPY target/rest-demo-0.0.1-SNAPSHOT.jar app.jar

# Command to run when the container starts
CMD ["java", "-jar", "app.jar"]
