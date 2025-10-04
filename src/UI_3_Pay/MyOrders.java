
package UI_3_Pay;

import UI_2_Menu.rice;



public class MyOrders extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MyOrders.class.getName());

   
    
    public MyOrders() {
        initComponents();
       
    }

    
   
    
    
    
 
    
   
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        myorders = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablemenu = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(206, 215, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        myorders.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        myorders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myorders.setText("My Orders");
        myorders.setMaximumSize(new java.awt.Dimension(232, 80));
        myorders.setPreferredSize(new java.awt.Dimension(232, 60));
        jPanel1.add(myorders);
        myorders.setBounds(500, 50, 250, 50);

        total.setBackground(new java.awt.Color(0, 0, 0));
        total.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        total.setText("รวม      บาท");
        jPanel1.add(total);
        total.setBounds(970, 500, 180, 40);

        next.setBackground(new java.awt.Color(217, 217, 217));
        next.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        next.setText("ดำเนินการต่อ");
        next.setToolTipText("");
        next.setBorder(null);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next);
        next.setBounds(400, 600, 473, 72);

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Back (4).png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(50, 30, 18, 30);

        tablemenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MENU", "PRICE"
            }
        ));
        jScrollPane1.setViewportView(tablemenu);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(290, 140, 640, 402);

        jButton1.setBackground(new java.awt.Color(206, 215, 209));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/delete.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton1);
        jButton1.setBounds(1030, 140, 46, 46);

        jButton2.setBackground(new java.awt.Color(206, 215, 209));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/add.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(960, 140, 46, 46);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        Bill billpage = new Bill();
        billpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        rice ricePage = new rice();
        ricePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel myorders;
    private javax.swing.JButton next;
    private javax.swing.JTable tablemenu;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
