# Proyecto de Comunicación por Sockets en Java

## 📋 Descripción

Este proyecto implementa un sistema de comunicación cliente-servidor utilizando sockets TCP en Java con interfaz gráfica Swing. El sistema permite el envío de mensajes de texto entre un cliente y un servidor en tiempo real.

## 🏗️ Arquitectura del Proyecto

### Estructura de Archivos
```
sockets/
├── src/
│   └── socket/
│       ├── control.java      # Clase principal que inicia cliente y servidor
│       ├── socket1.java      # Cliente con interfaz gráfica
│       ├── socket1.form      # Archivo de diseño del formulario cliente
│       ├── socket2.java      # Servidor con interfaz gráfica
│       └── socket2.form      # Archivo de diseño del formulario servidor
├── nbproject/                # Configuración del proyecto NetBeans
├── build.xml                 # Script de construcción Ant
└── manifest.mf              # Archivo de manifiesto para JAR
```

## 🚀 Características

### Cliente (socket1.java)
- **Interfaz gráfica**: Campo de texto y botón de envío
- **Conexión**: Se conecta al servidor en `127.0.0.1:9999`
- **Funcionalidad**: Envía mensajes de texto al servidor
- **Protocolo**: TCP Socket con DataOutputStream

### Servidor (socket2.java)
- **Interfaz gráfica**: Área de texto para mostrar mensajes recibidos
- **Escucha**: Puerto 9999
- **Funcionalidad**: Recibe y muestra mensajes del cliente
- **Protocolo**: TCP ServerSocket con DataInputStream

## 🛠️ Requisitos del Sistema

- **Java**: JDK 1.8 o superior
- **IDE**: NetBeans (recomendado) o cualquier IDE compatible
- **Sistema Operativo**: Windows, Linux, macOS

## 📦 Instalación y Configuración

### Opción 1: Usando NetBeans
1. Abrir NetBeans IDE
2. Seleccionar `File` → `Open Project`
3. Navegar hasta la carpeta del proyecto y seleccionarla
4. El proyecto se abrirá automáticamente

### Opción 2: Compilación Manual
```bash
# Navegar al directorio del proyecto
cd sockets

# Compilar el proyecto
javac -d build/classes src/socket/*.java

# Ejecutar la aplicación
java -cp build/classes socket.control
```

## 🎯 Uso del Sistema

### Ejecución
1. **Ejecutar la clase principal**: `control.java`
2. **Se abrirán automáticamente**:
   - Ventana del servidor (socket2)
   - Ventana del cliente (socket1)

### Flujo de Comunicación
1. El servidor inicia y espera conexiones en el puerto 9999
2. El cliente se conecta al servidor
3. El usuario escribe un mensaje en el campo de texto del cliente
4. Al hacer clic en "Enviar", el mensaje se transmite al servidor
5. El servidor recibe y muestra el mensaje en su área de texto

## 🔧 Configuración Avanzada

### Cambiar Puerto de Comunicación
Para modificar el puerto de comunicación, editar en ambos archivos:

**En socket1.java (línea ~95):**
```java
Socket conexion = new Socket("127.0.0.1", 9999); // Cambiar 9999 por el puerto deseado
```

**En socket2.java (línea ~85):**
```java
server = new ServerSocket(9999); // Cambiar 9999 por el puerto deseado
```

### Cambiar Dirección IP
Para comunicación entre equipos diferentes, modificar en socket1.java:
```java
Socket conexion = new Socket("IP_DEL_SERVIDOR", 9999);
```

## 🐛 Solución de Problemas

### Error de Conexión
- **Problema**: "Connection refused"
- **Solución**: Verificar que el servidor esté ejecutándose antes que el cliente

### Puerto Ocupado
- **Problema**: "Address already in use"
- **Solución**: Cambiar el puerto o cerrar aplicaciones que usen el puerto 9999

### Firewall
- **Problema**: Conexión bloqueada
- **Solución**: Configurar el firewall para permitir conexiones en el puerto 9999

## 📚 Mejoras Futuras

### Funcionalidades Planificadas
- [ ] Chat bidireccional en tiempo real
- [ ] Soporte para múltiples clientes
- [ ] Transmisión de archivos multimedia
- [ ] Implementación de protocolos MQTT y CoAP
- [ ] Integración con Firebase para chat WAN
- [ ] Interfaz de usuario mejorada

### Optimizaciones Técnicas
- [ ] Manejo de excepciones mejorado
- [ ] Logging detallado
- [ ] Configuración mediante archivos de propiedades
- [ ] Tests unitarios
- [ ] Documentación Javadoc completa

## 👥 Autores

- **Desarrollador Principal**: locon
- **Contribuidor**: nestor

## 📄 Licencia

Este proyecto está bajo la licencia por defecto de NetBeans. Para más información, consultar el archivo de licencia en el proyecto.

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Para contribuir:

1. Fork el proyecto
2. Crear una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abrir un Pull Request

## 📞 Soporte

Para reportar bugs o solicitar nuevas funcionalidades, crear un issue en el repositorio del proyecto.

---

**Nota**: Este proyecto es educativo y está diseñado para demostrar los conceptos básicos de programación de sockets en Java. 