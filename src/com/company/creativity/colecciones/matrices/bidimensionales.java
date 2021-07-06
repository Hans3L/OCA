package com.company.creativity.colecciones.matrices;

import java.util.Arrays;
import java.util.Scanner;

public class bidimensionales {
    //una tabla bidimensional recibe el nombre de matriz
    public static void main(String[] args) {
        //declaramos
        int datos[][];
        // tabla 25 elements
        datos = new int[5][5];

        System.out.println(datos.length);
        //Los algoritmos que utilizan matrices requieren dos
        // bucles anidadados. Un bucle se encarga del indice para la
        // dimension X y el otro bucle se encarga para el eje Y

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 25 elementos ");
        for (int i = 0; i < datos.length; i++) {  // eje x
            for (int j = 0; j < datos.length; j++) {  // eje y
                datos[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                System.out.print(" " + datos[i][j]);
            }
        }
        System.out.println("-----------------------");
        System.out.println(Arrays.deepToString(datos));
    }
}
