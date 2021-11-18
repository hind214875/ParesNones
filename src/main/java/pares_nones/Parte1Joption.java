/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pares_nones;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author hinda
 */
public class Parte1Joption {

    public static void main(String[] args) {
        //declarare y initializar variables
        int opcion = 0, jugadorA, jugadorB, suma;
        boolean esPare = false, seguir;
        String text;
        //pedir informaciones
        do {// un boucle que se repite hasta que el usuario elige Salir           
                text = JOptionPane.showInputDialog(null, "Menú de opciones"
                    + "\n1.Jugar"
                    + "\n2.Salir");     
                try {
                    opcion = Integer.parseInt(text);  
                } catch (NumberFormatException nfe) {
                    //Código para tratar el error
                    JOptionPane.showMessageDialog(null, "El formato del número introducido no es correcto.");
                } catch (InputMismatchException ime) {
                    JOptionPane.showMessageDialog(null, "has puesto algo malo elige 1/2");
                }

            switch (opcion) {
                case 1:
                    do {
                        text = JOptionPane.showInputDialog(null, "elige que quieres Pares o Nones : "
                                + "\n-------------------------"
                                + "\n1.Pares"
                                + "\n2.Nones"
                                + "\n3.Parar");
                        
                        try {
                            opcion = Integer.parseInt(text);
                            seguir=false;
                        } catch (InputMismatchException ime) {
                            JOptionPane.showMessageDialog(null, "has puesto algo malo elige 1/2 o 3");
                        } catch (NumberFormatException nfe) {
                            //Código para tratar el error
                            JOptionPane.showMessageDialog(null, "El formato del número introducido no es correcto.");    
                        }
                       

                        switch (opcion) {
                            case 1:
                                esPare = true;
                                break;

                            case 2:
                                esPare = false;
                                break;
                            case 3:
                                System.out.println("Termina");
                                System.exit(0);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Elige opcion valida");
                        }

                        do {//bucle Que se Repita si el numero de jugadorA menos que 0 o mas que 10
                            text = JOptionPane.showInputDialog(null, "JugadorA:Introduce un numero: ");
                            jugadorA = Integer.parseInt(text);
                        } while (jugadorA < 0 || jugadorA > 10);

                        do {//bucle que se repita si el numero de jugadorB menos que 0 o mas que 10
                            text = JOptionPane.showInputDialog("JugadorB.Introduce un numero: ");
                            jugadorB = Integer.parseInt(text);
                        } while (jugadorB < 0 || jugadorB > 10);

                        suma = jugadorA + jugadorB;
                        JOptionPane.showMessageDialog(null, "la suma es :" + suma);
                        if (suma % 2 == 0) {//si suma is pares
                            if (esPare) {//y esPare es true entonces jugador A gana
                                JOptionPane.showMessageDialog(null, "el jugador A que gana");
                            } else {
                                JOptionPane.showMessageDialog(null, "el jugador B que gana");
                            }
                        } else {
                            //la suma impares
                            if (esPare == false) {//si esPare es false B pierde entonces A gana
                                JOptionPane.showMessageDialog(null, "el jugador A que gana");
                            } else {//si no B que gana
                                JOptionPane.showMessageDialog(null, "el jugador B que gana");
                            }

                        }

                    } while (opcion == 1 || opcion == 2);//repite el bucle cuando opcion==1 or ==2
                    break;
                case 2:
                    JOptionPane.showInternalMessageDialog(null, "Terminar");
                    break;
            }

        } while (opcion != 2);

    }
}
