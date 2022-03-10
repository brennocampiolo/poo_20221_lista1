import javax.swing.JOptionPane; 
public class Dolar {
    public static void main(String[] x) {
    double cot, valor;
    //entrada de dados
    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dolar:"));
    //processamento
    cot = valor * 5.10 ;
    //saida
JOptionPane.showMessageDialog(null, "O valor em real é:" + cot);
    }
}