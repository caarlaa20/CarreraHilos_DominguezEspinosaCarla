package com.mycompany.carrerahilos;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Carla
 */
public class Carrera extends Thread {

    private JLabel eti;
    private Juego p;
    private JButton iniciar;

    public Carrera(JLabel eti, Juego p, JButton iniciar) {
        this.eti = eti;
        this.p = p;
        this.iniciar = iniciar;
    }

    public void run() {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        int v1, v2, v3, v4; // Velocidad de los coches
        // Asignamos velocidades aleatorias para cada coche
        v1 = (int) (Math.random() * 10) + 5;
        v2 = (int) (Math.random() * 10) + 5;
        v3 = (int) (Math.random() * 10) + 5;
        v4 = (int) (Math.random() * 10) + 5;

        while (true) {
            try {
                // Simulamos el avance de cada coche, con diferentes velocidades
                sleep((int) (Math.random() * 200));

                c1 = p.getcoche1().getLocation().x;
                c2 = p.getcoche2().getLocation().x;
                c3 = p.getcoche3().getLocation().x;
                c4 = p.getcoche4().getLocation().x;

                // Actualizamos la posición de cada coche con base en su velocidad
                p.getcoche1().setLocation(c1 + v1, p.getcoche1().getLocation().y);
                p.getcoche2().setLocation(c2 + v2, p.getcoche2().getLocation().y);
                p.getcoche3().setLocation(c3 + v3, p.getcoche3().getLocation().y);
                p.getcoche4().setLocation(c4 + v4, p.getcoche4().getLocation().y);

                p.repaint(); // Repintamos la pantalla para actualizar las posiciones

                // Verificar si alguno de los coches ha llegado a la meta
                if (c1 >= p.getbarrera().getLocation().x - 10 && c2 >= p.getbarrera().getLocation().x - 10 &&
                    c3 >= p.getbarrera().getLocation().x - 10 && c4 >= p.getbarrera().getLocation().x - 10) {
                    break; // Salimos del ciclo cuando alguien haya llegado a la meta
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Determinar al ganador
        String ganador = "";
        int maxDistancia = Math.max(Math.max(c1, c2), Math.max(c3, c4));

        if (maxDistancia == c1) {
            ganador = "Coche 1";
        } else if (maxDistancia == c2) {
            ganador = "Coche 2";
        } else if (maxDistancia == c3) {
            ganador = "Coche 3";
        } else if (maxDistancia == c4) {
            ganador = "Coche 4";
        }

        // Mostrar las distancias recorridas por los coches y el ganador solo una vez
        String mensajeDistancias = "Distancias recorridas por los coches:\n";
        mensajeDistancias += "Coche 1: " + c1 + " unidades\n";
        mensajeDistancias += "Coche 2: " + c2 + " unidades\n";
        mensajeDistancias += "Coche 3: " + c3 + " unidades\n";
        mensajeDistancias += "Coche 4: " + c4 + " unidades\n";
        mensajeDistancias += "\nEl ganador es: " + ganador;

        // Mostrar el mensaje final con las distancias y el ganador
        JOptionPane.showMessageDialog(null, mensajeDistancias);

        // Habilitar el botón de inicio nuevamente
        iniciar.setEnabled(true);
    }
}
