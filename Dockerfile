FROM ubuntu:latest
ADD calcd.java /app/calcd.java
RUN ["javac", "calcd.java"]
ENTRYPOINT ["java", "calcd"]

