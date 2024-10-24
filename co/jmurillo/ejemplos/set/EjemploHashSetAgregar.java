package co.jmurillo.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        //Ejemplo Basico de HashSet
        Set<String> hs = new HashSet<>(); //
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        hs.add(null); // Permite Null
        hs.add("tres"); // Este se no se agregará porque es duplicado
        System.out.println(hs); // Salida: [null, cinco, cuatro, tres, dos, uno](Orden no garantizado)
    }
}
