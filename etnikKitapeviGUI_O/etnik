
package kullanici_kismi;

import javax.swing.JOptionPane;


public class bilgiyarismasiveritabani extends javax.swing.JFrame {

    
    Kullanici_Giris_Bolumu kgb = new Kullanici_Giris_Bolumu();
    Fonksiyonlar fonksiyon = new Fonksiyonlar();
    
    public bilgiyarismasiveritabani() {
        initComponents();
        ad_alani.setText("Tebrikler " + kgb.kullanici_adi);
        bilgiyarismasi by = new bilgiyarismasi();
        skor_alani.setText("Skorun: " + Integer.toString(by.skor));
    }

    static int sayi =0;
    
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        skorumu_kaydet_butonu = new javax.swing.JButton();
        liderlik_tablosu_butonu = new javax.swing.JButton();
        kendi_siralamam_butonu = new javax.swing.JButton();
        skor_alani = new javax.swing.JLabel();
        ad_alani = new javax.swing.JLabel();
        menuye_don_butonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        skorumu_kaydet_butonu.setText("Skorumu Kaydet");
        skorumu_kaydet_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skorumu_kaydet_butonuActionPerformed(evt);
            }
        });

        liderlik_tablosu_butonu.setText("Liderlik Tablosu");
        liderlik_tablosu_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liderlik_tablosu_butonuActionPerformed(evt);
            }
        });

        kendi_siralamam_butonu.setText("Kendi Sıralamam");
        kendi_siralamam_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kendi_siralamam_butonuActionPerformed(evt);
            }
        });

        skor_alani.setText("Skor: ");

        ad_alani.setText("Adınız:");

        menuye_don_butonu.setText("Menüye Dön");
        menuye_don_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuye_don_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ad_alani)
                .addGap(133, 133, 133)
                .addComponent(skor_alani)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(liderlik_tablosu_butonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(skorumu_kaydet_butonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kendi_siralamam_butonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(menuye_don_butonu)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ad_alani)
                    .addComponent(skor_alani))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(skorumu_kaydet_butonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(liderlik_tablosu_butonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuye_don_butonu)
                    .addComponent(kendi_siralamam_butonu))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void menuye_don_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuye_don_butonuActionPerformed
               Object[] saveOption = {"Evet","Hayır"};
        
        if(JOptionPane.showOptionDialog(this, "Menüye Dön?", "UYARI", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE, null,saveOption , null) == JOptionPane.YES_OPTION)
                {
               Kullanici_Arayuzu ka = new Kullanici_Arayuzu(this, true);
               this.dispose();
               ka.setVisible(true);
        }
        else{
            return;
        }
    }//GEN-LAST:event_menuye_don_butonuActionPerformed

    static int sayac2=0;
    private void skorumu_kaydet_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skorumu_kaydet_butonuActionPerformed

        if(sayi<1){
            sayac2++;
        JOptionPane.showMessageDialog(rootPane, "Skorunuz başarıyla kaydedildi");
        Kullanici_Giris_Bolumu kgb = new Kullanici_Giris_Bolumu();
        bilgiyarismasi by = new bilgiyarismasi();
        fonksiyon.skorkaydet(kgb.kullanici_adi,by.skor);
        sayi++;
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Skorunuzu yalnızca 1 kere kaydedebilirsiniz","HATA",0);
        }
        
    }//GEN-LAST:event_skorumu_kaydet_butonuActionPerformed

    private void liderlik_tablosu_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liderlik_tablosu_butonuActionPerformed
        liderliktablosu ldk = new liderliktablosu(this, true);
        this.dispose();
        ldk.setVisible(true);
    }//GEN-LAST:event_liderlik_tablosu_butonuActionPerformed

    bilgiyarismasi bg = new bilgiyarismasi();
    private void kendi_siralamam_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kendi_siralamam_butonuActionPerformed
        
        if(sayac2!=1){
            JOptionPane.showMessageDialog(this, "Siralamanizi görmeniz için öncelikle skorunuzu kaydetmelisiniz");
        }
        else{
                   int i=0;
        for(i=0;i<fonksiyon.kendiSiralamamiGetir().size();i++){
          if(bg.skor==Integer.valueOf(fonksiyon.kendiSiralamamiGetir().get(i))){
              break;
          }      
      }
        i++;
        JOptionPane.showMessageDialog(this,"Kendi siralaman: " + i);
        }
    
        
    }//GEN-LAST:event_kendi_siralamam_butonuActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bilgiyarismasiveritabani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad_alani;
    private javax.swing.JButton kendi_siralamam_butonu;
    private javax.swing.JButton liderlik_tablosu_butonu;
    private javax.swing.JButton menuye_don_butonu;
    private javax.swing.JLabel skor_alani;
    private javax.swing.JButton skorumu_kaydet_butonu;
    // End of variables declaration//GEN-END:variables
}
