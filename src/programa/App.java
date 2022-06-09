
package programa;

import Modelo.Alumno;
import Modelo.AlumnoArreglo;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numAl;
       
    AlumnoArreglo alumnos = new AlumnoArreglo(5);
        
    //Agregamos los datos del arreglo
        
    Alumno alumno1 = new Alumno("1900200", "Jose Perez");
    alumno1.calcularPromedio(12.5f, 14.7f); 
    Alumno alumno2 = new Alumno("1900567", "Luis Ramos");
    alumno2.calcularPromedio(14.7f, 11.0f);
    Alumno alumno3 = new Alumno("1900234", "Luca Quispe");
    alumno3.calcularPromedio(10.5f, 13.4f);
    Alumno alumno4 = new Alumno("1900712", "Juan Paz");
    alumno4.calcularPromedio(9.8f, 16.9f);
    Alumno alumno5 = new Alumno("1900456", "Alex Lopez");
    alumno5.calcularPromedio(10.6f, 17.6f);

    //Agregamos los objetos alumnos al Arreglo:
        
    System.out.println(alumnos.agregar(alumno1));
    System.out.println(alumnos.agregar(alumno2));
    System.out.println(alumnos.agregar(alumno3));
    System.out.println(alumnos.agregar(alumno4));
    System.out.println(alumnos.agregar(alumno5));
        
    //Imprimimos el arreglo inicial
    System.out.println("");
    System.out.println("Imprimiendo los alumnos del arreglo");
    System.out.println(alumnos);
    
    //Ordenar insercion
    System.out.println("Ordenamiento metodo INSERCION:");
    alumnos.ordenarInserccion();
    System.out.println(alumnos);
    
    //Ordenar burbuja
    System.out.println("Ordenamiento metodo BURBUJA:");
    alumnos.ordenarBurbuja();
    System.out.println(alumnos);
    
    //Ordenamiento por Seleccion:
    System.out.println("Ordenamiento metodo SELECCION:");
    alumnos.ordenarSeleccion();
    System.out.println(alumnos);
    
    //Buscar
    alumnos.Buscar();
    
    //Eliminar
    System.out.println("");
    alumnos.Eliminar();
    System.out.println(alumnos);
    
}
}    

