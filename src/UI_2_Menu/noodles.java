
package UI_2_Menu;

import UI_1_User.login;
import UI_3_Pay.MyOrders;
import UI_3_Pay.Myprofile;


public class noodles extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(noodles.class.getName());

    
    public noodles() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        Pnoodle = new javax.swing.JLabel();
        Pdessert = new javax.swing.JLabel();
        Pdrink = new javax.swing.JLabel();
        Brice = new javax.swing.JButton();
        Bnoodle = new javax.swing.JButton();
        Bdessert = new javax.swing.JButton();
        Bdrink = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Pgekhuay = new javax.swing.JLabel();
        Pwater = new javax.swing.JLabel();
        Pcoffee = new javax.swing.JLabel();
        Pchadum = new javax.swing.JLabel();
        Pchayen = new javax.swing.JLabel();
        cola = new javax.swing.JLabel();
        Pred = new javax.swing.JLabel();
        noodle = new javax.swing.JButton();
        padthai = new javax.swing.JButton();
        radna = new javax.swing.JButton();
        yentafo = new javax.swing.JButton();
        sukihang = new javax.swing.JButton();
        sukinum = new javax.swing.JButton();
        padsieiw = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        myprofile = new javax.swing.JButton();
        shoppingcart = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(206, 215, 209));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(206, 215, 209));
        jPanel4.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Drink");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(600, 150, 150, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dessert");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(400, 150, 150, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Noodle");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(200, 150, 150, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rice");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, 150, 150, 50);

        Price.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/rice.png"))); // NOI18N
        jPanel4.add(Price);
        Price.setBounds(0, 0, 150, 150);

        Pnoodle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/nood.png"))); // NOI18N
        jPanel4.add(Pnoodle);
        Pnoodle.setBounds(200, 0, 150, 150);

        Pdessert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/dessert.png"))); // NOI18N
        jPanel4.add(Pdessert);
        Pdessert.setBounds(400, 0, 150, 130);

        Pdrink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/drink.png"))); // NOI18N
        jPanel4.add(Pdrink);
        Pdrink.setBounds(600, 0, 150, 150);

        Brice.setBorder(null);
        Brice.setBorderPainted(false);
        Brice.setContentAreaFilled(false);
        Brice.setFocusPainted(false);
        Brice.setRolloverEnabled(false);
        Brice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BriceActionPerformed(evt);
            }
        });
        jPanel4.add(Brice);
        Brice.setBounds(0, 0, 150, 200);

        Bnoodle.setBackground(new java.awt.Color(217, 217, 217));
        Bnoodle.setBorder(null);
        Bnoodle.setBorderPainted(false);
        Bnoodle.setContentAreaFilled(false);
        Bnoodle.setFocusPainted(false);
        Bnoodle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnoodleActionPerformed(evt);
            }
        });
        jPanel4.add(Bnoodle);
        Bnoodle.setBounds(200, 0, 150, 200);

        Bdessert.setBorder(null);
        Bdessert.setBorderPainted(false);
        Bdessert.setContentAreaFilled(false);
        Bdessert.setFocusPainted(false);
        Bdessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdessertActionPerformed(evt);
            }
        });
        jPanel4.add(Bdessert);
        Bdessert.setBounds(400, 0, 150, 200);

        Bdrink.setBorder(null);
        Bdrink.setBorderPainted(false);
        Bdrink.setContentAreaFilled(false);
        Bdrink.setFocusPainted(false);
        Bdrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdrinkActionPerformed(evt);
            }
        });
        jPanel4.add(Bdrink);
        Bdrink.setBounds(600, 0, 150, 200);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(275, 20, 750, 200);

        jPanel2.setBackground(new java.awt.Color(206, 215, 209));
        jPanel2.setLayout(null);

        Pgekhuay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noodles/padthai 1.png"))); // NOI18N
        jPanel2.add(Pgekhuay);
        Pgekhuay.setBounds(200, 0, 150, 150);

        Pwater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noodles/noodles 1.png"))); // NOI18N
        jPanel2.add(Pwater);
        Pwater.setBounds(0, 0, 150, 150);

        Pcoffee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noodles/radna 1.png"))); // NOI18N
        jPanel2.add(Pcoffee);
        Pcoffee.setBounds(400, 0, 150, 150);

        Pchadum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noodles/yentafour 1.png"))); // NOI18N
        jPanel2.add(Pchadum);
        Pchadum.setBounds(600, 0, 150, 150);

        Pchayen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noodles/sukihang1.png"))); // NOI18N
        jPanel2.add(Pchayen);
        Pchayen.setBounds(800, 0, 150, 150);

        cola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noodles/sukinam 1.png"))); // NOI18N
        jPanel2.add(cola);
        cola.setBounds(0, 230, 150, 150);

        Pred.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noodles/padseeiw 1.png"))); // NOI18N
        jPanel2.add(Pred);
        Pred.setBounds(200, 230, 150, 150);

        noodle.setBackground(new java.awt.Color(217, 217, 217));
        noodle.setBorder(null);
        noodle.setBorderPainted(false);
        noodle.setContentAreaFilled(false);
        noodle.setFocusPainted(false);
        noodle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noodleActionPerformed(evt);
            }
        });
        jPanel2.add(noodle);
        noodle.setBounds(0, 0, 150, 200);

        padthai.setBackground(new java.awt.Color(217, 217, 217));
        padthai.setBorder(null);
        padthai.setBorderPainted(false);
        padthai.setContentAreaFilled(false);
        padthai.setFocusPainted(false);
        padthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                padthaiActionPerformed(evt);
            }
        });
        jPanel2.add(padthai);
        padthai.setBounds(200, 0, 150, 200);

        radna.setBackground(new java.awt.Color(217, 217, 217));
        radna.setBorder(null);
        radna.setBorderPainted(false);
        radna.setContentAreaFilled(false);
        radna.setFocusPainted(false);
        radna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radnaActionPerformed(evt);
            }
        });
        jPanel2.add(radna);
        radna.setBounds(400, 0, 150, 200);

        yentafo.setBackground(new java.awt.Color(217, 217, 217));
        yentafo.setBorder(null);
        yentafo.setBorderPainted(false);
        yentafo.setContentAreaFilled(false);
        yentafo.setFocusPainted(false);
        yentafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yentafoActionPerformed(evt);
            }
        });
        jPanel2.add(yentafo);
        yentafo.setBounds(600, 0, 150, 200);

        sukihang.setBackground(new java.awt.Color(217, 217, 217));
        sukihang.setBorder(null);
        sukihang.setBorderPainted(false);
        sukihang.setContentAreaFilled(false);
        sukihang.setFocusPainted(false);
        sukihang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sukihangActionPerformed(evt);
            }
        });
        jPanel2.add(sukihang);
        sukihang.setBounds(800, 0, 150, 200);

        sukinum.setBackground(new java.awt.Color(217, 217, 217));
        sukinum.setBorder(null);
        sukinum.setBorderPainted(false);
        sukinum.setContentAreaFilled(false);
        sukinum.setFocusPainted(false);
        sukinum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sukinumActionPerformed(evt);
            }
        });
        jPanel2.add(sukinum);
        sukinum.setBounds(0, 230, 150, 200);

        padsieiw.setBackground(new java.awt.Color(217, 217, 217));
        padsieiw.setBorder(null);
        padsieiw.setBorderPainted(false);
        padsieiw.setContentAreaFilled(false);
        padsieiw.setFocusPainted(false);
        padsieiw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                padsieiwActionPerformed(evt);
            }
        });
        jPanel2.add(padsieiw);
        padsieiw.setBounds(200, 230, 150, 200);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(120, 250, 950, 430);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(85, 720));
        jPanel3.setLayout(null);

        myprofile.setBackground(new java.awt.Color(204, 204, 204));
        myprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/user1.png"))); // NOI18N
        myprofile.setToolTipText("");
        myprofile.setBorder(null);
        myprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myprofileActionPerformed(evt);
            }
        });
        jPanel3.add(myprofile);
        myprofile.setBounds(23, 270, 40, 40);

        shoppingcart.setBackground(new java.awt.Color(204, 204, 204));
        shoppingcart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/shopping-bag 1.png"))); // NOI18N
        shoppingcart.setToolTipText("");
        shoppingcart.setBorder(null);
        shoppingcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoppingcartActionPerformed(evt);
            }
        });
        jPanel3.add(shoppingcart);
        shoppingcart.setBounds(23, 340, 40, 40);

        logout.setBackground(new java.awt.Color(204, 204, 204));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/logout 1.png"))); // NOI18N
        logout.setToolTipText("");
        logout.setBorder(null);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel3.add(logout);
        logout.setBounds(23, 410, 40, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(1195, 0, 85, 720);

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

    private void BdessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdessertActionPerformed
        dessert dessertpage = new dessert();
        dessertpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BdessertActionPerformed

    private void myprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myprofileActionPerformed
        Myprofile myprofilepage = new Myprofile();
        myprofilepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_myprofileActionPerformed

    private void shoppingcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoppingcartActionPerformed
        MyOrders myorderpage = new MyOrders();
        myorderpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_shoppingcartActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        login loginPage = new login();
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void BriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BriceActionPerformed
        rice ricepage = new rice();
        ricepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BriceActionPerformed

    private void BnoodleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnoodleActionPerformed
        noodles noodlespage = new noodles();
        noodlespage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BnoodleActionPerformed

    private void BdrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdrinkActionPerformed
        drinks drinkspage = new drinks();
        drinkspage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BdrinkActionPerformed

    private void padthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_padthaiActionPerformed
        Designnoodles designnoodles = new Designnoodles("padthai 1");
        designnoodles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_padthaiActionPerformed

    private void noodleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noodleActionPerformed
        Designnoodles designnoodles = new Designnoodles("noodles 1");
        designnoodles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_noodleActionPerformed

    private void radnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radnaActionPerformed
        Designnoodles designnoodles = new Designnoodles("radna 1");
        designnoodles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_radnaActionPerformed

    private void yentafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yentafoActionPerformed
        Designnoodles designnoodles = new Designnoodles("yentafour 1");
        designnoodles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_yentafoActionPerformed

    private void sukihangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sukihangActionPerformed
        Designnoodles designnoodles = new Designnoodles("sukihang1");
        designnoodles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sukihangActionPerformed

    private void padsieiwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_padsieiwActionPerformed
        Designnoodles designnoodles = new Designnoodles("padseeiw 1");
        designnoodles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_padsieiwActionPerformed

    private void sukinumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sukinumActionPerformed
        Designnoodles designnoodles = new Designnoodles("sukinam 1");
        designnoodles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sukinumActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdessert;
    private javax.swing.JButton Bdrink;
    private javax.swing.JButton Bnoodle;
    private javax.swing.JButton Brice;
    private javax.swing.JLabel Pchadum;
    private javax.swing.JLabel Pchayen;
    private javax.swing.JLabel Pcoffee;
    private javax.swing.JLabel Pdessert;
    private javax.swing.JLabel Pdrink;
    private javax.swing.JLabel Pgekhuay;
    private javax.swing.JLabel Pnoodle;
    private javax.swing.JLabel Pred;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel Pwater;
    private javax.swing.JLabel cola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logout;
    private javax.swing.JButton myprofile;
    private javax.swing.JButton noodle;
    private javax.swing.JButton padsieiw;
    private javax.swing.JButton padthai;
    private javax.swing.JButton radna;
    private javax.swing.JButton shoppingcart;
    private javax.swing.JButton sukihang;
    private javax.swing.JButton sukinum;
    private javax.swing.JButton yentafo;
    // End of variables declaration//GEN-END:variables
}
