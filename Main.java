package cuboobjetos;

import java.util.Scanner;

public class Main {
    static Cubo cub;
    static double x;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        PNumero ();
        print ();
        scanner.nextLine();
    }
    //Salida
    private static void print(){
        int  opcion =Menu();
        String valor="";
        
        while(opcion != 5){
            switch(opcion){
            case 1:  
                valor="perimetro";
                break;
            case 2:
                valor="área";
                break;
            case 3:
                valor="volúmen";
                break;
            case 4:
                valor="volúmen del cubo";
                break;
    }
            x = calcular(opcion ,cub);
            
            System.out.println("El "+valor+" es " +x+ "\n");
            
            opcion = Menu();
        }
        PNumero();
        print();
    }

    //Valor del lado
    private static void PNumero(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuanto vale el lado? ");
        try{
            double lado  = Double.parseDouble( scanner.nextLine());
            cub = new Cubo(lado);
        }
        catch (NumberFormatException nfe){
            System.out.println ("Error, verifique que el valor introducido sea un numero");
            PNumero();
        }



    }

    //Llamada a los calculos
    public static double calcular( int opciones, Cubo cubo){

        double resultado = 0;
        switch (opciones){
            case 1: resultado =cubo.calPerimetro(true); break;
            case 2: resultado = cubo.CalcularArea (); break;
            case 3: resultado = cubo.calVolumen(); break;
            case 4: resultado = cubo.calPerimetro(false); break;
            case 5: PNumero();break;
            case 6: System.exit (0);break;

        }
        return resultado;
    }
    //Imprimir menu
    public static int Menu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija alguna opción");
        System.out.println ("¿Qué desea calcular?");
        System.out.println ("1) Perímetro");
        System.out.println ("2) Área");
        System.out.println ("3) Volúmen");
        System.out.println ("4) Perímetro de un cubo");
        System.out.println ("5) Comenzar de nuevo");
        System.out.println ("6) Salir");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int opcion  = Integer.parseInt(entrada.nextLine());
        return opcion;
    }
}