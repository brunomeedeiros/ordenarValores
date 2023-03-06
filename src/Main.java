import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite três valores separados por vírgula:");
        String[] valores = entrada.split(",");
        ordenarValores(valores);
        String resultado = String.join(",", valores);
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void ordenarValores(String[] valores) {
        if (valores.length != 3) {
            throw new IllegalArgumentException("Deve ser informado exatamente três valores");
        }

        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i].compareTo(valores[j]) > 0) {
                    String temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }
    }
}
