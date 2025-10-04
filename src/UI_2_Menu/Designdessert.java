
package UI_2_Menu;

import java.awt.Image;

import javax.swing.ImageIcon;

import UI_3_Pay.MyOrders;


public class Designdessert extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Designdessert.class.getName());
    private String menuName;
    
    public Designdessert(String menuName) {
        initComponents();
        this.menuName = menuName;

        showMenuImage(); //show label ที่เตรียมไว้
    }

     private void showMenuImage() {
        try {
            String imagePath = "src/dessert/" + menuName + ".png";// สมมติว่าไฟล์รูปภาพอยู่ในโฟลเดอร์ Media
            ImageIcon icon = new ImageIcon(imagePath);
            Image img = icon.getImage().getScaledInstance(imagedessert.getWidth(), imagedessert.getHeight(), Image.SCALE_SMOOTH);
            imagedessert.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        design = new javax.swing.JLabel();
        select = new javax.swing.JLabel();
        low = new javax.swing.JRadioButton();
        medium = new javax.swing.JRadioButton();
        high = new javax.swing.JRadioButton();
        addcart = new javax.swing.JButton();
        back = new javax.swing.JButton();
        imagedessert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(206, 215, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        design.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        design.setText("ปรับแต่ง");
        jPanel1.add(design);
        design.setBounds(550, 50, 140, 40);

        select.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        select.setText("เลือกระดับความหวาน");
        jPanel1.add(select);
        select.setBounds(330, 120, 220, 29);

        low.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup1.add(low);
        low.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        low.setText("หวานน้อย");
        low.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowActionPerformed(evt);
            }
        });
        jPanel1.add(low);
        low.setBounds(350, 170, 110, 30);

        medium.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup1.add(medium);
        medium.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        medium.setText("ปานกลาง");
        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumActionPerformed(evt);
            }
        });
        jPanel1.add(medium);
        medium.setBounds(500, 170, 110, 30);

        high.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup1.add(high);
        high.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        high.setText("หวานมาก");
        high.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highActionPerformed(evt);
            }
        });
        jPanel1.add(high);
        high.setBounds(650, 170, 110, 30);

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
        jPanel1.add(imagedessert);
        imagedessert.setBounds(80, 130, 150, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lowActionPerformed

    private void highActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_highActionPerformed

    private void mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediumActionPerformed

    private void addcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcartActionPerformed
        MyOrders myordersPage = new MyOrders();
        myordersPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addcartActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dessert dessertpage = new dessert();
        dessertpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcart;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel design;
    private javax.swing.JRadioButton high;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton low;
    private javax.swing.JRadioButton medium;
    private javax.swing.JLabel select;
    private javax.swing.JLabel imagedessert;
    // End of variables declaration//GEN-END:variables
}
