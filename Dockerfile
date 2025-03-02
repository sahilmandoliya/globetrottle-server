# Use OpenJDK 17 as the base image
FROM eclipse-temurin:21-jdk AS build

# Set working directory inside the container
WORKDIR /app

# Copy Maven wrapper and project files
COPY .mvn/ .mvn/
COPY mvnw pom.xml ./
COPY src ./src

# Grant execute permissions to Maven wrapper
RUN chmod +x mvnw

# Build the application
RUN ./mvnw clean package -DskipTests

# Use a smaller JDK image for final deployment
FROM eclipse-temurin:17-jdk AS runtime

# Set working directory
WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
