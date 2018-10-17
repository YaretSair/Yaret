/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_numromanos;

import java.util.Scanner;

/**
 *
 * @author Sair
 */
public class Ej2_NumRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      String desea;
      do{
      System.out.println("Ingresa numero entre 1 y 1000");
      int num = entrada.nextInt();
      int unidad=num%10;
      int desena=(num/10)%10;
      int centena=num/100;
      
        // TODO code application logic here
      String Unidad[]={
          "",     
          "I",    /*1*/
          "II",   /*2*/
          "III",  /*3*/
          "IV",   /*4*/
          "V",    /*5*/
          "VI",   /*6*/
          "VII",  /*7*/
          "VIII", /*8*/
          "IX"};  /*9*/
      String Decena[]={
          "",  
          "X",    /*10*/
          "XX",   /*20*/
          "XXX",  /*30*/
          "XL",   /*40*/
          "L",    /*50*/
          "LX",   /*60*/
          "LXX",  /*70*/
          "LXXX", /*80*/
          "XC"};  /*90*/
      String Centena[]={
          "",
          "C",    /*100*/
          "CC",   /*200*/
          "CCC",  /*300*/
          "CD",   /*400*/
          "D",    /*500*/
          "DC",   /*600*/
          "DCC",  /*700*/
          "DCCC", /*800*/
          "CM"};  /*900*/
      String Milesima[]={
          "",
          "M"};   /*1000*/
      
        
    if(num>999){
          System.out.println(Milesima[1]);
          }else{
              if(num>=100){         
                  System.out.println(Centena[centena]+Decena[desena]+Unidad[unidad]);
                  }else{
                      if(num>=10){
                          System.out.println(Decena[desena]+Unidad[unidad]);          
                              }else{
                                  System.out.println(Unidad[num]);          
                                }         
                    }
            }
    System.out.println("¿Desea introducir otro numero? (S/N)");
     desea = entrada.next();
      }while("S".equals(desea)||"s".equals(desea));
      }          
}