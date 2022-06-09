
package Modelo;

import java.util.Scanner;


public class AlumnoArreglo {
    
    Scanner entrada = new Scanner(System.in);
    private Alumno[] arreglo;
    private int indice;
    

    public AlumnoArreglo(int tamano) {
        this.arreglo = new Alumno[tamano];
        this.indice=0;
    }

    public AlumnoArreglo(){
        this(5);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < this.indice; i++ ){
            sb.append(this.arreglo[i]);
        }
        return sb.toString();
    }
    
    public boolean agregar(Alumno alumno){
        boolean result = false;
        if(this.indice<this.arreglo.length &&
                !existeCodigo(alumno.getCodigo())){
            this.arreglo[indice]= alumno;
            indice++;
            result= true;
        }
        return result;
    }
    
    private boolean existeCodigo(String codigo){
        boolean result = false;
        for(Alumno a:this.arreglo){
            if( a != null && a.getCodigo().equalsIgnoreCase(codigo) ){
                result = true;
                break;
            }
        }
        return result;
    }
    
    //COMPLETAR LO SIGUIENTE Y HACER COMMITS POR CADA PARTE DESARROLLADA
    
    public void  ordenarInserccion(){ 
        Alumno aux;
        int pos;
        for(int i=0;i<arreglo.length;i++){
            pos=i;
            aux = arreglo[i];
            
            while((pos>0) && (arreglo[pos-1].getPromedio()>aux.getPromedio())){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
    }  
    
    public void  ordenarBurbuja(){ 
        Alumno aux;

        for(int i=0;i<(arreglo.length-1);i++){
            for(int j=0;j<(arreglo.length-i-1);j++){
                
                if(arreglo[j+1].getPromedio()>arreglo[j].getPromedio()){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
    }
    
    public void  ordenarSeleccion(){        
       int i, j,pos;
        Alumno menor, tmp;
          for (i = 0; i < arreglo.length - 1; i++) {    
                menor = arreglo[i];                                       
                pos = i;                          
                for (j = i + 1; j < arreglo.length; j++){ 
                      if (arreglo[j].getPromedio() < menor.getPromedio()) {      
                          menor = arreglo[j];         
                          pos = j;
                      }
                }
                if (pos != i){                                       
                    tmp = arreglo[i];
                    arreglo[i] = arreglo[pos];
                    arreglo[pos] = tmp;
                }
          }        

    }    
    
    public void Buscar(){
        String codigo;
        System.out.println("Digita el codigo del alumno que buscas: ");
        codigo = entrada.nextLine();
        int posicion = -1;
        for(int i=0;i<arreglo.length;i++){
            if(codigo.equals(arreglo[i].getCodigo())){
                posicion = i;
                
            }
        }
        if(posicion>-1){
            System.out.println(arreglo[posicion]);
        }else{
            System.out.println("El alumno no fue encontrado");
        }
    }
    
    public void Eliminar(){
        
    }
    
    public void crecer(){
  
    }
}
