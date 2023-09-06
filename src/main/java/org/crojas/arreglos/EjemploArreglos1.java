package org.crojas.arreglos;

import java.util.Arrays;

public class EjemploArreglos1 {

    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] ="Kingston";
        productos[1] ="Samsung";
        productos[2] ="Disco duro";
        productos[3] ="Asus";
        productos[4] ="Macbook";
        productos[5] ="Chromecast";
        productos[6] ="Bicicleta Oxford";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];




        System.out.println("\tLISTA DE PRODUCTOS");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("producto 1: " + prod1);
        System.out.println("producto 2: " + prod2);
        System.out.println("producto 3: " + prod3);
        System.out.println("producto 4: " + prod4);
        System.out.println("producto 5: " + prod5);
        System.out.println("producto 6: " + prod6);
        System.out.println("producto 7: " + prod7);
        System.out.println();
        System.out.println();


        int[] numeros = new int[4];
        numeros[0] = 15;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 5;
        numeros[3] = 10;
        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];
        System.out.println("\tLISTA DE NUMEROS");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);


    }
}
