package com.company.creativity.colecciones.matrices;

public class BreakContinue {
    public static void main(String[] args) {
        char[][] matrix = {
                {'A', 'B', 'C', 'D', 'E'},
                {'F', 'G', 'H', 'I', 'K'},
                {'L', 'M', 'N', 'O', 'P'},
                {'Q', 'R', 'S', 'T', 'U'},
                {'V', 'W', 'X', 'Y', 'Z'}};

        StringBuilder stb = new StringBuilder();
        outerLoopLabel:        //etiqueta de lazo exterior
        for (char[] row : matrix) {
            for (char value : row) {
                if (value == 'C') {
                    continue;     //salta y vuelve al inicio de la condicional
                }
                if (value == 'H') {
                    continue outerLoopLabel;
                }
                if (value == 'N') {
                    break;      //sale y vuelve al inicio de la condicional
                }
                if (value == 'S') {
                    break outerLoopLabel;
                }
                stb.append(value);
            }
            stb.append("\n");
        }
        System.out.println(stb);
    }
}
