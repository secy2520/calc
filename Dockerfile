FROM ubuntu:latest

# Install OpenJDK (adjust the version if needed)
RUN apt-get update && apt-get install -y openjdk

# Copy the Java source code into the container
ADD calcd.java /app/calcd.java

# Compile the Java source code
RUN javac /app/calcd.java



