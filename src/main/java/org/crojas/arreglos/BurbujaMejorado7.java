package org.crojas.arreglos;

import javax.swing.text.html.ObjectView;
import java.util.Arrays;

public class BurbujaMejorado7 {

    public static void main(String[] args) {

        String[] productos = {"Kingston", "Samsung", "Disco duro",
                "Asus", "Macbook", "Chromecast",
                "Bicicleta Oxford"};

        int total = productos.length;

        for (int i = 0; i < (total - 1); i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String aux = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = aux;
                }
            }
        }


        System.out.println("\tLISTA DE PRODUCTOS");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        Arrays.sort(productos);
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }
        Integer[] numeros = new Integer[4];

        numeros[0] = 15;
        numeros[1] = Integer.valueOf("-2");
        numeros[2] = 5;
        numeros[3] = 10;
        sortBurbuja(numeros);
        System.out.println("\tLISTA DE NUMEROS");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numeros " + (i + 1) + ": " + numeros[i]);
        }
    }

    public static void sortBurbuja(Object[] arr) {
        int cont = 0;
        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (((Comparable) arr[j + 1]).compareTo(arr[j]) < 0) {
                    Object aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
                cont++;
            }
        }
        System.out.println();
        System.out.println("\tNUMERO DE REPETICIONES QUE REALIZA PARA ORDENAR");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("cont = " + cont);
        System.out.println();
    }
}
