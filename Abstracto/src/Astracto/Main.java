
package Astracto;

public class Main {
    public static void main (String []args){
        
        Planta bonsay = new Planta ();
        bonsay.alimentarse();
        
        Animal_carnivoro leopardo=new Animal_carnivoro();
        leopardo.alimentarse();
        
        Animal_Hervivoro caballo = new Animal_Hervivoro();
        caballo.alimentarse();
    }
    
}
