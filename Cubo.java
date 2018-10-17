package cuboobjetos;


import java.lang.Math;

public class Cubo extends Cuadrado
{
 //Cualculos del cubo
     public double cubo;

    public Cubo(double lado) {
        super(lado);

        this.cubo = lado;
    }
    
    
    public  double calVolumen(){
        return Math.pow(this.cubo, 3);
    }

    public   double calPerimetro(boolean is_super){

        if (is_super){
           return super.CalcularPerimetro();
        }
        else{
            return this.cubo*12;
        }
    }
}