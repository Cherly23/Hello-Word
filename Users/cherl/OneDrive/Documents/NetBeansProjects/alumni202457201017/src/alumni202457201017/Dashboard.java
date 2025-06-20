/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package alumni202457201017;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author cherly
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JPanel();
        panelSidebar = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnJurusan = new javax.swing.JButton();
        btnGuru = new javax.swing.JButton();
        btnKelas = new javax.swing.JButton();
        btnSiswa = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelUtama.setBackground(new java.awt.Color(0, 0, 183));
        panelUtama.setForeground(new java.awt.Color(255, 255, 255));

        panelSidebar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        panelSidebar.setForeground(new java.awt.Color(255, 255, 255));
        panelSidebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201017/Gambar/icons8-school-50.png"))); // NOI18N
        panelSidebar.setText("Aloomni");

        btnDashboard.setBackground(new java.awt.Color(0, 0, 183));
        btnDashboard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201017/Gambar/icons8-dashboard-20.png"))); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashboard.setIconTextGap(10);
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnJurusan.setBackground(new java.awt.Color(0, 0, 183));
        btnJurusan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnJurusan.setForeground(new java.awt.Color(255, 255, 255));
        btnJurusan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201017/Gambar/icons8-school-20 (1).png"))); // NOI18N
        btnJurusan.setText("Jurusan");
        btnJurusan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnJurusan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnJurusan.setIconTextGap(10);
        btnJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJurusanbtnDashboardActionPerformed(evt);
            }
        });

        btnGuru.setBackground(new java.awt.Color(0, 0, 183));
        btnGuru.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuru.setForeground(new java.awt.Color(255, 255, 255));
        btnGuru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201017/Gambar/icons8-teacher-20.png"))); // NOI18N
        btnGuru.setText("Guru");
        btnGuru.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnGuru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGuru.setIconTextGap(10);
        btnGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGurubtnDashboardActionPerformed(evt);
            }
        });

        btnKelas.setBackground(new java.awt.Color(0, 0, 183));
        btnKelas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnKelas.setForeground(new java.awt.Color(255, 255, 255));
        btnKelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201017/Gambar/icons8-class-20.png"))); // NOI18N
        btnKelas.setText("Kelas");
        btnKelas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnKelas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKelas.setIconTextGap(10);
        btnKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelasbtnDashboardActionPerformed(evt);
            }
        });

        btnSiswa.setBackground(new java.awt.Color(0, 0, 183));
        btnSiswa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSiswa.setForeground(new java.awt.Color(255, 255, 255));
        btnSiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201017/Gambar/icons8-student-20.png"))); // NOI18N
        btnSiswa.setText("Siswa");
        btnSiswa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnSiswa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSiswa.setIconTextGap(10);
        btnSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiswabtnDashboardActionPerformed(evt);
            }
        });

        btnAbout.setBackground(new java.awt.Color(0, 0, 183));
        btnAbout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(255, 255, 255));
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201017/Gambar/icons8-about-20.png"))); // NOI18N
        btnAbout.setText("About");
        btnAbout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnAbout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAbout.setIconTextGap(10);
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutbtnDashboardActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(0, 0, 183));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201017/Gambar/icons8-logout-20.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogout.setIconTextGap(10);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutbtnDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(panelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAbout))
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogout))
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSiswa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKelas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnJurusan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnDashboard)
                .addGap(10, 10, 10)
                .addComponent(btnJurusan)
                .addGap(8, 8, 8)
                .addComponent(btnGuru)
                .addGap(10, 10, 10)
                .addComponent(btnKelas)
                .addGap(10, 10, 10)
                .addComponent(btnSiswa)
                .addGap(10, 10, 10)
                .addComponent(btnAbout)
                .addGap(10, 10, 10)
                .addComponent(btnLogout)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.add(new Dasboar());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnJurusanbtnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJurusanbtnDashboardActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.add(new Jurusan());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btnJurusanbtnDashboardActionPerformed

    private void btnGurubtnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGurubtnDashboardActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.add(new Guru());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btnGurubtnDashboardActionPerformed

    private void btnKelasbtnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelasbtnDashboardActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.add(new Kelas());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btnKelasbtnDashboardActionPerformed

    private void btnSiswabtnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiswabtnDashboardActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.add(new Siswa());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btnSiswabtnDashboardActionPerformed

    private void btnAboutbtnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutbtnDashboardActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.add(new About());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btnAboutbtnDashboardActionPerformed

    private void btnLogoutbtnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutbtnDashboardActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.add(new Logout());
        jPanel2.repaint();
        jPanel2.revalidate();
        int konfirmasi = JOptionPane.showConfirmDialog(
                this,"Apakah anda yakin ingin keluar?", 
                "Konfirmasi", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        if (konfirmasi == JOptionPane.YES_NO_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutbtnDashboardActionPerformed

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
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
        }



        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnGuru;
    private javax.swing.JButton btnJurusan;
    private javax.swing.JButton btnKelas;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel panelSidebar;
    private javax.swing.JPanel panelUtama;
    // End of variables declaration//GEN-END:variables
}
