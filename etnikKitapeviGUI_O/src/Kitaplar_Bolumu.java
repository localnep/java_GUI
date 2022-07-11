
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Kitaplar_Bolumu extends javax.swing.JDialog {

    Giris_Bolumu giris_Bolumu = new Giris_Bolumu();
  
     
    DefaultTableModel model;//tabloyu model değişkeninde tutabilmek için
    DefaultTableModel model2;
    Fonksiyonlar fonksiyonlar = new Fonksiyonlar();
    Giris_Bolumu giris = new Giris_Bolumu();

    
    static boolean hareket = false;
    int hareketSure = 0;
    int eskiX=0;
    int eskiY=0;
    int yeniX=0;
    int yeniY=0;
    
    
    public Kitaplar_Bolumu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel)kitaplar_tablosu.getModel(); //tekrar tekrar yazmamak için constructor da yazdık
        kitaplarGoruntule();//hemen çalışmasını istiyoruz
        model2 = (DefaultTableModel)kitaplar_tablosu2.getModel(); //tekrar tekrar yazmamak için constructor da yazdık
        kitaplarGoruntule2();
        kullanici_ismi.setText(giris.kullanici_adi);
        
        ////////////////////////////////////////////////////////
        Timer timer = new Timer(1, new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           
           if(!hareket){
               hareketSure++;
               if(hareketSure == 1000*60*20){ //1000*60*20
                   Timer tmr = (Timer)e.getSource();
                   tmr.stop();
                   JOptionPane.showMessageDialog(rootPane, "Uzun süre işlem yapılmadığı için güvenlik amacıyla oturum kapatılmıştır.", "UYARI", 0);
                   System.exit(0);
                       
               }
           }
           else
           {
               hareketSure = 0;
           }
           hareket = false;           
       }
   });
        
        timer.start();
    }

    
    

  


  
   
    public void dinamikAra(String ara){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);//dinamik ara için TableRowSorter kütüp. kullandık, cons olarak model kullanıyoruz
        kitaplar_tablosu.setRowSorter(tr);
       
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        kitaplar_tablosu = new javax.swing.JTable();
        kitap_ekleme_butonu = new javax.swing.JButton();
        kitap_ad_alani = new javax.swing.JTextField();
        kitap_yazari_alani = new javax.swing.JTextField();
        kitap_turu_alani = new javax.swing.JTextField();
        kitap_mevcut_alani = new javax.swing.JTextField();
        arama_cubugu = new javax.swing.JTextField();
        kitap_guncelleme_butonu = new javax.swing.JButton();
        kitap_silme_butonu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        kitaplar_tablosu2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        gelecek_kitap_sil_butonu = new javax.swing.JButton();
        gelecek_kitap_ekle_butonu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        kullanici_ismi = new javax.swing.JLabel();
        cikis_yap_butonu = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        kitaplar_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Kitap Ad", "Tür", "Yazar", "Yayınevi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kitaplar_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kitaplar_tablosuMouseClicked(evt);
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

        kitap_ekleme_butonu.setText("Kitap Ekle");
        kitap_ekleme_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_ekleme_butonuActionPerformed(evt);
            }
        });

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        kitap_guncelleme_butonu.setText("Kitap Güncelle");
        kitap_guncelleme_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_guncelleme_butonuActionPerformed(evt);
            }
        });

        kitap_silme_butonu.setText("Kitap Sil");
        kitap_silme_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_silme_butonuActionPerformed(evt);
            }
        });

        jLabel1.setText("Kitap Ad:");

        jLabel2.setText("Yazar:");

        jLabel3.setText("Tür:");

        jLabel4.setText("Yayınevi:");

        kitaplar_tablosu2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Kitap Adi", "Yazari"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kitaplar_tablosu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kitaplar_tablosu2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(kitaplar_tablosu2);
        if (kitaplar_tablosu2.getColumnModel().getColumnCount() > 0) {
            kitaplar_tablosu2.getColumnModel().getColumn(0).setResizable(false);
            kitaplar_tablosu2.getColumnModel().getColumn(1).setResizable(false);
            kitaplar_tablosu2.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel5.setText("GELECEK OLAN KİTAP LİSTESİ");

        gelecek_kitap_sil_butonu.setText("Gelecek Kitap Sil");
        gelecek_kitap_sil_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gelecek_kitap_sil_butonuActionPerformed(evt);
            }
        });

        gelecek_kitap_ekle_butonu.setText("Gelecek Kitap Ekle");
        gelecek_kitap_ekle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gelecek_kitap_ekle_butonuActionPerformed(evt);
            }
        });

        jLabel6.setText("Hoşgeldin");

        cikis_yap_butonu.setText("Çıkış Yap");
        cikis_yap_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis_yap_butonuActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kitap_turu_alani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kitap_mevcut_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kitap_yazari_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(kitap_ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kitap_guncelleme_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitap_ekleme_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitap_silme_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gelecek_kitap_ekle_butonu)
                                        .addGap(18, 18, 18)
                                        .addComponent(gelecek_kitap_sil_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104)
                                        .addComponent(kullanici_ismi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cikis_yap_butonu, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kullanici_ismi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cikis_yap_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gelecek_kitap_ekle_butonu)
                            .addComponent(gelecek_kitap_sil_butonu))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(kitap_ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitap_ekleme_butonu))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kitap_guncelleme_butonu)
                            .addComponent(kitap_yazari_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kitap_turu_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(kitap_silme_butonu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(kitap_mevcut_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kitap_ekleme_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_ekleme_butonuActionPerformed
        String kitap_ad = kitap_ad_alani.getText();
        String kitap_yazar = kitap_yazari_alani.getText();
        String kitap_tur = kitap_turu_alani.getText();
        String kitap_mevcut = kitap_mevcut_alani.getText();
        
        
        if(kitap_ad.equals("") || kitap_yazar.equals("") || kitap_tur.equals("") || kitap_mevcut.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Girilmesi gereken alanlar boş bırakılamaz","HATA",0);
        }
        else{            
        fonksiyonlar.kitapEkle(kitap_ad,kitap_yazar,kitap_tur,kitap_mevcut);
        kitaplarGoruntule();
         JOptionPane.showMessageDialog(rootPane, "Yeni kitap başarıyla eklendi.");
            }
    }//GEN-LAST:event_kitap_ekleme_butonuActionPerformed

    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
         //klavyeden girilen degere gore tetiklenecek --> keyreleased
        String ara = arama_cubugu.getText();
        dinamikAra(ara);//->
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void kitaplar_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitaplar_tablosuMouseClicked
         //kitaplar tablosundaki hangi satıra basıldıysa o satırın özellikleri text area'ya gelsin
        int selectedrow = kitaplar_tablosu.getSelectedRow();//secilen satırı aldık 
        kitap_ad_alani.setText(model.getValueAt(selectedrow,1).toString());//seçilen satırı ad alani text area'ya string'e dönüştürerek aldık
        kitap_yazari_alani.setText(model.getValueAt(selectedrow,2).toString());
        kitap_turu_alani.setText(model.getValueAt(selectedrow,3).toString());
        kitap_mevcut_alani.setText(model.getValueAt(selectedrow,4).toString());// TODO add your handling code here:
    }//GEN-LAST:event_kitaplar_tablosuMouseClicked

    private void kitap_guncelleme_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_guncelleme_butonuActionPerformed
         //değerleri almış olduk
        String kitapad = kitap_ad_alani.getText();
        String kitapyazar= kitap_yazari_alani.getText();
        String kitaptur = kitap_turu_alani.getText();
        String kitapmevcut = kitap_mevcut_alani.getText();
        
        //hangi satırı aldğımızı bilmek için
        int selectedrow = kitaplar_tablosu.getSelectedRow();
        if(selectedrow == -1){ //ya tablo boştur ya da herhangi bir yere tıklanmamıştır
            if(model.getRowCount() == 0){ //tablomuz boşmu kontrolu
                 JOptionPane.showMessageDialog(rootPane, "Kitap tablosu şu anda boştur.","HATA",0);
            }
            else{
                 JOptionPane.showMessageDialog(rootPane, "Hatalı seçim","HATA",0);
            }
        }
        else{
            //seçilen satırın id sini almak istioyrum idye göre güncelleme işlemi yapılacak
            int id = (int)model.getValueAt(selectedrow, 0);
            fonksiyonlar.kitapGuncelle(id,kitapad,kitapyazar,kitaptur,kitapmevcut);
            kitaplarGoruntule();
            JOptionPane.showMessageDialog(rootPane, "Kitap basariyla güncellendi.");
        }
    }//GEN-LAST:event_kitap_guncelleme_butonuActionPerformed

    private void kitap_silme_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_silme_butonuActionPerformed
         int selectedrow = kitaplar_tablosu.getSelectedRow();
        //eğer boş ise veya herhangi bir alan seçilmemişse
        if(selectedrow == -1){
            if(model.getRowCount()==0){
                 JOptionPane.showMessageDialog(rootPane, "Kitap tablosu şu anda boş","HATA",0);
            }
            else{
                 JOptionPane.showMessageDialog(rootPane, "Hatalı seçim","HATA",0);
            }
        }
        else{
            //id ye göre silme işlemi yapılacağından
            int id = (int) model.getValueAt(selectedrow,0);
            fonksiyonlar.kitapSil(id);//kutup islemlerde
            kitaplarGoruntule();
            JOptionPane.showMessageDialog(rootPane, "Kitap basariyla silindi.");
        }
    }//GEN-LAST:event_kitap_silme_butonuActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        yeniX = evt.getX();
        yeniY = evt.getY();
        if (yeniX == eskiX || yeniY == eskiY) {
            hareket = false;
        }
        else
        {
            hareket = true;
            eskiX = yeniX; 
            eskiY = yeniY; 
        }
    }//GEN-LAST:event_formMouseMoved

    private void kitaplar_tablosu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitaplar_tablosu2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_kitaplar_tablosu2MouseClicked

    private void gelecek_kitap_sil_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gelecek_kitap_sil_butonuActionPerformed
          int selectedrow = kitaplar_tablosu2.getSelectedRow();
        //eğer boş ise veya herhangi bir alan seçilmemişse
        if(selectedrow == -1){
            if(model.getRowCount()==0){
                 JOptionPane.showMessageDialog(rootPane, "Kitap tablosu şu anda boş","HATA",0);
            }
            else{
                 JOptionPane.showMessageDialog(rootPane, "Hatalı seçim","HATA",0);
            }
        }
        else{
            //id ye göre silme işlemi yapılacağından
            int id = (int) model2.getValueAt(selectedrow,0);
            fonksiyonlar.gelecekKitapSil(id);//kutup islemlerde
            kitaplarGoruntule2();
            JOptionPane.showMessageDialog(rootPane, "Kitap basariyla silindi.");
        }
    }//GEN-LAST:event_gelecek_kitap_sil_butonuActionPerformed

    private void gelecek_kitap_ekle_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gelecek_kitap_ekle_butonuActionPerformed
        String kitap_ad = kitap_ad_alani.getText();
        String kitap_yazar = kitap_yazari_alani.getText();
        
        if(kitap_ad.equals("") || kitap_yazar.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Girilmesi gereken alanlar boş bırakılamaz","HATA",0);
        }
        else{            
        fonksiyonlar.gelecekKitapEkle(kitap_ad,kitap_yazar);
        kitaplarGoruntule2();
         JOptionPane.showMessageDialog(rootPane, "Yeni kitap başarıyla eklendi.");
            }
    }//GEN-LAST:event_gelecek_kitap_ekle_butonuActionPerformed

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

   
        
    public void kitaplarGoruntule(){
    //ilk başta tabloyu boşaltmamız lazım
    model.setRowCount(0);//her seferinde kitaptablomuş boşalmış olur
    ArrayList<Kitaplar> kitaplar = new ArrayList<Kitaplar>();
    kitaplar = fonksiyonlar.kitaplariGetir();
    if(kitaplar != null){
        for(Kitaplar kitap : kitaplar){
            Object[] eklenecek = {kitap.getId(),kitap.getKitap_adi(),kitap.getKitap_turu(),kitap.getKitap_yazari(),kitap.getKitap_mevcut()};
            model.addRow(eklenecek);
        }
    }
}
    
    public void kitaplarGoruntule2(){
    //ilk başta tabloyu boşaltmamız lazım
    model2.setRowCount(0);//her seferinde kitaptablomuş boşalmış olur
    ArrayList<gelecek_kitaplar> kitaplar = new ArrayList<gelecek_kitaplar>();
    kitaplar = fonksiyonlar.kitaplariGetir2();
    if(kitaplar != null){
        for(gelecek_kitaplar kitap : kitaplar){
            Object[] eklenecek = {kitap.getId(),kitap.getKitap_adi(),kitap.getKitap_yazari()};
            model2.addRow(eklenecek);
        }
    }
}
   
    
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
            java.util.logging.Logger.getLogger(Kitaplar_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kitaplar_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kitaplar_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kitaplar_Bolumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Kitaplar_Bolumu dialog = new Kitaplar_Bolumu(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton cikis_yap_butonu;
    private javax.swing.JButton gelecek_kitap_ekle_butonu;
    private javax.swing.JButton gelecek_kitap_sil_butonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField kitap_ad_alani;
    private javax.swing.JButton kitap_ekleme_butonu;
    private javax.swing.JButton kitap_guncelleme_butonu;
    private javax.swing.JTextField kitap_mevcut_alani;
    private javax.swing.JButton kitap_silme_butonu;
    private javax.swing.JTextField kitap_turu_alani;
    private javax.swing.JTextField kitap_yazari_alani;
    private javax.swing.JTable kitaplar_tablosu;
    private javax.swing.JTable kitaplar_tablosu2;
    private javax.swing.JLabel kullanici_ismi;
    // End of variables declaration//GEN-END:variables
}
