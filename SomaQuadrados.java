import javax.swing.JOptionPane; 
public class SomaQuadrados {
    public static void main(String[] x) {
    int n1, n2, n3, n4, q1, q2, q3 , q4 , soma, resultado;
    //entrada de dados
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
    n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor:"));
    n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor:"));
    //processamento
    q1 = n1 * n1;
    q2 = n2 * n2;
    q3 = n3 * n3;
    q4 = n4 * n4;
    soma = q1 +  q2 + q3 + q4;
    resultado = soma;
    //saida
JOptionPane.showMessageDialog(null, "A soma total dos quadrados é de: " + resultado);
    }
}