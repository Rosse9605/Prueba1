
package Polimorfismo;

public class Main {
    public static void main(String[] args) {
   
        //vectores: espacio en memoria de un tipo especifico de datos 
        
       // String  a[] = new String [5];
       
       Transporte transporte1 [] = new Transporte [3];
       
       transporte1 [0] = new Taxi();
       transporte1 [1] = new Bus();

        
        
        //instanciar los objetos
        
        Transporte c= new Transporte();
        Transporte a = new Taxi();
        Transporte b= new Bus();
        
       c.mostrar();
       a.mostrar();
       b.mostrar();
        
    }
    
}
