package co.jmurillo.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado"};
        Set<String> unicos = new HashSet<>();
        for (String pez: peces){ // Recorre cada nombre de pez del arreglo
            if (!unicos.add(pez)){ // unicos.add(pez) devuelve false si el elemento ya existe en el conjunto
                System.out.println("Elemento Duplicado: " + pez); //Cuando encuentra un duplicado, lo imprime
            }
        }
        System.out.println(unicos.size() + " elementos no duplicados: " + unicos);
    }
}
