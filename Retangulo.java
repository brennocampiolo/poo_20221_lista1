import javax.swing.JOptionPane; 
public class Retangulo{
    public static void main(String[] x) {
    int base, altura, area;
    //entrada de dados
    base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base: "));
    altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
    //processamento
    area = base * altura;
    //saida
JOptionPane.showMessageDialog(null, "A area do retangulo é: " + area);
    }
}