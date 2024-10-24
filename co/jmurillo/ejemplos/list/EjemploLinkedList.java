package co.jmurillo.ejemplos.list;

import co.jmurillo.ejemplos.models.Alumno;

import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();

        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("está vacia = " + enlazada.isEmpty());

        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 10));
        enlazada.addLast(new Alumno("Peter", 5));

        System.out.println(enlazada + ", size = " + enlazada.size());

    }
}
