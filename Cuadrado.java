package cuboobjetos;

public class Cuadrado {

    //calculos de cuadrado
   public double cuadrado;

    public  Cuadrado(double lado) {
        this.cuadrado =  lado;
    }
    
    public  double CalcularArea(){
        return this.cuadrado * this.cuadrado;
    }
    
    public  double CalcularPerimetro()
    {
        return this.cuadrado *4;
    }
}