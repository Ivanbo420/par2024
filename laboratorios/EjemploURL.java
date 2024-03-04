/*
    Autor: Claudia Palacios -- nombre del autor
    Date: 02-2024
    Referencia: https://docs.oracle.com/javase/10/docs/api/java/net/URL.html
 */
import java.io.IOException;
import java.net.URL;

public class EjemploURL {  //Clase EjemploURL: La clase principal que contiene el método main.
    public static void main(String[] args) throws IOException { //Método main: El punto de entrada del programa. Se lanza una excepción IOException que se puede producir al trabajar con URL.
        String test_url= "http://www.pol.una.py"; // URL que usaremos de prueba
        URL pagina1 = new URL(test_url);
        URL pagina2 = new URL("http","grado.pol.una.py",80,"index.html");
        //Variables y URLs: Se definen dos objetos URL, pagina1 y pagina2, que representan diferentes direcciones web.
        
        //Primera Prueba
        System.out.println("***** Primera pagina");
        System.out.println("Protocolo: "+pagina1.getProtocol()); // se obtiene el protocolo utilizado en la primera pagina
        System.out.println("Puerto: "+pagina1.getPort()); // se obtiene el puerto utilizado en la primera pagina
        System.out.println("Host: "+pagina1.getHost()); // se obtiene la direccion del host que contiene la pagina
        System.out.println("Archivo: "+pagina1.getFile()); // se obtiene el archivo del index
        System.out.println("External form: "+pagina1.toExternalForm()); // imprime la representación externa de la URL, lo que permite visualizar cómo se ven las URL completas en su formato de cadena de caracteres.

        //Segunda prueba
        System.out.println("***** Segunda pagina"); 
        System.out.println("Protocolo: "+pagina2.getProtocol()); // se obtiene el protocolo utilizado en la segunda pagina
        System.out.println("Puerto: "+pagina2.getPort()); // se obtiene el puerto utilizado en la segunda pagina
        System.out.println("Host: "+pagina2.getHost()); // se obtiene la direccion del host que contiene la pagina
        System.out.println("Archivo: "+pagina2.getFile()); // se obtiene el archivo del index
        System.out.println("External form: "+pagina2.toExternalForm()); // imprime la representación externa de la URL, lo que permite visualizar cómo se ven las URL completas en su formato de cadena de caracteres.

    } //fin main

} //fin EjemploURL