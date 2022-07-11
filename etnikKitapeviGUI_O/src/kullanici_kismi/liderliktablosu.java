
package kullanici_kismi;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class liderliktablosu extends javax.swing.JDialog {


    public liderliktablosu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel)liderlik_tablosu.getModel(); //tekrar tekrar yazmamak için constructor da yazdık
        liderleriGoruntule();
    }

    DefaultTableModel model;//tabloyu model değişkeninde tutabilmek için
    
    Fonksiyonlar fonksiyon= new Fonksiyonlar();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        liderlik_tablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        geri_don_butonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        liderlik_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kullanıcı", "Skor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(liderlik_tablosu);
        if (liderlik_tablosu.getColumnModel().getColumnCount() > 0) {
            liderlik_tablosu.getColumnModel().getColumn(0).setResizable(false);
            liderlik_tablosu.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("Liderlik Tablosu: 10 kişi");

        geri_don_butonu.setText("Geri Dön");
        geri_don_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geri_don_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(geri_don_butonu)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(geri_don_butonu, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geri_don_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geri_don_butonuActionPerformed
        this.dispose();
        bilgiyarismasiveritabani byg = new bilgiyarismasiveritabani();
        byg.setVisible(true);
    }//GEN-LAST:event_geri_don_butonuActionPerformed

    
     public void liderleriGoruntule(){
    //ilk başta tabloyu boşaltmamız lazım
    model.setRowCount(0);//her seferinde kitaptablomuş boşalmış olur
    ArrayList<Liderler> lider2 = new ArrayList<Liderler>();
    lider2 = fonksiyon.liderlikTablosunuGetir();
    if(lider2 != null){
        for(Liderler lider : lider2){
            Object[] eklenecek = {lider.getKullanici_adi(),lider.getSkor()};
            model.addRow(eklenecek);
        }
    }
}
     
        public void kendiSiralamam(){
    //ilk başta tabloyu boşaltmamız lazım
    
    model.setRowCount(0);//her seferinde kitaptablomuş boşalmış olur
    ArrayList<Liderler> lider2 = new ArrayList<Liderler>();
    lider2 = fonksiyon.liderlikTablosunuGetir();
    if(lider2 != null){
        for(Liderler lider : lider2){
            Object[] eklenecek = {lider.getKullanici_adi(),lider.getSkor()};
            model.addRow(eklenecek);
        }
    }
}
     
   
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                liderliktablosu dialog = new liderliktablosu(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton geri_don_butonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable liderlik_tablosu;
    // End of variables declaration//GEN-END:variables
}
