package co.jmurillo.ejemplos.set;

import co.jmurillo.ejemplos.models.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> sa = new HashSet<>();

        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 3));

        System.out.println(sa);

        System.out.println("Iterando usando un foreach");
        for (Alumno a: sa){
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando While and Iterator");
        Iterator<Alumno> it = sa.iterator();
        //System.out.println("\nRemoviendo Alumno con el mismo nombre con Iterator:");
        //while (it.hasNext()){
        //    Alumno a = it.next();
        //    if (a.getNombre().equals("Zeus")){
        //        it.remove();
        //        System.out.println("Removido: " + a.getNombre());
        //    }
       // }
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }
        System.out.println("Iterando con operaciones lambda ");
        sa.forEach(a -> System.out.println(a.getNombre()));
    }
}
