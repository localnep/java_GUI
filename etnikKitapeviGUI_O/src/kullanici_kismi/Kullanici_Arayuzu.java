/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanici_kismi;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Kullanici_Arayuzu extends javax.swing.JDialog {

    Fonksiyonlar fonksiyon = new Fonksiyonlar();
    DefaultTableModel model;//tabloyu model değişkeninde tutabilmek için
    Kullanici_Giris_Bolumu kgb = new Kullanici_Giris_Bolumu();
    
    public Kullanici_Arayuzu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel)kitaplar_tablosu.getModel(); //tekrar tekrar yazmamak için constructor da yazdık
        kitaplarGoruntule();//hemen çalışmasını istiyoruz
        kullanici_adi.setText(kgb.kullanici_adi);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        kitaplar_tablosu = new javax.swing.JTable();
        cikis_yap_butonu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        istek_listesi = new javax.swing.JTextArea();
        gonder_butonu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kullanici_adi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        masal_butonu = new javax.swing.JButton();
        roman_butonu = new javax.swing.JButton();
        bilim_butonu = new javax.swing.JButton();
        kişiselgelişim_butonu = new javax.swing.JButton();
        destan_butonu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        hepsini_getir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kitaplar_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Kitap Adı", "Tür", "Yazarı", "Yayınevi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(kitaplar_tablosu);
        if (kitaplar_tablosu.getColumnModel().getColumnCount() > 0) {
            kitaplar_tablosu.getColumnModel().getColumn(0).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(1).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(2).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(3).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        cikis_yap_butonu.setText("Çıkış Yap");
        cikis_yap_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis_yap_butonuActionPerformed(evt);
            }
        });

        istek_listesi.setColumns(20);
        istek_listesi.setRows(5);
        istek_listesi.setText("Bu bölüm size özel kitabevinden istediğiniz bir kitabı \nveya listede olmayan bir kitabı belirtmeniz için\noluşturulmuştur.Eğer isterseniz bize mesaj olarak da\nkullanabilirsiniz. Olası bir durumda sizinle iletişime\ngeçebilmemiz için telefon numaranız sistemimizde\nkayıtlı olacaktır. Bu bölümü silip isteğinizi yazabilirsiniz.\n");
        jScrollPane2.setViewportView(istek_listesi);

        gonder_butonu.setText("Mesajı Gönder");
        gonder_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonder_butonuActionPerformed(evt);
            }
        });

        jLabel1.setText("HOŞGELDİNİZ");

        jLabel2.setText("İstek Listesi");

        masal_butonu.setText("Masal");
        masal_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masal_butonuActionPerformed(evt);
            }
        });

        roman_butonu.setText("Roman");
        roman_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roman_butonuActionPerformed(evt);
            }
        });

        bilim_butonu.setText("Bilim");
        bilim_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilim_butonuActionPerformed(evt);
            }
        });

        kişiselgelişim_butonu.setText("Kişisel Gelişim");
        kişiselgelişim_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kişiselgelişim_butonuActionPerformed(evt);
            }
        });

        destan_butonu.setText("Destan");
        destan_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destan_butonuActionPerformed(evt);
            }
        });

        jLabel3.setText("Listeleme");

        hepsini_getir.setText("Hepsini Göster");
        hepsini_getir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hepsini_getirActionPerformed(evt);
            }
        });

        jMenu1.setText("Bilgi Yarismasi");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kullanici_adi)
                                        .addGap(17, 17, 17))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cikis_yap_butonu, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gonder_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masal_butonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roman_butonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bilim_butonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kişiselgelişim_butonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(destan_butonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hepsini_getir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cikis_yap_butonu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gonder_butonu, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(masal_butonu)
                    .addComponent(roman_butonu)
                    .addComponent(bilim_butonu)
                    .addComponent(kişiselgelişim_butonu)
                    .addComponent(destan_butonu)
                    .addComponent(hepsini_getir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cikis_yap_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis_yap_butonuActionPerformed
        Object[] saveOption = {"Evet","Hayır"};
        
        if(JOptionPane.showOptionDialog(this, "Çıkmak istediğinize emin misiniz?", "UYARI", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE, null,saveOption , null) == JOptionPane.YES_OPTION)
                {
               System.exit(0);
        }
        else{
            return;
        }
    }//GEN-LAST:event_cikis_yap_butonuActionPerformed

    private void gonder_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonder_butonuActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Mesajınız başarıyla gönderilmiştir."); 
        fonksiyon.istekgonder(kgb.kullanici_adi,fonksiyon.telgetir(),istek_listesi.getText());

    }//GEN-LAST:event_gonder_butonuActionPerformed

    private void masal_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masal_butonuActionPerformed
        model.setRowCount(0);//her seferinde kitaptablomuş boşalmış olur
        ArrayList<Kitaplar2> kitaplar = new ArrayList<Kitaplar2>();
        kitaplar = fonksiyon.masalGetir();
         if(kitaplar != null){
        for(Kitaplar2 kitap : kitaplar){
            Object[] eklenecek = {kitap.getId(),kitap.getKitap_adi(),kitap.getKitap_turu(),kitap.getKitap_yazari(),kitap.getKitap_mevcut()};
            model.addRow(eklenecek);
        }
         }
    }//GEN-LAST:event_masal_butonuActionPerformed

    private void roman_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roman_butonuActionPerformed
        model.setRowCount(0);//her seferinde kitaptablomuş boşalmış olur
        ArrayList<Kitaplar2> kitaplar = new ArrayList<Kitaplar2>();
        kitaplar = fonksiyon.romanGetir();
         if(kitaplar != null){
        for(Kitaplar2 kitap : kitaplar){
            Object[] eklenecek = {kitap.getId(),kitap.getKitap_adi(),kitap.getKitap_turu(),kitap.getKitap_yazari(),kitap.getKitap_mevcut()};
            model.addRow(eklenecek);
        }
         }
    }//GEN-LAST:event_roman_butonuActionPerformed

    private void bilim_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilim_butonuActionPerformed
           model.setRowCount(0);//her seferinde kitaptablomuş boşalmış olur
        ArrayList<Kitaplar2> kitaplar = new ArrayList<Kitaplar2>();
        kitaplar = fonksiyon.bilimGetir();
         if(kitaplar != null){
        for(Kitaplar2 kitap : kitaplar){
            Object[] eklenecek = {kitap.getId(),kitap.getKitap_adi(),kitap.getKitap_turu(),kitap.getKitap_yazari(),kitap.getKitap_mevcut()};
            model.addRow(eklenecek);
        }
         }
    }//GEN-LAST:event_bilim_butonuActionPerformed

    private void kişiselgelişim_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kişiselgelişim_butonuActionPerformed
           model.setRowCount(0);//her seferinde kitaptablomuş boşalmış olur
        ArrayList<Kitaplar2> kitaplar = new ArrayList<Kitaplar2>();
        kitaplar = fonksiyon.kisiselGelisimGetir();
         if(kitaplar != null){
        for(Kitaplar2 kitap : kitaplar){
            Object[] eklenecek = {kitap.getId(),kitap.getKitap_adi(),kitap.getKitap_turu(),kitap.getKitap_yazari(),kitap.getKitap_mevcut()};
            model.addRow(eklenecek);
        }
         }
    }//GEN-LAST:event_kişiselgelişim_butonuActionPerformed

    private void destan_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destan_butonuActionPerformed
         model.setRowCount(0);//her seferinde kitaptablomuş boşalmış olur
        ArrayList<Kitaplar2> kitaplar = new ArrayList<Kitaplar2>();
        kitaplar = fonksiyon.destanGetir();
         if(kitaplar != null){
        for(Kitaplar2 kitap : kitaplar){
            Object[] eklenecek = {kitap.getId(),kitap.getKitap_adi(),kitap.getKitap_turu(),kitap.getKitap_yazari(),kitap.getKitap_mevcut()};
            model.addRow(eklenecek);
        }
         }
    }//GEN-LAST:event_destan_butonuActionPerformed

    private void hepsini_getirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hepsini_getirActionPerformed
          model.setRowCount(0);//her seferinde kitaptablomuş boşalmış olur
        ArrayList<Kitaplar2> kitaplar = new ArrayList<Kitaplar2>();
        kitaplar = fonksiyon.kitaplariGetir();
         if(kitaplar != null){
        for(Kitaplar2 kitap : kitaplar){
            Object[] eklenecek = {kitap.getId(),kitap.getKitap_adi(),kitap.getKitap_turu(),kitap.getKitap_yazari(),kitap.getKitap_mevcut()};
            model.addRow(eklenecek);
        }
         }
    }//GEN-LAST:event_hepsini_getirActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed
   static int sayac=0;
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

                  Object[] saveOption = {"Evet","Hayır"};
        
        if(JOptionPane.showOptionDialog(this, "Oynamaya hazır mısın?", "UYARI", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE, null,saveOption , null) == JOptionPane.YES_OPTION)
                {
                    sayac++;
                    if(sayac<=1){
                        bilgiyarismasi byg = new bilgiyarismasi();
               this.dispose();
               byg.setVisible(true); 
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Oyunu sadece 1 kez oynayabilirsiniz");
                    }
              
        }
        else{
            return;
        }
    }//GEN-LAST:event_jMenu1MouseClicked

     public void kitaplarGoruntule(){
    //ilk başta tabloyu boşaltmamız lazım
    model.setRowCount(0);//her seferinde kitaptablomuş boşalmış olur
    ArrayList<Kitaplar2> kitaplar = new ArrayList<Kitaplar2>();
    kitaplar = fonksiyon.kitaplariGetir();
    if(kitaplar != null){
        for(Kitaplar2 kitap : kitaplar){
            Object[] eklenecek = {kitap.getId(),kitap.getKitap_adi(),kitap.getKitap_turu(),kitap.getKitap_yazari(),kitap.getKitap_mevcut()};
            model.addRow(eklenecek);
        }
    }
}
    
    
    
    
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
            java.util.logging.Logger.getLogger(Kullanici_Arayuzu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kullanici_Arayuzu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kullanici_Arayuzu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kullanici_Arayuzu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Kullanici_Arayuzu dialog = new Kullanici_Arayuzu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bilim_butonu;
    private javax.swing.JButton cikis_yap_butonu;
    private javax.swing.JButton destan_butonu;
    private javax.swing.JButton gonder_butonu;
    private javax.swing.JButton hepsini_getir;
    private javax.swing.JTextArea istek_listesi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable kitaplar_tablosu;
    private javax.swing.JButton kişiselgelişim_butonu;
    private javax.swing.JLabel kullanici_adi;
    private javax.swing.JButton masal_butonu;
    private javax.swing.JButton roman_butonu;
    // End of variables declaration//GEN-END:variables
}
