import javax.swing.JOptionPane;
public class Exercicio10 {

    public static void main () {
    double custofabrica, carro_novo, parte_distribuidor, imposto;
    //entrada de dados
    custofabrica = Integer.parseInt(JOptionPane.showInputDialog("Insira o custo de fábrica do veiculo: "));  
    //processamento
    parte_distribuidor = custofabrica * 28/100;
    custofabrica = custofabrica * 45/100; // calculando imposto direto no custo de fábrica
    carro_novo = custofabrica + parte_distribuidor + custofabrica;
    //saida
JOptionPane.showMessageDialog(null, "O custo de um carro novo ao consumidor será R$"+ carro_novo);
    }
    

}