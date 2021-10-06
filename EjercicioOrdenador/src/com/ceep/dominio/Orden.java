
package com.ceep.dominio;

public class Orden {
    
    private static int idOrden;
    Computadora computadoras[];
    private int contadorOrdenes;
    private static int contadorComputadoras;
    private static int maxComputadoras=10;

    public Orden() {
        Orden.contadorComputadoras= 0;
        computadoras = new Computadora[Orden.maxComputadoras];
        this.idOrden = ++idOrden;
    }
    
    
    public void agregarComputadora(Computadora computadora){
        if (contadorComputadoras<maxComputadoras) {
                computadoras[contadorComputadoras++]=computadora;
                System.out.println("Se ha agregado correctamente tu computadora");  
        }else{
            System.out.println("No se pueden agregar más computadoras, su limite es: "+ maxComputadoras );
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Nº de orden: "+idOrden);
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println("Id Computadora: "+ computadoras[i].getIdComputadora());
            System.out.println("Nombre de la computadora: "+computadoras[i].getNombre());
            System.out.println("Nombre del teclado: "+computadoras[i].teclado.getMarca());
            System.out.println("Nombre del monitor: "+computadoras[i].monitor.getMarca());
            System.out.println("Nombre del raton: "+computadoras[i].raton.getMarca());
            System.out.println("================================================");
        }
        
        System.out.println("");
        
    }
    
    
}
