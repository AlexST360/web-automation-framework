# Web Automation Framework - Prueba Técnica

Este proyecto es un **framework de automatización web**, utilizando **Selenium WebDriver, Java, TestNG, Maven y WebDriverManager**. Está diseñado para demostrar habilidades en **automatización de pruebas de aplicaciones web, integración de pruebas en pipelines CI/CD y buenas prácticas de desarrollo**.

## Tecnologías y herramientas usadas

- **Java 11**: lenguaje principal.
- **Selenium WebDriver 4.16.0**: automatización de navegadores.
- **TestNG 7.8.0**: framework de pruebas.
- **Maven 3.9.11**: gestión de dependencias y build.
- **WebDriverManager 5.5.3**: manejo automático de drivers.
- **Postman**: para pruebas de API externas.
- **SQL**: para validación y consultas de datos.

## Estructura del proyecto

qa-automation-starter/
│
├─ src/main/java/com/alex/core/ # Clases principales de soporte
│ └─ DriverFactory.java # Inicializa WebDriver
│
├─ src/test/java/com/alex/tests/ # Tests automatizados
│ └─ GoogleTitleTest.java # Ejemplo de prueba Selenium
│
├─ pom.xml # Dependencias y configuración Maven
└─ README.md # Este archivo

## Cómo ejecutar las pruebas

1. Clonar el repositorio:
```bash
git clone https://github.com/tuusuario/web-automation-framework.git

## Entrar al directorio del proyecto
## cd qa-automation-starter


## Ejecutar pruebas con Maven
## mvn clean test

Buenas prácticas incluidas
Uso de Page Object Pattern y clases de soporte.
Gestión de dependencias con Maven.
Manejo de versiones de Java y drivers compatible.
TestNG para reportes claros de pruebas.


Notas
Este proyecto se puede expandir para incluir pruebas de APIs REST/SOAP y validaciones SQL.
Todos los tests están pensados para ser ejecutados en pipelines CI/CD sin intervención manual.
# Trigger de prueba para GitHub Actions
# Trigger de prueba para GitHub Actions
# Trigger de prueba para GitHub Actions
# Trigger de prueba para GitHub Actions
# Trigger de prueba para GitHub Actions
