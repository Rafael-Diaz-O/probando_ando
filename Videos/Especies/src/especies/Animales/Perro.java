package especies.Animales;

import especies.Mamifero;
        
public class Perro extends Mamifero {
    
    public Perro(String color,int numeroDePatas){
        super(color,numeroDePatas);
        
    }
    
    @Override
    
    public void hacerMovimiento(){
            System.out.println("Caminar");
    }
    
    public void hacerSonido(){
        System.out.println("Guau,Guau");
    }
    
}
