import javax.swing.JOptionPane;

public class Exercicio24 {
    public static void main(String[] args) {
        int i = 12;
        do {
            i = i + 2;
            JOptionPane.showMessageDialog(null, "é par: " + i);
        } while (i < 24);
    }
}
