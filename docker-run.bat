@echo off
echo Construyendo imagen Docker...
docker build -t qa-automation:latest .

echo Ejecutando contenedor y corriendo tests...
docker run --rm qa-automation:latest

pause
