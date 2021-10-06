
package com.ceep.test;

import com.ceep.dominio.Computadora;
import com.ceep.dominio.Monitor;
import com.ceep.dominio.Orden;
import com.ceep.dominio.Raton;
import com.ceep.dominio.Teclado;


public class testComputadora {
    public static void main(String[] args) {
        
        Monitor m1 = new Monitor("LG OLED",22.5);
        Monitor m2 = new Monitor("Samsung-led", 24.0);
        Monitor m3 = new Monitor("Hp",16.3);
        
        Raton r1 = new Raton("USB","Netway");
        Raton r2 = new Raton("USB","Rider");
        Raton r3 = new Raton("Inalámrico","hp");
        
        Teclado t1 = new Teclado ("USB","HP");
        Teclado t2 = new Teclado ("Inalábrico","Acer-250");
        Teclado t3 = new Teclado ("USB","Logitech");
        
        
        Computadora comp1 = new Computadora("Hp-gaming",m1,t1,r1);
        Computadora comp2 = new Computadora("Hp",m2,t2,r2);
        Computadora comp3 = new Computadora("Acer",m3,t3,r3);
        
        Orden orden1 = new Orden ();
        Orden orden2 = new Orden ();
        Orden orden3 = new Orden ();
        
        
        orden1.agregarComputadora(comp1);
        
        
        orden1.agregarComputadora(comp2);
        orden1.mostrarOrden();
        
    }
}
