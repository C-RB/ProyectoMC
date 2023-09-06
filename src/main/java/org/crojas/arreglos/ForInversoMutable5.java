package org.crojas.arreglos;

import java.util.Arrays;
import java.util.Collections;

public class ForInversoMutable5 {

    public static void main(String[] args) {

        String[] productos = {"Kingston", "Samsung", "Disco duro",
                "Asus", "Macbook", "Chromecast",
                "Bicicleta Oxford"};


        System.out.println("\tLISTA DE PRODUCTOS");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        Arrays.sort(productos);
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }

        // CAMBIO DE INDICES DENTRO DE UN ARRAY.
        for (int i = 0; i < (productos.length / 2); i++) {
            String actual = productos[i];
            String inverso = productos[productos.length - 1 - i];
            productos[i] = inverso;
            productos[productos.length - 1 - i] = actual;
        }

        System.out.println();
        System.out.println();
        System.out.println("\tMODIFCANDO EL ARREGLO A LA INVERSA");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }
        arregloInverso(productos);
        System.out.println();
        System.out.println();
        System.out.println("\tMODIFCANDO EL ARREGLO A LA INVERSA 2 ");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }
        //OTRA FORMA DE IMPLENTAR CON LAS COLLECCIONES
       // Collections.reverse(Arrays.asList(productos));

    }

    public static void arregloInverso(String[] arr) {
        int totalProductos = arr.length;
        // CAMBIO DE INDICES DENTRO DE UN ARRAY 2.
        for (int i = 0; i < arr.length; i++) {
            String actual = arr[i];
            String inverso = arr[arr.length - 1 - i];
            arr[i] = inverso;
            arr[arr.length - 1 - i] = actual;
            totalProductos--;
        }


    }
}
