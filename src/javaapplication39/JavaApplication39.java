/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

/* LA AEROLINEA DANIEL BRAND TIENE 5 DESTINOS
MEDELLIN [NADA, 50.000 , 60.000, 120.000]
BOGOTA [50.000, NADA, 70.000, 95.000, 100.000]
CALI [60.000,70.000,NADA,80.000,110.000]
CARTAGENA[80.000,95.000,80.000,NADA,70.000]
SANTA MARTA[120.00,100.000,110.000,70.000,NADA]
*/
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class JavaApplication39 {
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI userInterface = new GUI();
        userInterface.setVisible(true);
        String[] fila1 = {"MEDELLIN", "NADA", "50.000", "60.000", "80.000", "120.000"};
        String[] fila2 = {"BOGOTA", "50.000", "NADA", "70.000", "95.000", "100.000"};
        String[] fila3 = {"CALI", "60.000", "70.000", "NADA", "80.000", "110.000"};
        String[] fila4 = {"CARTAGENA", "80.000", "95.000", "80.000", "NADA", "70.000"};
        String[] fila5 = {"SANTA MARTA", "120.000", "100.000", "110.000", "70.000", "NADA"};
        
        String [][] vuelos = {fila1, fila2, fila3, fila4, fila5};
 
    } 
}
