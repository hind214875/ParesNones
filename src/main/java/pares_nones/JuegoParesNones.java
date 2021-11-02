
package pares_nones;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class JuegoParesNones {
    public static void main(String[] args) {
        
        //declaracion y initializacion variables
        int opcion,opcionP,pare,none;
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
                         case 1:
                             System.out.println("Elija un numero pare");
                             pare=entrada.nextInt();
                             if(pare%2==0){
                                 esPar=true;
                             }else{
                                 esPar=false;
                                 System.out.println("El numero no es Par eliga otro");
                                 pare=entrada.nextInt();
                             }
                             break;
                             
                         
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
