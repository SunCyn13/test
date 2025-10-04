
package UI_3_Pay;

import UI_2_Menu.rice;


public class Bill extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Bill.class.getName());

    
    public Bill() {
        initComponents();
    }

    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bill = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        list = new javax.swing.JList<>();
        payment = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(206, 215, 209));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        bill.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        bill.setText("Bill");
        jPanel1.add(bill);
        bill.setBounds(560, 50, 77, 73);

        total.setBackground(new java.awt.Color(0, 0, 0));
        total.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        total.setText("รวม      บาท");
        jPanel1.add(total);
        total.setBounds(900, 520, 180, 40);

        list.setBorder(null);
        list.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "ก๋วยเตี๋ยว บะหมี่ หมู พิเศษ", "ข้าวไข่เจียว หมู พิเศษ", "ข้าวเหนียวมะม่วง หวานปกติ", "น้ำโคล่า แก้วใหญ่" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list.setToolTipText("");
        jPanel1.add(list);
        list.setBounds(270, 170, 570, 270);

        payment.setBackground(new java.awt.Color(217, 217, 217));
        payment.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        payment.setText("ชำระเงิน");
        payment.setToolTipText("");
        payment.setBorder(null);
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        jPanel1.add(payment);
        payment.setBounds(400, 600, 473, 72);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        Final FinalPage = new Final();
        FinalPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_paymentActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        rice ricePage = new rice();
        ricePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel bill;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<String> list;
    private javax.swing.JButton payment;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
