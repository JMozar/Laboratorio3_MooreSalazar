//Git
package Modelo;


public class Alumno {
    //Atributos de Alumno
    private String codigo;
    private String nombre; 
    private float promedio;
    
    //Metodos de Alumno
    //Constructor:
    public Alumno(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    //Calcular promedio y verificar si son validas las notas
    public boolean calcularPromedio(float notaparcial, float notafinal) {
        boolean result = false;
        if (notaparcial > 0.0 && notafinal >0.0){
            this.promedio = (notaparcial + notafinal)/2;
            result = true;
        } 
        return result;
    }
    
    //Metodo to string(codigo,nombre,promedio)
    @Override
    public String toString() {
        return  codigo +'\t'+nombre + '\t'+promedio +'\n';
    }
    
    //getter codigo
    public String getCodigo(){
        return this.codigo;
    }

    public float getPromedio() {
        return this.promedio;
    }
}
