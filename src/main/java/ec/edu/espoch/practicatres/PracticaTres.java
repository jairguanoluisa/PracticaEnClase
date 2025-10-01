/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.practicatres;

public class PracticaTres {

    public static void main(String[] args) {
        
        Estudiantes estudianteUno = new Estudiantes();
            estudianteUno.nombre = "Jair";
            estudianteUno.id = 1234;
            estudianteUno.promedio = 8.8f;
        
        System.out.println("Nombre: " + estudianteUno.nombre);
        System.out.println("Identificacion: " + estudianteUno.id);
        System.out.println("Promedio: " + estudianteUno.promedio);
        
        Estudiantes estudianteDos = new Estudiantes();
            estudianteDos.nombre = "Alejandro";
            estudianteDos.id = 4321;
            estudianteDos.promedio = 8.9f;
        
        System.out.println("Nombre: " + estudianteDos.nombre);
        System.out.println("Identificacion: " + estudianteDos.id);
        System.out.println("Promedio: " + estudianteDos.promedio);
            
    }
}
