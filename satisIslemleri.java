
package stoktakip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class satisIslemleri extends javax.swing.JFrame {

    
    public satisIslemleri() {
        initComponents();
        getUrun();
        getMusteri();
        getConnection();
        urunleri_tabloya_aktar();
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

        cb_urunadi = new javax.swing.JComboBox();
        dc_tarih = new com.toedter.calendar.JDateChooser();
        txt_ucret = new javax.swing.JTextField();
        txt_adet = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cb_musteri = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cb_urunadi.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cb_urunadiPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("ÜRÜN ADI");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ÜCRET");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("SATIŞ TARİHİ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ADET");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("SATIŞ YAP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("MÜŞTERİ");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("ÇIKIŞ YAP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Satıs No", "Ürün Adı", "ücret", "Satış Tarihi", "Adet", "Müşteri"
            }
        ));
        jScrollPane1.setViewportView(tablo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ucret, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_urunadi, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dc_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_adet, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_musteri, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(79, 79, 79)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_urunadi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ucret, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dc_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_adet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cb_musteri, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              anasayfa frm = new anasayfa();
              frm.setVisible(true);
              setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cb_urunadiPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cb_urunadiPopupMenuWillBecomeInvisible
       String tmp = (String)cb_urunadi.getSelectedItem();
       Connection con=getConnection();
       PreparedStatement st=null;
       ResultSet rs;
      String sql="SELECT * FROM stok WHERE urun_adi=?";
      try
      {
          
           st=con.prepareStatement(sql);
           st.setString(1, tmp);
           rs=st.executeQuery();
           if(rs.next())
           {
               float add=Float.parseFloat(rs.getString("urun_fiyat"));
               txt_ucret.setText(String.valueOf(add));
           }
      }
      catch(Exception e)
      {
          
      }
                  
    }//GEN-LAST:event_cb_urunadiPopupMenuWillBecomeInvisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         if(kontrolEt()){
        try {
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("insert into  satıs(urun_adi,ucret,tarih,adet,musteri_adi) values (?,?,?,?,?)");
            ps.setString(1, cb_urunadi.getSelectedItem().toString());
            ps.setString(2, txt_ucret.getText());
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String tarih=dateFormat.format(dc_tarih.getDate());
            ps.setString(3, tarih);
            ps.setString(4, txt_adet.getText());
            ps.setString(5, cb_musteri.getSelectedItem().toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, " İşlem Gerçekleştirildi");
            urunleri_tabloya_aktar();
            
                txt_ucret.setText("");
                txt_adet.setText("");
                
            } catch (Exception e) {
            e.printStackTrace();
            }
     
          }
         else {
                JOptionPane.showMessageDialog(null, "Boş değer tanımlanamaz");       
            }
      
    
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
   ArrayList<stoklistesi>getUrun(){
     ArrayList<stoklistesi>stoklistesi=new ArrayList<>();
     Connection con=getConnection();
     String sorgu="SELECT * FROM stok";
     Statement st;
        try {
           ResultSet rs;
           st=con.createStatement();
           rs=st.executeQuery(sorgu);
        stoklistesi s;
        while(rs.next()){
            s=new stoklistesi(rs.getInt("stok_id"),rs.getString("urun_adi"),Float.parseFloat(rs.getString("urun_fiyat")),rs.getString("tarih"),rs.getInt("adet"));
            stoklistesi.add(s);
            cb_urunadi.addItem(rs.getString("urun_adi"));
            
             }
         
       } catch (Exception e) {
           e.printStackTrace();
       }
        return stoklistesi;
      }
    ArrayList<musteri_listesi>getMusteri(){
     ArrayList<musteri_listesi>musteri_listesi=new ArrayList<>();
     Connection con=getConnection();
     String sorgu="SELECT * FROM musteri";
     Statement st;
        try {
           ResultSet rs;
           st=con.createStatement();
           rs=st.executeQuery(sorgu);
        musteri_listesi s;
        while(rs.next()){
            s=new musteri_listesi(rs.getInt("musteri_no"),rs.getString("adi_soyadi"),rs.getString("telefon"),rs.getString("eklenis_tarihi"),rs.getString("e_posta"));
            musteri_listesi.add(s);
            cb_musteri.addItem(rs.getString("adi_soyadi"));
            
             }
         
       } catch (Exception e) {
           e.printStackTrace();
       }
        return musteri_listesi;
      }
     ArrayList<satis>getSutunlar(){
     ArrayList<satis>satis=new ArrayList<>();
        Connection con=getConnection();
     String sorgu="SELECT * FROM satıs";
     Statement st;
        try {
           ResultSet rs;
           st=con.createStatement();
           rs=st.executeQuery(sorgu);
          satis s;
        while(rs.next()){
            s=new satis(rs.getInt("satis_id"), rs.getString("urun_adi"), Float.parseFloat(rs.getString("ucret")), rs.getString("tarih"), 
                    rs.getInt("adet"),rs.getString("musteri_adi"));
            satis.add(s);
             }
            
       } catch (Exception e) {
           e.printStackTrace();
       }
        return satis;
}
     void urunleri_tabloya_aktar(){
       try {
           ArrayList<satis>list=getSutunlar();
           DefaultTableModel model=(DefaultTableModel)tablo.getModel();
                       model.setRowCount(0);
           Object [] satir=new Object[6];
                for(int i=0;i<list.size();i++){
                    satir[0]=list.get(i).getSatis_id();
                    satir[1]=list.get(i).getUrun_adi();
                    satir[2]=list.get(i).getUcret();
                    satir[3]=list.get(i).getTarih();
                    satir[4]=list.get(i).getAdet();
                    satir[5]=list.get(i).getMusteri_adi();
                      model.addRow(satir);
                   
                }
       } catch (Exception e) {
           e.printStackTrace();
     
       }
   }
    boolean kontrolEt(){
    if( txt_ucret.getText().equals("") || txt_adet.getText().equals(""))
     
    {
        return false;
    }
    else 
    {
        return true;

    }
    
    }
    
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new satisIslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_musteri;
    private javax.swing.JComboBox cb_urunadi;
    private com.toedter.calendar.JDateChooser dc_tarih;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablo;
    private javax.swing.JTextField txt_adet;
    private javax.swing.JTextField txt_ucret;
    // End of variables declaration//GEN-END:variables
}
