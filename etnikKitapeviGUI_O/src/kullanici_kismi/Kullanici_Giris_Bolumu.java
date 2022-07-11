
package kullanici_kismi;



import javax.swing.JOptionPane;


public class Kullanici_Giris_Bolumu extends javax.swing.JFrame {

     
    
    public Kullanici_Giris_Bolumu() {
        initComponents();
    }

    Fonksiyonlar Fonksiyonlar = new Fonksiyonlar();
    
   static String kullanici_adi;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kullanici_adi_alani = new javax.swing.JTextField();
        giris_yap_butonu = new javax.swing.JButton();
        yeni_hesap_butonu = new javax.swing.JButton();
        parola_alani = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kullanici Adı:");

        jLabel2.setText("Parola:");

        giris_yap_butonu.setText("Giriş Yap");
        giris_yap_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_yap_butonuActionPerformed(evt);
            }
        });

        yeni_hesap_butonu.setText("Yeni Hesap");
        yeni_hesap_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeni_hesap_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kullanici_adi_alani)
                            .addComponent(parola_alani)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(giris_yap_butonu)
                        .addGap(102, 102, 102)
                        .addComponent(yeni_hesap_butonu)))
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kullanici_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giris_yap_butonu)
                    .addComponent(yeni_hesap_butonu))
                .addGap(67, 67, 67))
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
        Kullanici_Arayuzu kullanici_arayuzu = new Kullanici_Arayuzu(this,true);
        if(girisbasarili==true){
            JOptionPane.showMessageDialog(rootPane, "Sisteme hosgeldiniz\n" + "Arayüze geçiş yapiliyor..."); 
            kullanici_arayuzu = new Kullanici_Arayuzu(this,true);
            setVisible(false);
            kullanici_arayuzu.setVisible(true);
            
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Kullanıcı adı veya şifre hatalı!","HATA",0);
        }
    }//GEN-LAST:event_giris_yap_butonuActionPerformed

    private void yeni_hesap_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeni_hesap_butonuActionPerformed
          Yeni_Kullanici_Bolumu yeni_kullanici_bolumu = new Yeni_Kullanici_Bolumu();
          setVisible(false);
          yeni_kullanici_bolumu.setVisible(true);
    }//GEN-LAST:event_yeni_hesap_butonuActionPerformed

  
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
            java.util.logging.Logger.getLogger(Kullanici_Giris_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kullanici_Giris_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kullanici_Giris_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kullanici_Giris_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kullanici_Giris_Bolumu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giris_yap_butonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField kullanici_adi_alani;
    private javax.swing.JPasswordField parola_alani;
    private javax.swing.JButton yeni_hesap_butonu;
    // End of variables declaration//GEN-END:variables
}
