
package pares_nones;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class JuegoParesParteA {
    public static void main(String[] args) {
        //declaracion y initializacion variables
        int opcion,opcionP,numeroA,numeroB,suma;
        boolean esPar=false;
        Scanner entrada=new Scanner(System.in);
        
         do {// el progrma repite hasta que opcion seria 3
             

            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("1.Manual");
            System.out.println("2.Automatico");
            System.out.println("3. Finalizar");
            
            System.out.println("Elija una opcion: ");
            opcion = entrada.nextInt();
          switch (opcion) {
             
            case 1: 
                     System.out.println("Elija que quieres Pares o Nones : ");
                     System.out.println("-------------------------");
                     System.out.println("1.Pares");
                     System.out.println("2.Nones");
                     opcionP = entrada.nextInt();
                     
                     switch(opcionP){
                         //jugador A coge una opcion
                         case 1: 
                             esPar=true;
                             break;
                             
                         case 2:   
                             esPar=false;
                          break;
         
                        }
                          do{
                              //el jugador A eliga un numero
                             System.out.println("JugadorA.Elija un numero: ");
                             numeroA=entrada.nextInt();
                          } while(numeroA>=0 && numeroA<=5);
                          
                          do{
                              //el jugador B lo queda una opcion
                            System.out.println("JugadorB:Eliga un numero: ");
                            numeroB=entrada.nextInt(); 
                          }while(numeroB>=0 && numeroB<=5);  
                            
                            //hago la suma de numeros que el jugadores eliga
                            suma=numeroA+numeroB;
                            
                            if(suma%2==0){//si es par entonces jugador A gana 
                               if(esPar==true){
                                 System.out.println("el jugador A que gana ");
                               }
                            }else{//si no el jogador B gana
                                System.out.println("el jugador B que gana");
                            }                   
                 
            break;

            case 2:
                /*----------------------------Automatico----------------------*/
                
                break;
            default :
                 System.out.println("eliger opcion valida");
        }

        } while (opcion!= 3);
         
        System.out.println(" Finalizar");

    }
}
