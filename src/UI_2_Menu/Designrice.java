
package UI_2_Menu;

import javax.swing.ImageIcon;
import java.awt.Image;

import UI_3_Pay.MyOrders;





public class Designrice extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Designrice.class.getName());
    private String menuName;

    
    public Designrice(String menuName) {
        initComponents();
        this.menuName = menuName;
        
        showMenuImage(); //show label ที่เตรียมไว้
    }

    private void showMenuImage() {
        try {
            String imagePath = "src/rice/" + menuName + ".png";
            ImageIcon icon = new ImageIcon(imagePath);
            Image img = icon.getImage().getScaledInstance(imagerice.getWidth(), imagerice.getHeight(), Image.SCALE_SMOOTH);
            imagerice.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Design = new javax.swing.JLabel();
        select = new javax.swing.JLabel();
        normal = new javax.swing.JRadioButton();
        special = new javax.swing.JRadioButton();
        selectmeat = new javax.swing.JLabel();
        pig = new javax.swing.JRadioButton();
        chicken = new javax.swing.JRadioButton();
        addcart = new javax.swing.JButton();
        back = new javax.swing.JButton();
        imagerice = new javax.swing.JLabel();

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

        normal.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup1.add(normal);
        normal.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        normal.setText("ธรรมดา");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });
        jPanel1.add(normal);
        normal.setBounds(350, 170, 90, 30);

        special.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup1.add(special);
        special.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        special.setText("พิเศษ");
        special.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialActionPerformed(evt);
            }
        });
        jPanel1.add(special);
        special.setBounds(500, 170, 90, 30);

        selectmeat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        selectmeat.setText("เนื้อ");
        jPanel1.add(selectmeat);
        selectmeat.setBounds(330, 250, 37, 29);

        pig.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup2.add(pig);
        pig.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pig.setText("หมู");
        pig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pigActionPerformed(evt);
            }
        });
        jPanel1.add(pig);
        pig.setBounds(350, 300, 50, 30);

        chicken.setBackground(new java.awt.Color(206, 215, 209));
        buttonGroup2.add(chicken);
        chicken.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chicken.setText("ไก่");
        chicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenActionPerformed(evt);
            }
        });
        jPanel1.add(chicken);
        chicken.setBounds(500, 300, 60, 30);

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
        jPanel1.add(imagerice);
        imagerice.setBounds(80, 130, 150, 150);

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
    }// </editor-fold>                        

    private void chickenActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void pigActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void specialActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void normalActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void addcartActionPerformed(java.awt.event.ActionEvent evt) {                                        
        MyOrders myordersPage = new MyOrders();
        myordersPage.setVisible(true);
        this.dispose();
    }                                       

    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
        rice ricePage = new rice();
        ricePage.setVisible(true);
        this.dispose();
    }                                    

    

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Design;
    private javax.swing.JButton addcart;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton chicken;
    private javax.swing.JLabel imagerice;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton normal;
    private javax.swing.JRadioButton pig;
    private javax.swing.JLabel select;
    private javax.swing.JLabel selectmeat;
    private javax.swing.JRadioButton special;
    // End of variables declaration                   
}
