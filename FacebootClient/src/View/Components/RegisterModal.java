/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Components;

import Faceboot.App;
import FacebootNet.Packets.Server.SOauthPacket;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author orlandocamacho
 */
public class RegisterModal extends javax.swing.JDialog {

    ButtonGroup group = new ButtonGroup();
    private SOauthPacket oauth;
    
    /**
     * Creates new form RegisterModal
     * @param parent
     * @param modal
     */
    public RegisterModal(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        
        this.setUndecorated(true);
        super.setUndecorated(true);
        
        setShape(new RoundRectangle2D.Double(0, 0, 430, 641,22,22));
        initComponents();
        
        new TextPrompt("Nombre", name);
        new TextPrompt("Apellido", lastname);
        new TextPrompt("Correo electrónico", email);
        new TextPrompt("Telefono", phone);
        new TextPrompt("Contraseña", password1);
        new TextPrompt("Confirmar contraseña", confirmPassword);
        
        setLocationRelativeTo(null);

        male.setActionCommand("male");
        female.setActionCommand("female");
        personalized.setActionCommand("Personalized");
        
        group.add(male);
        group.add(female);
        group.add(personalized);
        personalized.setSelected(true);
        
        comboboxSetInvisible();
        
        Date date = new Date();
        int year = date.getYear() - 1;
        int month = date.getMonth();
        int day = date.getDate() - 1;
        
        fillComboBoxDay(month+1, year+1901);
        fillComboBoxMonthYear();
        cDay.setSelectedIndex(day);
        cMonth.setSelectedIndex(month);
        cYear.setSelectedIndex(year);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedPanel = new View.Components.RoundedPanel();
        register = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        isfast = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        containerName80 = new View.Components.RoundedPanel();
        cYear = new javax.swing.JComboBox<>();
        containerName81 = new View.Components.RoundedPanel();
        female = new javax.swing.JRadioButton();
        containerName82 = new View.Components.RoundedPanel();
        personalized = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        containerName83 = new View.Components.RoundedPanel();
        cDay = new javax.swing.JComboBox<>();
        containerName84 = new View.Components.RoundedPanel();
        cMonth = new javax.swing.JComboBox<>();
        containerName85 = new View.Components.RoundedPanel();
        male = new javax.swing.JRadioButton();
        containerBtn12 = new View.Components.RoundedPanel();
        signUp = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        containerName86 = new View.Components.RoundedPanel();
        phone = new javax.swing.JTextField();
        containerName1 = new View.Components.RoundedPanel();
        lastname = new javax.swing.JTextField();
        containerName2 = new View.Components.RoundedPanel();
        email = new javax.swing.JTextField();
        containerName = new View.Components.RoundedPanel();
        name = new javax.swing.JTextField();
        containerName88 = new View.Components.RoundedPanel();
        password1 = new javax.swing.JPasswordField();
        containerName87 = new View.Components.RoundedPanel();
        confirmPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        roundedPanel.setBackground(new java.awt.Color(35, 36, 37));
        roundedPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Registrarte");
        roundedPanel.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/x.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closecloseMousePressed(evt);
            }
        });
        roundedPanel.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        isfast.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        isfast.setForeground(new java.awt.Color(255, 255, 255));
        isfast.setText("Es rápido y fácil.");
        roundedPanel.add(isfast, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 62, -1, 20));

        jLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setText("<html>\nAl hacer clic en \"Registrarte\", aceptas nuestras Condiciones, la Política de\ndatos y la Política de cookies. Es posible que te enviemos notificaciones por \nSMS, que puedes desactivar cuando quieras.\n</html>"); // NOI18N
        roundedPanel.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 390, 40));
        roundedPanel.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 430, 10));

        containerName80.setBackground(new java.awt.Color(58, 59, 60));
        containerName80.setToolTipText("Correo electrónico");
        containerName80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cYear.setBackground(new java.awt.Color(58, 59, 60));
        cYear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cYear.setForeground(new java.awt.Color(204, 204, 204));
        cYear.setMaximumRowCount(10);
        cYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cYear.setBorder(null);
        cYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cYearActionPerformed(evt);
            }
        });
        containerName80.add(cYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 40));

        roundedPanel.add(containerName80, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 120, 40));

        containerName81.setBackground(new java.awt.Color(58, 59, 60));
        containerName81.setToolTipText("Correo electrónico");
        containerName81.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        female.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        female.setForeground(new java.awt.Color(204, 204, 204));
        female.setText("Mujer");
        female.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        female.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        female.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/RadioButton.png"))); // NOI18N
        female.setIconTextGap(25);
        female.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/RadioButtonHover.png"))); // NOI18N
        female.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/RadioButtonSelected.png"))); // NOI18N
        containerName81.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 40));
        female.getAccessibleContext().setAccessibleName("Female");

        roundedPanel.add(containerName81, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 100, 40));

        containerName82.setBackground(new java.awt.Color(58, 59, 60));
        containerName82.setToolTipText("Correo electrónico");
        containerName82.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personalized.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        personalized.setForeground(new java.awt.Color(204, 204, 204));
        personalized.setText("Personalizado");
        personalized.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        personalized.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        personalized.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/RadioButton.png"))); // NOI18N
        personalized.setIconTextGap(21);
        personalized.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/RadioButtonHover.png"))); // NOI18N
        personalized.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/RadioButtonSelected.png"))); // NOI18N
        containerName82.add(personalized, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));
        personalized.getAccessibleContext().setAccessibleName("Perzonalized");

        roundedPanel.add(containerName82, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 150, 40));

        jLabel35.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Sexo");
        roundedPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        containerName83.setBackground(new java.awt.Color(58, 59, 60));
        containerName83.setToolTipText("Correo electrónico");
        containerName83.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cDay.setBackground(new java.awt.Color(58, 59, 60));
        cDay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cDay.setForeground(new java.awt.Color(204, 204, 204));
        cDay.setMaximumRowCount(12);
        cDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cDay.setBorder(null);
        containerName83.add(cDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 40));

        roundedPanel.add(containerName83, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 120, 40));

        containerName84.setBackground(new java.awt.Color(58, 59, 60));
        containerName84.setToolTipText("Correo electrónico");
        containerName84.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cMonth.setBackground(new java.awt.Color(58, 59, 60));
        cMonth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cMonth.setForeground(new java.awt.Color(204, 204, 204));
        cMonth.setMaximumRowCount(10);
        cMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cMonth.setBorder(null);
        cMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMonthActionPerformed(evt);
            }
        });
        containerName84.add(cMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 40));

        roundedPanel.add(containerName84, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 130, 40));

        containerName85.setBackground(new java.awt.Color(58, 59, 60));
        containerName85.setToolTipText("Correo electrónico");
        containerName85.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        male.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        male.setForeground(new java.awt.Color(204, 204, 204));
        male.setText("Hombre");
        male.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        male.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        male.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/RadioButton.png"))); // NOI18N
        male.setIconTextGap(30);
        male.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/RadioButtonHover.png"))); // NOI18N
        male.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/RadioButtonSelected.png"))); // NOI18N
        containerName85.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 40));
        male.getAccessibleContext().setAccessibleName("Male");

        roundedPanel.add(containerName85, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 120, 40));

        containerBtn12.setBackground(new java.awt.Color(65, 183, 41));
        containerBtn12.setLayout(new java.awt.BorderLayout());

        signUp.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        signUp.setForeground(new java.awt.Color(255, 255, 255));
        signUp.setText("Registrarte");
        signUp.setContentAreaFilled(false);
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        containerBtn12.add(signUp, java.awt.BorderLayout.CENTER);

        roundedPanel.add(containerBtn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 190, 35));

        jLabel36.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Fecha de nacimiento");
        roundedPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        containerName86.setBackground(new java.awt.Color(58, 59, 60));
        containerName86.setToolTipText("Correo electrónico");

        phone.setBackground(new java.awt.Color(58, 59, 60));
        phone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(204, 204, 204));
        phone.setToolTipText("");
        phone.setBorder(null);
        phone.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneFocusLost(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout containerName86Layout = new javax.swing.GroupLayout(containerName86);
        containerName86.setLayout(containerName86Layout);
        containerName86Layout.setHorizontalGroup(
            containerName86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerName86Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        containerName86Layout.setVerticalGroup(
            containerName86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerName86Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundedPanel.add(containerName86, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 40));

        containerName1.setBackground(new java.awt.Color(58, 59, 60));
        containerName1.setToolTipText("Correo electrónico");

        lastname.setBackground(new java.awt.Color(58, 59, 60));
        lastname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lastname.setForeground(new java.awt.Color(204, 204, 204));
        lastname.setBorder(null);
        lastname.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastnameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout containerName1Layout = new javax.swing.GroupLayout(containerName1);
        containerName1.setLayout(containerName1Layout);
        containerName1Layout.setHorizontalGroup(
            containerName1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerName1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        containerName1Layout.setVerticalGroup(
            containerName1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerName1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lastname, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundedPanel.add(containerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 190, 40));

        containerName2.setBackground(new java.awt.Color(58, 59, 60));
        containerName2.setToolTipText("Correo electrónico");

        email.setBackground(new java.awt.Color(58, 59, 60));
        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(204, 204, 204));
        email.setToolTipText("");
        email.setBorder(null);
        email.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });

        javax.swing.GroupLayout containerName2Layout = new javax.swing.GroupLayout(containerName2);
        containerName2.setLayout(containerName2Layout);
        containerName2Layout.setHorizontalGroup(
            containerName2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerName2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        containerName2Layout.setVerticalGroup(
            containerName2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerName2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundedPanel.add(containerName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 390, 40));

        containerName.setBackground(new java.awt.Color(58, 59, 60));
        containerName.setToolTipText("Correo electrónico");

        name.setBackground(new java.awt.Color(58, 59, 60));
        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(204, 204, 204));
        name.setBorder(null);
        name.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout containerNameLayout = new javax.swing.GroupLayout(containerName);
        containerName.setLayout(containerNameLayout);
        containerNameLayout.setHorizontalGroup(
            containerNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerNameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        containerNameLayout.setVerticalGroup(
            containerNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundedPanel.add(containerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 40));

        containerName88.setBackground(new java.awt.Color(58, 59, 60));
        containerName88.setToolTipText("Correo electrónico");

        password1.setBackground(new java.awt.Color(58, 59, 60));
        password1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        password1.setForeground(new java.awt.Color(204, 204, 204));
        password1.setToolTipText("");
        password1.setBorder(null);
        password1.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        password1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password1passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password1passwordFocusLost(evt);
            }
        });

        javax.swing.GroupLayout containerName88Layout = new javax.swing.GroupLayout(containerName88);
        containerName88.setLayout(containerName88Layout);
        containerName88Layout.setHorizontalGroup(
            containerName88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerName88Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        containerName88Layout.setVerticalGroup(
            containerName88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerName88Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        roundedPanel.add(containerName88, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 390, -1));

        containerName87.setBackground(new java.awt.Color(58, 59, 60));
        containerName87.setToolTipText("Correo electrónico");

        confirmPassword.setBackground(new java.awt.Color(58, 59, 60));
        confirmPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        confirmPassword.setForeground(new java.awt.Color(204, 204, 204));
        confirmPassword.setToolTipText("");
        confirmPassword.setBorder(null);
        confirmPassword.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        confirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPasswordpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmPasswordpasswordFocusLost(evt);
            }
        });

        javax.swing.GroupLayout containerName87Layout = new javax.swing.GroupLayout(containerName87);
        containerName87.setLayout(containerName87Layout);
        containerName87Layout.setHorizontalGroup(
            containerName87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerName87Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(confirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        containerName87Layout.setVerticalGroup(
            containerName87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerName87Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundedPanel.add(containerName87, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 390, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closecloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closecloseMousePressed
        if (evt.getClickCount() >= 0) {
            this.dispose();
        }
    }//GEN-LAST:event_closecloseMousePressed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        
        String name = this.name.getText();
        String lastName = this.lastname.getText();
        String email = this.email.getText();
        String password = new String(this.password1.getPassword());
        String confirmPassword = new String(this.confirmPassword.getPassword());
        String phone = this.phone.getText();
        String birthday = this.cDay.getSelectedItem() + "/" + this.cMonth.getSelectedItem() + "/" + this.cYear.getSelectedItem();
        String gender = this.group.getSelection().getActionCommand();

        App.GetSingleton().RegisterController.AttemptRegister(name, lastName, email, phone, password, confirmPassword, birthday, gender, oauth);      
    }//GEN-LAST:event_signUpActionPerformed

     public void mapFields(SOauthPacket packet){
        name.setText(packet.FirstName);
        lastname.setText(packet.LastName);
        email.setText(packet.Email);
        password1.setText("");
        confirmPassword.setText("");
        phone.setText("");
        male.setSelected(false);
        female.setSelected(false);
        personalized.setSelected(false);
        if (packet.Gender.equals("male"))
            male.setSelected(true);
        else if (packet.Gender.equals("female"))
            female.setSelected(true);
        else
            personalized.setSelected(true);
        
        cDay.setSelectedIndex((int)packet.BirthDay - 1);
        cMonth.setSelectedIndex((int)packet.BirthMonth - 1);
        cYear.setSelectedIndex((int)packet.BirthYear - 1901);
        oauth = packet;
        revalidate();
    }
     
    private void lastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusGained
        lastname.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(37,119,241)));
    }//GEN-LAST:event_lastnameFocusGained

    private void lastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusLost
        lastname.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(58,59,60)));
    }//GEN-LAST:event_lastnameFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        email.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(37,119,241)));
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        email.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(58,59,60)));
    }//GEN-LAST:event_emailFocusLost

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        name.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(37,119,241)));
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        name.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(58,59,60)));
    }//GEN-LAST:event_nameFocusLost

    private void password1passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password1passwordFocusGained
        password1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(37,119,241)));
    }//GEN-LAST:event_password1passwordFocusGained

    private void password1passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password1passwordFocusLost
        password1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(58,59,60)));
    }//GEN-LAST:event_password1passwordFocusLost

    private void phoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneFocusGained
        phone.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(37,119,241)));
    }//GEN-LAST:event_phoneFocusGained

    private void phoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneFocusLost
        phone.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(58,59,60)));
    }//GEN-LAST:event_phoneFocusLost

    private void confirmPasswordpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordpasswordFocusGained
        confirmPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(37,119,241)));
    }//GEN-LAST:event_confirmPasswordpasswordFocusGained

    private void confirmPasswordpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordpasswordFocusLost
        confirmPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(58,59,60)));
    }//GEN-LAST:event_confirmPasswordpasswordFocusLost

    private void cMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMonthActionPerformed
        int month = Integer.parseInt((String) cMonth.getSelectedItem());
        int year = Integer.parseInt((String) cYear.getSelectedItem());
        
        int day = cDay.getSelectedIndex();
        
        fillComboBoxDay(month, year);
        
        if (day < cDay.getItemCount() - 1){
            cDay.setSelectedIndex(day);
        } else {
            cDay.setSelectedIndex(cDay.getItemCount() - 1);
        } 
    }//GEN-LAST:event_cMonthActionPerformed

    private void cYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cYearActionPerformed
        int month = Integer.parseInt((String) cMonth.getSelectedItem());
        int year = Integer.parseInt((String) cYear.getSelectedItem());
        
        int day = cDay.getSelectedIndex();
        
        fillComboBoxDay(month, year);
        
        if (day < cDay.getItemCount() - 1){
            cDay.setSelectedIndex(day);
        } else {
            cDay.setSelectedIndex(cDay.getItemCount() - 1);
        } 
    }//GEN-LAST:event_cYearActionPerformed

    private void phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (phone.getText().length() == 10)
            evt.consume();
    }//GEN-LAST:event_phoneKeyTyped

    private void comboboxSetInvisible(){
        cDay.setOpaque(false);
        cDay.setBackground(new Color(0,0,0,0));
        cDay.setForeground(Color.WHITE);
        cMonth.setOpaque(false);
        cMonth.setBackground(new Color(0,0,0,0));
        cYear.setOpaque(false);
        cYear.setBackground(new Color(0,0,0,0));
    }
    
    private void fillComboBoxDay(int month, int year){
        Calendar mycal = new GregorianCalendar(year, month, 0);
        int daysInMonth = mycal.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        ArrayList<String> days = new ArrayList<String>();
        
        for (int i = 0; i < daysInMonth; i++) {
            days.add(String.valueOf(i+1));
        }
        
        cDay.setModel(new DefaultComboBoxModel<String>(days.toArray(new String[0])));
    }
    
    private void fillComboBoxMonthYear(){
        ArrayList<String> months = new ArrayList<String>();
        ArrayList<String> years = new ArrayList<String>();
        
        for (int i = 0; i < 12; i++){
            months.add(String.valueOf(i+1));
        }
        
        Date date = new Date();
        int year = date.getYear();
        
        for (int i = 0; i < year ; i++){
            years.add(String.valueOf(i+1901));
        }
        
        cMonth.setModel(new DefaultComboBoxModel<String>(months.toArray(new String[0])));
        cYear.setModel(new DefaultComboBoxModel<String>(years.toArray(new String[0])));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cDay;
    private javax.swing.JComboBox<String> cMonth;
    private javax.swing.JComboBox<String> cYear;
    private javax.swing.JLabel close;
    private javax.swing.JPasswordField confirmPassword;
    public View.Components.RoundedPanel containerBtn12;
    private View.Components.RoundedPanel containerName;
    private View.Components.RoundedPanel containerName1;
    private View.Components.RoundedPanel containerName2;
    private View.Components.RoundedPanel containerName80;
    private View.Components.RoundedPanel containerName81;
    private View.Components.RoundedPanel containerName82;
    private View.Components.RoundedPanel containerName83;
    private View.Components.RoundedPanel containerName84;
    private View.Components.RoundedPanel containerName85;
    private View.Components.RoundedPanel containerName86;
    private View.Components.RoundedPanel containerName87;
    private View.Components.RoundedPanel containerName88;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel isfast;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JTextField lastname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password1;
    private javax.swing.JRadioButton personalized;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel register;
    private View.Components.RoundedPanel roundedPanel;
    private javax.swing.JButton signUp;
    // End of variables declaration//GEN-END:variables
}
