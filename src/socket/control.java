/*
 * Proyecto de Comunicación por Sockets en Java
 * 
 * Esta clase es el punto de entrada principal de la aplicación.
 * Inicia tanto el cliente como el servidor para demostrar la comunicación
 * por sockets TCP.
 * 
 * @author locon
 * @version 1.0
 * @since 2024
 */
package socket;

/**
 * Clase principal que inicia la aplicación de comunicación por sockets.
 * 
 * Esta clase crea instancias del cliente (socket1) y servidor (socket2)
 * para demostrar la comunicación bidireccional entre aplicaciones Java
 * utilizando sockets TCP.
 * 
 * @author locon
 * @version 1.0
 */
public class control {
    
    /**
     * Método principal que inicia la aplicación.
     * 
     * Crea instancias del cliente y servidor, iniciando ambos componentes
     * de la aplicación de comunicación por sockets.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        try {
            System.out.println("=== Iniciando Aplicación de Sockets ===");
            System.out.println("Puerto de comunicación: 9999");
            System.out.println("Dirección del servidor: 127.0.0.1");
            System.out.println("=======================================");
            
            // Crear e iniciar el servidor primero
            System.out.println("Iniciando servidor...");
            socket2 server = new socket2();
            
            // Pequeña pausa para asegurar que el servidor esté listo
            Thread.sleep(1000);
            
            // Crear e iniciar el cliente
            System.out.println("Iniciando cliente...");
            socket1 cliente = new socket1();
            
            System.out.println("Aplicación iniciada correctamente.");
            System.out.println("El servidor está escuchando en el puerto 9999");
            System.out.println("El cliente está listo para enviar mensajes.");
            
        } catch (InterruptedException e) {
            System.err.println("Error al iniciar la aplicación: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error inesperado al iniciar la aplicación: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
