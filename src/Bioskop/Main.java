package Bioskop;
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();        
    }

        String film;
        String studio;
        int jumlahtiket;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_bossbaby = new javax.swing.JButton();
        btn_aladdin = new javax.swing.JButton();
        btn_avengers = new javax.swing.JButton();
        btn_dilan = new javax.swing.JButton();
        btn_filkop = new javax.swing.JButton();
        btn_yowis = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOW SHOWING IN SINEMAX THEATER");

        btn_bossbaby.setIcon(new javax.swing.ImageIcon("F:\\Kuliah\\Praktik Pemrograman 2\\Bismillah\\img\\thebossbaby.jpg")); // NOI18N
        btn_bossbaby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bossbabyActionPerformed(evt);
            }
        });

        btn_aladdin.setIcon(new javax.swing.ImageIcon("F:\\Kuliah\\Praktik Pemrograman 2\\Bismillah\\img\\aladdin.jpg")); // NOI18N
        btn_aladdin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aladdinActionPerformed(evt);
            }
        });

        btn_avengers.setIcon(new javax.swing.ImageIcon("F:\\Kuliah\\Praktik Pemrograman 2\\Bismillah\\img\\avengers.jpg")); // NOI18N
        btn_avengers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_avengersActionPerformed(evt);
            }
        });

        btn_dilan.setIcon(new javax.swing.ImageIcon("F:\\Kuliah\\Praktik Pemrograman 2\\Bismillah\\img\\dilan.jpg")); // NOI18N
        btn_dilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dilanActionPerformed(evt);
            }
        });

        btn_filkop.setIcon(new javax.swing.ImageIcon("F:\\Kuliah\\Praktik Pemrograman 2\\Bismillah\\img\\filosofikopi.jpg")); // NOI18N
        btn_filkop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filkopActionPerformed(evt);
            }
        });

        btn_yowis.setIcon(new javax.swing.ImageIcon("F:\\Kuliah\\Praktik Pemrograman 2\\Bismillah\\img\\yowisben.jpg")); // NOI18N
        btn_yowis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yowisActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Avengers Endgame");

        jLabel3.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Aladdin");

        jLabel4.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("The Boss Baby");

        jLabel5.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dilan 1991");

        jLabel6.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Filosofi Kopi 2");

        jLabel7.setFont(new java.awt.Font("Humnst777 BT", 0, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("-- tekan film untuk memilih --");

        jLabel8.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Yowis Ben 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_avengers)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_dilan)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_aladdin))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_bossbaby, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_filkop)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_yowis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)))
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_aladdin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_avengers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_bossbaby, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_dilan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_filkop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_yowis, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_yowisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yowisActionPerformed
        this.setVisible(false);
         film = "Yowis Ben 2";
         studio = "Studio 6";
         jumlahtiket = 0;
        new Transaksi(film,jumlahtiket).setVisible(true);
    }//GEN-LAST:event_btn_yowisActionPerformed

    private void btn_filkopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filkopActionPerformed
        this.setVisible(false);
         film = "Filosofi Kopi 2";
         studio = "Studio 5";
        new Transaksi(film,jumlahtiket).setVisible(true);
    }//GEN-LAST:event_btn_filkopActionPerformed

    private void btn_dilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dilanActionPerformed
        this.setVisible(false);
         film = "Dilan 1991";
         studio = "Studio 4";
        new Transaksi(film,jumlahtiket).setVisible(true);
    }//GEN-LAST:event_btn_dilanActionPerformed

    private void btn_avengersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_avengersActionPerformed
        this.setVisible(false);
        btn_avengers.setText("Avengers Endgame");
        new studio1().setVisible(true);
        
    }//GEN-LAST:event_btn_avengersActionPerformed
    
    public void jButtonAction(java.awt.event.ActionEvent evt) {
        btn_avengersActionPerformed(evt);
        
    }
    
    private void btn_aladdinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aladdinActionPerformed
        this.setVisible(false);
         film = "Aladdin";
         studio = "Studio 2";
        new Transaksi(film,jumlahtiket).setVisible(true);
    }//GEN-LAST:event_btn_aladdinActionPerformed

    private void btn_bossbabyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bossbabyActionPerformed
        this.setVisible(false);
        film = "The Boss Baby";
        studio = "Studio 3";
        new Transaksi(film,jumlahtiket).setVisible(true);
    }//GEN-LAST:event_btn_bossbabyActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aladdin;
    private javax.swing.JButton btn_avengers;
    private javax.swing.JButton btn_bossbaby;
    private javax.swing.JButton btn_dilan;
    private javax.swing.JButton btn_filkop;
    private javax.swing.JButton btn_yowis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
