package com.company.creativity.variables;

import com.company.creativity.clases.clase.Mini;

public class TypeVariable {

    //variable final

    private final String cambio= "cambio";

    //variable primitivos
    int a,b,x;
    char amount;


    // variable referencia
    Object name;
    Mini mini;
    String saludo;

    //variable instancia
    //Las variables de instancia se definen dentro de la clase,
    // pero fuera de cualquier método, y se inicializan solo cuando
    // se instancia la clase
    //no pueden tener abstract, synchronized, native, o strictfp.
    //pero puede ser modificadores transient , final, o volatile

     private String varInstance =" 55";

    //variable local
    public void VariableLocal(){
        // private int a; // nunca puede existir un modificador dentro de un metodo
        final String typeSave; // modificador correcto de una variable local
        int inicializar;
       // System.out.println(inicializar);  //una variable local dentro
                                           // de un metodo siempre de debe inicializar
    }

    public void changeVariable(){
      //  cambio = "Rosa";  //un final variable no puede cambiar su variable de referencia
    }

}