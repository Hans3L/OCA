package com.company.creativity.colecciones.matrices;

import java.util.Arrays;

public class ClaseArray {
    private static int op;

    public static void main(String[] args) {

        op = 4;
        //forma de declar 1
        int tabla[];
        tabla = new int[]{1, 5, 6, 7, 10, 20, 96};
        //forma de declar 2
        int tabla2[] = new int[10];
        switch (op) {
            case 1:
                System.out.println(tabla.length);
                System.out.println(tabla2.length);
                break;
            case 2:
                // mostrar 1
                for (int i = 0; i < tabla.length; i++) {
                    System.out.println("valores del eje X tabla -> " + tabla[i]);
                }
                //mostrar 2
                for (int i = 0; i < tabla2.length; i++) {
                    System.out.println("valores del eje X tabla2 -> " + tabla2[i]);
                }
                break;
            case 3:
                //mostrar en corchetes los arrays
                System.out.println(Arrays.toString(tabla));
                System.out.println(Arrays.toString(tabla2));
                break;
            case 4:
                String[] name1 = {"Mary", "Ann", "Jane", "Tom"};
                String[] name2 = {"Mary", "Ann", "John", "Tom"};

                boolean isTheSame = Arrays.equals(name1, name2);
                System.out.println("Son los mismos valores: " + isTheSame);
                Arrays.sort(name2);
                for (String value: name2) {
                    System.out.println(value);
                }
                System.out.println(" ");
                Arrays.sort(name2, new LengthCompare());
                for (String value: name2) {
                    System.out.println(value);
                }

                int x = Arrays.binarySearch(name1, "Tom");
                System.out.println("Se encuentra en el indice:  " + x);
        }
    }

}
