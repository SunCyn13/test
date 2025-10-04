
package UI_1_Admin;

import UI_1_User.login;


public class Admin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Admin.class.getName());

    
    public Admin() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnORDER = new javax.swing.JButton();
        BtnMENU = new javax.swing.JButton();
        txtPRICE = new javax.swing.JTextField();
        txtMENU = new javax.swing.JTextField();
        BtnAdd = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("MENU");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 120, 70, 25);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MENU", "PRICE"
            }
        ));
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(670, 30, 480, 600);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("PRICE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 220, 70, 25);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(180, 720));
        jPanel2.setLayout(null);

        BtnORDER.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnORDER.setText("ORDER");
        jPanel2.add(BtnORDER);
        BtnORDER.setBounds(45, 299, 143, 39);

        BtnMENU.setBackground(new java.awt.Color(217, 217, 217));
        BtnMENU.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnMENU.setText("MENU");
        jPanel2.add(BtnMENU);
        BtnMENU.setBounds(46, 190, 143, 39);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 240, 720);

        txtPRICE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtPRICE);
        txtPRICE.setBounds(390, 220, 100, 26);

        txtMENU.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtMENU);
        txtMENU.setBounds(390, 120, 210, 26);

        BtnAdd.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        BtnAdd.setText("ADD");
        jPanel1.add(BtnAdd);
        BtnAdd.setBounds(330, 390, 100, 34);

        BtnDelete.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        BtnDelete.setText("DELETE");
        jPanel1.add(BtnDelete);
        BtnDelete.setBounds(490, 390, 100, 34);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(85, 720));
        jPanel3.setLayout(null);

        logout.setBackground(new java.awt.Color(204, 204, 204));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/logout 1.png"))); // NOI18N
        logout.setBorder(null);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel3.add(logout);
        logout.setBounds(17, 20, 40, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(1195, 0, 85, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        login loginPage = new login();
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnMENU;
    private javax.swing.JButton BtnORDER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField txtMENU;
    private javax.swing.JTextField txtPRICE;
    // End of variables declaration//GEN-END:variables
}
