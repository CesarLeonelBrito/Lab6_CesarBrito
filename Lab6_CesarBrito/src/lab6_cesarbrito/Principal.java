/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_cesarbrito;

import javax.swing.JOptionPane;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author cesar
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_signup = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tf_apellido = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tf_nacionalidad = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_trabajo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tf_password = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tf_dinero = new javax.swing.JTextField();
        agregar_persona = new javax.swing.JButton();
        jd_login = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jd_tree = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        jd_carro = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        tf_vin = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tf_marca = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tf_modelo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tf_carroceria = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tf_pasajeros = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tf_maletero = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tf_color = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tf_precio = new javax.swing.JTextField();
        agregar_auto = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        tf_potencia = new javax.swing.JTextField();
        jd_admin = new javax.swing.JDialog();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jd_joined = new javax.swing.JDialog();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel14.setText("ID:");

        jLabel15.setText("Nombre:");

        jLabel16.setText("Apellido:");

        jLabel17.setText("Nacionalidad:");

        jLabel18.setText("Trabajo:");

        jLabel19.setText("Usuario:");

        jLabel20.setText("Contrase??a:");

        jLabel21.setText("Dinero:");

        agregar_persona.setText("Agregar");
        agregar_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_personaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_signupLayout = new javax.swing.GroupLayout(jd_signup.getContentPane());
        jd_signup.getContentPane().setLayout(jd_signupLayout);
        jd_signupLayout.setHorizontalGroup(
            jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_signupLayout.createSequentialGroup()
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_signupLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_id, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                            .addComponent(tf_nombre)
                            .addComponent(tf_apellido)
                            .addComponent(tf_nacionalidad)
                            .addComponent(tf_trabajo)
                            .addComponent(tf_usuario)
                            .addComponent(tf_password)
                            .addComponent(tf_dinero)))
                    .addGroup(jd_signupLayout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(agregar_persona)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jd_signupLayout.setVerticalGroup(
            jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_signupLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tf_dinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(agregar_persona)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contrase??a:");

        jButton3.setText("LogIn");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user)
                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)))
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jButton3)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jButton3)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(arbol);

        javax.swing.GroupLayout jd_treeLayout = new javax.swing.GroupLayout(jd_tree.getContentPane());
        jd_tree.getContentPane().setLayout(jd_treeLayout);
        jd_treeLayout.setHorizontalGroup(
            jd_treeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_treeLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jd_treeLayout.setVerticalGroup(
            jd_treeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_treeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel22.setText("VIN:");

        jLabel23.setText("Marca:");

        jLabel24.setText("Modelo:");

        jLabel25.setText("Carroceria:");

        tf_carroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_carroceriaActionPerformed(evt);
            }
        });

        jLabel26.setText("Pasajeros:");

        jLabel27.setText("Maletero:");

        jLabel28.setText("Color:");

        jLabel29.setText("Potencia:");

        agregar_auto.setText("Agregar");
        agregar_auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_autoActionPerformed(evt);
            }
        });

        jLabel30.setText("Precio:");

        javax.swing.GroupLayout jd_carroLayout = new javax.swing.GroupLayout(jd_carro.getContentPane());
        jd_carro.getContentPane().setLayout(jd_carroLayout);
        jd_carroLayout.setHorizontalGroup(
            jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_carroLayout.createSequentialGroup()
                .addGroup(jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_carroLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_vin, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                            .addComponent(tf_marca)
                            .addComponent(tf_modelo)
                            .addComponent(tf_carroceria)
                            .addComponent(tf_pasajeros)
                            .addComponent(tf_maletero)
                            .addComponent(tf_color)
                            .addComponent(tf_precio)
                            .addComponent(tf_potencia)))
                    .addGroup(jd_carroLayout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(agregar_auto)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jd_carroLayout.setVerticalGroup(
            jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_carroLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tf_vin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tf_carroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_pasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf_maletero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tf_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jd_carroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(tf_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(agregar_auto)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jButton4.setText("Ver Clientes");

        jButton5.setText("Agregar Carro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_adminLayout = new javax.swing.GroupLayout(jd_admin.getContentPane());
        jd_admin.getContentPane().setLayout(jd_adminLayout);
        jd_adminLayout.setHorizontalGroup(
            jd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_adminLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(jd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jd_adminLayout.setVerticalGroup(
            jd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_adminLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton4)
                .addGap(58, 58, 58)
                .addComponent(jButton5)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jButton6.setText("Carros Disponibles");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Comprar Carro");

        jButton8.setText("Mis Carros");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_joinedLayout = new javax.swing.GroupLayout(jd_joined.getContentPane());
        jd_joined.getContentPane().setLayout(jd_joinedLayout);
        jd_joinedLayout.setHorizontalGroup(
            jd_joinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_joinedLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jd_joinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jd_joinedLayout.setVerticalGroup(
            jd_joinedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_joinedLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Sign In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_personaActionPerformed
        // TODO add your handling code here:
        try {
            String trabajo = tf_trabajo.getText();
            String nombre = tf_nombre.getText();
            String apellido = tf_apellido.getText();
            String nacionalidad = tf_nacionalidad.getText();
            String usuario = tf_usuario.getText();
            String password = tf_password.getText();
            int id = Integer.parseInt(tf_id.getText());
            int dinero = Integer.parseInt(tf_dinero.getText());
            tf_id.setText("");
            tf_nombre.setText("");
            tf_apellido.setText("");
            tf_nacionalidad.setText("");
            tf_usuario.setText("");
            tf_password.setText("");
            tf_trabajo.setText("");
            tf_dinero.setText("");
            administrarPersonas ap = new administrarPersonas("./personas.txt");
            ap.cargarArchivo();
            Cliente p = new Cliente(id, nombre, apellido, nacionalidad, trabajo, usuario, password, dinero);
            ap.getListaPersonas().add(p);
            ap.escribirArchivo();

            DefaultTreeModel m = (DefaultTreeModel) arbol.getModel();
            JOptionPane.showMessageDialog(this, "Se ha agregado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
    }//GEN-LAST:event_agregar_personaActionPerformed

    private void agregar_autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_autoActionPerformed
        // TODO add your handling code here:
        try {
            String marca = tf_marca.getText();
            String modelo = tf_modelo.getText();
            String carroceria = tf_carroceria.getText();
            String pasajeros = tf_pasajeros.getText();
            String color = tf_color.getText();
            int vin = Integer.parseInt(tf_vin.getText());
            int maletero = Integer.parseInt(tf_maletero.getText());
            int precio = Integer.parseInt(tf_precio.getText());
            int potencia = Integer.parseInt(tf_potencia.getText());
            tf_marca.setText("");
            tf_modelo.setText("");
            tf_carroceria.setText("");
            tf_pasajeros.setText("");
            tf_color.setText("");
            tf_vin.setText("");
            tf_maletero.setText("");
            tf_precio.setText("");
            tf_potencia.setText("");
            administrarCarros ap = new administrarCarros("./carros.txt");
            ap.cargarArchivo();
            Auto p = new Auto(vin, marca, modelo, carroceria, pasajeros, maletero, color, precio, potencia);
            ap.getListaCarros().add(p);
            ap.escribirArchivo();

            DefaultTreeModel m = (DefaultTreeModel) arbol.getModel();
            JOptionPane.showMessageDialog(this, "Se ha agregado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
    }//GEN-LAST:event_agregar_autoActionPerformed

    private void tf_carroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_carroceriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_carroceriaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jd_signup.setModal(true);
        jd_signup.pack();
        jd_signup.setLocationRelativeTo(this);
        jd_signup.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        try {
            int aux = 0;
            administrarPersonas ap = new administrarPersonas("./personas.txt");
            ap.cargarArchivo();

            for (Cliente t : ap.getListaPersonas()) {
                if (t.getUsuario().equals(user.getText()) && t.getPassword().equals(pass.getText())) {
                    aux = 1;
                    persona = t;
                }
            }
            if (user.getText().equals("admin") && pass.getText().equals("admin")) {
                jd_admin.setModal(true);
                jd_admin.pack();
                jd_admin.setLocationRelativeTo(this);
                jd_admin.setVisible(true);
                jd_login.setVisible(false);
            } else if (aux == 1) {
                jd_joined.setModal(true);
                jd_joined.pack();
                jd_joined.setLocationRelativeTo(this);
                jd_joined.setVisible(true);
                jd_login.setVisible(false);
                //persona
            } else {
                JOptionPane.showMessageDialog(this, "No se encontro el usuario");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jd_login.setModal(true);
        jd_login.pack();
        jd_login.setLocationRelativeTo(this);
        jd_login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // carro
        jd_carro.setModal(true);
        jd_carro.pack();
        jd_carro.setLocationRelativeTo(this);
        jd_carro.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        administrarCarros ap = new administrarCarros("./carros.txt");
        ap.cargarArchivo();
        String acum = "";
        for (Auto t : ap.getListaCarros()) {
            acum += ap.getListaCarros().indexOf(t) + " " + t;
            acum += "\n";
        }
        JOptionPane.showMessageDialog(this, acum);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        administrarCarros ap = new administrarCarros("./carros.txt");
        ap.cargarArchivo();
        String acum = "";
        for (int i = 0; i < persona.getCarros().size(); i++) {
            acum += i + persona.getCarros().get(i).getVin();
            acum += "\n";
        }
        JOptionPane.showMessageDialog(this, acum);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_auto;
    private javax.swing.JButton agregar_persona;
    private javax.swing.JTree arbol;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jd_admin;
    private javax.swing.JDialog jd_carro;
    private javax.swing.JDialog jd_joined;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_signup;
    private javax.swing.JDialog jd_tree;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_carroceria;
    private javax.swing.JTextField tf_color;
    private javax.swing.JTextField tf_dinero;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_maletero;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_modelo;
    private javax.swing.JTextField tf_nacionalidad;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_pasajeros;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_potencia;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_trabajo;
    private javax.swing.JTextField tf_usuario;
    private javax.swing.JTextField tf_vin;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
    Cliente persona;
}
