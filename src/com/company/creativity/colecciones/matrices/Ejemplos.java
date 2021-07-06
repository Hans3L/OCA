package com.company.creativity.colecciones.matrices;

import java.util.Arrays;

public class Ejemplos {

    private static int op;

    static int[][] tabla;
    public static void main(String[] args) throws Exception {

        op = 6;

        switch (op){
            case 1:
                mostrar();
                break;
            case 2:
                reverserTabla();
                break;
            case 3:
                mostrarDiagonalPrincipal();
                break;
            case 4:
                int [] [] m1 = {{2,0,1},
                                {3,0,0},
                                {5,1,1}};
                int [] [] m2 = {{1,0,1},
                                {1,2,1},
                                {1,1,0}};
                sumTwoMatrices(m1,m2);
                break;
            case 5:
                int [] [] mt1 = {{3,-1},{2,-4}};
                int [] [] mt2 = {{7,2},{3,1}};
                int [] [] mt3 = {{-1,-2},{-3,4}};
                sumThreeMatrices(mt1,mt2,mt3);
                break;
            case 6:
                int [] [] mtz1 = {{2,0},{1,3}};
                int [] [] mtz2 = {{-1,-1},{5,6}};
                multiTwoMatrices(mtz1,mtz2);
                break;
        }
        /**
         * 1
         *      7
         *          13
         *              18
         *                  25
         */

        tabla = new int[][]
                {{1, 2, 3, 4, 5},         // -4
                 {6, 7, 8, 9, 10},        // -3
                 {11, 12, 13, 14, 15},    // -2
                 {16, 17, 18, 19, 20},    // -1
                 {21, 22, 23, 24, 25}};   //  0


    }

    private static void mostrar(){
        for (int i = 0; i < tabla.length; i++) { // eje X
            for (int j = 0; j < tabla.length; j++) { // eje y
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void reverserTabla(){
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.print(tabla[4-i][4-j] + " ");
            }
            System.out.println();
        }
    }
    private static void mostrarDiagonalPrincipal() {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length - 4; j++) {
                System.out.print(tabla[i][i] + " ");
            }
            System.out.println(tabla[i][1] + "           ");
        }
    }

    private static void sumTwoMatrices(int[][] m1,int[][] m2) throws Exception {
        int filaMatriz1 = m1.length;
        int filaMatriz2 = m2.length;
        int columnaMatriz1 = m1[0].length;
        int columnaMatriz2 = m2[0].length;

        int[][] result = new int [m1.length][m2[0].length];

        if (filaMatriz1 == filaMatriz2 && columnaMatriz1 == columnaMatriz2) {

            for (int i = 0; i < m1.length; i++) {
                System.out.print("[ ");
                for (int j = 0; j < m2.length; j++) {
                    result[i][j] = m1[i][j] + m2[i][j];
                    System.out.print(result[i][j] + " ");
                }
                System.out.println("]");
            }
        } else {
            throw new Exception("No tienen la misma dimensión de columnas y filas");
        }
    }

    private static void sumThreeMatrices(int[][] mt1,int[][] mt2, int[][] mt3) throws Exception {
        int filaMatriz1 = mt1.length;
        int filaMatriz2 = mt2.length;
        int columnaMatriz1 = mt1[0].length;
        int columnaMatriz2 = mt2[0].length;
        int filaMatriz3 = mt3.length;
        int columnaMatriz3 = mt3[0].length;

        int[][] result = new int [mt1.length][mt3[0].length];

        if (filaMatriz1 == filaMatriz2 && columnaMatriz1 == columnaMatriz2 && filaMatriz3 == filaMatriz1 && columnaMatriz3 == columnaMatriz2) {

            for (int i = 0; i < mt1.length; i++) {
                System.out.print("[ ");
                for (int j = 0; j < mt2.length; j++) {
                    result[i][j] = mt1[i][j] + mt2[i][j] + mt3[i][j];
                    System.out.printf(" %,d ", result[i][j]);
                }
                System.out.println("]");
            }
        } else {
            throw new Exception("No tienen la misma dimensión de columnas y filas");
        }
    }

    private static void multiTwoMatrices(int[][] mtz1, int[][] mtz2) throws Exception {
        //todo falta terminar
        int filaMatriz1 = mtz1.length;
        int filaMatriz2 = mtz2.length;
        int columnaMatriz1 = mtz1[0].length;
        int columnaMatriz2 = mtz2[0].length;

        int result[][] = new int[filaMatriz2][columnaMatriz1];
        if (filaMatriz1 == columnaMatriz2) {
            for (int i = 0; i < mtz1.length; i++) {
                System.out.print("[ ");
                for (int j = 0; j < filaMatriz2; j++) {
                    result[i][j] = mtz1[i][j] * mtz2[i][j];
                    System.out.printf(" %,d ", result[i][j]);
                }
                System.out.println("]");
            }
        } else {
            throw new Exception("Las filas y columnas de ambas matrices no son lo mismo");
        }
    }
}
