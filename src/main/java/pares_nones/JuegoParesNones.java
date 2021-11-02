
package pares_nones;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class JuegoParesNones {
    public static void main(String[] args) {
        
        //declaracion y initializacion variables
        int opcion;
        Scanner entrada=new Scanner(System.in);
        
         do {// el progrma repite hasta que opcion seria 3
             
            System.out.print("Elija que quieres Pares o Nones : ");
            opcion = entrada.nextInt();
            
            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("1.Manual");
            System.out.println("2.Automatico");
            System.out.println("3. Finalizar");
            
          switch (opcion) {
             
            case 1: 
                   
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
