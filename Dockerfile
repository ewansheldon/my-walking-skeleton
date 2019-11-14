FROM openjdk:13.0.1

WORKDIR /app

COPY target/my-walking-skeleton-1.0-SNAPSHOT.jar .

EXPOSE 3000

ENTRYPOINT ["java", "-jar", "my-walking-skeleton-1.0-SNAPSHOT.jar"]