import javax.swing.JOptionPane; 
public class Venda {
    public static void main(String[] x) {
    int comissao, preço_uni, venda_total, salario;
    //entrada de dados
    preço_uni = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor unitario da peça: "));
    venda_total = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade total de peças vendidas: "));
    //processamento
    venda_total = preço_uni * venda_total;
    comissao = venda_total * (5/100);
    salario = venda_total + comissao;
    //saida
JOptionPane.showMessageDialog(null, "O valor da comissão é:" + comissao);
JOptionPane.showMessageDialog(null, "O salario do funcionario com o bonus é:" + salario);
    }
}