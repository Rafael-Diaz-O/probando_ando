
package especies.Animales;

import especies.Ave;

public class Pato extends Ave{
    
    public Pato(String color,int numeroDePatas){
        super(color,numeroDePatas);
        
    }
    
    @Override
    
    public void hacerMovimiento(){
            System.out.println("Nadar y volar");
    }
    
    public void hacerSonido(){
        System.out.println("cuac-cuac");
    }
    
}
