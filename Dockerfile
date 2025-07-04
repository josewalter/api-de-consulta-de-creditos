FROM openjdk:24-ea-17-slim
WORKDIR /app
COPY target/*.jar /app/api-de-consulta-de-creditos.jar
COPY . .
EXPOSE 8080
CMD ["java", "-jar", "api-de-consulta-de-creditos.jar"]