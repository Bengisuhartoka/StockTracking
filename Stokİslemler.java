
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

public class Stokİslemler extends javax.swing.JFrame {

  
    public Stokİslemler() {
        initComponents();
       getConnection();
       getFiyat();
       jTextField1.setEditable(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adet = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        stktarih = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("ÜRÜN ADI");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("STOK TARİHİ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("FİYAT");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ADET");

        adet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adetActionPerformed(evt);
            }
        });

        jButton1.setText("STOK EKLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ÇIKIŞ YAP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stok id", "Ürün Adı", "Fiyat", "Tarih", "Adet"
            }
        ));
        jScrollPane1.setViewportView(tablo);

        stktarih.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(stktarih, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(stktarih, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(adet, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186))
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        anasayfa frm = new anasayfa();
        frm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
  

     
     ArrayList<uruntbl>getFiyat(){
     ArrayList<uruntbl>uruntbl=new ArrayList<>();
        Connection con=getConnection();
     String sorgu="SELECT * FROM urun";
     Statement st;
        try {
           ResultSet rs;
           st=con.createStatement();
           rs=st.executeQuery(sorgu);
     uruntbl s;
        while(rs.next()){
            s=new uruntbl(rs.getInt("urun_kodu"), rs.getString("urun_adi"),Float.parseFloat(rs.getString("urun_fiyat")));
            uruntbl.add(s);
            jComboBox1.addItem(rs.getString("urun_adi"));
            
             }
         
       } catch (Exception e) {
           e.printStackTrace();
       }
        return uruntbl;
      }
     ArrayList<stoklistesi>getSutunlar(){
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
            s=new stoklistesi(rs.getInt("stok_id"), rs.getString("urun_adi"), Float.parseFloat(rs.getString("urun_fiyat")), rs.getString("tarih"), rs.getInt("adet"));
            stoklistesi.add(s);
             }
            
       } catch (Exception e) {
           e.printStackTrace();
       }
        return stoklistesi;
}
      void urunleri_tabloya_aktar(){
       try {
           ArrayList<stoklistesi>list=getSutunlar();
           DefaultTableModel model=(DefaultTableModel)tablo.getModel();
                       model.setRowCount(0);
           Object [] satir=new Object[5];
                for(int i=0;i<list.size();i++){
                    satir[0]=list.get(i).getStok_id();
                    satir[1]=list.get(i).getUrun_adi();
                    satir[2]=list.get(i).getUrun_fiyat();
                    satir[3]=list.get(i).getTarih();
                    satir[4]=list.get(i).getAdet();
                      model.addRow(satir);
                   
                }
       } catch (Exception e) {
           e.printStackTrace();
     
       }
   }
   
    
    private void adetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adetActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
       String tmp = (String)jComboBox1.getSelectedItem();
       Connection con=getConnection();
       PreparedStatement st=null;
       ResultSet rs;
      String sql="SELECT * FROM urun WHERE urun_adi=?";
      try
      {
          
           st=con.prepareStatement(sql);
           st.setString(1, tmp);
           rs=st.executeQuery();
           if(rs.next())
           {
               float add=Float.parseFloat(rs.getString("urun_fiyat"));
               jTextField1.setText(String.valueOf(add));
           }
      }
      catch(Exception e)
      {
          
      }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(kontrolEt()){
        try {
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("insert into  stok(urun_adi,urun_fiyat,tarih,adet) values (?,?,?,?)");
            ps.setString(1, jComboBox1.getSelectedItem().toString());
            ps.setString(2, jTextField1.getText());
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String tarih=dateFormat.format(stktarih.getDate());
            ps.setString(3, tarih);
            ps.setString(4, adet.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Stok Eklendi");
           urunleri_tabloya_aktar();
                jTextField1.setText("");
                adet.setText("");
            } catch (Exception e) {
            e.printStackTrace();
            }
     
          }
         else {
                JOptionPane.showMessageDialog(null, "Boş değer tanımlanamaz");       
            }
      
                 
    }//GEN-LAST:event_jButton1ActionPerformed
boolean kontrolEt(){
    if( jTextField1.getText().equals("") || adet.getText().equals("")|| stktarih.getDate().equals(""))
     
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
                new Stokİslemler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adet;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private com.toedter.calendar.JDateChooser stktarih;
    private javax.swing.JTable tablo;
    // End of variables declaration//GEN-END:variables
}
