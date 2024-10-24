package co.jmurillo.ejemplos.list;

import co.jmurillo.ejemplos.models.Alumno;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();

        System.out.println(al + ", size = " + al.size());
        System.out.println("está vacia = " + al.isEmpty());

        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(2, new Alumno("Jano", 7));
        al.add(new Alumno("Andres", 3));
        al.set(3, new Alumno("Andres", 3));

        System.out.println(al + ", size = " + al.size());

        al.remove(new Alumno("Jano", 7));
        System.out.println(al + ", size = " + al.size());

        boolean b = al.contains(new Alumno("Cata", 7));
        System.out.println("La lista contiene a cata = " + b);


    }
}
