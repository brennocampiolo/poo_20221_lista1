import javax.swing.JOptionPane;

public class RevendedoraCarros{
    public static void main (String[] x){
    int carros_vendidos, valor_venda_total, salario_fixo, bonusporcarro, salario__final, comissao;
    //entrada
    carros_vendidos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade carros vendidos: "));
    valor_venda_total = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor total da venda: "));
    salario_fixo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do salario sem bonificações: "));
    bonusporcarro = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor recebido por carro vendido: "));
    //processamento 
    //salario final = salario fixo + comissao fixa + 5% do valor das vendas efetuadas
    comissao = valor_venda_total * (5/100);
    salario__final = salario_fixo + bonusporcarro + comissao;
    bonusporcarro = (bonusporcarro/100) * carros_vendidos;
    //saida
JOptionPane.showMessageDialog(null,"O salario final é R$: " + salario__final);



    }
}