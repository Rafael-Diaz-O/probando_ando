package especies.Animales;

import especies.Ave;

public class Gallo extends Ave{
    
    public Gallo(String color,int numeroDePatas){
        super(color,numeroDePatas);
        
    }
    
    @Override
    
    public void hacerMovimiento(){
            System.out.println("Volar y picotear");
    }
    
    public void hacerSonido(){
        System.out.println("quiquiriqui");
    }
    
}
