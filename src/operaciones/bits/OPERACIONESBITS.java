/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones.bits;

import java.util.Scanner;

/**
 *
 * @author esanc
 */
public class OPERACIONESBITS {


    public static void main(String[] args) {
int k = 255;   // k: 00000000000000000000000010000100
int l = 144;   // l: 00000000000000000000000010010000  
int m = k & l; // m: 00000000000000000000000010000000 
//System.out.println("El resultado and es "+m);


    int segmento1ip; int segmentomask1=0;
    int segmento2ip; int segmentomask2=0;
    int segmento3ip; int segmentomask3=0;
    int segmento4ip; int segmentomask4=0;
    
    int segmentored1;
    int segmentored2;
    int segmentored3;
    int segmentored4;
    
    int segmentowildcard1; int wilcardresta1=255;
    int segmentowildcard2;int wilcardresta2=255;
    int segmentowildcard3;int wilcardresta3=255;
    int segmentowildcard4;int wilcardresta4=255;
    
    int broadcast1;
    int broadcast2;
    int broadcast3;
    int broadcast4;
    
    int primeraip;
    int ultimaip;
    
int bits=0;
Scanner sc= new Scanner(System.in);


System.out.println("Ingrese el numero de bits para la mascara ");
        bits = sc.nextInt();
switch(bits) {
  case 1:
      segmentomask1=128;
      segmentomask2=0;
      segmentomask3=0;
      segmentomask4=0;
    break;
  case 2:
      segmentomask1=192;
      segmentomask2=0;
      segmentomask3=0;
      segmentomask4=0;
    break;
  case 3:
     segmentomask1=224;
      segmentomask2=0;
      segmentomask3=0;
      segmentomask4=0;
    break;
  case 4:
      segmentomask1=240;
      segmentomask2=0;
      segmentomask3=0;
      segmentomask4=0;
    break;
     case 5:
      segmentomask1=248;
      segmentomask2=0;
      segmentomask3=0;
      segmentomask4=0;
    break;
     case 6:
      segmentomask1=252;
      segmentomask2=0;
      segmentomask3=0;
      segmentomask4=0;
    break;
     case 7:
      segmentomask1=254;
      segmentomask2=0;
      segmentomask3=0;
      segmentomask4=0;
    break;
     case 8:
      segmentomask1=255;
      segmentomask2=0;
      segmentomask3=0;
      segmentomask4=0;
    break;
     case 9:
      segmentomask1=255;
      segmentomask2=128;
      segmentomask3=0;
      segmentomask4=0;
    break;
     case 10:
      segmentomask1=255;
      segmentomask2=192;
      segmentomask3=0;
      segmentomask4=0;
    break;
     case 11:
      segmentomask1=255;
      segmentomask2=224;
      segmentomask3=0;
      segmentomask4=0;
    break;
     case 12:
      segmentomask1=255;
      segmentomask2=240;
      segmentomask3=0;
      segmentomask4=0;
    break;
     case 13:
      segmentomask1=255;
      segmentomask2=248;
      segmentomask3=0;
      segmentomask4=0;
    break;
     case 14:
      segmentomask1=255;
      segmentomask2=252;
      segmentomask3=0;
      segmentomask4=0;
    break;
     case 15:
      segmentomask1=255;
      segmentomask2=254;
      segmentomask3=0;
      segmentomask4=0;
    break;
     case 16:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=0;
      segmentomask4=0;
    break;
     case 17:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=128;
      segmentomask4=0;
    break;
case 18:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=192;
      segmentomask4=0;
    break;
case 19:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=224;
      segmentomask4=0;
    break;
case 20:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=240;
      segmentomask4=0;
    break;
case 21:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=248;
      segmentomask4=0;
      break;
case 22:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=252;
      segmentomask4=0;
    break;
case 23:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=254;
      segmentomask4=0;
    break;
case 24:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=255;
      segmentomask4=0;
    break;
case 25:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=255;
      segmentomask4=128;
    break;
case 26:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=255;
      segmentomask4=192;
    break;
case 27:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=255;
      segmentomask4=224;
    break;
case 28:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=255;
      segmentomask4=240;
    break;
case 29:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=255;
      segmentomask4=248;
    break;
    case 30:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=255;
      segmentomask4=252;
    break;
    case 31:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=255;
      segmentomask4=254;
    break;
    case 32:
      segmentomask1=255;
      segmentomask2=255;
      segmentomask3=255;
      segmentomask4=255;
    break;
    
  default:
    System.out.println("No puede superar los 32 bits .");
    
}
System.out.println("TU ID MASCARA ES: "+segmentomask1+"."+segmentomask2+"."+segmentomask3+"."+segmentomask4);
        //1
        System.out.println("Ingrese el primer segmento de la ip en decimal: ");
        segmento1ip = sc.nextInt();
   
   segmentored1= segmento1ip & segmentomask1;
    System.out.println("El segmento de red 1 es : "+segmentored1);
    
    
    //2
    System.out.println("Ingrese el segundo segmento de la ip en decimal: ");
        segmento2ip = sc.nextInt();
   
   segmentored2= segmento2ip & segmentomask2;
    System.out.println("El segmento de red 2 es : "+segmentored2);
    
    //3
    System.out.println("Ingrese el tercer segmento de la ip en decimal: ");
        segmento3ip = sc.nextInt();
   
   segmentored3= segmento3ip & segmentomask3;
    System.out.println("El segmento de red 3 es : "+segmentored3);
    
    //4
    System.out.println("Ingrese el cuarto segmento de la ip en decimal: ");
        segmento4ip = sc.nextInt();
   
   segmentored4= segmento4ip & segmentomask4;
    System.out.println("El segmento de red 4 es : "+segmentored4);
    
          System.out.println("TU ID RED ES: "+segmentored1+"."+segmentored2+"."+segmentored3+"."+segmentored4);
          
        //WILDCARD
        
        //Como los enteros negativos en Java se representan con el método del complemento a dos, 
        //podemos realizar un sencillo experimento de cambiarle el signo a un número.
        //Para realizarlo debemos aplicar a un entero el operador NOT y sumarle uno.   https://es.wikibooks.org/wiki/Programación_en_Java/Operadores_de_bits

        //AQUI SE TRANSFORMA AL NEGATIVO
         segmentowildcard1=  ~ (segmentomask1)+1;
           segmentowildcard2=  ~ (segmentomask2)+1;
              segmentowildcard3=  ~ (segmentomask3)+1;
             segmentowildcard4=  ~ (segmentomask4)+1;
             
             
        //AQUI SE REALIZA LA RESTA Y DA EL RESULTADO
                 segmentowildcard1=  wilcardresta1+segmentowildcard1;
                  segmentowildcard2=  wilcardresta2+segmentowildcard2;
                   segmentowildcard3=  wilcardresta3+segmentowildcard3;
                    segmentowildcard4=  wilcardresta4+segmentowildcard4;
             
             

                
     System.out.println("TU WILDCARD ES: "+segmentowildcard1+"."+segmentowildcard2+"."+segmentowildcard3+"."+segmentowildcard4);
          
     
     
     
        //CALCULO BROADCAST
        broadcast1  = segmentored1 ^ segmentowildcard1;
        broadcast2  = segmentored2 ^ segmentowildcard2;
        broadcast3  = segmentored3 ^ segmentowildcard3;
        broadcast4  = segmentored4 ^ segmentowildcard4;
     System.out.println("TU BROADCAST ES: "+broadcast1+"."+broadcast2+"."+broadcast3+"."+broadcast4);
     
     
     //PRIMERA IP
     primeraip= segmentored4+1;
     System.out.println("TU PRIMERA IP ES: "+segmentored1+"."+segmentored2+"."+segmentored3+"."+primeraip);
     
     //ULTIMA IP
     ultimaip=broadcast4-1;
     System.out.println("TU ULTIMA IP ES: "+broadcast1+"."+broadcast2+"."+broadcast3+"."+ultimaip);
     
     
     
    }
    
}
    

