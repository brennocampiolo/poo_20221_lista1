import javax.swing.JOptionPane;

public class CalculoEleitoral{

    public static void main(String[] args) {
    double eleitores, voto_branco, nulo, valido;
    //entrada de dados
    eleitores = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade total de eleitores: "));
    voto_branco = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos em branco: "));
    nulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos nulos: "));
    valido = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos validos: "));
    //processamento
    voto_branco = voto_branco * 100 / eleitores;
    nulo = nulo * 100 / eleitores;
    valido = valido * 100 / eleitores;
    //saida
JOptionPane.showMessageDialog(null,"A porcentagem de votos brancos foi de: " + voto_branco);
JOptionPane.showMessageDialog(null,"A porcentagem de votos nulos foi de: " + nulo);
JOptionPane.showMessageDialog(null,"A porcentagem de votos validos foi de: " + valido);
    }
}