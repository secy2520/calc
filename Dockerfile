FROM ubuntu:latest

# Update the package list and install curl
RUN apt-get update && apt-get install -y curl

# Install OpenJDK 11
RUN apt-get install -y openjdk-11-jdk

# Set the JAVA_HOME environment variable
ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk-amd64

COPY scientific_calc/target/scientific_calc-1.0-SNAPSHOT.jar /app/scientific_calc-1.0-SNAPSHOT.jar



