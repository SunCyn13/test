
package UI_2_Menu;

import java.awt.Image;

import javax.swing.ImageIcon;

import UI_3_Pay.MyOrders;
import java.io.BufferedReader;
import java.io.FileReader;


public class Designnoodles extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Designnoodles.class.getName());

    private String menuName;
    public Designnoodles(String menuName) {
        initComponents();

        this.menuName = menuName;
        
        showMenuImage(); //show label ที่เตรียมไว้
    }

     private void showMenuImage() {
        try {
            String imagePath = "src/noodles/" + menuName + ".png";
            ImageIcon icon = new ImageIcon(imagePath);
            Image img = icon.getImage().getScaledInstance(imagenoodles.getWidth(), imagenoodles.getHeight(), Image.SCALE_SMOOTH);
            imagenoodles.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
        
        
        
        
        
        
        
        
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Design = new javax.swing.JLabel();
        noodle = new javax.swing.JLabel();
        bamie = new javax.swing.JRadioButton();
        senlek = new javax.swing.JRadioButton();
        miekao = new javax.swing.JRadioButton();
        mama = new javax.swing.JRadioButton();
        senyai = new javax.swing.JRadioButton();
        select = new javax.swing.JLabel();
        normal = new javax.swing.JRadioButton();
        special = new javax.swing.JRadioButton();
        selectmeat = new javax.swing.JLabel();
        pig = new javax.swing.JRadioButton();
        chicken = new javax.swing.JRadioButton();
        addcart = new javax.swing.JButton();
        back = new javax.swing.JButton();
        imagenoodles = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(206, 215, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        Design.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Design.setText("ปรับแต่ง");
        jPanel1.add(Design);
        Design.setBounds(550, 50, 140, 40);

        noodle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        noodle.setText("เส้น");
        jPanel1.add(noodle);
        noodle.setBounds(330, 120, 38, 29);

        bamie.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup1.add(bamie);
        bamie.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        bamie.setText("บะหมี่");
        bamie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bamieActionPerformed(evt);
            }
        });
        jPanel1.add(bamie);
        bamie.setBounds(350, 170, 110, 30);

        senlek.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup1.add(senlek);
        senlek.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        senlek.setText("เส้นเล็ก");
        senlek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senlekActionPerformed(evt);
            }
        });
        jPanel1.add(senlek);
        senlek.setBounds(500, 170, 90, 30);

        miekao.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup1.add(miekao);
        miekao.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        miekao.setText("หมี่ขาว");
        miekao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miekaoActionPerformed(evt);
            }
        });
        jPanel1.add(miekao);
        miekao.setBounds(650, 170, 90, 30);

        mama.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup1.add(mama);
        mama.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mama.setText("มาม่า");
        mama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mamaActionPerformed(evt);
            }
        });
        jPanel1.add(mama);
        mama.setBounds(800, 170, 90, 30);

        senyai.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup1.add(senyai);
        senyai.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        senyai.setText("เส้นใหญ่");
        senyai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senyaiActionPerformed(evt);
            }
        });
        jPanel1.add(senyai);
        senyai.setBounds(950, 170, 90, 30);

        select.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        select.setText("เลือกขนาด");
        jPanel1.add(select);
        select.setBounds(330, 250, 108, 29);

        normal.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup2.add(normal);
        normal.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        normal.setText("ธรรมดา");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });
        jPanel1.add(normal);
        normal.setBounds(350, 300, 86, 30);

        special.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup2.add(special);
        special.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        special.setText("พิเศษ");
        special.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialActionPerformed(evt);
            }
        });
        jPanel1.add(special);
        special.setBounds(500, 300, 90, 30);

        selectmeat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        selectmeat.setText("เนื้อ");
        jPanel1.add(selectmeat);
        selectmeat.setBounds(330, 380, 37, 29);

        pig.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup3.add(pig);
        pig.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pig.setText("หมู");
        pig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pigActionPerformed(evt);
            }
        });
        jPanel1.add(pig);
        pig.setBounds(350, 430, 60, 30);

        chicken.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup3.add(chicken);
        chicken.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chicken.setText("ไก่");
        chicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenActionPerformed(evt);
            }
        });
        jPanel1.add(chicken);
        chicken.setBounds(500, 430, 60, 30);

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
        jPanel1.add(imagenoodles);
        imagenoodles.setBounds(80, 130, 150, 150);
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    private void normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalActionPerformed
           
    }//GEN-LAST:event_normalActionPerformed

    private void senyaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senyaiActionPerformed
       
    }//GEN-LAST:event_senyaiActionPerformed

    private void pigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pigActionPerformed
      
    }//GEN-LAST:event_pigActionPerformed

    private void chickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenActionPerformed
      
    }//GEN-LAST:event_chickenActionPerformed

    private void specialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialActionPerformed
         
        
    }//GEN-LAST:event_specialActionPerformed

    private void miekaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miekaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miekaoActionPerformed

    private void mamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mamaActionPerformed

    private void bamieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bamieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bamieActionPerformed

    private void senlekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senlekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senlekActionPerformed

    private void addcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcartActionPerformed

        MyOrders myordersPage = new MyOrders();
        myordersPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addcartActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        noodles noodlesPage = new noodles();
        noodlesPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Design;
    private javax.swing.JButton addcart;
    private javax.swing.JButton back;
    private javax.swing.JRadioButton bamie;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton chicken;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton mama;
    private javax.swing.JRadioButton miekao;
    private javax.swing.JLabel noodle;
    private javax.swing.JRadioButton normal;
    private javax.swing.JRadioButton pig;
    private javax.swing.JLabel select;
    private javax.swing.JLabel selectmeat;
    private javax.swing.JRadioButton senlek;
    private javax.swing.JRadioButton senyai;
    private javax.swing.JRadioButton special;
    private javax.swing.JLabel imagenoodles;
    // End of variables declaration//GEN-END:variables
}
