
package UI_2_Menu;

import UI_1_User.login;
import UI_3_Pay.MyOrders;
import UI_3_Pay.Myprofile;


public class drinks extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(drinks.class.getName());

    
    public drinks() {
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
        Bwater = new javax.swing.JButton();
        Bgekhuay = new javax.swing.JButton();
        Bcoffee = new javax.swing.JButton();
        Bchadum = new javax.swing.JButton();
        Bchayen = new javax.swing.JButton();
        Bcola = new javax.swing.JButton();
        Bred = new javax.swing.JButton();
        Borange = new javax.swing.JButton();
        Bgreen = new javax.swing.JButton();
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Drink");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(600, 150, 150, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
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

        Bdrink.setBackground(new java.awt.Color(217, 217, 217));
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

        Pgekhuay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drink/gekhuay.png"))); // NOI18N
        jPanel2.add(Pgekhuay);
        Pgekhuay.setBounds(200, 0, 150, 150);

        Pwater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drink/water.png"))); // NOI18N
        jPanel2.add(Pwater);
        Pwater.setBounds(0, 0, 150, 150);

        Pcoffee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drink/coffee 1.png"))); // NOI18N
        jPanel2.add(Pcoffee);
        Pcoffee.setBounds(400, 0, 150, 150);

        Pchadum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drink/cha dum.png"))); // NOI18N
        jPanel2.add(Pchadum);
        Pchadum.setBounds(600, 0, 150, 150);

        Pchayen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drink/chayen.png"))); // NOI18N
        jPanel2.add(Pchayen);
        Pchayen.setBounds(800, 0, 150, 150);

        cola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drink/cola.png"))); // NOI18N
        jPanel2.add(cola);
        cola.setBounds(0, 230, 150, 150);

        Pred.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drink/red.png"))); // NOI18N
        jPanel2.add(Pred);
        Pred.setBounds(200, 230, 150, 150);

        Porange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drink/orange.png"))); // NOI18N
        jPanel2.add(Porange);
        Porange.setBounds(400, 230, 150, 150);

        Pgreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drink/green.png"))); // NOI18N
        jPanel2.add(Pgreen);
        Pgreen.setBounds(600, 230, 150, 150);

        Bwater.setBackground(new java.awt.Color(217, 217, 217));
        Bwater.setBorder(null);
        Bwater.setBorderPainted(false);
        Bwater.setContentAreaFilled(false);
        Bwater.setFocusPainted(false);
        Bwater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BwaterActionPerformed(evt);
            }
        });
        jPanel2.add(Bwater);
        Bwater.setBounds(0, 0, 150, 200);

        Bgekhuay.setBackground(new java.awt.Color(217, 217, 217));
        Bgekhuay.setBorder(null);
        Bgekhuay.setBorderPainted(false);
        Bgekhuay.setContentAreaFilled(false);
        Bgekhuay.setFocusPainted(false);
        Bgekhuay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BgekhuayActionPerformed(evt);
            }
        });
        jPanel2.add(Bgekhuay);
        Bgekhuay.setBounds(200, 0, 150, 200);

        Bcoffee.setBackground(new java.awt.Color(217, 217, 217));
        Bcoffee.setBorder(null);
        Bcoffee.setBorderPainted(false);
        Bcoffee.setContentAreaFilled(false);
        Bcoffee.setFocusPainted(false);
        Bcoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcoffeeActionPerformed(evt);
            }
        });
        jPanel2.add(Bcoffee);
        Bcoffee.setBounds(400, 0, 150, 200);

        Bchadum.setBackground(new java.awt.Color(217, 217, 217));
        Bchadum.setBorder(null);
        Bchadum.setBorderPainted(false);
        Bchadum.setContentAreaFilled(false);
        Bchadum.setFocusPainted(false);
        Bchadum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BchadumActionPerformed(evt);
            }
        });
        jPanel2.add(Bchadum);
        Bchadum.setBounds(600, 0, 150, 200);

        Bchayen.setBackground(new java.awt.Color(217, 217, 217));
        Bchayen.setBorder(null);
        Bchayen.setBorderPainted(false);
        Bchayen.setContentAreaFilled(false);
        Bchayen.setFocusPainted(false);
        Bchayen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BchayenActionPerformed(evt);
            }
        });
        jPanel2.add(Bchayen);
        Bchayen.setBounds(800, 0, 150, 200);

        Bcola.setBackground(new java.awt.Color(217, 217, 217));
        Bcola.setBorder(null);
        Bcola.setBorderPainted(false);
        Bcola.setContentAreaFilled(false);
        Bcola.setFocusPainted(false);
        Bcola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcolaActionPerformed(evt);
            }
        });
        jPanel2.add(Bcola);
        Bcola.setBounds(0, 230, 150, 200);

        Bred.setBackground(new java.awt.Color(217, 217, 217));
        Bred.setBorder(null);
        Bred.setBorderPainted(false);
        Bred.setContentAreaFilled(false);
        Bred.setFocusPainted(false);
        Bred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BredActionPerformed(evt);
            }
        });
        jPanel2.add(Bred);
        Bred.setBounds(200, 230, 150, 200);

        Borange.setBackground(new java.awt.Color(217, 217, 217));
        Borange.setBorder(null);
        Borange.setBorderPainted(false);
        Borange.setContentAreaFilled(false);
        Borange.setFocusPainted(false);
        Borange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorangeActionPerformed(evt);
            }
        });
        jPanel2.add(Borange);
        Borange.setBounds(400, 230, 150, 200);

        Bgreen.setBackground(new java.awt.Color(217, 217, 217));
        Bgreen.setBorder(null);
        Bgreen.setBorderPainted(false);
        Bgreen.setContentAreaFilled(false);
        Bgreen.setFocusPainted(false);
        Bgreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BgreenActionPerformed(evt);
            }
        });
        jPanel2.add(Bgreen);
        Bgreen.setBounds(600, 230, 150, 200);

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

    private void BgekhuayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BgekhuayActionPerformed
        Designdrinks designdrinks = new Designdrinks("gekhuay");
        designdrinks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BgekhuayActionPerformed

    private void BwaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BwaterActionPerformed
        Designdrinks designdrinks = new Designdrinks("water");
        designdrinks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BwaterActionPerformed

    private void BcoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcoffeeActionPerformed
        Designdrinks designdrinks = new Designdrinks("coffee 1");
        designdrinks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BcoffeeActionPerformed

    private void BchadumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BchadumActionPerformed
        Designdrinks designdrinks = new Designdrinks("cha dum");
        designdrinks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BchadumActionPerformed

    private void BchayenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BchayenActionPerformed
        Designdrinks designdrinks = new Designdrinks("chayen");
        designdrinks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BchayenActionPerformed

    private void BgreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BgreenActionPerformed
        Designdrinks designdrinks = new Designdrinks("green");
        designdrinks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BgreenActionPerformed

    private void BorangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorangeActionPerformed
        Designdrinks designdrinks = new Designdrinks("orange");
        designdrinks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BorangeActionPerformed

    private void BredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BredActionPerformed
        Designdrinks designdrinks = new Designdrinks("red");
        designdrinks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BredActionPerformed

    private void BcolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcolaActionPerformed
        Designdrinks designdrinks = new Designdrinks("cola");
        designdrinks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BcolaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bchadum;
    private javax.swing.JButton Bchayen;
    private javax.swing.JButton Bcoffee;
    private javax.swing.JButton Bcola;
    private javax.swing.JButton Bdessert;
    private javax.swing.JButton Bdrink;
    private javax.swing.JButton Bgekhuay;
    private javax.swing.JButton Bgreen;
    private javax.swing.JButton Bnoodle;
    private javax.swing.JButton Borange;
    private javax.swing.JButton Bred;
    private javax.swing.JButton Brice;
    private javax.swing.JButton Bwater;
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
    private javax.swing.JButton shoppingcart;
    // End of variables declaration//GEN-END:variables
}
