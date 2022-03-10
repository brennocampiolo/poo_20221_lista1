import javax.swing.JOptionPane; 
public class Antecessor{
    public static void main(String[] x) {
    int numero, antecessor;
    //entrada de dados
    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
    
    //processamento
  antecessor = numero - 1;
    //saida
JOptionPane.showMessageDialog(null, "O seu antecessor é: " + antecessor);
    }
}