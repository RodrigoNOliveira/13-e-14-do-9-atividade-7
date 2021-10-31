import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
    int quantia = 780000;
    double ganhador1, ganhador2, ganhador3;

    ganhador1 = quantia * 0.46;
    ganhador2 = quantia * 0.32;
    ganhador3= -((ganhador1 + ganhador2)-quantia);

    JOptionPane.showMessageDialog(null, "A quantia ganha foi de:\n\nPrimeiro ganhador: " + ganhador1 + "\nSegundo ganhador: " + ganhador2 + "\nTerceiro ganhador: " + ganhador3, "Valores", JOptionPane.INFORMATION_MESSAGE);
    
    }
}
