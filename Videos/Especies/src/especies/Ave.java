package especies;

public abstract class Ave extends AnimalesVertebrados{
    
    public Ave(String color,int numeroDePatas){
        super(color,numeroDePatas);
        
    }
    
    @Override 
     
    public void hacerMovimiento(){
        System.out.println("vuelan y picotean ");
    }
    
    public void hacerSonido(){
        System.out.println("");
    }
    
   
    
}
