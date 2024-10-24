package co.jmurillo.ejemplos.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Murillo");
        persona.put("Edad", 24);
        persona.put("Email", "johnpalacio@gmail.com");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "160");

        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);

        Object nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        Object apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String estado = direccionPersona.get("estado");
        String ciudad = direccionPersona.get("ciudad");
        System.out.println("pais = " + pais);
        System.out.println("ciudad = " + ciudad);
        System.out.println("estado = " + estado);
        System.out.println("El pais de " + nombre + " es: " + pais);
        System.out.println("La ciudad de " + nombre + " es: " + ciudad);
        System.out.println("El estado de " + nombre + " es: " + estado);
    }
}
