
package UI_3_Pay;

import UI_2_Menu.rice;


public class Myprofile extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Myprofile.class.getName());

    
    public Myprofile() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        myprofile = new javax.swing.JLabel();
        information = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(206, 215, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        myprofile.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        myprofile.setText("My Profile");
        jPanel1.add(myprofile);
        myprofile.setBounds(525, 50, 243, 58);

        information.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        information.setText("Information");
        jPanel1.add(information);
        information.setBounds(110, 130, 219, 44);

        username.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        username.setText("Username : ");
        jPanel1.add(username);
        username.setBounds(160, 210, 143, 29);

        email.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        email.setText("Email : ");
        jPanel1.add(email);
        email.setBounds(160, 280, 89, 29);

        mobile.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mobile.setText("Mobile number : ");
        jPanel1.add(mobile);
        mobile.setBounds(160, 350, 201, 29);

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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        rice ricePage = new rice();
        ricePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel email;
    private javax.swing.JLabel information;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mobile;
    private javax.swing.JLabel myprofile;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
