package org.crojas.arreglos;

public class EjemploArreglosOrdenaPrincFinal8 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        System.out.println();
        System.out.println("\tLISTA DE NUMEROS");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");

        int aux = 0;
        for (int i = 0; i < numeros.length/2; i++) {
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length - 1 - i];

            //System.out.print(numeros[i] +" ");
            //System.out.println(numeros[numeros.length-1-i]);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("iteracion " +(i+1)+ " valor: " +a[i]);
        }
    }
}
