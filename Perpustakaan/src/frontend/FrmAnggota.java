/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class FrmAnggota extends javax.swing.JFrame {

    public FrmAnggota() {
        initComponents();
        tampilkanData();
        kosongkanForm();
    }
    
    public void kosongkanForm() {
        txtIdAnggota.setText("0");
        txtNama.setText("");
        txtAlamat.setText("");
        txtTelepon.setText("");
    }
    
    public void tampilkanData() {
        String[] kolom = {"idanggota", "nama", "alamat", "telepon"};
        ArrayList<Anggota> list = new Anggota().getAll();
        Object rowData[] = new Object[4];
        
        tblAnggota.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Anggota ang : list) {
            rowData[0] = ang.getIdanggota();
            rowData[1] = ang.getNama();
            rowData[2] = ang.getAlamat();
            rowData[3] = ang.getTelepon();
            
            ((DefaultTableModel)tblAnggota.getModel()).addRow(rowData);
        }
    }
    
    public void cari (String keyword) {
        String[] kolom = {"idanggota", "nama", "alamat", "telepon"};
        ArrayList<Anggota> list = new Anggota().search(keyword);
        Object rowData[] = new Object[4];
        
        tblAnggota.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Anggota ang : list) {
            rowData[0] = ang.getIdanggota();
            rowData[1] = ang.getNama();
            rowData[2] = ang.getAlamat();
            rowData[3] = ang.getTelepon();
            
            ((DefaultTableModel)tblAnggota.getModel()).addRow(rowData);
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

        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAnggota = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdAnggota = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTambahBaru = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTelepon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Anggota");

        tblAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnggotaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAnggota);

        jLabel2.setText("Nama Anggota");

        jLabel3.setText("Alamat");

        txtIdAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAnggotaActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        btnHapus.setText("hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel4.setText("Telepon");

        txtTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleponActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNama)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelepon)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambahBaru)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus)
                                .addGap(18, 18, 18)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahBaru)
                    .addComponent(btnHapus)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnggotaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblAnggota.getModel();
        int row = tblAnggota.getSelectedRow();

        txtIdAnggota.setText(model.getValueAt(row, 0).toString());
        txtNama.setText(model.getValueAt(row, 1).toString());
        txtAlamat.setText(model.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tblAnggotaMouseClicked

    private void txtIdAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAnggotaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtIdAnggotaActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        Anggota ang = new Anggota();
        ang.setIdanggota(Integer.parseInt(txtIdAnggota.getText()));
        ang.setNama(txtNama.getText());
        ang.setAlamat(txtAlamat.getText());
        ang.setTelepon(txtTelepon.getText());
        ang.save();
        txtIdAnggota.setText(Integer.toString(ang.getIdanggota()));
        tampilkanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblAnggota.getModel();
        int row = tblAnggota.getSelectedRow();

        Anggota kat = new Anggota().getById(Integer.parseInt(model.getValueAt(row,0).toString()));
        kat.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeleponActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAnggota;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdAnggota;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables
}
