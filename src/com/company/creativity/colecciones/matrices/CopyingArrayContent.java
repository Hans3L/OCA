package com.company.creativity.colecciones.matrices;

import java.util.Arrays;

public class CopyingArrayContent {

    static char[] b1 = {'a', 'c', 'm', 'e'};
    static char[] b2 = Arrays.copyOf(b1, 5);

    static char[] a1 = {'a', 'c', 'm', 'e'};
    static char[] a2 = {'t','o',' ',' ',' '};

    public static void main(String[] args) {
        for (int i = 0; i < b2.length; i++) {
            System.out.println(b2[i]);
        }

        System.arraycopy(a1,2,a2,3,2);

        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }
    }
}
