package org.crojas.arreglos;

import java.util.Arrays;

public class ForInverso4 {

    public static void main(String[] args) {

        String[] productos = {"Kingston", "Samsung", "Disco duro",
                "Asus", "Macbook", "Chromecast", "Bicicleta Oxford"};


        System.out.println("\tLISTA DE PRODUCTOS CON FOR");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        Arrays.sort(productos);
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("\tLISTA DE PRODUCTOS CON FOR A LA INVERSA");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (productos.length - 1 - i) + ": " + productos[productos.length - 1 - i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("\tLISTA DE PRODUCTOS CON FOR A LA INVERSA 2");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");

        for (int i = (productos.length - 1); i >= 0; i--) {
            System.out.println("Producto " + (i) + ": " + productos[i]);
        }
    }
}
