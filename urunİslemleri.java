package stoktakip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class urunİslemleri extends javax.swing.JFrame {

  
    public urunİslemleri() {
        initComponents();
        getConnection();
     urunleri_tabloya_aktar();
     urun_no.setEditable(false);

    }
   Connection getConnection(){
       Connection cn=null;
        try {
          cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stoktakip?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
          return cn;
        } catch (SQLException ex) {
            System.out.println("Veritabanı bağlantısı başarısız. ");
          Logger.getLogger(urunİslemleri.class.getName()).log(Level.SEVERE, null, ex);
                return null;
        }     
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        urun_no = new javax.swing.JTextField();
        urun_adi = new javax.swing.JTextField();
        urun_acıklama = new javax.swing.JTextField();
        urun_fiyat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("ÜRÜN AÇIKLAMA");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ÜRÜN FİYAT");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("KAYDET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("GÜNCELLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("SİL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        urun_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urun_noActionPerformed(evt);
            }
        });

        urun_adi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("ÜRÜN NO");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ÜRÜN ADI");

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün Kodu", "Ürün Adı", "Ürün Açıklama", "Ürün Fiyat"
            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("ÇIKIŞ YAP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(urun_no, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(urun_adi)
                            .addComponent(urun_acıklama)
                            .addComponent(urun_fiyat)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urun_no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(urun_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urun_acıklama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urun_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void urun_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urun_noActionPerformed
       
    }//GEN-LAST:event_urun_noActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
      if(kontrolEt())
      {
          try{
        String urun_adi1 = urun_adi.getText();
        String urun_acıklama1 = urun_acıklama.getText();
        float urun_fiyati1 = Float.valueOf(urun_fiyat.getText());
        ekle ekl=new ekle();
        ekl.kaydet(urun_adi1, urun_acıklama1, urun_fiyati1);
        JOptionPane.showMessageDialog(null, "Ürün Eklendi");
         urunleri_tabloya_aktar();
        urun_adi.setText("");
        urun_acıklama.setText("");
        urun_fiyat.setText("");
          }
          catch(Exception e)
          { 
              e.printStackTrace();
              
          }
      }
      else
      {
          JOptionPane.showMessageDialog(null, "Boş değer tanımlanamaz");
      }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if(!urun_no.getText().equals("")){
        int urun_kodu1 = Integer.valueOf(urun_no.getText());
        String urun_adi1 = urun_adi.getText();
        String urun_acıklama1 = urun_acıklama.getText();
        float urun_fiyati1 = Float.valueOf(urun_fiyat.getText());
        guncelle gnc = new guncelle();
        gnc.gnclle(urun_kodu1, urun_adi1, urun_acıklama1, urun_fiyati1);
        JOptionPane.showMessageDialog(null, "Ürün guncellendi");
        urunleri_tabloya_aktar();
         }
         else
      {
          JOptionPane.showMessageDialog(null, "guncellenecek Urun Kodu Yok"); 
      }
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    if(!urun_no.getText().equals("")){
       int urunK=Integer.parseInt(urun_no.getText());
       silmeislemi sl = new silmeislemi();
       sl.sll(urunK);
       JOptionPane.showMessageDialog(null, "Ürün Silindi");
       urunleri_tabloya_aktar();
       urun_no.setText("");
       urun_adi.setText("");
       urun_fiyat.setText("");
       urun_acıklama.setText("");
      }
      else
      {
          JOptionPane.showMessageDialog(null, "Silinecek Urun Kodu Yok"); 
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       anasayfa frm = new anasayfa();
       frm.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
      int index=tablo.getSelectedRow();
        try {
            urunGoster(index);
            
        } catch (Exception e) {
        }

    }//GEN-LAST:event_tabloMouseClicked

    boolean kontrolEt(){
    if(urun_adi.getText().equals("") || urun_acıklama.getText().equals("") || urun_fiyat.getText().equals(""))
    {
        return false;
    }
    else 
    {
        Float.parseFloat(urun_fiyat.getText());
        return true;

    }
    
    }
   
     ArrayList<urun_listesi>getSutunlar(){
     ArrayList<urun_listesi>urun_listesi=new ArrayList<>();
        Connection con=getConnection();
     String sorgu="SELECT * FROM urun";
     Statement st;
        try {
           ResultSet rs;
           st=con.createStatement();
           rs=st.executeQuery(sorgu);
     urun_listesi s;
        while(rs.next()){
            s=new urun_listesi(rs.getInt("urun_kodu"), rs.getString("urun_adi"), rs.getString("urun_acıklama"), Float.parseFloat(rs.getString("urun_fiyat")));
            urun_listesi.add(s);
             }
            
       } catch (Exception e) {
           e.printStackTrace();
       }
        return urun_listesi;
      }
 void urunleri_tabloya_aktar(){
       try {
           ArrayList<urun_listesi>list=getSutunlar();
           DefaultTableModel model=(DefaultTableModel)tablo.getModel();
                       model.setRowCount(0);
           Object [] satir=new Object[4];
                for(int i=0;i<list.size();i++){
                    satir[0]=list.get(i).getUrun_kodu();
                    satir[1]=list.get(i).getUrun_adi();
                    satir[2]=list.get(i).getUrun_acıklama();
                    satir[3]=list.get(i).getUrun_fiyat();
                 
                      model.addRow(satir);
                   
                }
       } catch (Exception e) {
           e.printStackTrace();
     
       }
   }
   void urunGoster(int index){
       try {
        urun_no.setText(Integer.toString(getSutunlar().get(index).getUrun_kodu()));
        urun_adi.setText(getSutunlar().get(index).getUrun_adi());
        urun_acıklama.setText(getSutunlar().get(index).getUrun_acıklama());
        urun_fiyat.setText(Float.toString(getSutunlar().get(index).getUrun_fiyat()));
       
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new urunİslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablo;
    private javax.swing.JTextField urun_acıklama;
    private javax.swing.JTextField urun_adi;
    private javax.swing.JTextField urun_fiyat;
    private javax.swing.JTextField urun_no;
    // End of variables declaration//GEN-END:variables
}
