package boletin5_2;
//Yasmin
import javax.swing.JOptionPane;

public class Boletin5_2 {
    public static void main(String[] args) {
        double p,m,d;
     String resultado=JOptionPane.showInputDialog("Paralelo");
     p=Double.parseDouble(resultado);
     String resultado1=JOptionPane.showInputDialog("Meridiano");
     m=Double.parseDouble(resultado1);
     String resultado2=JOptionPane.showInputDialog("Distancia");
     d=Double.parseDouble(resultado1);
     Satelite s=new Satelite(m,p,d);
     s.verPosicion();
    }
    
}