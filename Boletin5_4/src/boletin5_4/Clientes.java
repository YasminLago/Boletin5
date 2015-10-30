package boletin5_4;
//Yasmin
public class Clientes {
    private float polbo,patacas;
    public Clientes(){
    }
    
    public Clientes(float polbo,float patacas){
        this.polbo=polbo;
        this.patacas=patacas;   
    }
    
    public int numeroClientes(float polbo,float patacas){
        int clientes=3;
        return clientes=(int)(polbo+patacas);
    }
    
    public void engadirPolbo(float x){ 
            float polbo1=polbo+x;    
    }
    
   public void engadirPatacas(float x){ 
            float patacas1=patacas+x;
   }   
   
   public float amosarPolbo(float polbo){ 
           return polbo;
   }
   
   public float amosarPatacas(float patacas){
          return patacas;
   }

}