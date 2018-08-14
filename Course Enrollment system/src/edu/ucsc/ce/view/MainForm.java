/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.view;

import edu.ucsc.ce.controllers.UserController;
import edu.ucsc.ce.models.User;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jinadi
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomeForm
     */
    //AdminHomeForm adminHomeForm=new AdminHomeForm();
    JFrame c;
    int mouseClc;

    public MainForm() {
        initComponents();
        jPanel3.setBackground(new Color(0, 0, 0, 102));
        setLocationRelativeTo(null);
        // enchan();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblUser1 = new javax.swing.JLabel();
        panelUser = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        lblDele1 = new javax.swing.JLabel();
        panelDeleteUser = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Settings");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 90, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Student");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 120, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Lecture");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 110, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Instructor");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 130, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Result");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 110, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Subject");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 110, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Payments");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 120, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1000, 80));
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1000, 260));

        lblUser1.setBackground(new java.awt.Color(51, 51, 51));
        lblUser1.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        lblUser1.setForeground(new java.awt.Color(51, 51, 51));
        lblUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser1.setText("new user");
        lblUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUser1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUser1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUser1MouseExited(evt);
            }
        });
        jPanel2.add(lblUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 660, 130, -1));

        panelUser.setBackground(new java.awt.Color(102, 102, 102));
        panelUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelUserMouseEntered(evt);
            }
        });
        panelUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel54MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel54MouseReleased(evt);
            }
        });
        panelUser.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 135, -1, 20));

        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel53MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel53MouseReleased(evt);
            }
        });
        panelUser.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 93, -1, 20));

        jLabel47.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("re-enter password");
        panelUser.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 50));

        jLabel48.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("username");
        panelUser.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 50));

        jLabel46.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("name");
        panelUser.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 30));

        jLabel49.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("password");
        panelUser.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 50));

        jPasswordField2.setFont(new java.awt.Font("Raleway Light", 0, 15)); // NOI18N
        jPasswordField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        panelUser.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, 30));

        jPasswordField1.setFont(new java.awt.Font("Raleway Light", 0, 15)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        panelUser.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 150, 30));

        jTextField2.setFont(new java.awt.Font("Raleway Light", 0, 15)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelUser.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 100, 30));

        jTextField3.setFont(new java.awt.Font("Raleway Light", 0, 15)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        panelUser.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 100, 30));

        jTextField4.setFont(new java.awt.Font("Raleway Light", 0, 15)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        panelUser.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 150, 30));

        jTextField1.setFont(new java.awt.Font("Raleway Light", 0, 15)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelUser.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 150, 30));

        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel51MouseExited(evt);
            }
        });
        panelUser.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 50, 60));

        jLabel52.setFont(new java.awt.Font("Raleway Thin", 0, 18)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("X");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel52MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel52MouseExited(evt);
            }
        });
        panelUser.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 40, 40));

        jPanel2.add(panelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 350, 230));

        lblDele1.setBackground(new java.awt.Color(51, 51, 51));
        lblDele1.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        lblDele1.setForeground(new java.awt.Color(51, 51, 51));
        lblDele1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDele1.setText("delete user");
        lblDele1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDele1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDele1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDele1MouseExited(evt);
            }
        });
        jPanel2.add(lblDele1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 160, -1));

        panelDeleteUser.setBackground(new java.awt.Color(102, 102, 102));
        panelDeleteUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDeleteUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("username");
        panelDeleteUser.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtUser.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        panelDeleteUser.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 180, 30));

        jLabel60.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("delete");
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel60MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel60MouseExited(evt);
            }
        });
        panelDeleteUser.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 100, 30));

        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        panelDeleteUser.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 30));

        jPanel2.add(panelDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 340, 120));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel3.setText("X");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 20, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel4.setText("_");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, -20, 30, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ucsc/ce/images/background-xx.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUser1MouseClicked

        mouseClc++;
        if (mouseClc % 2 == 0) {
            panelUser.setVisible(false);
        } else {
            panelUser.setVisible(true);
        }
    }//GEN-LAST:event_lblUser1MouseClicked

    private void lblUser1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUser1MouseEntered
        lblUser1.setFont(new java.awt.Font("Raleway Thin", 1, 24)); // NOI18N
    }//GEN-LAST:event_lblUser1MouseEntered

    private void lblUser1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUser1MouseExited
        lblUser1.setFont(new java.awt.Font("Raleway Light", 0, 24));
    }//GEN-LAST:event_lblUser1MouseExited

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked

    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel54MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MousePressed
        jTextField3.setText(jPasswordField2.getText().toString());
        jTextField3.setVisible(true);
        jPasswordField2.requestFocus();
        jPasswordField2.setVisible(false);
    }//GEN-LAST:event_jLabel54MousePressed

    private void jLabel54MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseReleased
        jTextField3.setText(jPasswordField2.getText().toString());
        jTextField3.setVisible(false);
        jPasswordField2.setVisible(true);
        jPasswordField2.requestFocus();
    }//GEN-LAST:event_jLabel54MouseReleased

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked

    }//GEN-LAST:event_jLabel53MouseClicked

    private void jLabel53MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MousePressed
        jTextField2.setText(jPasswordField1.getText().toString());
        jTextField2.setVisible(true);
        jPasswordField1.requestFocus();
        jPasswordField1.setVisible(false);
    }//GEN-LAST:event_jLabel53MousePressed

    private void jLabel53MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseReleased
        jTextField2.setText(jPasswordField1.getText().toString());
        jTextField2.setVisible(false);
        jPasswordField1.setVisible(true);
        jPasswordField1.requestFocus();
    }//GEN-LAST:event_jLabel53MouseReleased

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        try {
            boolean rst = UserController.checkValidity(jTextField4.getText());
            if (rst == true) {
                jTextField3.setText(jPasswordField2.getText().toString());
                boolean res;
                String temp1 = jPasswordField1.getText().toString();
                String temp2 = jPasswordField2.getText().toString();
                if (temp1.equals(temp2) & !"".equals(jTextField1.getText()) & !"".equals(jTextField4.getText()) & !"".equals(jPasswordField1.getText().toString())) {
                    try {
                        User user = new User(jTextField4.getText(), jTextField1.getText(), jPasswordField1.getText().toString());
                        res = UserController.addNewUser(user);
                        if (res == true & !"".equals(jTextField1.getText()) & !"".equals(jTextField4.getText()) & !"".equals(jPasswordField1.getText().toString())) {

                            JOptionPane.showMessageDialog(this, "Added success !");
                        } else {
                            JOptionPane.showMessageDialog(this, "failed adding user", "saving error", 0);
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(MainForm.this, "invalid entry", "error", 0);
                }
            } else {
                JOptionPane.showMessageDialog(this, "User Name already exists");
            }
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        jPasswordField2.requestFocus();
        jTextField2.setText(jPasswordField1.getText().toString());
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        try {
            boolean rst = UserController.checkValidity(jTextField4.getText());
            if (rst == true) {
                jPasswordField1.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "User Name already exists");
            }
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jTextField4.requestFocus();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked

        try {
            boolean rst = UserController.checkValidity(jTextField4.getText());
            if (rst == true) {
                boolean res;
                String temp1 = jPasswordField1.getText().toString();
                String temp2 = jPasswordField2.getText().toString();
                if (temp1.equals(temp2) & !"".equals(jTextField1.getText()) & !"".equals(jTextField4.getText()) & !"".equals(jPasswordField1.getText().toString())) {
                    try {
                        User user = new User(jTextField4.getText(), jTextField1.getText(), jPasswordField1.getText().toString());
                        System.out.println("pw" + jPasswordField1.getText().toString());
                        res = UserController.addNewUser(user);
                        if (res == true) {

                            JOptionPane.showMessageDialog(this, "Added success !");

                        } else {
                            JOptionPane.showMessageDialog(MainForm.this, "failed adding user", "saving error", 0);
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(MainForm.this, "invalid entry", "error", 0);

                }
            } else {
                JOptionPane.showMessageDialog(this, "User Name already exists");
            }
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseExited

    }//GEN-LAST:event_jLabel51MouseExited

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        panelUser.setVisible(false);
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jLabel52MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseEntered
        jLabel52.setFont(new Font("Raleway Thin", 1, 18));
    }//GEN-LAST:event_jLabel52MouseEntered

    private void jLabel52MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseExited
        jLabel52.setFont(new Font("Raleway Thin", 0, 18));
    }//GEN-LAST:event_jLabel52MouseExited

    private void panelUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUserMouseEntered

    }//GEN-LAST:event_panelUserMouseEntered

    private void lblDele1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDele1MouseClicked

        mouseClc++;
        if (mouseClc % 2 == 0) {
            panelDeleteUser.setVisible(false);
        } else {
            panelDeleteUser.setVisible(true);
        }

    }//GEN-LAST:event_lblDele1MouseClicked

    private void lblDele1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDele1MouseEntered
        lblDele1.setFont(new java.awt.Font("Raleway Thin", 1, 24));
    }//GEN-LAST:event_lblDele1MouseEntered

    private void lblDele1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDele1MouseExited
        lblDele1.setFont(new java.awt.Font("Raleway Light", 0, 24));
    }//GEN-LAST:event_lblDele1MouseExited

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        String user = txtUser.getText();
        try {
            if ("admin".equals(user)) {
                JOptionPane.showMessageDialog(MainForm.this, " you cannot delete administrator user account ", "error", 0);
            } else {
                boolean rst = UserController.searchUser(txtUser.getText());
                if (rst == true) {
                    JOptionPane.showMessageDialog(this, "User found");
                } else {
                    JOptionPane.showMessageDialog(MainForm.this, "invalid user name", "error", 0);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {

        }
    }//GEN-LAST:event_txtUserActionPerformed

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
        try {
            String user = txtUser.getText();
            if ("admin".equals(user)) {
                JOptionPane.showMessageDialog(MainForm.this, " you cannot delete administrator user account ", "error", 0);
                txtUser.setText("");
            } else {
                boolean rst = UserController.searchUser(txtUser.getText());
                if (rst == true) {
                    boolean res = UserController.deleteUser(txtUser.getText());
                    JOptionPane.showMessageDialog(this, "User deleted");
                } else {
                    JOptionPane.showMessageDialog(MainForm.this, "invalid user name", "error", 0);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {

        }
    }//GEN-LAST:event_jLabel60MouseClicked

    private void jLabel60MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseEntered
        jLabel60.setFont(new Font("Raleway Light", 1, 18));
    }//GEN-LAST:event_jLabel60MouseEntered

    private void jLabel60MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseExited
        jLabel60.setFont(new Font("Raleway Light", 0, 18));
    }//GEN-LAST:event_jLabel60MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        try {
            boolean rst = UserController.searchUser(txtUser.getText());
            if (rst == true) {
                JOptionPane.showMessageDialog(this, "User found");
            } else {
                JOptionPane.showMessageDialog(MainForm.this, "invalid user name", "error", 0);
            }
        } catch (SQLException | ClassNotFoundException ex) {

        }
    }//GEN-LAST:event_jLabel11MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminHomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblDele1;
    private javax.swing.JLabel lblUser1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JPanel panelDeleteUser;
    private javax.swing.JPanel panelUser;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void enchan() {

    }
}