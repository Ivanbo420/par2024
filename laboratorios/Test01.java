/*
    Autor: Claudia Palacios -- nombre del autor
    Date: 02-2024
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class Test01 { // clase principal que contiene el método main y la función peticionHttpGet.
    public static void main(String[] args) {
        String url = "https://www.datos.gov.py/dataset/proyectos-adjudicados-hackathon";
        String respuesta = "";
        try {
            respuesta = peticionHttpGet(url);
            System.out.println("La respuesta es:\n" + respuesta);
        } catch (Exception e) {
            // Se manejan las excepciones generales en caso de error durante la solicitud HTTP GET
            e.printStackTrace();
        }
    }

    public static String peticionHttpGet(String urlParaVisitar) throws Exception { // Realiza una solicitud HTTP GET a la URL especificada y devuelve la respuesta como una cadena de caracteres.
        StringBuilder resultado = new StringBuilder();
        URL url = new URL(urlParaVisitar);

        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        String linea;
        while ((linea = rd.readLine()) != null) {
            resultado.append(linea);
        }

        rd.close();
        return resultado.toString();
    }
}