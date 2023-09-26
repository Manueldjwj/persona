/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Persona;
import java.util.Scanner;

/**
 *
 * @author MANUEL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //declarar variables
       String Nombre="";
       int Cedula=0;
       int Añonacimiento=0;
       int operacion=0;
       int Añoactual=2023;
       
       //crear objetos 
       Persona objpersona=new Persona ();
       
       //fijar informacion
       
       Scanner scan=new Scanner (System.in);
       
       //adjuntar y pedir datos del usuario
        System.out.println("Digite su nommbre");
        Nombre=scan.nextLine();
        objpersona.setNombre(Nombre);
        
        System.out.println("Digite su cedula");
        Cedula=scan.nextInt();
        objpersona.setCedula(Cedula);
        
        System.out.println("Digite su año de nacimiento");
        Añonacimiento=scan.nextInt();
        objpersona.setAñonacimiento(Añonacimiento);
        
        //operacion
        operacion= Añoactual- objpersona.getAñonacimiento();
        
        System.out.println("Su nombre es"+"\t"+objpersona.getNombre());
        System.out.println("con cedula de ciudadania de"+"\t"+objpersona.getCedula());
        System.out.println("Nacido en el año"+"\t"+objpersona.getAñonacimiento());
        System.out.println(" y una edad de "+"\t"+operacion+"años");
        
        //creacion objeto constructor parametrizado
        
        Persona objpersona1 =new Persona (Nombre, Cedula, Añonacimiento);
        
        System.out.println("Su nombre es"+"\t"+objpersona1.getNombre());
        System.out.println("con cedula de ciudadania de"+"\t"+objpersona1.getCedula());
        System.out.println("Nacido en el año"+"\t"+objpersona1.getAñonacimiento());
        System.out.println(" y una edad de "+"\t"+operacion+"años");
        
        
      
    }
        
        
    
    
}
