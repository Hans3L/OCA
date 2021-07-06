package com.company.creativity.colecciones.matrices;

public class LoopsArrays {
    public static void main(String[] args) {
        int op = 2;

        switch (op) {
            case 1:
                int[][] matrix = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
                //todo 3 5 7
                for (int i = 0, j = 2; !(i == 3 || j == -1); i++, j--) {
                    int value = matrix[i][j];
                    System.out.println(value);
                }
                break;
            case 2:
                int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                int suma = 0;
                //for (int i = 0; i <= value.length; suma += i++)  //TODO
                for (int i = 0; i < value.length; suma += i++);

                    System.out.println(suma);
                    break;
        }
    }
}
