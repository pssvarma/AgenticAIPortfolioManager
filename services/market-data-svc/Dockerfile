# Stage 1: Build the application
FROM maven:3.8-openjdk-21 AS build
WORKDIR /app
COPY pom.xml .
# Copy the source code
COPY src ./src
# Build the application and skip tests
RUN mvn clean install -DskipTests

# Stage 2: Create the final, lean image
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
# Copy the JAR from the build stage
COPY --from=build /app/target/market-data-svc-0.0.1-SNAPSHOT.jar app.jar
# Expose the application port
EXPOSE 8080
# Set the entrypoint to run the application
ENTRYPOINT ["java","-jar","app.jar"]
