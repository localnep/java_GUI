

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Giris_Bolumu extends javax.swing.JFrame {

    
    public Giris_Bolumu() {
        initComponents();
    }

    Fonksiyonlar Fonksiyonlar = new Fonksiyonlar();
    
     static String kullanici_adi;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kullanici_adi_alani = new javax.swing.JTextField();
        parola_alani = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        giris_yap_butonu = new javax.swing.JButton();
        geriye_don_butonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kullanıcı Adı:");

        jLabel2.setText("Parola:");

        giris_yap_butonu.setText("Giriş Yap");
        giris_yap_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_yap_butonuActionPerformed(evt);
            }
        });

        geriye_don_butonu.setText("Geriye dön");
        geriye_don_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriye_don_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kullanici_adi_alani)
                            .addComponent(parola_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(geriye_don_butonu)))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(giris_yap_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullanici_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(giris_yap_butonu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(geriye_don_butonu)))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giris_yap_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_yap_butonuActionPerformed
       kullanici_adi = kullanici_adi_alani.getText();//kullanıcı adı değişkenini aldık
       String parola = new String(parola_alani.getPassword());
        //parola ve şifre yi aldık şimdi veritabanı ile eşleşmesi kontrolünü sağlmalayız
        //giris yap adlı metod oluşturuyoruz --> kutuphane islemlerinde
        Fonksiyonlar.girisYap(kullanici_adi,parola);
        boolean girisbasarili = Fonksiyonlar.girisYap(kullanici_adi, parola);//gönderdiğimiz k.adi ve parola var ise true dönecek
        if(girisbasarili==true){
            JOptionPane.showMessageDialog(rootPane, "Sisteme hosgeldiniz\n" + "Arayüze geçiş yapiliyor..."); 
            Kitaplar_Bolumu kitaplar_bolumu = new Kitaplar_Bolumu(this,true);
            setVisible(false);
            kitaplar_bolumu.setVisible(true);
            System.exit(0);
            
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Kullanıcı adı veya şifre hatalı!","HATA",0);
        }
    }//GEN-LAST:event_giris_yap_butonuActionPerformed

    private void geriye_don_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriye_don_butonuActionPerformed
      Acilis_Bolumu acilis = new Acilis_Bolumu();
        this.dispose();
        acilis.setVisible(true);
    }//GEN-LAST:event_geriye_don_butonuActionPerformed

    
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
            java.util.logging.Logger.getLogger(Giris_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris_Bolumu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton geriye_don_butonu;
    private javax.swing.JButton giris_yap_butonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField kullanici_adi_alani;
    private javax.swing.JPasswordField parola_alani;
    // End of variables declaration//GEN-END:variables
}
