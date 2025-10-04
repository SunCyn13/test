
package UI_3_Pay;

import UI_2_Menu.rice;


public class Final extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Final.class.getName());

    
    public Final() {
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        success = new javax.swing.JLabel();
        thank = new javax.swing.JLabel();
        csflavor = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(206, 215, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/true1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(530, 150, 200, 140);

        success.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        success.setText("สั่งซื้อสำเร็จแล้ว!");
        jPanel1.add(success);
        success.setBounds(460, 298, 353, 70);

        thank.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        thank.setText("ขอบคุณที่ใช้บริการ ");
        jPanel1.add(thank);
        thank.setBounds(530, 375, 215, 29);

        csflavor.setBackground(new java.awt.Color(206, 215, 209));
        csflavor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        csflavor.setForeground(new java.awt.Color(0, 102, 100));
        csflavor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        csflavor.setText("CS Flavor");
        csflavor.setOpaque(true);
        jPanel1.add(csflavor);
        csflavor.setBounds(575, 420, 112, 30);

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Back (4).png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(50, 30, 18, 30);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        rice ricePage = new rice();
        ricePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel csflavor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel success;
    private javax.swing.JLabel thank;
    // End of variables declaration//GEN-END:variables
}
