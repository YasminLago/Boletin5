package boletin5_1;
//Yasmin
public class Coche {
   private int velocidade;//Atributo(siempre privado)
    public Coche(){
         velocidade=0;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }
    
    public int getVelocidade(){//Devolve a velocidade actual
        return velocidade;
    }
    
    public void acelerar (int valor){//Incrementa a velocidade na cantidade valor
          velocidade=this.velocidade+valor;
          //velocidade+=valor;
    }
    
    public void frenar(int menos){//Disminue a velocidade nacantidade menos
          velocidade=this.velocidade-menos;
          //velocidade-=menos;
    } 
  
}
