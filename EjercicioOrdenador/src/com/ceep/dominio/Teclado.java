
package com.ceep.dominio;


public class Teclado extends DispositivoEntrada {
    
    private int teclado;
    private int contadorTeclado;

    public Teclado (String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.teclado = teclado;
        this.contadorTeclado = contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" + "teclado=" + teclado + ", contadorTeclado=" + contadorTeclado + '}';
    }
    
    
    
}
