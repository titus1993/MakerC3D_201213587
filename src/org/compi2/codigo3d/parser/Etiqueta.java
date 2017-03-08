/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.compi2.codigo3d.parser;

/**
 *
 * @author Titus
 */
public class Etiqueta {

    public static int contador = -1;

    public static String generarEtq() {
        contador++;
        return "L"+contador;
    }
    
    public static void setear(){
        contador = -1;
    }
}
