
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Carla
 */
public class Juego extends javax.swing.JFrame {


    public Juego() {
        initComponents();
    }
    public JLabel getcoche1(){
        return coche1;
    } 
      public JLabel getcoche2(){
        return coche2;
    }
        public JLabel getcoche3(){
        return coche3;
    }
         public JLabel getcoche4(){
        return coche4;
    }
        public JLabel getbarrera(){
        return barrera;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        coche1 = new javax.swing.JLabel();
        coche2 = new javax.swing.JLabel();
        coche3 = new javax.swing.JLabel();
        barrera = new javax.swing.JLabel();
        iniciar = new javax.swing.JButton();
        carretera = new javax.swing.JLabel();
        coche4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        coche1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coche1.png"))); // NOI18N

        coche2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coche2.png"))); // NOI18N

        coche3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coche3.png"))); // NOI18N

        barrera.setBackground(new java.awt.Color(255, 0, 102));
        barrera.setOpaque(true);

        iniciar.setBackground(new java.awt.Color(255, 51, 102));
        iniciar.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        iniciar.setForeground(new java.awt.Color(255, 255, 255));
        iniciar.setText("INICIAR CARRERA");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        carretera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carretera.png"))); // NOI18N

        coche4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coche4.PNG"))); // NOI18N

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coche1)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(coche4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coche2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coche3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50)
                .addComponent(carretera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barrera, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iniciar)
                .addGap(214, 214, 214))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(coche1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(coche2)
                        .addGap(117, 117, 117)
                        .addComponent(coche3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(coche4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carretera)
                            .addComponent(barrera, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        iniciar.setEnabled(false);
        coche1.setLocation(0,coche1.getLocation().y);
        coche2.setLocation(0,coche2.getLocation().y);
        coche3.setLocation(0,coche3.getLocation().y);
        coche4.setLocation(0,coche4.getLocation().y);
        Carrera hilo1=new Carrera(coche1, this,iniciar);
        Carrera hilo2=new Carrera(coche2, this,iniciar);
        Carrera hilo3=new Carrera(coche3, this,iniciar);
        Carrera hilo4=new Carrera(coche4, this,iniciar);
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

    }//GEN-LAST:event_iniciarActionPerformed


    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel barrera;
    private javax.swing.JLabel carretera;
    private javax.swing.JLabel coche1;
    private javax.swing.JLabel coche2;
    private javax.swing.JLabel coche3;
    private javax.swing.JLabel coche4;
    private javax.swing.JButton iniciar;
    // End of variables declaration//GEN-END:variables
}
