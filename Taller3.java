/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller3;

import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JOptionPane;




public class Taller3 {

    

    public static void main(String[] args) {
        
        taller4();

    }
    
    public static void taller1() {
        
        System.out.println("MENU DE OPCIONES");
        System.out.println("1-SALUDAR");
        System.out.println("2-DESPEDIRSE");
        System.out.println("3-salir");
        
        int op1=Integer.parseInt(JOptionPane.showInputDialog("seleccione una opcion"));
        
        if (op1==1){
            
            JOptionPane.showMessageDialog(null, "¡HOLA!");
            
        }
        if (op1==2){
            JOptionPane.showMessageDialog(null, "¡ADIOS!");
        }
        if (op1==3){
            JOptionPane.showMessageDialog(null, "¡acabas de salir del sistema!");
            
            
        }
        else {
            JOptionPane.showMessageDialog(null, "OPCION NO VALIDA");
            
        }
     
        
        
        
         


        
    }
    
    public static void taller2() {
        int a1 = 0;
        String dialogoMenu = """
MENU
1-CALCULAR AREA DEL CUADRADO
2-CALCULAR AREA DEL CIRCULO
3-CALCULAR AREA DEL TRIANGULO
4-CALCULAR AREA DEL RECTANGULO
5-SALIR """;
        
        while (true) {
            
            String p1=JOptionPane.showInputDialog(dialogoMenu);
            
            if (p1==null){
                break;
            } 
            else {
                a1 = Integer.parseInt(p1);
            }
            
            if (a1 == 1){
                
                double l1=Double.parseDouble(JOptionPane.showInputDialog("ingrese la medida de uno de sus lados"));
                
                double ac= Math.pow(l1, 2);
                JOptionPane.showMessageDialog(null, "el area total del cuadrado es de: "+ac);  
            }
            if (a1==2){
                double b1 =Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor del radio"));
                double ac=(3.1416*(Math.pow(b1, 2)));
                JOptionPane.showInternalMessageDialog(null, "el area total del circulo es de:  "+ac);
                
                
            }
            if (a1==3){
                double b1 =Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor de la base del triangulo"));
                double b2 =Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor de la altura del triangulo"));
                
                double at=(b1*b2)/2;
            }
            
            if (a1==4){
                double b1 =Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor de la base "));
                double b2 =Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor de la altura "));
                double at=(b1*b2);
            }
            if (a1==5){
                break;
            }
            
        }
        
    }
    
    public static void taller3() {
        
        



        String[] nombres = new String[100];
        double[] matematicas = new double[100];
        double[] ingles = new double[100];
        double[] espanol = new double[100];

        int contador = 0;
        int opcion = 0;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU\n"
                    + "1. Registrar notas\n"
                    + "2. Promedio por materia\n"
                    + "3. Promedio total del curso\n"
                    + "4. Mostrar aprobados y reprobados\n"
                    + "5. Salir"));

            switch (opcion) {

                case 1:
                    
                    nombres[contador] = JOptionPane.showInputDialog("Nombre del estudiante:");

                    matematicas[contador] = Double.parseDouble(
                            JOptionPane.showInputDialog("Nota Matemáticas:"));

                    ingles[contador] = Double.parseDouble(
                            JOptionPane.showInputDialog("Nota Inglés:"));

                    espanol[contador] = Double.parseDouble(
                            JOptionPane.showInputDialog("Nota Español:"));

                    contador++;

                    JOptionPane.showMessageDialog(null, "Estudiante registrado correctamente");
                    break;

                case 2:
                    
                    double sumaMat = 0, sumaIng = 0, sumaEsp = 0;

                    for (int i = 0; i < contador; i++) {
                        sumaMat += matematicas[i];
                        sumaIng += ingles[i];
                        sumaEsp += espanol[i];
                    }

                    if (contador > 0) {
                        JOptionPane.showMessageDialog(null,
                                "Promedio Matemáticas: " + (sumaMat / contador) +
                                "\nPromedio Inglés: " + (sumaIng / contador) +
                                "\nPromedio Español: " + (sumaEsp / contador));
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay estudiantes registrados");
                    }
                    break;

                case 3:
                    // Promedio total del curso
                    double sumaTotal = 0;

                    for (int i = 0; i < contador; i++) {
                        sumaTotal += (matematicas[i] + ingles[i] + espanol[i]) / 3;
                    }

                    if (contador > 0) {
                        JOptionPane.showMessageDialog(null,
                                "Promedio total del curso: " + (sumaTotal / contador));
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay estudiantes registrados");
                    }
                    break;

                case 4:
                    // Mostrar aprobados y reprobados
                    String aprobados = "";
                    String reprobados = "";

                    for (int i = 0; i < contador; i++) {

                        double promedio = (matematicas[i] + ingles[i] + espanol[i]) / 3;

                        if (promedio >= 3.0) {
                            aprobados += nombres[i] + " - Promedio: " + promedio + "\n";
                        } else {
                            reprobados += nombres[i] + " - Promedio: " + promedio + "\n";
                        }
                    }

                    JOptionPane.showMessageDialog(null,
                            "APROBADOS:\n" + aprobados +
                            "\nREPROBADOS:\n" + reprobados);
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }

        } while (opcion != 5);
    }
     public static void taller4() {

        int cantidad = Integer.parseInt(
                JOptionPane.showInputDialog("¿Cuántas personas desea registrar?"));

        String[] nombres = new String[cantidad];
        char[] sexos = new char[cantidad];

        // Listas nuevas (máximo posible = cantidad)
        String[] hombres = new String[cantidad];
        String[] mujeres = new String[cantidad];

        int contHombres = 0;
        int contMujeres = 0;

        
        for (int i = 0; i < cantidad; i++) {

            nombres[i] = JOptionPane.showInputDialog("Nombre de la persona " + (i + 1) + ":");

            sexos[i] = JOptionPane.showInputDialog(
                    "Sexo (m = masculino, f = femenino):").toLowerCase().charAt(0);

            // Clasificación
            if (sexos[i] == 'm') {
                hombres[contHombres] = nombres[i];
                contHombres++;
            } else if (sexos[i] == 'f') {
                mujeres[contMujeres] = nombres[i];
                contMujeres++;
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inválido, no se registrará.");
            }
        }

        
        String listaHombres = "HOMBRES:\n";
        for (int i = 0; i < contHombres; i++) {
            listaHombres += hombres[i] + "\n";
        }

        String listaMujeres = "MUJERES:\n";
        for (int i = 0; i < contMujeres; i++) {
            listaMujeres += mujeres[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, listaHombres + "\n" + listaMujeres);
    }
}
        
        
        
        
        
        
        
        
        
        
        
 
    

