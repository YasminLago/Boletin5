package boletin5_4;
//Yasmin
import javax.swing.JOptionPane;

public class Boletin5_4 {
    public static void main(String[] args) {
      
     float polbo,patacas,engadir;
    
     String res=JOptionPane.showInputDialog("Kg polvo");
     polbo=Float.parseFloat(res);
     String res1=JOptionPane.showInputDialog("Kg patacas");
     patacas=Float.parseFloat(res1);
        
     Clientes cli=new Clientes(polbo,patacas);
     JOptionPane.showMessageDialog(null,"Nº clientes" +cli.numeroClientes(polbo, patacas)); 
    
     String res2=JOptionPane.showInputDialog("Engadir Kg polbo");
     engadir=Float.parseFloat(res2);
     String res3=JOptionPane.showInputDialog("Engadir Kg patacas");
     engadir=Float.parseFloat(res3);
     Clientes cli1=new Clientes(polbo,patacas);
     JOptionPane.showMessageDialog(null,"Nº total kg polvo" +cli1.amosarPolbo(20));
     JOptionPane.showMessageDialog(null,"Nº total kg patacas"+cli1.amosarPatacas(50));
 
    
}
}