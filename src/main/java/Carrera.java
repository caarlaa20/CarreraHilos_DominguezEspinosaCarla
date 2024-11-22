
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Carla
 */
public class Carrera extends Thread {

    private JLabel eti;
    private Juego p;
    private JButton iniciar;

    public Carrera(JLabel eti, Juego p,JButton iniciar) {
        this.eti = eti;
        this.p = p;
        this.iniciar=iniciar;
    }

    public void run() {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        while (true) {
            try {
                sleep((int) (Math.random() * 200));
                c1 = p.getcoche1().getLocation().x;
                c2 = p.getcoche2().getLocation().x;
                c3 = p.getcoche3().getLocation().x;
                c4 = p.getcoche4().getLocation().x;
                if (c1 < p.getbarrera().getLocation().x - 10 && c2 < p.getbarrera().getLocation().x - 10 && c3 < p.getbarrera().getLocation().x - 10 & c4 < p.getbarrera().getLocation().x - 10) {
                    eti.setLocation(eti.getLocation().x + 10, eti.getLocation().y);
                    p.repaint();
                } else {
                    break;
                }
            } catch (Exception e) {

            }
            if (eti.getLocation().x >= p.getbarrera().getLocation().x - 10) {
                if (c1 > c2 && c1 > c3 && c1 > c4) {
                    JOptionPane.showMessageDialog(null, "Ganó 1");
                } else if (c2 > c1 && c2 > c3 && c2 > c4) {
                    JOptionPane.showMessageDialog(null, "Ganó 2");
                } else if (c3 > c1 && c3 > c2 && c3 > c4) {
                    JOptionPane.showMessageDialog(null, "Ganó 3");
                } else if (c4 > c1 && c4 > c2 && c4 > c3) {
                    JOptionPane.showMessageDialog(null, "Ganó 4");
                } else if (c1 == c2 && c1 > c3 && c1 > c4) {
                    JOptionPane.showMessageDialog(null, "Empate entre 1 y 2");
                } else if (c1 == c3 && c1 > c2 && c1 > c4) {
                    JOptionPane.showMessageDialog(null, "Empate entre 1 y 3");
                } else if (c1 == c4 && c1 > c2 && c1 > c3) {
                    JOptionPane.showMessageDialog(null, "Empate entre 1 y 4");
                } else if (c2 == c3 && c2 > c1 && c2 > c4) {
                    JOptionPane.showMessageDialog(null, "Empate entre 2 y 3");
                } else if (c2 == c4 && c2 > c1 && c2 > c3) {
                    JOptionPane.showMessageDialog(null, "Empate entre 2 y 4");
                } else if (c3 == c4 && c3 > c1 && c3 > c2) {
                    JOptionPane.showMessageDialog(null, "Empate entre 3 y 4");
                } else if (c1 == c2 && c1 == c3 && c1 > c4) {
                    JOptionPane.showMessageDialog(null, "Empate entre 1, 2 y 3");
                } else if (c1 == c2 && c1 == c4 && c1 > c3) {
                    JOptionPane.showMessageDialog(null, "Empate entre 1, 2 y 4");
                } else if (c1 == c3 && c1 == c4 && c1 > c2) {
                    JOptionPane.showMessageDialog(null, "Empate entre 1, 3 y 4");
                } else if (c2 == c3 && c2 == c4 && c2 > c1) {
                    JOptionPane.showMessageDialog(null, "Empate entre 2, 3 y 4");
                } else if (c1 == c2 && c1 == c3 && c1 == c4) {
                    JOptionPane.showMessageDialog(null, "Empate entre los cuatro");
                }
                iniciar.setEnabled(true);
            }

        }

    }
}

