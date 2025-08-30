package especies.Animales;

import especies.Mamifero;

public class Gato extends Mamifero{
    
    public Gato(String color,int numeroDePatas){
        super(color,numeroDePatas);
        
    }
    
    @Override
    
    public void hacerMovimiento(){
            System.out.println("Caminar");
    }
    
    public void hacerSonido(){
        System.out.println("Miau,miau");
    }
    
}
