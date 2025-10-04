
package UI_2_Menu;

import java.awt.Image;

import javax.swing.ImageIcon;

import UI_3_Pay.MyOrders;


public class Designdrinks extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Designdrinks.class.getName());
    private String menuName;
    
    public Designdrinks(String menuName) {
        initComponents();
        this.menuName = menuName;
        showMenuImage(); //show label ที่เตรียมไว้
    }

    private void showMenuImage() {
        try {
            String imagePath = "src/drink/" + menuName + ".png";
            ImageIcon icon = new ImageIcon(imagePath);
            Image img = icon.getImage().getScaledInstance(imagedrink.getWidth(), imagedrink.getHeight(), Image.SCALE_SMOOTH);
            imagedrink.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Design = new javax.swing.JLabel();
        select = new javax.swing.JLabel();
        small = new javax.swing.JRadioButton();
        medium = new javax.swing.JRadioButton();
        big = new javax.swing.JRadioButton();
        addcart = new javax.swing.JButton();
        back = new javax.swing.JButton();
        imagedrink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(206, 215, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        Design.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Design.setText("ปรับแต่ง");
        jPanel1.add(Design);
        Design.setBounds(550, 50, 140, 40);

        select.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        select.setText("เลือกขนาด");
        jPanel1.add(select);
        select.setBounds(330, 120, 110, 29);

        small.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup1.add(small);
        small.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        small.setText("แก้วเล็ก");
        small.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallActionPerformed(evt);
            }
        });
        jPanel1.add(small);
        small.setBounds(350, 170, 90, 30);

        medium.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup1.add(medium);
        medium.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        medium.setText("ธรรมดา");
        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumActionPerformed(evt);
            }
        });
        jPanel1.add(medium);
        medium.setBounds(500, 170, 90, 30);

        big.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup1.add(big);
        big.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        big.setText("แก้วใหญ่");
        big.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigActionPerformed(evt);
            }
        });
        jPanel1.add(big);
        big.setBounds(650, 170, 110, 30);

        addcart.setBackground(new java.awt.Color(217, 217, 217));
        addcart.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        addcart.setText("ใส่ตะกร้า");
        addcart.setBorder(null);
        addcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcartActionPerformed(evt);
            }
        });
        jPanel1.add(addcart);
        addcart.setBounds(500, 550, 220, 40);

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Back (4).png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(50, 30, 18, 30);
        jPanel1.add(imagedrink);
        imagedrink.setBounds(80, 130, 150, 150);

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

    private void smallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smallActionPerformed

    private void bigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bigActionPerformed

    private void mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediumActionPerformed

    private void addcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcartActionPerformed
        MyOrders myordersPage = new MyOrders();
        myordersPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addcartActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        drinks drinkspage = new drinks();
        drinkspage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Design;
    private javax.swing.JButton addcart;
    private javax.swing.JButton back;
    private javax.swing.JRadioButton big;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton medium;
    private javax.swing.JLabel select;
    private javax.swing.JRadioButton small;
    private javax.swing.JLabel imagedrink;
    // End of variables declaration//GEN-END:variables
}
