import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class novo {
    public JPanel painelPrincipal;
    public JRadioButton adiçãoRadioButton;
    public JRadioButton subtraçãoRadioButton;
    public JRadioButton multiplicaçãoRadioButton;
    public JRadioButton divisãoRadioButton;
    public JTextField txValor1;
    public JTextField txValor2;
    private JButton button1;
    private double resultadoFinal = 0;

    public novo() {


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, resultadoFinal);
            }
        });

        adiçãoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(txValor1.getText());
                double valor2 = Double.parseDouble(txValor2.getText());
                double resultado = valor1 + valor2;
                resultadoFinal = resultado;
            }

        });
        subtraçãoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(txValor1.getText());
                double valor2 = Double.parseDouble(txValor2.getText());
                double resultado = valor1 - valor2;
                resultadoFinal = resultado;
            }
        });
        multiplicaçãoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(txValor1.getText());
                double valor2 = Double.parseDouble(txValor2.getText());
                double resultado = valor1 * valor2;
                resultadoFinal = resultado;
            }
        });
        divisãoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor1 = Double.parseDouble(txValor1.getText());
                double valor2 = Double.parseDouble(txValor2.getText());
                double resultado = valor1 / valor2;
                resultadoFinal = resultado;
            }
        });
    }
}
