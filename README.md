# Web Automation Framework - Prueba Técnica

Este proyecto es un **framework de automatización web**, utilizando **Selenium WebDriver, Java 11, TestNG, Maven y WebDriverManager**. **automatización de pruebas de aplicaciones web, integración en pipelines CI/CD y buenas prácticas de desarrollo**.

## Tecnologías y herramientas usadas

- **Java 11**: lenguaje principal.
- **Selenium WebDriver 4.16.0**: automatización de navegadores.
- **TestNG 7.8.0**: framework de pruebas.
- **Maven 3.9.11**: gestión de dependencias y build.
- **WebDriverManager 5.5.3**: manejo automático de drivers.
- **SLF4J**: logging profesional en tests.
- **Postman**: para pruebas de API externas.
- **SQL**: ejemplo de validación y consultas de datos.

## Estructura del proyecto

qa-automation-starter/
│
├─ src/main/java/com/alex/core/ # Clases principales de soporte
│ └─ DriverFactory.java # Inicializa WebDriver y gestiona drivers
│
├─ src/main/java/com/alex/pages/ # Clases de Page Object Model (POM)
│ └─ GoogleHomePage.java # Ejemplo de POM para la página de Google
│
├─ src/test/java/com/alex/tests/ # Tests automatizados
│ ├─ GoogleTitleTest.java # Test básico de título de Google
│ └─ GoogleSearchTest.java # Test usando POM y logging
│
├─ pom.xml # Dependencias y configuración Maven
├─ README.md # Este archivo
└─ .gitignore # Archivos y carpetas a ignorar

## Cómo ejecutar las pruebas

1. **Clonar el repositorio**
```bash
git clone https://github.com/tuusuario/web-automation-framework.git
cd qa-automation-starter
Ejecutar pruebas con Maven

mvn clean test
Ejecutar un test específico

mvn -Dtest=GoogleTitleTest test

TestNG genera reportes en target/surefire-reports/.

Los logs detallados se encuentran en la consola gracias a SLF4J.
Buenas prácticas incluidas
Implementación de Page Object Pattern para separar lógica de interacción de la UI.
Uso de clases de soporte (DriverFactory) para inicializar y cerrar WebDriver correctamente.
Gestión de dependencias y versiones con Maven.
Logging profesional con SLF4J.
Tests configurados para ejecutarse en pipelines CI/CD sin intervención manual.
Código preparado para expansión a pruebas de APIs REST/SOAP y validaciones SQL/MongoDB.
