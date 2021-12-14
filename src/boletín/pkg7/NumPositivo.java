
package boletín.pkg7;


import javax.swing.*;

public class NumPositivo {
    private java.lang.Object JOptionPane;

    public void NumPosi(){
    // declaramos o número
    int num1 = lerNumPositivo();
    // condicional: si numero 1 es mayor que 0 entonces es positivo
    if (num1 > 0){
    javax.swing.JOptionPane.showMessageDialog(null, num1 + " é positivo");
}
    
    }
    public int lerNumPositivo(){ 
    java.lang.String resposta = javax.swing.JOptionPane.showInputDialog(" teclea numero enteiro :");
        int num = Integer.parseInt(resposta);
        return num;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
