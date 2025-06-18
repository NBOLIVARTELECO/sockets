#!/bin/bash

echo "========================================"
echo "   Proyecto de Sockets en Java"
echo "========================================"
echo

# Verificar si Java está instalado
if ! command -v java &> /dev/null; then
    echo "ERROR: Java no está instalado o no está en el PATH"
    echo "Por favor, instale Java JDK 1.8 o superior"
    exit 1
fi

echo "Java encontrado. Compilando proyecto..."
echo

# Crear directorio de clases si no existe
mkdir -p build/classes

# Compilar el proyecto
javac -d build/classes -cp . src/socket/*.java
if [ $? -ne 0 ]; then
    echo "ERROR: Error durante la compilación"
    exit 1
fi

echo "Compilación exitosa!"
echo
echo "Ejecutando aplicación..."
echo

# Ejecutar la aplicación
java -cp build/classes socket.control

echo
echo "Aplicación terminada." 