FROM ubuntu:latest
LABEL authors="jnste"
COPY D387_sample_code-0.0.2-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]