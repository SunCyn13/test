package UI_1_User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



public class Signup extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Signup.class.getName());

   
    public Signup() {
        initComponents();
        
        Mobilenumber.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            if (!Character.isDigit(c) || Mobilenumber.getText().length() >= 10) {
                evt.consume(); //  กันไม่ให้พิมพ์ถ้าไม่ใช่ตัวเลข หรือ เกิน 10 ตัว
            }
        }
    });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Mobilenumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        confirm_password = new javax.swing.JPasswordField();
        signup2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel2.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(420, 720));
        jPanel3.setLayout(null);

        login.setBackground(new java.awt.Color(217, 217, 217));
        login.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        login.setText("Log In");
        login.setBorderPainted(false);
        login.setFocusPainted(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel3.add(login);
        login.setBounds(100, 170, 210, 50);

        signup.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        signup.setText("Sign Up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel3.add(signup);
        signup.setBounds(100, 250, 210, 50);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 43)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 100));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CS Flavor");
        jLabel1.setOpaque(true);
        jPanel3.add(jLabel1);
        jLabel1.setBounds(90, 20, 230, 80);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 420, 720);

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));
        jPanel1.setPreferredSize(new java.awt.Dimension(860, 720));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Sign Up");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(380, 50, 140, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel3.setText("Email");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 120, 41, 24);

        Email.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Email.setPreferredSize(new java.awt.Dimension(67, 27));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel1.add(Email);
        Email.setBounds(280, 150, 320, 30);

        Name.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Name.setPreferredSize(new java.awt.Dimension(67, 27));
        jPanel1.add(Name);
        Name.setBounds(280, 240, 320, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setText("Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 210, 110, 24);

        Mobilenumber.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Mobilenumber.setPreferredSize(new java.awt.Dimension(67, 27));
        jPanel1.add(Mobilenumber);
        Mobilenumber.setBounds(280, 330, 320, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setText("Mobile Number");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 300, 120, 24);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(280, 390, 71, 24);
        jPanel1.add(Password);
        Password.setBounds(280, 420, 320, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel7.setText("Confirm Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(280, 480, 137, 24);

        confirm_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(confirm_password);
        confirm_password.setBounds(280, 510, 320, 30);

        signup2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signup2.setText("Sign Up");
        signup2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup2ActionPerformed(evt);
            }
        });
        jPanel1.add(signup2);
        signup2.setBounds(280, 600, 320, 40);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(420, 0, 860, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {                                      
        login loginPage = new login();
        loginPage.setVisible(true);
        this.dispose();

    }                                     

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Signup signupPage = new Signup();
        signupPage.setVisible(true);
        this.dispose();

    }                                      

    private void confirm_passwordActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

     private boolean hasLetter(String str) {
     for (int i = 0; i < str.length(); i++) {
     if (Character.isLetter(str.charAt(i))) {
        return true; // เจอตัวอักษร
     }
}
    return false; // ไม่มีตัวอักษร
}
    
    private void signup2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
    String username = Name.getText();
    String email = Email.getText();
    String mobilenumber = Mobilenumber.getText();
    String password = new String(Password.getPassword());
    String confirmpassword = new String(confirm_password.getPassword());

    if (username.isEmpty() || email.isEmpty() || mobilenumber.isEmpty() || password.isEmpty() || confirmpassword.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please fill in all fields!");
        return;
    }

    if (!password.equals(confirmpassword)) {
        javax.swing.JOptionPane.showMessageDialog(this, "Password and Confirm Password do not match!");
        return;
    }
    
    if (!hasLetter(username)) {
        javax.swing.JOptionPane.showMessageDialog(this, "Username must contain at least one letter!");
        return;
    }

 

    // เขียนข้อมูลลงไฟล์ CSV
    try (
        FileWriter fw = new FileWriter("src/datacsv/Fileuser.csv", true); // true = ไม่ลบของ
        BufferedWriter bw = new BufferedWriter(fw)
    ) {
        bw.write(username + "," + password + "," + email + "," + mobilenumber);
        bw.newLine(); //ขึ้นบรรทัดใหม่
        bw.flush(); //ส่งข้อมูลลงไฟล์ทันที
        javax.swing.JOptionPane.showMessageDialog(this, "Signup successful!");
    } catch (Exception e) {
        System.out.println(e);
        javax.swing.JOptionPane.showMessageDialog(this, "Error saving data!");
    }

    login loginPage = new login();
    loginPage.setVisible(true);
    this.dispose();
}                                       

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
    }                                     

    

    // Variables declaration - do not modify                     
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Mobilenumber;
    private javax.swing.JTextField Name;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPasswordField confirm_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login;
    private javax.swing.JButton signup;
    private javax.swing.JButton signup2;
    // End of variables declaration                   
}
