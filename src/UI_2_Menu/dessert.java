
package UI_2_Menu;

import UI_1_User.login;
import UI_3_Pay.MyOrders;
import UI_3_Pay.Myprofile;


public class dessert extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(dessert.class.getName());

    
    public dessert() {
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
        Porange = new javax.swing.JLabel();
        Pgreen = new javax.swing.JLabel();
        mango = new javax.swing.JButton();
        banana = new javax.swing.JButton();
        tubtim = new javax.swing.JButton();
        iscream = new javax.swing.JButton();
        lodchong = new javax.swing.JButton();
        bualoy = new javax.swing.JButton();
        chaoguay = new javax.swing.JButton();
        woon = new javax.swing.JButton();
        kanotuay = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        myprofile = new javax.swing.JButton();
        shoppingcart = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(206, 215, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(206, 215, 209));
        jPanel4.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Drink");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(600, 150, 150, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dessert");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(400, 150, 150, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
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
        Brice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BriceActionPerformed(evt);
            }
        });
        jPanel4.add(Brice);
        Brice.setBounds(0, 0, 150, 200);

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

        Bdessert.setBackground(new java.awt.Color(217, 217, 217));
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

        Pgekhuay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dessert/banana 1.png"))); // NOI18N
        jPanel2.add(Pgekhuay);
        Pgekhuay.setBounds(200, 0, 150, 150);

        Pwater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dessert/magosticky 1.png"))); // NOI18N
        jPanel2.add(Pwater);
        Pwater.setBounds(0, 0, 150, 150);

        Pcoffee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dessert/tubtim 1.png"))); // NOI18N
        jPanel2.add(Pcoffee);
        Pcoffee.setBounds(400, 0, 150, 150);

        Pchadum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dessert/i tim1.png"))); // NOI18N
        jPanel2.add(Pchadum);
        Pchadum.setBounds(600, 0, 150, 150);

        Pchayen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dessert/lodchong 1.png"))); // NOI18N
        jPanel2.add(Pchayen);
        Pchayen.setBounds(800, 0, 150, 150);

        cola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dessert/bualoy.png"))); // NOI18N
        jPanel2.add(cola);
        cola.setBounds(0, 230, 150, 150);

        Pred.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dessert/chaojuy.png"))); // NOI18N
        jPanel2.add(Pred);
        Pred.setBounds(200, 230, 150, 150);

        Porange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dessert/woongati.png"))); // NOI18N
        jPanel2.add(Porange);
        Porange.setBounds(400, 230, 150, 150);

        Pgreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dessert/kanomtuy.png"))); // NOI18N
        jPanel2.add(Pgreen);
        Pgreen.setBounds(600, 230, 150, 150);

        mango.setBackground(new java.awt.Color(217, 217, 217));
        mango.setBorder(null);
        mango.setBorderPainted(false);
        mango.setContentAreaFilled(false);
        mango.setFocusPainted(false);
        mango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangoActionPerformed(evt);
            }
        });
        jPanel2.add(mango);
        mango.setBounds(0, 0, 150, 200);

        banana.setBackground(new java.awt.Color(217, 217, 217));
        banana.setBorder(null);
        banana.setBorderPainted(false);
        banana.setContentAreaFilled(false);
        banana.setFocusPainted(false);
        banana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bananaActionPerformed(evt);
            }
        });
        jPanel2.add(banana);
        banana.setBounds(200, 0, 150, 200);

        tubtim.setBackground(new java.awt.Color(217, 217, 217));
        tubtim.setBorder(null);
        tubtim.setBorderPainted(false);
        tubtim.setContentAreaFilled(false);
        tubtim.setFocusPainted(false);
        tubtim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tubtimActionPerformed(evt);
            }
        });
        jPanel2.add(tubtim);
        tubtim.setBounds(400, 0, 150, 200);

        iscream.setBackground(new java.awt.Color(217, 217, 217));
        iscream.setBorder(null);
        iscream.setBorderPainted(false);
        iscream.setContentAreaFilled(false);
        iscream.setFocusPainted(false);
        iscream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iscreamActionPerformed(evt);
            }
        });
        jPanel2.add(iscream);
        iscream.setBounds(600, 0, 150, 200);

        lodchong.setBackground(new java.awt.Color(217, 217, 217));
        lodchong.setBorder(null);
        lodchong.setBorderPainted(false);
        lodchong.setContentAreaFilled(false);
        lodchong.setFocusPainted(false);
        lodchong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lodchongActionPerformed(evt);
            }
        });
        jPanel2.add(lodchong);
        lodchong.setBounds(800, 0, 150, 200);

        bualoy.setBackground(new java.awt.Color(217, 217, 217));
        bualoy.setBorder(null);
        bualoy.setBorderPainted(false);
        bualoy.setContentAreaFilled(false);
        bualoy.setFocusPainted(false);
        bualoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bualoyActionPerformed(evt);
            }
        });
        jPanel2.add(bualoy);
        bualoy.setBounds(0, 230, 150, 200);

        chaoguay.setBackground(new java.awt.Color(217, 217, 217));
        chaoguay.setBorder(null);
        chaoguay.setBorderPainted(false);
        chaoguay.setContentAreaFilled(false);
        chaoguay.setFocusPainted(false);
        chaoguay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaoguayActionPerformed(evt);
            }
        });
        jPanel2.add(chaoguay);
        chaoguay.setBounds(200, 230, 150, 200);

        woon.setBackground(new java.awt.Color(217, 217, 217));
        woon.setBorder(null);
        woon.setBorderPainted(false);
        woon.setContentAreaFilled(false);
        woon.setFocusPainted(false);
        woon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                woonActionPerformed(evt);
            }
        });
        jPanel2.add(woon);
        woon.setBounds(400, 230, 150, 200);

        kanotuay.setBackground(new java.awt.Color(217, 217, 217));
        kanotuay.setBorder(null);
        kanotuay.setBorderPainted(false);
        kanotuay.setContentAreaFilled(false);
        kanotuay.setFocusPainted(false);
        kanotuay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kanotuayActionPerformed(evt);
            }
        });
        jPanel2.add(kanotuay);
        kanotuay.setBounds(600, 230, 150, 200);

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
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

    private void bananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bananaActionPerformed
        Designdessert designdessert = new Designdessert("banana 1");
        designdessert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bananaActionPerformed

    private void mangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangoActionPerformed
        Designdessert designdessert = new Designdessert("magosticky 1");
        designdessert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mangoActionPerformed

    private void tubtimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tubtimActionPerformed
        Designdessert designdessert = new Designdessert("tubtim 1");
        designdessert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tubtimActionPerformed

    private void iscreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iscreamActionPerformed
        Designdessert designdessert = new Designdessert("i tim1");
        designdessert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iscreamActionPerformed

    private void lodchongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lodchongActionPerformed
        Designdessert designdessert = new Designdessert("lodchong 1");
        designdessert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lodchongActionPerformed

    private void kanotuayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kanotuayActionPerformed
        Designdessert designdessert = new Designdessert("kanomtuy");
        designdessert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kanotuayActionPerformed

    private void woonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_woonActionPerformed
        Designdessert designdessert = new Designdessert("woongati");
        designdessert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_woonActionPerformed

    private void chaoguayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaoguayActionPerformed
        Designdessert designdessert = new Designdessert("chaojuy");
        designdessert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_chaoguayActionPerformed

    private void bualoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bualoyActionPerformed
        Designdessert designdessert = new Designdessert("bualoy");
        designdessert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bualoyActionPerformed

   

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
    private javax.swing.JLabel Pgreen;
    private javax.swing.JLabel Pnoodle;
    private javax.swing.JLabel Porange;
    private javax.swing.JLabel Pred;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel Pwater;
    private javax.swing.JButton banana;
    private javax.swing.JButton bualoy;
    private javax.swing.JButton chaoguay;
    private javax.swing.JLabel cola;
    private javax.swing.JButton iscream;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton kanotuay;
    private javax.swing.JButton lodchong;
    private javax.swing.JButton logout;
    private javax.swing.JButton mango;
    private javax.swing.JButton myprofile;
    private javax.swing.JButton shoppingcart;
    private javax.swing.JButton tubtim;
    private javax.swing.JButton woon;
    // End of variables declaration//GEN-END:variables
}
