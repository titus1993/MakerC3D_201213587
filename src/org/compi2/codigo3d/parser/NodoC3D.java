package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad, temp;
    public String etqv = "";
    public String etqf = "";

    public NodoC3D(String temp, String cad, String v, String f) {
        this.cad = cad;
        this.etqv = v;
        this.etqf = f;
        this.temp = temp;
    }
    
    public String getCad(){
        return cad;
    }
        
    public String getTemp(){
        return temp;
    }
}
