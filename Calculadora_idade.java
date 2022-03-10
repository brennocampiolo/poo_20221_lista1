import javax.swing.JOptionPane;

public class Calculadora_idade{
    public static void main (String[] x){
    int idade, dias, horas_sono, dias_dormindo, meses;
    //entrada de dados
    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
    //processammento
    dias = idade * 365;
    horas_sono = dias * 8 ;
    dias_dormindo = horas_sono / 24;
    meses = idade * 12;
    //saida
JOptionPane.showMessageDialog(null,"Sua idade em dias é: "+ dias);
JOptionPane.showMessageDialog(null,"Você ja dormiu um total de: " + dias_dormindo);
JOptionPane.showMessageDialog(null,"Sua idade em meses é : " + meses);
    } 
}

