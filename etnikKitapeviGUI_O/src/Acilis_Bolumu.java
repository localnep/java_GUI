import kullanici_kismi.Kullanici_Giris_Bolumu;


public class Acilis_Bolumu extends javax.swing.JFrame {

    /**
     * Creates new form Acilis_Bolumu
     */
    public Acilis_Bolumu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kullanici_giris_butonu = new javax.swing.JButton();
        yetkili_giris_butonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kullanici_giris_butonu.setText("Kullanıcı Giris");
        kullanici_giris_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_giris_butonuActionPerformed(evt);
            }
        });

        yetkili_giris_butonu.setText("Yetkili Giris");
        yetkili_giris_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yetkili_giris_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(kullanici_giris_butonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(yetkili_giris_butonu)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullanici_giris_butonu)
                    .addComponent(yetkili_giris_butonu))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yetkili_giris_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yetkili_giris_butonuActionPerformed
            Giris_Bolumu giris_bolumu = new Giris_Bolumu();
            setVisible(false);
            giris_bolumu.setVisible(true);
    }//GEN-LAST:event_yetkili_giris_butonuActionPerformed

    private void kullanici_giris_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_giris_butonuActionPerformed
           Kullanici_Giris_Bolumu kullanici_giris_bolumu = new Kullanici_Giris_Bolumu();
           setVisible(false);
           kullanici_giris_bolumu.setVisible(true);
    }//GEN-LAST:event_kullanici_giris_butonuActionPerformed

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
            java.util.logging.Logger.getLogger(Acilis_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acilis_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acilis_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acilis_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acilis_Bolumu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton kullanici_giris_butonu;
    private javax.swing.JButton yetkili_giris_butonu;
    // End of variables declaration//GEN-END:variables
}
