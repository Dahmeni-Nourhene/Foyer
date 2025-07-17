# Étape 1 : Build avec Maven
FROM maven:3.8.5-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Étape 2 : Image d'exécution
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Port exposé par DiscoveryService
EXPOSE 8095

# Commande de démarrage
ENTRYPOINT ["java", "-jar", "app.jar"]
