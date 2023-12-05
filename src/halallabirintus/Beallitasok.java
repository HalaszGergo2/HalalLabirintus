/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package halallabirintus;

/**
 *
 * @author HalászGergő(SZOFT_20
 */
public class Beallitasok extends javax.swing.JFrame {

    /**
     * Creates new form Beallitasok
     */
    public Beallitasok() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        pnlEger = new javax.swing.JPanel();
        sldEger = new javax.swing.JSlider();
        pnlNehez = new javax.swing.JPanel();
        rdbKonnyu = new javax.swing.JRadioButton();
        rdbKozep = new javax.swing.JRadioButton();
        rdbNehez = new javax.swing.JRadioButton();
        pnlGrafika = new javax.swing.JPanel();
        cmbFelbontas = new javax.swing.JComboBox<>();
        cmbSzint = new javax.swing.JComboBox<>();
        chbSzin = new javax.swing.JCheckBox();
        btnMegsem = new javax.swing.JButton();
        btnAlkalmaz = new javax.swing.JButton();
        pnlZene = new javax.swing.JPanel();
        sldZene = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        pnlEger.setBackground(new java.awt.Color(153, 153, 153));
        pnlEger.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Egér érzékenysége:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout pnlEgerLayout = new javax.swing.GroupLayout(pnlEger);
        pnlEger.setLayout(pnlEgerLayout);
        pnlEgerLayout.setHorizontalGroup(
            pnlEgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEgerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldEger, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlEgerLayout.setVerticalGroup(
            pnlEgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEgerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldEger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlNehez.setBackground(new java.awt.Color(153, 153, 153));
        pnlNehez.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Játék nehézsége:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlNehez.setForeground(new java.awt.Color(153, 153, 153));

        buttonGroup1.add(rdbKonnyu);
        rdbKonnyu.setText("Könnyű");

        buttonGroup1.add(rdbKozep);
        rdbKozep.setText("Nehéz");

        buttonGroup1.add(rdbNehez);
        rdbNehez.setSelected(true);
        rdbNehez.setText("Közepes");

        javax.swing.GroupLayout pnlNehezLayout = new javax.swing.GroupLayout(pnlNehez);
        pnlNehez.setLayout(pnlNehezLayout);
        pnlNehezLayout.setHorizontalGroup(
            pnlNehezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNehezLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlNehezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbNehez)
                    .addComponent(rdbKonnyu)
                    .addComponent(rdbKozep))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlNehezLayout.setVerticalGroup(
            pnlNehezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNehezLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbKonnyu)
                .addGap(12, 12, 12)
                .addComponent(rdbNehez)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbKozep)
                .addContainerGap())
        );

        pnlGrafika.setBackground(new java.awt.Color(153, 153, 153));
        pnlGrafika.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grafika:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlGrafika.setForeground(new java.awt.Color(153, 153, 153));

        cmbFelbontas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "640 x 480", "800 x 600", "1024 x 768", "1152 x 964", "1280 x 1024" }));

        cmbSzint.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alacsony", "Közepes", "Magas", "Ultra" }));

        chbSzin.setText("Színvak mód");

        javax.swing.GroupLayout pnlGrafikaLayout = new javax.swing.GroupLayout(pnlGrafika);
        pnlGrafika.setLayout(pnlGrafikaLayout);
        pnlGrafikaLayout.setHorizontalGroup(
            pnlGrafikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGrafikaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGrafikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGrafikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbFelbontas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbSzint, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(chbSzin))
                .addContainerGap())
        );
        pnlGrafikaLayout.setVerticalGroup(
            pnlGrafikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGrafikaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbFelbontas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbSzint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbSzin)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnMegsem.setText("Mégsem");
        btnMegsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegsemActionPerformed(evt);
            }
        });

        btnAlkalmaz.setText("Alkalmaz");
        btnAlkalmaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlkalmazActionPerformed(evt);
            }
        });

        pnlZene.setBackground(new java.awt.Color(153, 153, 153));
        pnlZene.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Zene hangereje:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout pnlZeneLayout = new javax.swing.GroupLayout(pnlZene);
        pnlZene.setLayout(pnlZeneLayout);
        pnlZeneLayout.setHorizontalGroup(
            pnlZeneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlZeneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldZene, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlZeneLayout.setVerticalGroup(
            pnlZeneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlZeneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldZene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pnlZene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(pnlGrafika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlNehez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnMegsem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlkalmaz)))
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlZene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(pnlEger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlNehez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlGrafika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMegsem)
                    .addComponent(btnAlkalmaz))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMegsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegsemActionPerformed
        dispose();
    }//GEN-LAST:event_btnMegsemActionPerformed

    private void btnAlkalmazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlkalmazActionPerformed
        dispose();
    }//GEN-LAST:event_btnAlkalmazActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Beallitasok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beallitasok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beallitasok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beallitasok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beallitasok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlkalmaz;
    private javax.swing.JButton btnMegsem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbSzin;
    private javax.swing.JComboBox<String> cmbFelbontas;
    private javax.swing.JComboBox<String> cmbSzint;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel pnlEger;
    private javax.swing.JPanel pnlGrafika;
    private javax.swing.JPanel pnlNehez;
    private javax.swing.JPanel pnlZene;
    private javax.swing.JRadioButton rdbKonnyu;
    private javax.swing.JRadioButton rdbKozep;
    private javax.swing.JRadioButton rdbNehez;
    private javax.swing.JSlider sldEger;
    private javax.swing.JSlider sldZene;
    // End of variables declaration//GEN-END:variables
}
