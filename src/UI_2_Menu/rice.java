
package UI_2_Menu;

import UI_1_User.login;
import UI_3_Pay.MyOrders;
import UI_3_Pay.Myprofile;


public class rice extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(rice.class.getName());

    
    public rice() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        myprofile = new javax.swing.JButton();
        shoppingcart = new javax.swing.JButton();
        logout = new javax.swing.JButton();
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
        kaijeay = new javax.swing.JButton();
        kapao = new javax.swing.JButton();
        todkrataum = new javax.swing.JButton();
        pikkang = new javax.swing.JButton();
        naped = new javax.swing.JButton();
        panang = new javax.swing.JButton();
        kana = new javax.swing.JButton();
        karee = new javax.swing.JButton();
        cuapikkua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(206, 215, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Noodle");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(200, 150, 150, 50);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
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

        Brice.setBackground(new java.awt.Color(217, 217, 217));
        Brice.setBorder(null);
        Brice.setContentAreaFilled(false);
        Brice.setFocusPainted(false);
        Brice.setRequestFocusEnabled(false);
        Brice.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/rice.png"))); // NOI18N
        Brice.setVerifyInputWhenFocusTarget(false);
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
        Bnoodle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Bnoodle.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/nood.png"))); // NOI18N
        Bnoodle.setFocusPainted(false);
        Bnoodle.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/nood.png"))); // NOI18N
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

        Pgekhuay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rice/kapao.png"))); // NOI18N
        jPanel2.add(Pgekhuay);
        Pgekhuay.setBounds(200, 0, 150, 150);

        Pwater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rice/kajael.png"))); // NOI18N
        jPanel2.add(Pwater);
        Pwater.setBounds(0, 0, 150, 150);

        Pcoffee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rice/todkratealm.png"))); // NOI18N
        jPanel2.add(Pcoffee);
        Pcoffee.setBounds(400, 0, 150, 150);

        Pchadum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rice/pikkang.png"))); // NOI18N
        jPanel2.add(Pchadum);
        Pchadum.setBounds(600, 0, 150, 150);

        Pchayen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rice/narped.png"))); // NOI18N
        jPanel2.add(Pchayen);
        Pchayen.setBounds(800, 0, 150, 150);

        cola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rice/panang.png"))); // NOI18N
        jPanel2.add(cola);
        cola.setBounds(0, 230, 150, 150);

        Pred.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rice/kanamoo.png"))); // NOI18N
        jPanel2.add(Pred);
        Pred.setBounds(200, 230, 150, 150);

        Porange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rice/karee 3.png"))); // NOI18N
        jPanel2.add(Porange);
        Porange.setBounds(400, 230, 150, 150);

        Pgreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rice/cuapikgue.png"))); // NOI18N
        jPanel2.add(Pgreen);
        Pgreen.setBounds(600, 230, 150, 150);

        kaijeay.setBackground(new java.awt.Color(204, 204, 204));
        kaijeay.setBorder(null);
        kaijeay.setBorderPainted(false);
        kaijeay.setContentAreaFilled(false);
        kaijeay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaijeayActionPerformed(evt);
            }
        });
        jPanel2.add(kaijeay);
        kaijeay.setBounds(0, 0, 150, 200);

        kapao.setBackground(new java.awt.Color(217, 217, 217));
        kapao.setBorder(null);
        kapao.setBorderPainted(false);
        kapao.setContentAreaFilled(false);
        kapao.setFocusPainted(false);
        kapao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kapaoActionPerformed(evt);
            }
        });
        jPanel2.add(kapao);
        kapao.setBounds(200, 0, 150, 200);

        todkrataum.setBackground(new java.awt.Color(217, 217, 217));
        todkrataum.setBorder(null);
        todkrataum.setBorderPainted(false);
        todkrataum.setContentAreaFilled(false);
        todkrataum.setFocusPainted(false);
        todkrataum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todkrataumActionPerformed(evt);
            }
        });
        jPanel2.add(todkrataum);
        todkrataum.setBounds(400, 0, 150, 200);

        pikkang.setBackground(new java.awt.Color(217, 217, 217));
        pikkang.setBorder(null);
        pikkang.setBorderPainted(false);
        pikkang.setContentAreaFilled(false);
        pikkang.setFocusPainted(false);
        pikkang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pikkangActionPerformed(evt);
            }
        });
        jPanel2.add(pikkang);
        pikkang.setBounds(600, 0, 150, 200);

        naped.setBackground(new java.awt.Color(217, 217, 217));
        naped.setBorder(null);
        naped.setBorderPainted(false);
        naped.setContentAreaFilled(false);
        naped.setFocusPainted(false);
        naped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                napedActionPerformed(evt);
            }
        });
        jPanel2.add(naped);
        naped.setBounds(800, 0, 150, 200);

        panang.setBackground(new java.awt.Color(217, 217, 217));
        panang.setBorder(null);
        panang.setBorderPainted(false);
        panang.setContentAreaFilled(false);
        panang.setFocusPainted(false);
        panang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panangActionPerformed(evt);
            }
        });
        jPanel2.add(panang);
        panang.setBounds(0, 230, 150, 200);

        kana.setBackground(new java.awt.Color(217, 217, 217));
        kana.setBorder(null);
        kana.setBorderPainted(false);
        kana.setContentAreaFilled(false);
        kana.setFocusPainted(false);
        kana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kanaActionPerformed(evt);
            }
        });
        jPanel2.add(kana);
        kana.setBounds(200, 230, 150, 200);

        karee.setBackground(new java.awt.Color(217, 217, 217));
        karee.setBorder(null);
        karee.setBorderPainted(false);
        karee.setContentAreaFilled(false);
        karee.setFocusPainted(false);
        karee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kareeActionPerformed(evt);
            }
        });
        jPanel2.add(karee);
        karee.setBounds(400, 230, 150, 200);

        cuapikkua.setBackground(new java.awt.Color(217, 217, 217));
        cuapikkua.setBorder(null);
        cuapikkua.setBorderPainted(false);
        cuapikkua.setContentAreaFilled(false);
        cuapikkua.setFocusPainted(false);
        cuapikkua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuapikkuaActionPerformed(evt);
            }
        });
        jPanel2.add(cuapikkua);
        cuapikkua.setBounds(600, 230, 150, 200);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(120, 250, 950, 430);

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

    private void BnoodleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnoodleActionPerformed
        noodles noodlespage = new noodles();
        noodlespage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BnoodleActionPerformed

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

    private void BdrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdrinkActionPerformed
        drinks drinkspage = new drinks();
        drinkspage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BdrinkActionPerformed

    private void kapaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kapaoActionPerformed
        Designrice designrice = new Designrice("kapao");
        designrice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kapaoActionPerformed

    private void kaijeayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaijeayActionPerformed
        Designrice designrice = new Designrice("kajael");
        designrice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kaijeayActionPerformed

    private void todkrataumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todkrataumActionPerformed
        Designrice designrice = new Designrice("todkratealm");
        designrice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_todkrataumActionPerformed

    private void pikkangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pikkangActionPerformed
        Designrice designrice = new Designrice("pikkang");
        designrice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pikkangActionPerformed

    private void napedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_napedActionPerformed
        Designrice designrice = new Designrice("narped");
        designrice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_napedActionPerformed

    private void cuapikkuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuapikkuaActionPerformed
        Designrice designrice = new Designrice("cuapikgue");
        designrice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cuapikkuaActionPerformed

    private void kareeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kareeActionPerformed
        Designrice designrice = new Designrice("karee 3");
        designrice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kareeActionPerformed

    private void kanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kanaActionPerformed
        Designrice designrice = new Designrice("kanamoo");
        designrice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kanaActionPerformed

    private void panangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panangActionPerformed
        Designrice designrice = new Designrice("panang");
        designrice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_panangActionPerformed

    

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
    private javax.swing.JLabel cola;
    private javax.swing.JButton cuapikkua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton kaijeay;
    private javax.swing.JButton kana;
    private javax.swing.JButton kapao;
    private javax.swing.JButton karee;
    private javax.swing.JButton logout;
    private javax.swing.JButton myprofile;
    private javax.swing.JButton naped;
    private javax.swing.JButton panang;
    private javax.swing.JButton pikkang;
    private javax.swing.JButton shoppingcart;
    private javax.swing.JButton todkrataum;
    // End of variables declaration//GEN-END:variables
}
