# Step 1: Use an official Java runtime as base image
FROM openjdk:21-jdk-slim

# Step 2: Add a label (optional metadata)
LABEL maintainer="yourname@example.com"

# Step 3: Copy the jar file into the container
COPY target/SpringBootDcoker-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Expose the port your app runs on
EXPOSE 8090

# Step 5: Run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]
