package boletin5_1;
//Yasmin
import javax.swing.JOptionPane;

public class Boletin5_1 {
   public static void main(String[] args) {
         Coche car=new Coche();
         int vel=0;
     vel=Integer.parseInt(JOptionPane.showInputDialog("Velocidade"));
     car.acelerar(50);
     car.frenar(10);
     JOptionPane.showMessageDialog(null,"Velocidade final" +car.getVelocidade());
    }
 
}