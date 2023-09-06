package org.crojas.arreglos;

import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {

        // PRBANDO COSITAS NUEVAS....:[

        int [] arr = new int [10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Ingrese un numero: ");
            arr[i] = teclado.nextInt();
        }

        System.out.println("\r\nIngrese un numero a buscar: ");
        int num  = teclado.nextInt();
        int i = 0;
        while (i<arr.length && arr[i]!= num){
            i++;
        }
        if (i== arr.length){
            System.out.println("Numero no encontrado");
        } else if (arr[i] == num) {

            System.out.println("Numero encontrado en la posicion:  "+i);
        }
    }
}
