package org.crojas.arreglos;

import java.util.Arrays;

public class Burbuja6 {

    public static void main(String[] args) {

        String[] productos = {"Kingston", "Samsung", "Disco duro",
                "Asus", "Macbook", "Chromecast",
                "Bicicleta Oxford"};
        int cont = 0;

        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length(); j++) {
                if (productos[i].compareTo(productos[j]) < 0){
                    String aux = productos[i];
                    productos[i] = productos[j];
                    productos[j]= aux;
                }
                cont++;
            }
        }
        System.out.println();
        System.out.println("cont = " + cont);
        System.out.println();

        System.out.println("\tLISTA DE PRODUCTOS");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        Arrays.sort(productos);
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }

    }
}
