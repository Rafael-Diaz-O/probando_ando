package especies;


public abstract class AnimalesVertebrados {
    
    private String color;
    private int numeroDePatas;
    
    public AnimalesVertebrados(String color,int numeroDePatas){
        this.color = color;
        this.numeroDePatas = numeroDePatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
    
    public boolean tienePatas(){
        if(numeroDePatas > 0){
            System.out.println("El tiene " + numeroDePatas + "patas");
            return true;
        }else{
            System.out.println("El animal no tiene patas");
            return false;
        }
        
    }
    
    public boolean tieneDientes(){
        System.out.println("El tiene dientes");
        return true;
    }
    
    
    public abstract void hacerMovimiento();
    public abstract void hacerSonido();
    
    
    
}
