/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_morse;

import java.util.Scanner;

/**
 *
 * @author Sair
 */
public class Ej1_Morse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char mor;
        int espacio=0;
        String mensaje="",palabra="", español="";
        mensaje = mensaje.toLowerCase();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija una opcion M | A");
        String ent = entrada.nextLine();
            
       if(ent.equals("a")||ent.equals("A")){
           System.out.println("Teclee la palabra.");
           palabra = entrada.nextLine(); 
           palabra= palabra.toUpperCase();
        String scanA[] ={
        /*----------------------------LETRAS-------------------------*/    
        "._ ",   /*a*/
        "-... ", /*b*/
        "-.-. ", /*c*/
        "-.. ",  /*d*/
        ". ",    /*e*/
        "..-. ", /*f*/
        "--. ",  /*g*/
        ".... ", /*h*/
        ".. ",   /*i*/
        ".--- ", /*j*/
        "-.- ",  /*k*/
        ".-.. ", /*l*/
        "-- ",   /*m*/
        "-. ",   /*n*/
        "--- ",  /*o*/
        ".--. ", /*p*/
        "--.- ", /*q*/
        ".-. ",  /*r*/
        "... ",  /*s*/
        "- ",    /*t*/
        "..- ",  /*u*/
        "..._ ", /*v*/
        ".-- ",  /*w*/
        "-..- ", /*x*/
        "-.-- ", /*y*/
        "--.. ", /*z*/
        
        /*----------------------------NUMEROS-------------------------*/
        ".---- ", /*1*/
        "..--- ", /*2*/
        "...-- ", /*3*/
        ".....- ",/*4*/
        "..... ", /*5*/
        ".... ",  /*6*/
        "--... ", /*7*/
        "---.. ", /*8*/
        "----. ", /*9*/
        "----- ", /*0*/
        "  "};    /*Espacio*/
        
        String scanF="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
        
        for (int x = 0 ; x < palabra.length(); x++) {
            int pos = scanF.indexOf(palabra.charAt(x));
            español+=scanA[pos];
        }
        System.out.println(español);}
     /*--------------------------------------------------------------*/
     if(ent.equals("m")||ent.equals("M")){
        System.out.println("Teclee Texto.");
        palabra = entrada.nextLine(); 
     String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
     String morse = " ";
        String scanB[] ={
        /*----------------------------LETRAS-------------------------*/  
        ".-",   /*a*/
        "-...", /*b*/
        "-.-.", /*c*/
        "-..",  /*d*/
        ".",    /*e*/
        "..-.", /*f*/
        "--.",  /*g*/
        "....", /*h*/
        "..",   /*i*/
        ".---", /*j*/
        "-.-",  /*k*/
        ".-..", /*l*/
        "--",   /*m*/
        "-.",   /*n*/
        "---",  /*o*/
        ".--.", /*p*/
        "--.-", /*q*/
        ".-.",  /*r*/
        "...",  /*s*/
        "-",    /*t*/
        "..-",  /*u*/
        "...-", /*v*/
        ".--",  /*w*/
        "-..-", /*x*/
        "-.--", /*y*/
        "--..", /*z*/
        
        /*----------------------------NUMEROS-------------------------*/
        ".----", /*1*/
        "..---", /*2*/
        "...--", /*3*/
        "....-", /*4*/
        ".....", /*5*/
        "-....", /*6*/
        "--...", /*7*/
        "---..", /*8*/
        "----.", /*9*/
        "-----", /*0*/
        " "};    /*espacio*/
				
        String oracion[] = palabra.split(" ");
        //Salida de texto
        for  (int i = 0; i < oracion.length; i++){
            espacio=0;
            for (int j = 0; j < 37; j++){        
                if (oracion[i].equals(scanB[j])) {
                    morse = morse+letras.charAt(j);
                    //Validar espacios
                        if(palabra.charAt(i) != ' '){
                            espacio=0;
                        }
                break;
                }else{
                    espacio=espacio+1;
                        if(espacio==3){
                            morse = morse+" ";
                        }
                    }       
                }
            }
        System.out.println(morse);
        }
   }
}
