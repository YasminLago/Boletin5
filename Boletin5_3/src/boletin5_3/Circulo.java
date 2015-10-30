package boletin5_3;
//Yasmin
public class Circulo {
   private double radio;
   public static final double PI=3.14d;
   
   //Constructores
   public Circulo(){  
   }
   
   public Circulo(double radio){
       this.radio=radio;
   }
   
   //Métodos
    public void setRadio(double radio){
       this.radio=radio;   
   }
    
   public double areaCirculo(){
       return (PI*(Math.pow(radio, 2)));
   }
   
   public double lonxitude(){
       return (2*PI*radio);
   }
}