@echo off
echo ========================================
echo    Proyecto de Sockets en Java
echo ========================================
echo.

REM Verificar si Java está instalado
java -version >nul 2>&1
if errorlevel 1 (
    echo ERROR: Java no está instalado o no está en el PATH
    echo Por favor, instale Java JDK 1.8 o superior
    pause
    exit /b 1
)

echo Java encontrado. Compilando proyecto...
echo.

REM Crear directorio de clases si no existe
if not exist "build\classes" mkdir "build\classes"

REM Compilar el proyecto
javac -d build\classes -cp . src\socket\*.java
if errorlevel 1 (
    echo ERROR: Error durante la compilación
    pause
    exit /b 1
)

echo Compilación exitosa!
echo.
echo Ejecutando aplicación...
echo.

REM Ejecutar la aplicación
java -cp build\classes socket.control

echo.
echo Aplicación terminada.
pause 