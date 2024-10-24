package co.jmurillo.ejemplos.list;

import co.jmurillo.ejemplos.models.Producto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjemploIteraciones{
    public static void main(String[] args) {

        //Creamos una lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", 1000.0));
        productos.add(new Producto("Mouse", 20.0));
        productos.add(new Producto("Teclado", 50.0));
        productos.add(new Producto("Teclado2", 40.0));

        // 1. Iteración con for-each para mostrar productos
        System.out.println("Usando for-each:");
        for (Producto p: productos){
            System.out.println(p.getNombre() + " : $" + p.getPrecio());
        }
        // 2. Usando Iterator para remover productos caros
        System.out.println("\nRemoviendo productos caros con Iterator:");
        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()){
            Producto p = it.next();
            if (p.getPrecio() > 500){
                it.remove();
                System.out.println("Removido: " + p.getNombre());
            }
        }
        // 3. Usando Stream para filtrar y procesar
        System.out.println("\nProductos económicos usando Stream:");
        productos.stream()
                .filter(p -> p.getPrecio() < 100)
                .map(Producto::getNombre)
                .forEach(nombre -> System.out.println("Producto económico: " + nombre));
        // 4. forEach con lambda para actualizar precios
        System.out.println("\nActualizando precios con forEach:");
        productos.forEach(p -> {
            p.setPrecio(p.getPrecio() * 1.1); // Por el 10%
            System.out.println(p.getNombre() + " nuevo precio: $" + p.getPrecio());
        });
    }
}
