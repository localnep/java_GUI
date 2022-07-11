
package kullanici_kismi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;


public class bilgiyarismasi extends javax.swing.JFrame implements ActionListener{

    
    
    public bilgiyarismasi() {
        initComponents();
        sorulariolustur();
        Random rnd = new Random(); 
        //int a=rnd.nextInt(6);// 0 ile 5 arasında
        soruyuEkranaYansit(gecerliSoru);
       
    }
    
soru[] sorular = new soru[10];
int gecerliSoru=0;
static int skor=0;
int soruMax=10;

    public void sorulariolustur(){
        sorular[0]= new soru("'Babalar ve Oğullar' kitabının yazarı kimdir ?" , "Lewis Carrol" , "Daniel Goleman" , "İvan Turgenyev" , "Aleksandr Soljenitsin" , soru.Cevap.CEVAP_C);
        sorular[1]= new soru("Hangisi 'Destan' türünde bir kitaptır ?" , "Prens İgor" , "Kör Saatçi" , "	\n" +
"Sefiller" , "Savaş ve Barış" , soru.Cevap.CEVAP_A);
        sorular[2]= new soru("Raskolnikov hangi 'Roman'ın kahramanıdır" , "Gulag Takım Adaları" , "Ölü Canlar" , "Suç ve Ceza" , "Preacher" , soru.Cevap.CEVAP_C);
        sorular[3]= new soru("Hangisi bir 'Yaşar Kemal' romanı değildir ?" , "Yılanı Öldürseler" , "Yer Demir Gök Bakır" , "Orta Direk" , "Sis" , soru.Cevap.CEVAP_D);
        sorular[4]= new soru("Hangi karakter Tutunamayanlar adlı romanın kahramanı değildir ?" , "Selim Işık" , "Mustafa İnan" , "Turgut Özben" , "Küçük Prens" , soru.Cevap.CEVAP_B);
        sorular[5]= new soru("Kürk Mantolu Madonna adlı eser hangi yılda yayımlanmıştı ?", "1962", "1957", "1943", "1951", soru.Cevap.CEVAP_C);
        sorular[6]= new soru("Hangisi Vladimir Nabokov'a ait bir eserdir ?", "Dava", "Lolita", "Ulysses", "Babalar ve Oğullar", soru.Cevap.CEVAP_B);
        sorular[7]= new soru("Gregor Samsa hangi eserin kahramanıdır ?", "Dönüşüm - Franz Kafka", "Mahpus - Micheal Proust", "John Morrison", "Vadideki Zambak - Balzac", soru.Cevap.CEVAP_A);
        sorular[8]= new soru("Cervantes'in ünlü karakteri Don Kişot için hangisi doğrudur ?", "Portekizli", "Fransız şövalye", "İskandinav Viking", "İspanyol soylu", soru.Cevap.CEVAP_D);
        sorular[9]= new soru("Gulliver'in Gezileri adlı eserde minik insanların ülkesi hangisidir ?", "Lilliput", "Brobdingna", "Yahoo", "WWE", soru.Cevap.CEVAP_A);
        
    }   
    
    public void soruyuEkranaYansit(int soruNo){
        soru_metni.setText(sorular[soruNo].soruMetni);
        a_sikki.setText(sorular[soruNo].secenekA);
        b_sikki.setText(sorular[soruNo].secenekB);
        c_sikki.setText(sorular[soruNo].secenekC);
        d_sikki.setText(sorular[soruNo].secenekD);
    }
    
    public boolean cevapKontrol(soru.Cevap verilenCevap){
        return sorular[gecerliSoru].cevapKontrol(verilenCevap);
    }
 
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        soru_metni = new javax.swing.JLabel();
        a_sikki = new javax.swing.JRadioButton();
        c_sikki = new javax.swing.JRadioButton();
        b_sikki = new javax.swing.JRadioButton();
        d_sikki = new javax.swing.JRadioButton();
        cevapla_butonu = new javax.swing.JButton();
        skor_label = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        soru_metni.setText("asdasdasd");

        buttonGroup1.add(a_sikki);
        a_sikki.setText("jRadioButton1");

        buttonGroup1.add(c_sikki);
        c_sikki.setText("jRadioButton2");

        buttonGroup1.add(b_sikki);
        b_sikki.setText("jRadioButton3");

        buttonGroup1.add(d_sikki);
        d_sikki.setText("jRadioButton4");

        cevapla_butonu.setText("Cevapla");
        cevapla_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cevapla_butonuActionPerformed(evt);
            }
        });

        skor_label.setText("Puan: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(soru_metni, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cevapla_butonu)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c_sikki)
                        .addComponent(a_sikki)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_sikki)
                            .addComponent(d_sikki)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(skor_label)
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(soru_metni, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_sikki)
                    .addComponent(b_sikki))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d_sikki)
                    .addComponent(c_sikki))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cevapla_butonu)
                    .addComponent(skor_label))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cevapla_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cevapla_butonuActionPerformed
         boolean cevap;
       //cevap kontrol kısmı
        if(a_sikki.isSelected()){
            cevap = cevapKontrol(soru.Cevap.CEVAP_A);
        }
        else if(b_sikki.isSelected()){
            cevap = cevapKontrol(soru.Cevap.CEVAP_B);
        }
        else if(c_sikki.isSelected()){
            cevap = cevapKontrol(soru.Cevap.CEVAP_C);
        }
        else if(d_sikki.isSelected()){
            cevap = cevapKontrol(soru.Cevap.CEVAP_D);
        }
        else{
             //JOptionPane.showMessageDialog(rootPane, "Cevap boş bırakılamaz!","HATA",0);
             cevap=false;
        }
        
                //cevaba göre iş yap
         if(cevap){
            JOptionPane.showMessageDialog(this, "Doğru!");
            skor+=10;
            skor_label.setText("Puan: " + skor);
        }
         else{
             JOptionPane.showMessageDialog(rootPane, "Yanlış!","HATA",0);
         }
         
         gecerliSoru++;
         if(gecerliSoru < soruMax){
             soruyuEkranaYansit(gecerliSoru);
         }
         else{
              JOptionPane.showMessageDialog(this, "Oyun bitti, Puanın: " + skor);
              JOptionPane.showMessageDialog(this,"Tebrikler" + "\nToplam Doğru Cevap: " + soru.dogruCevapSayisi 
              + "\nToplan Yanlış Cevap: " + soru.yanlisCevapSayisi + "\nSkorun: " + skor);
               bilgiyarismasiveritabani bybt = new bilgiyarismasiveritabani();
               this.dispose();
               bybt.setVisible(true);
         }
         

    }//GEN-LAST:event_cevapla_butonuActionPerformed

    
    
    
    
    
    
    
    

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
            java.util.logging.Logger.getLogger(bilgiyarismasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bilgiyarismasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bilgiyarismasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bilgiyarismasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bilgiyarismasi().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a_sikki;
    private javax.swing.JRadioButton b_sikki;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton c_sikki;
    private javax.swing.JButton cevapla_butonu;
    private javax.swing.JRadioButton d_sikki;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel skor_label;
    private javax.swing.JLabel soru_metni;
    // End of variables declaration//GEN-END:variables
}
