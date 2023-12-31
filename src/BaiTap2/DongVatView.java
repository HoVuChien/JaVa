/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BaiTap2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class DongVatView extends javax.swing.JFrame {

    /**
     * Creates new form SinhVienView
     */QLDongVat ql= new QLDongVat();
        DefaultTableModel defaultTableModel;
         ArrayList<DongVat> loai = new ArrayList<>();
    public DongVatView() {
        initComponents();
        loai.add(new  DongVat("1", "Dat", "Cho" ,"Cai"));
        loai.add(new DongVat("2", "Ngu", "MEO" ,"Duc"));
        loai.add(new DongVat("3", "Vl", "Cho" ,"Cai"));
        for (DongVat dongVat : loai) {
            cboLoai.addItem(dongVat.getLoai());
        }
        
       ArrayList<DongVat> list = ql.getlist();
        loadDaTa(list);
        
    }
    
 void loadDaTa(ArrayList<DongVat>list){
    defaultTableModel = (DefaultTableModel) tblDongVat.getModel();
    defaultTableModel.setRowCount(0);
     for (DongVat dongVat : list) {
         defaultTableModel.addRow(new Object[]{
         dongVat.getMa(),dongVat.getTen(),dongVat.getLoai(),dongVat.getGiongloai()
         });
     }           
    String ma = (String) tblDongVat.getValueAt(2, 0);
        txtMa.setText(ma);
        String ten = (String) tblDongVat.getValueAt(2, 1);
        txtTen.setText(ten);
        String loai = (String) tblDongVat.getValueAt(2, 2);
        cboLoai.setSelectedItem(loai);
        String giong = (String) tblDongVat.getValueAt(2, 3);
        if (giong.equals("Duc")) {
            rdDuc.setSelected(true);
        }else{
        rdCai.setSelected(true);
        }
 
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDongVat = new javax.swing.JTable();
        cboLoai = new javax.swing.JComboBox<>();
        rdDuc = new javax.swing.JCheckBox();
        rdCai = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btoAdd = new javax.swing.JButton();
        btoXoa = new javax.swing.JButton();
        btoXua = new javax.swing.JButton();
        btoTimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDongVat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MA", "Ho Ten", "Loai", "GioiTinh"
            }
        ));
        tblDongVat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDongVatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDongVat);

        buttonGroup1.add(rdDuc);
        rdDuc.setText("Duc");

        buttonGroup1.add(rdCai);
        rdCai.setText("Cai");

        jLabel1.setText("MA");

        jLabel2.setText("Ten");

        jLabel3.setText("Loai");

        jLabel4.setText("Giong Loai");

        btoAdd.setText("ADD");
        btoAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btoAddMouseClicked(evt);
            }
        });

        btoXoa.setText("XOA");
        btoXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btoXoaMouseClicked(evt);
            }
        });

        btoXua.setText("XUA");
        btoXua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btoXuaMouseClicked(evt);
            }
        });

        btoTimKiem.setText("Tìm Kiếm");
        btoTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btoTimKiemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdDuc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdCai, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btoXoa)
                            .addComponent(btoAdd)
                            .addComponent(btoXua)
                            .addComponent(btoTimKiem))
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(btoAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btoXoa)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdDuc)
                                    .addComponent(rdCai)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btoXua))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btoTimKiem)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDongVatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDongVatMouseClicked
        // TODO add your handling code here:
        int row = tblDongVat.getSelectedRow();
        String ma = (String) tblDongVat.getValueAt(row, 0);
        txtMa.setText(ma);
        String ten = (String) tblDongVat.getValueAt(row, 1);
        txtTen.setText(ten);
        String loai = (String) tblDongVat.getValueAt(row, 2);
        cboLoai.setSelectedItem(loai);
        String giong = (String) tblDongVat.getValueAt(row, 3);
        if (giong.equals("Duc")) {
            rdDuc.setSelected(true);
        }else{
        rdCai.setSelected(true);
        
        }
    }//GEN-LAST:event_tblDongVatMouseClicked

    private void btoAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btoAddMouseClicked
        // TODO add your handling code here:
        String ma = 
                txtMa.getText();
        String ten= txtTen.getText();
        String loai = (String) cboLoai.getSelectedItem();
        String giong ="";
        if (rdDuc.isSelected()) {
            giong="Đực";
        }else{
        giong="Cái";
        }
        DongVat dongvat =new DongVat(ma,ten,loai,giong);
        Boolean Add = ql.addNew(dongvat);
        if (Add) {
            JOptionPane.showMessageDialog(this, "Them thanh cong");
            loadDaTa(ql.getlist());
        }
    }//GEN-LAST:event_btoAddMouseClicked

    private void btoXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btoXoaMouseClicked
        // TODO add your handling code here:
        //lay vi tri can xoa
        int i =  tblDongVat.getSelectedRow();
        //goi sang ql de xao
        Boolean check = ql.delete(i);
        if (check) {
            JOptionPane.showMessageDialog(this, "Xoa thanh Cong");
            loadDaTa(ql.getlist());
        }
        
    }//GEN-LAST:event_btoXoaMouseClicked

    private void btoXuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btoXuaMouseClicked
        // TODO add your handling code here:
         int row = tblDongVat.getSelectedRow();
           String ma = txtMa.getText();
        String ten= txtTen.getText();
        String loai = (String) cboLoai.getSelectedItem();
        String giong ="";
        if (rdDuc.isSelected()) {
            giong="Đực";
        }else{
        giong="Cái";
        }
        DongVat dongvat =new DongVat(ma,ten,loai,giong);
        Boolean UPDATE  = ql.update(row, dongvat);
        if (UPDATE) {
            JOptionPane.showMessageDialog(this, "UPDATE  thanh cong");
            loadDaTa(ql.getlist());
        }
    }//GEN-LAST:event_btoXuaMouseClicked

    private void btoTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btoTimKiemMouseClicked
        // TODO add your handling code here:
        String tencantim = txtTen.getText();
        ArrayList<DongVat> ketqua = ql.search(tencantim);
        loadDaTa(ketqua);
    }//GEN-LAST:event_btoTimKiemMouseClicked

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
            java.util.logging.Logger.getLogger(DongVatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DongVatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DongVatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DongVatView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DongVatView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoAdd;
    private javax.swing.JButton btoTimKiem;
    private javax.swing.JButton btoXoa;
    private javax.swing.JButton btoXua;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox rdCai;
    private javax.swing.JCheckBox rdDuc;
    private javax.swing.JTable tblDongVat;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
