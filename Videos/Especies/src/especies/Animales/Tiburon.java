package especies.Animales;

import especies.Pez;

public class Tiburon extends Pez {
    
    public Tiburon (String color,int numeroDePatas){
        super(color,numeroDePatas);
        
    }
    
    @Override
    
    public void hacerMovimiento(){
            System.out.println("Nadar");
    }
    
    public void hacerSonido(){
        System.out.println("szzz");
    }
}
