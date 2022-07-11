/*
   
 */
package kullanici_kismi;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Yeni_Kullanici_Bolumu extends javax.swing.JFrame {

   
    public Yeni_Kullanici_Bolumu() {
        initComponents();
    }

    
    /*private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private java.sql.Statement statament;*/
   
    
    
    Fonksiyonlar fonksiyonlar = new Fonksiyonlar();
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kullanici_adi_alani = new javax.swing.JTextField();
        eposta_alani = new javax.swing.JTextField();
        telefon_alani = new javax.swing.JTextField();
        yeni_kayit_butonu = new javax.swing.JButton();
        parola_alani = new javax.swing.JTextField();
        geriye_don_butonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kullanıcı Adı Olusturun");

        jLabel2.setText("Sifre Olusturun");

        jLabel3.setText("E-posta Adresiniz");

        jLabel4.setText("Telefon Numaranız");

        yeni_kayit_butonu.setText("Yeni Kayit");
        yeni_kayit_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeni_kayit_butonuActionPerformed(evt);
            }
        });

        geriye_don_butonu.setText("Geriye Dön");
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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(geriye_don_butonu)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eposta_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(telefon_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(kullanici_adi_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(parola_alani))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(yeni_kayit_butonu)
                        .addGap(117, 117, 117))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanici_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(eposta_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(telefon_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeni_kayit_butonu)
                    .addComponent(geriye_don_butonu))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yeni_kayit_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeni_kayit_butonuActionPerformed
   
    /*String sorgu = "INSERT INTO kullanicilar (kullaniciadi,sifre,eposta,telefon) VALUES (?,?,?,?)";
        try { 
            preparedStatement = con.prepareCall(sorgu);
            preparedStatement.setString(1, kullanici_adi_alani.getText());
            preparedStatement.setString(2, parola_alani.getText());
            preparedStatement.setString(3, eposta_alani.getText());
            preparedStatement.setString(4, telefon_alani.getText());
            if(!kullanici_adi_alani.getText().equals("") && !parola_alani.getText().equals("") && !eposta_alani.getText()
                .equals("") && !telefon_alani.getText().equals("")){
                 JOptionPane.showMessageDialog(rootPane, "Lütfen boş alanları doldurun!","HATA",0);
                 if(preparedStatement.executeUpdate()!=0){
                JOptionPane.showMessageDialog(rootPane, "Kullanıcı kaydedildi!","HATA",0);
            }
                 else{
                     JOptionPane.showMessageDialog(rootPane, "Kullasdasdasdasdildi!","HATA",0);
                 }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Yeni_Kullanici_Bolumu.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        String kullanici_adi = kullanici_adi_alani.getText();
        String sifre = parola_alani.getText();
        String eposta = eposta_alani.getText();
        String telefon = telefon_alani.getText();
    
         if(kullanici_adi.equals("") || sifre.equals("") || eposta.equals("") || telefon.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Girilmesi gereken alanlar boş bırakılamaz","HATA",0);
        }
        else{            
        fonksiyonlar.kayitOl(kullanici_adi,sifre,eposta,telefon);
         JOptionPane.showMessageDialog(rootPane, "Yeni kullanıcı başarıyla eklendi.");
            }
         
      
    
    }//GEN-LAST:event_yeni_kayit_butonuActionPerformed

    private void geriye_don_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriye_don_butonuActionPerformed
        Kullanici_Giris_Bolumu fener = new Kullanici_Giris_Bolumu();
        this.dispose();
        fener.setVisible(true);
    }//GEN-LAST:event_geriye_don_butonuActionPerformed

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
            java.util.logging.Logger.getLogger(Yeni_Kullanici_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Yeni_Kullanici_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Yeni_Kullanici_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Yeni_Kullanici_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Yeni_Kullanici_Bolumu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eposta_alani;
    private javax.swing.JButton geriye_don_butonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kullanici_adi_alani;
    private javax.swing.JTextField parola_alani;
    private javax.swing.JTextField telefon_alani;
    private javax.swing.JButton yeni_kayit_butonu;
    // End of variables declaration//GEN-END:variables
}
