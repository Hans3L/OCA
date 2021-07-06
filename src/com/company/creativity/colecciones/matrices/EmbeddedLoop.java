package com.company.creativity.colecciones.matrices;


public class EmbeddedLoop {
    static char[][] game = {
            {'o', 'x', 'x'},
            {'x', 'x', 'o'},
            {'o', ' ', 'o'}
    };

    static StringBuilder txt = new StringBuilder();

    public static void main(String[] args) {
        for (int i = 0; i < game.length; i++) {
            int j = 0;
            while (j < game[i].length){
                txt.append(game[i][j]);
                j++;
            }
            txt.append("\n");
        }

        System.out.println(txt);

        for (char[] row : game ) {     //eje x
            for (char value: row) {
                //System.out.println(value);
                txt.append(value);
            }
            txt.append("\n");
        }
        System.out.println(txt);
    }
}
