/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stoktakip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class müsteriler extends javax.swing.JFrame {

  
    public müsteriler() {
        initComponents();
        getConnection();
        urunleri_tabloya_aktar();
        musteri_no.setEditable(false);
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
        musteri_no = new javax.swing.JTextField();
        ad_soyad = new javax.swing.JTextField();
        telefon = new javax.swing.JTextField();
        e_posta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eklenis_tarihi = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        telefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("MÜŞTERİ NO");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("MÜŞTERİ AD-SOYAD");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("TELEFON");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("E-POSTA");

        eklenis_tarihi.setDateFormatString("yyyy-MM-dd");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("EKLENİŞ TARİHİ");

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Müşteri No", "Adi-Soyadi", "Telefon", "Tarih", "E-Posta"
            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("KAYIT EKLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("KAYIT GÜNCELLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("KAYIT SİL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(musteri_no, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(ad_soyad))
                        .addGap(47, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(e_posta, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(eklenis_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(musteri_no, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(eklenis_tarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ad_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(e_posta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void telefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonActionPerformed

    }//GEN-LAST:event_telefonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       anasayfa frm = new anasayfa();
       frm.setVisible(true);
      setVisible(false);

    }//GEN-LAST:event_jButton4ActionPerformed
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if(kontrolEt()){
        try {
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("insert into  musteri(adi_soyadi,telefon,eklenis_tarihi,e_posta) values (?,?,?,?)");
            ps.setString(1, ad_soyad.getText());
            ps.setString(2, telefon.getText());
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String tarih=dateFormat.format(eklenis_tarihi.getDate());
            ps.setString(3, tarih);
            ps.setString(4, e_posta.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Müşteri Eklendi");
            urunleri_tabloya_aktar();
                ad_soyad.setText("");
                telefon.setText("");
                e_posta.setText("");
            } catch (Exception e) {
            e.printStackTrace();
            }
     
          }
         else {
                JOptionPane.showMessageDialog(null, "Boş değer tanımlanamaz");       
            }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if(!musteri_no.getText().equals("")){
         try{
        
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("update musteri set adi_soyadi=?,telefon=?,eklenis_tarihi=?,e_posta=? where musteri_no=?");
            ps.setString(1,ad_soyad.getText());
            ps.setString(2,telefon.getText());
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String tarih=dateFormat.format(eklenis_tarihi.getDate());
            ps.setString(3,tarih);
            ps.setString(4,e_posta.getText()); 
            ps.setInt(5,Integer.valueOf(musteri_no.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Müşteri Güncellendi");
            urunleri_tabloya_aktar();
                ad_soyad.setText("");
                telefon.setText("");
                e_posta.setText("");
         }
         catch(Exception e)
         {
              JOptionPane.showMessageDialog(null," hata2132"+e.getMessage());
         }
         }
         else
             {
          JOptionPane.showMessageDialog(null, "guncellenecek müştri no Yok"); 
      }
         
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if(!musteri_no.getText().equals("")){
            try {
          Connection con=getConnection();
          PreparedStatement ps=con.prepareStatement("Delete From musteri where musteri_no=?");
          int urunK=Integer.parseInt(musteri_no.getText());
          ps.setInt(1, urunK);
          ps.executeUpdate();
    
         JOptionPane.showMessageDialog(null, "Müşteri Silindi");
         urunleri_tabloya_aktar();
        musteri_no.setText("");
        ad_soyad.setText("");
        telefon.setText("");
            } catch (Exception e) {
               e.printStackTrace();
            }
       
       
      }
      else
      {
          JOptionPane.showMessageDialog(null, "Silinecek Müşteri Kodu Yok"); 
      }
                                  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
        int index=tablo.getSelectedRow();
        try {
            urunGoster(index);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tabloMouseClicked
boolean kontrolEt(){
    if( ad_soyad.getText().equals("") || telefon.getText().equals("")||e_posta.getText().equals("")|| eklenis_tarihi.getDate().equals(""))
     
    {
        return false;
    }
    else 
    {
        return true;

    }
    
    }
     ArrayList<musteri_listesi>getSutunlar(){
     ArrayList<musteri_listesi>urun_listesi=new ArrayList<>();
     Connection con=getConnection();
     String sorgu="SELECT * FROM musteri";
     Statement st;
        try {
           ResultSet rs;
           st=con.createStatement();
           rs=st.executeQuery(sorgu);
     musteri_listesi s;
        while(rs.next()){
            s=new musteri_listesi(rs.getInt("musteri_no"), rs.getString("adi_soyadi"), rs.getString("telefon"), rs.getString("eklenis_tarihi"), rs.getString("e_posta"));
            urun_listesi.add(s);
             }
            
       } catch (Exception e) {
           e.printStackTrace();
       }
        return urun_listesi;
}
      void urunleri_tabloya_aktar(){
       try {
           ArrayList<musteri_listesi>list=getSutunlar();
           DefaultTableModel model=(DefaultTableModel)tablo.getModel();
                       model.setRowCount(0);
           Object [] satir=new Object[5];
                for(int i=0;i<list.size();i++){
                    satir[0]=list.get(i).getMusteri_no();
                    satir[1]=list.get(i).getAdi_soyadi();
                    satir[2]=list.get(i).getTelefon();
                    satir[3]=list.get(i).getEklenis_tarihi();
                    satir[4]=list.get(i).getE_posta();
                      model.addRow(satir);
                   
                }
       } catch (Exception e) {
           e.printStackTrace();
     
       }
   }
       void urunGoster(int index){
       try {
        musteri_no.setText(Integer.toString(getSutunlar().get(index).getMusteri_no()));
        ad_soyad.setText(getSutunlar().get(index).getAdi_soyadi());
        telefon.setText(getSutunlar().get(index).getTelefon());
        Date tarih=new SimpleDateFormat("yyyy-MM-dd").parse((String)getSutunlar().get(index).getEklenis_tarihi());
        eklenis_tarihi.setDate(tarih);
        e_posta.setText(getSutunlar().get(index).getE_posta());
       } catch (Exception e) {
           e.printStackTrace();
       }
   }



    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new müsteriler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_soyad;
    private javax.swing.JTextField e_posta;
    private com.toedter.calendar.JDateChooser eklenis_tarihi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField musteri_no;
    private javax.swing.JTable tablo;
    private javax.swing.JTextField telefon;
    // End of variables declaration//GEN-END:variables
}
