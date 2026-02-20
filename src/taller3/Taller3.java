/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller3;

import javax.swing.JOptionPane;




public class Taller3 {

    

    public static void main(String[] args) {
        
        taller3();

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
            } else {
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
       int a1=0;
                    String op ="""
                               MENU DE OPCIONES
                       1-registrar notas
                       2-calcular promedio por materia
                       3-calcular promedio total del curso
                       4-mostrar los estudiantes aprobados y reprobados
                       5-salir""";
    while (true){
        String n1=JOptionPane.showInputDialog(op);
        if (n1==null){
            break;
        }else{
            a1=Integer.parseInt(n1);
            
        }
        String[]nombres=new String[20];
            

            
            
            
            
        }
        
    }
}
