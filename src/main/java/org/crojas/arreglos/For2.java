package org.crojas.arreglos;

import java.util.Arrays;

public class For2 {

    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "Kingston";
        productos[1] = "Samsung";
        productos[2] = "Disco duro";
        productos[3] = "Asus";
        productos[4] = "Macbook";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta Oxford";

        System.out.println("\tLISTA DE PRODUCTOS CON FOR");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");

        Arrays.sort(productos);
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("\tLISTA DE PRODUCTOS CON FOREACH");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");

        for (String prod : productos) {
            System.out.println("Producto con foreach: " + prod);
        }

        System.out.println();
        System.out.println();
        System.out.println("\tLISTA DE PRODUCTOS CON WHILE");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        int i = 0;
        while (i < productos.length) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
            i++;
        }


        System.out.println();
        System.out.println();
        System.out.println("\tLISTA DE PRODUCTOS CON DO WHILE");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        int j = 0;
        do {
            System.out.println("Producto " + (j + 1) + ": " + productos[j]);
            j++;
        } while (j < productos.length);
        System.out.println();
        System.out.println();

        int[] numeros = new int[10];
        // LLENADO DEL FOR
        for (int k = 0; k < numeros.length; k++) {
            numeros[k] = k*3;
        }
        System.out.println("\tLISTA DE NUMEROS  CON FOR");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        for (int k = 0; k < numeros.length; k++) {
            System.out.println("numero " +(k+1)+ ": " + numeros[k]);
            
        }

    }
}
