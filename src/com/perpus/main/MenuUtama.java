package com.perpus.main;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.perpus.form.FormProfile;
import com.perpus.form.LaporanAnggota;
import com.perpus.form.LaporanBuku;
import com.perpus.form.LaporanPeminjaman;
import com.perpus.form.MasterAnggota;
import com.perpus.form.MasterBuku;
import com.perpus.form.MasterDashboard;
import com.perpus.form.MasterKategori;
import com.perpus.form.MasterPenerbit;
import com.perpus.form.MasterPetugas;
import com.perpus.form.TransaksiPeminjaman;
import com.perpus.form.TransaksiPengembalian;
import com.perpus.menu.EventMenuSelected;
import com.perpus.menu.Menu;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MenuUtama extends javax.swing.JFrame {

    private String userID;
    private String levelUser;
    private Timer timer;
    
    public MenuUtama(String userID, String namaUser, String levelUser) {
        initComponents();
        this.userID = userID;
        this.levelUser = levelUser;
        lbProfileName.setText(namaUser);
        
        menu.getLevelUser(levelUser);
        menu.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected(int index) {
                if(levelUser != null && levelUser.equals("Admin")){
                    if (index == 0){
                        setForm(new MasterDashboard());
                    } else if (index == 2){
                        setForm(new MasterAnggota());
                    } else if (index == 3){
                        setForm(new MasterKategori());
                    } else if (index == 4){
                        setForm(new MasterPenerbit());
                    } else if (index == 5){
                        setForm(new MasterBuku());
                    } else if (index == 6){
                        setForm(new MasterPetugas());
                    } else if (index == 9){
                        setForm(new TransaksiPeminjaman(userID));
                    } else if (index == 10){
                        setForm(new TransaksiPengembalian(userID));
                    } else if (index == 13){
                        setForm(new LaporanPeminjaman());
                    } else if (index == 14){
                        setForm(new LaporanAnggota());
                    } else if (index == 15){
                        setForm(new LaporanBuku());
                    }  
                } else {
                    if(index == 0){
                        setForm(new MasterDashboard());
                    } else if (index == 2){
                        setForm(new TransaksiPeminjaman(userID));
                    } else if (index == 3){
                        setForm(new TransaksiPengembalian(userID));
                    } else if (index == 6){
                        setForm(new LaporanPeminjaman());
                    } else if (index == 7){
                        setForm(new LaporanAnggota());
                    } else if (index == 8){
                        setForm(new LaporanBuku());
                    }
                }
            }
        });
        
        setForm(new MasterDashboard());
        setLayoutForm();
        setDate();
    }
    
    public String getUserID() {
        return userID;
    }
    
    public String getLevelUser() {
        return levelUser;
    }

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private void setLayoutForm(){
        setIconImage(new ImageIcon(getClass().getResource("/com/perpus/icon/LogoAppPerpus.png")).getImage());
        btnProfile.setIcon(new FlatSVGIcon("com/perpus/icon/petugas_white.svg", 1f));
    }
    
    public JPanel getMainPanel(){
        return mainPanel;
    }
    
    private void setDate(){
        timer = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar calender = Calendar.getInstance();
                Date now = new Date();
                SimpleDateFormat formatHari = new SimpleDateFormat("EEEE", new Locale("in","ID"));
                SimpleDateFormat formatTanggal  = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String hari = formatHari.format(calender.getTime());
                String waktuTanggal = formatTanggal.format(now);
                lbDate.setText(hari+", "+waktuTanggal);
            }
        });
        
        timer.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        menu = new com.perpus.menu.Menu();
        header = new javax.swing.JPanel();
        lbDate = new javax.swing.JLabel();
        lbProfileName = new javax.swing.JLabel();
        btnProfile = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(255, 255, 255));

        lbDate.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        lbDate.setForeground(new java.awt.Color(102, 102, 102));
        lbDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDate.setText("Date");

        lbProfileName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbProfileName.setForeground(new java.awt.Color(102, 102, 102));
        lbProfileName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbProfileName.setText("Profile Name");

        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(772, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProfileName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(lbProfileName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDate))
                    .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        FormProfile menu = new FormProfile(this, true, this);
        Point p = btnProfile.getLocationOnScreen();
        int x = p.x + btnProfile.getWidth() - menu.getWidth();
        int y = p.y + btnProfile.getHeight();
        menu.setLocation(x,y);
        menu.setVisible(true);
    }//GEN-LAST:event_btnProfileActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String userID = "ID";
                String levelUser = "Level";
                String namaUser = "Nama";
                new MenuUtama(userID,namaUser,levelUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProfile;
    private javax.swing.JPanel header;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbProfileName;
    private javax.swing.JPanel main;
    private javax.swing.JPanel mainPanel;
    private com.perpus.menu.Menu menu;
    // End of variables declaration//GEN-END:variables
}
