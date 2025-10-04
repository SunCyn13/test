package UI_1_User;

import UI_1_Admin.Admin;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

import UI_2_Menu.rice;


public class login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(login.class.getName());

 
    public login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emaillogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordlogin = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        loginbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel2.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(420, 720));
        jPanel3.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 43)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 100));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CS Flavor");
        jLabel1.setOpaque(true);
        jPanel3.add(jLabel1);
        jLabel1.setBounds(90, 20, 230, 80);

        jButton1.setBackground(new java.awt.Color(217, 217, 217));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(100, 170, 210, 50);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("Sign Up");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(100, 250, 210, 50);
        jButton3.getAccessibleContext().setAccessibleDescription("");

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 420, 720);

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));
        jPanel1.setPreferredSize(new java.awt.Dimension(860, 720));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Log In");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(380, 50, 140, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel3.setText("Email");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 155, 140, 24);

        emaillogin.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        emaillogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailloginActionPerformed(evt);
            }
        });
        jPanel1.add(emaillogin);
        emaillogin.setBounds(280, 195, 320, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 250, 71, 24);

        passwordlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordloginActionPerformed(evt);
            }
        });
        jPanel1.add(passwordlogin);
        passwordlogin.setBounds(280, 290, 320, 30);


        jButton2.setBackground(new java.awt.Color(242, 242, 242));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton2.setText("Do not have a account? Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 470, 320, 40);

        loginbutton.setBackground(new java.awt.Color(204, 204, 204));
        loginbutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginbutton.setText("Log In");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(loginbutton);
        loginbutton.setBounds(280, 410, 320, 40);
        loginbutton.getAccessibleContext().setAccessibleName("");

        jPanel2.add(jPanel1);
        jPanel1.setBounds(420, 0, 860, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        login loginPage = new login();
        loginPage.setVisible(true);
        this.dispose();
        
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Signup signupPage = new Signup();
        signupPage.setVisible(true);
        this.dispose();
        
    }                                        

    private void passwordloginActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             
                                      

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
        String inputemail = emaillogin.getText();    
        String inputpassword = new String(passwordlogin.getPassword());

        boolean loginsuccess = false;
        
        boolean isadmin = false;
        
        if (inputemail.isEmpty() || inputpassword.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please fill in all fields!");
        return;
    }

        try {
            BufferedReader br_user = new BufferedReader(new FileReader("src/datacsv/Fileuser.csv"));
            String user;
            br_user.readLine();

               
            while ((user = br_user.readLine()) != null) {
                String[] value = user.split(",");

                String email = "";
                String password = "";

                if (value.length >= 4) {
                    email = value[2];
                    password = value[1];
                }
                if (inputemail.equals(email) && inputpassword.equals(password)) {
                    loginsuccess = true;
                    break; 
                }
            }
            br_user.close();
            
            
            
            if(!loginsuccess){
            BufferedReader br_admin = new BufferedReader(new FileReader("src/datacsv/Fileadmin.csv"));
            String adminuser;
            br_admin.readLine();

               
            while ((adminuser = br_admin.readLine()) != null) {
                String[] value = adminuser.split(",");

                String emailadmin = "";
                String password = "";

                if (value.length >= 2) {
                    emailadmin = value[0];
                    password = value[1];
                }
                if (inputemail.equals(emailadmin) && inputpassword.equals(password)) {             
                    isadmin = true;
                    loginsuccess = true;
                    break; 
                }
 
            }
            br_admin.close();
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        

        if (loginsuccess) {
             if (isadmin) {
                JOptionPane.showMessageDialog(this, "Admin Login Successful!");
                Admin adminpage = new Admin();
                adminpage.setVisible(true);
                this.dispose();
            } else {   
                JOptionPane.showMessageDialog(this, "Login Successful!");
                rice ricePage = new rice();
                ricePage.setVisible(true);
                this.dispose();
            }
    } else {
        JOptionPane.showMessageDialog(this, "Invalid Email or Password!");
    }
   }

        
                                               

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Signup signupPage2 = new Signup();
        signupPage2.setVisible(true);
        this.dispose();
    }                                        

    private void emailloginActionPerformed(java.awt.event.ActionEvent evt) {                                           
       
    }                                          


    // Variables declaration - do not modify                     
    private javax.swing.JTextField emaillogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
   
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginbutton;
    private javax.swing.JPasswordField passwordlogin;
    // End of variables declaration                   
}
