
package pares_nones;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class JuegoParesNones {
    public static void main(String[] args) {
        
        //declaracion y initializacion variables
        int opcion,opcionP,pare = 0,noneP = 0,suma;
        boolean esPar;
        Scanner entrada=new Scanner(System.in);
        
         do {// el progrma repite hasta que opcion seria 3
             
            System.out.print("Elija una opcion: ");
            opcion = entrada.nextInt();
            
            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("1.Manual");
            System.out.println("2.Automatico");
            System.out.println("3. Finalizar");
            
          switch (opcion) {
             
            case 1: 
                     System.out.print("Elija que quieres Pares o Nones : ");
                     opcionP = entrada.nextInt();
                     System.out.println("-------------------------");
                     System.out.println("1.Pares");
                     System.out.println("2.Nones");
                     
                     switch(opcionP){
                         //jugador A coge una opcion
                         case 1:
                             System.out.println("Elija un numero pare");
                             pare=entrada.nextInt();
                             esPar=true;
                             break;
                             
                         case 2:
                             System.out.println("Elija un numero nonePare");
                             noneP=entrada.nextInt();
                             esPar=false;
                          break;
         
                     }
                         //el jugador B lo queda una opcion
                            System.out.println("que numero quieres eligir: ");
                            if(esPar=true){
                             System.out.println("Elija un numero nonePare");
                             noneP=entrada.nextInt();
                            }
                            suma=noneP+pare;
                            if(suma%2==0){
                                System.out.println("el jugador que gana es A porque el resulta es par");
                            }else{
                                System.out.println("el jugador que gana es B porque el resulta es Nonepar");
                            }
                     
                
                
                break;

            case 2:
                
                break;
            default :
                 System.out.println("eliger opcion valida");
        }

        } while (opcion!= 3);
         
        System.out.println(" Finalizar");

    }
}
