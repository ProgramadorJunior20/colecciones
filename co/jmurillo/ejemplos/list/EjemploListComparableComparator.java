package co.jmurillo.ejemplos.list;

import co.jmurillo.ejemplos.models.Alumno;

import java.util.*;
import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();

        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 3));

        //Collections.sort(sa, (a,b) -> a.getNota().compareTo(b.getNota()));
        //sa.sort((a, b) -> a.getNota().compareTo(b.getNota()));
        sa.sort(comparing(Alumno::getNota).reversed());
        System.out.println(sa);

        System.out.println("Iterando con operaciones lambda ");
        sa.forEach(a -> System.out.println(a.getNombre()));
    }
}
