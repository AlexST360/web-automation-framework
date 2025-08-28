FROM maven:3.9.6-eclipse-temurin-17

WORKDIR /app

# Copiar solo pom.xml primero para cachear dependencias
COPY pom.xml .

# Instala dependencias sin ejecutar tests
RUN mvn clean install -DskipTests

# Copiar el código fuente
COPY src ./src

# Comando por defecto al correr contenedor
CMD ["mvn", "test"]
