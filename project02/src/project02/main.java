package project02;
import javax.swing.JOptionPane;
public class main {
public static void main(String[] args) {
int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero:"));
int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero:"));
int inicio = Math.min(num1, num2);
int fim = Math.max(num1, num2);
int quantidadeImpares = 0;
for (int i = inicio; i <= fim; i++) {
if (i % 2 != 0) {
quantidadeImpares++;
}
}
JOptionPane.showMessageDialog(null, "A quantidade de numeros impares entre " + inicio + " e " + fim + " e: " + quantidadeImpares);
}
}