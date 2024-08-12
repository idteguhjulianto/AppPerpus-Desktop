package com.perpus.form;


import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.perpus.config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class MasterDashboard extends javax.swing.JPanel {
    
    private Connection conn;
    
    public MasterDashboard() {
        initComponents();
        conn = Koneksi.getConnection();
        loadData();
        setTableModelPeminjaman();
        getDataPeminjaman((DefaultTableModel) tblData.getModel());
        setLayoutForm();
        setColumnWidth();
    }

    private void setColumnWidth() {
        TableColumnModel columnModel = tblData.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(0).setMaxWidth(40);
        columnModel.getColumn(0).setMinWidth(40);
    }
    
    private void setLayoutForm(){
        cardAnggota.putClientProperty( FlatClientProperties.STYLE, "arc: 20" );
        cardBuku.putClientProperty( FlatClientProperties.STYLE, "arc: 20" );
        cardPeminjaman.putClientProperty( FlatClientProperties.STYLE, "arc: 20" );
        cardPengembalian.putClientProperty( FlatClientProperties.STYLE, "arc: 20" );
        tblData.setShowGrid(false);
        
        iconDashboard.setIcon(new FlatSVGIcon("com/perpus/icon/dashboard.svg", 1f));
        iconAnggota.setIcon(new FlatSVGIcon("com/perpus/icon/anggota_white.svg", 3f));
        iconBuku.setIcon(new FlatSVGIcon("com/perpus/icon/book_white.svg", 3f));
        iconPeminjaman.setIcon(new FlatSVGIcon("com/perpus/icon/peminjaman_white.svg", 3f));
        iconPengembalian.setIcon(new FlatSVGIcon("com/perpus/icon/pengembalian_white.svg", 3f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iconDashboard = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        cardAnggota = new javax.swing.JPanel();
        iconAnggota = new javax.swing.JLabel();
        lbJumlahAnggota = new javax.swing.JLabel();
        lb_anggota = new javax.swing.JLabel();
        cardBuku = new javax.swing.JPanel();
        lbJumlahBuku = new javax.swing.JLabel();
        lb_anggota1 = new javax.swing.JLabel();
        iconBuku = new javax.swing.JLabel();
        cardPeminjaman = new javax.swing.JPanel();
        lbJumlahPeminjaman = new javax.swing.JLabel();
        lb_anggota5 = new javax.swing.JLabel();
        iconPeminjaman = new javax.swing.JLabel();
        cardPengembalian = new javax.swing.JPanel();
        lbJumlahPengembalian = new javax.swing.JLabel();
        lb_anggota3 = new javax.swing.JLabel();
        iconPengembalian = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1133, 690));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Riwayat Peminjaman Buku");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Master Data > Dashboard");

        tblData.setGridColor(new java.awt.Color(255, 255, 255));
        tblData.setRowHeight(40);
        tblData.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tblData);

        cardAnggota.setBackground(new java.awt.Color(0, 153, 153));

        iconAnggota.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        iconAnggota.setForeground(new java.awt.Color(0, 102, 153));

        lbJumlahAnggota.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lbJumlahAnggota.setForeground(new java.awt.Color(255, 255, 255));
        lbJumlahAnggota.setText("999");

        lb_anggota.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_anggota.setForeground(new java.awt.Color(204, 204, 204));
        lb_anggota.setText("ANGGOTA");

        javax.swing.GroupLayout cardAnggotaLayout = new javax.swing.GroupLayout(cardAnggota);
        cardAnggota.setLayout(cardAnggotaLayout);
        cardAnggotaLayout.setHorizontalGroup(
            cardAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggotaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(cardAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbJumlahAnggota)
                    .addComponent(lb_anggota))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(iconAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        cardAnggotaLayout.setVerticalGroup(
            cardAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardAnggotaLayout.createSequentialGroup()
                        .addComponent(lb_anggota)
                        .addGap(20, 20, 20)
                        .addComponent(lbJumlahAnggota)))
                .addGap(20, 20, 20))
        );

        cardBuku.setBackground(new java.awt.Color(0, 153, 153));

        lbJumlahBuku.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lbJumlahBuku.setForeground(new java.awt.Color(255, 255, 255));
        lbJumlahBuku.setText("999");

        lb_anggota1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_anggota1.setForeground(new java.awt.Color(204, 204, 204));
        lb_anggota1.setText("BUKU");

        iconBuku.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        iconBuku.setForeground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout cardBukuLayout = new javax.swing.GroupLayout(cardBuku);
        cardBuku.setLayout(cardBukuLayout);
        cardBukuLayout.setHorizontalGroup(
            cardBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardBukuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(cardBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbJumlahBuku)
                    .addComponent(lb_anggota1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(iconBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        cardBukuLayout.setVerticalGroup(
            cardBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardBukuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardBukuLayout.createSequentialGroup()
                        .addComponent(lb_anggota1)
                        .addGap(20, 20, 20)
                        .addComponent(lbJumlahBuku)))
                .addGap(20, 20, 20))
        );

        cardPeminjaman.setBackground(new java.awt.Color(0, 153, 153));

        lbJumlahPeminjaman.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lbJumlahPeminjaman.setForeground(new java.awt.Color(255, 255, 255));
        lbJumlahPeminjaman.setText("999");

        lb_anggota5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_anggota5.setForeground(new java.awt.Color(204, 204, 204));
        lb_anggota5.setText("PEMINJAMAN");

        iconPeminjaman.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        iconPeminjaman.setForeground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout cardPeminjamanLayout = new javax.swing.GroupLayout(cardPeminjaman);
        cardPeminjaman.setLayout(cardPeminjamanLayout);
        cardPeminjamanLayout.setHorizontalGroup(
            cardPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPeminjamanLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(cardPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbJumlahPeminjaman)
                    .addComponent(lb_anggota5))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(iconPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        cardPeminjamanLayout.setVerticalGroup(
            cardPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPeminjamanLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardPeminjamanLayout.createSequentialGroup()
                        .addComponent(lb_anggota5)
                        .addGap(20, 20, 20)
                        .addComponent(lbJumlahPeminjaman)))
                .addGap(20, 20, 20))
        );

        cardPengembalian.setBackground(new java.awt.Color(0, 153, 153));

        lbJumlahPengembalian.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lbJumlahPengembalian.setForeground(new java.awt.Color(255, 255, 255));
        lbJumlahPengembalian.setText("999");

        lb_anggota3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lb_anggota3.setForeground(new java.awt.Color(204, 204, 204));
        lb_anggota3.setText("PENGEMBALIAN");

        iconPengembalian.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        iconPengembalian.setForeground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout cardPengembalianLayout = new javax.swing.GroupLayout(cardPengembalian);
        cardPengembalian.setLayout(cardPengembalianLayout);
        cardPengembalianLayout.setHorizontalGroup(
            cardPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPengembalianLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(cardPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbJumlahPengembalian)
                    .addComponent(lb_anggota3))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(iconPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        cardPengembalianLayout.setVerticalGroup(
            cardPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPengembalianLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardPengembalianLayout.createSequentialGroup()
                        .addComponent(lb_anggota3)
                        .addGap(20, 20, 20)
                        .addComponent(lbJumlahPengembalian)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cardAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(48, 48, 48)
                                .addComponent(cardBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(48, 48, 48)
                                .addComponent(cardPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(50, 50, 50)
                                .addComponent(cardPengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cardAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cardPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addGap(10, 10, 10))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardAnggota;
    private javax.swing.JPanel cardBuku;
    private javax.swing.JPanel cardPeminjaman;
    private javax.swing.JPanel cardPengembalian;
    private javax.swing.JLabel iconAnggota;
    private javax.swing.JLabel iconBuku;
    private javax.swing.JLabel iconDashboard;
    private javax.swing.JLabel iconPeminjaman;
    private javax.swing.JLabel iconPengembalian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbJumlahAnggota;
    private javax.swing.JLabel lbJumlahBuku;
    private javax.swing.JLabel lbJumlahPeminjaman;
    private javax.swing.JLabel lbJumlahPengembalian;
    private javax.swing.JLabel lb_anggota;
    private javax.swing.JLabel lb_anggota1;
    private javax.swing.JLabel lb_anggota3;
    private javax.swing.JLabel lb_anggota5;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables

    private int jumlahAnggota(){
        int totalAnggota = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total FROM anggota";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                totalAnggota = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalAnggota;
    }
    
    private int jumlahBuku(){
        int totalBuku = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total FROM buku";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                totalBuku = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalBuku;
    }
    
    private int jumlahPeminjaman(){
        int totalPeminjaman = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total FROM detail_peminjaman";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                totalPeminjaman = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalPeminjaman;
    }
    
    private int jumlahPengembalian(){
        int totalPengembalian = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total FROM detail_peminjaman WHERE Status_Peminjaman ='Sudah dikembalikan'";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                totalPengembalian = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalPengembalian;
    }
    
    private void setTableModelPeminjaman(){
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.addColumn("No");
        model.addColumn("ID Peminjaman");
        model.addColumn("Tanggal Pinjam");
        model.addColumn("Tanggal Kembali");
        model.addColumn("Nama Anggota");
        model.addColumn("ID Buku");
        model.addColumn("Judul");
        model.addColumn("Jumlah Pinjam");
        model.addColumn("Status Peminjaman");
    }
    
    private void getDataPeminjaman(DefaultTableModel model){
        model.setRowCount(0);
        
        try {
            String sql = "SELECT pmd.ID_Peminjaman,pmj.Tanggal_Peminjaman, "
                    + "pmj.Tanggal_Pengembalian, agt.Nama_Anggota, bk.ID_Buku, "
                    + "bk.Judul_Buku, pmd.Jumlah_Pinjam, pmd.Status_Peminjaman\n" +
                        "FROM detail_peminjaman pmd\n" +
                        "INNER JOIN peminjaman pmj ON pmj.ID_Peminjaman = pmd.ID_Peminjaman\n" +
                        "INNER JOIN buku bk ON bk.ID_Buku = pmd.ID_Buku\n" +
                        "INNER JOIN anggota agt ON agt.ID_Anggota = pmj.ID_Anggota "
                    + "ORDER BY pmd.ID_Peminjaman DESC";
            
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            int no = 1;
            
            while(rs.next()){
                String idPeminjaman         = rs.getString("ID_Peminjaman");
                String tanggalPeminjaman    = rs.getString("Tanggal_Peminjaman");
                String tanggalPengembalian  = rs.getString("Tanggal_Pengembalian");
                String namaAnggota          = rs.getString("Nama_Anggota");
                String idBuku               = rs.getString("ID_Buku");
                String judulBuku            = rs.getString("Judul_Buku");
                String jumlahPinjam         = rs.getString("Jumlah_Pinjam");
                String statusPeminjaman     = rs.getString("Status_Peminjaman");
                
                Object[] rowData = {"   " + no++, idPeminjaman, tanggalPeminjaman, tanggalPengembalian, namaAnggota, idBuku, judulBuku, jumlahPinjam, statusPeminjaman};
                model.addRow(rowData);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void loadData() {
        lbJumlahAnggota.setText(String.valueOf(jumlahAnggota()));
        lbJumlahBuku.setText(String.valueOf(jumlahBuku()));
        lbJumlahPeminjaman.setText(String.valueOf(jumlahPeminjaman()));
        lbJumlahPengembalian.setText(String.valueOf(jumlahPengembalian()));
    }
}
