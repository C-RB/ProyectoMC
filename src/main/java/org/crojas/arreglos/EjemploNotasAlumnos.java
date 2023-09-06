package org.crojas.arreglos;

import java.util.Scanner;

public class EjemploNotasAlumnos {
    public static void main(String[] args) {



        double [] claseMatematica, claseHistoria, claseLenguaje;
        double sumaNotasMate = 0;
        double sumaNotasHist = 0;
        double  sumaNotasLeng = 0;

        claseMatematica = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de matematicas ");
        for (int i = 0; i < claseMatematica.length; i++) {
            claseMatematica[i] = teclado.nextDouble();
        }
        System.out.println("Ingrese 7 notas de historia ");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = teclado.nextDouble();
        }

        System.out.println("Ingrese 7 notas de lenguaje ");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = teclado.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumaNotasMate += claseMatematica[i];
            sumaNotasHist += claseHistoria[i];
            sumaNotasLeng += claseLenguaje[i];
        }

        double promMate =  ((sumaNotasMate)/claseMatematica.length);
        double promHist = ((sumaNotasHist)/claseHistoria.length);
        double promLeng = ((sumaNotasLeng)/claseLenguaje.length);
        double promCurso = (promMate + promHist + promLeng)/3;
        System.out.println("\tPROMEDIO DE ASIGNATURAS");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("Promedio clase matematica: " + promMate);
        System.out.println("Promedio clase Historia: " + promHist);
        System.out.println("Promedio clase lenguaje: " + promLeng);

        System.out.println("Promedio total del curso: " + promCurso);
    }
}
