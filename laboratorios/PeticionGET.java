/*
    Autor: Claudia Palacios -- nombre del autor
    Date: 02-2024
 */

// Este código realiza una solicitud GET a una URL específica y muestra el contenido de la página web en la consola.

import java.io.*;
import java.net.*;

public class PeticionGET { //Clase PeticionGET, la clase principal que contiene el método main.

    public static void main(String[] args) { // Se realiza una solicitud GET a la URL especificada, se lee el contenido de la respuesta y se muestra en la consola.
        try {
            String var_url = "https://www.google.com/";
            URL url = new URL(var_url);

            URLConnection conexion = url.openConnection();

            // LEER DE LA URL
            InputStreamReader input_str = new InputStreamReader(conexion.getInputStream());
            BufferedReader reader = new BufferedReader(input_str);

            String linea;

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();// cerrar flujo

        } catch (MalformedURLException me) { 

            System.err.println("MalformedURLException: " + me); // Se manejan las excepciones MalformedURLException (cuando la URL no es válida)

        } catch (IOException ioe) { 

            System.err.println("IOException:  " + ioe); // Se manejan las excepciones IOException (cuando ocurre un error de E/S al leer la URL)
        } //
    }// main
}