FROM adoptopenjdk/openjdk11:ubi
WORKDIR /
ADD target/searchinghouses-0.0.1-SNAPSHOT.jar //
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/searchinghouses-0.0.1-SNAPSHOT.jar"]
