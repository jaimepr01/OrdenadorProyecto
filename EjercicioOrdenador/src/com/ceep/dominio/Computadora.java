
package com.ceep.dominio;


public class Computadora {

    private static int idComputadora;
    private String nombre;
    Monitor monitor;
    Teclado teclado;
    Raton raton;

    public Computadora() {
    }

    public Computadora( String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this.idComputadora=++idComputadora;
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Raton getRaton() {
        return raton;
    }
    

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
    
    
    
    
    
    
}
