


import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joseluisllinaresanton
 */
public final class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("PhotoCrypt");
        Fichero.setVisible(false);
        BotonFichero.setVisible(false);
        jLabel2.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_subtitulo = new javax.swing.JLabel();
        boton_descifrar = new javax.swing.JButton();
        boton_cifrar = new javax.swing.JButton();
        lbl_propietarios = new javax.swing.JLabel();
        txt_imagen = new javax.swing.JTextField();
        boton_imagen = new javax.swing.JButton();
        logo_imagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        img_principal = new javax.swing.JLabel();
        Fichero = new javax.swing.JTextField();
        BotonFichero = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        jLabel1.setText("jLabel1");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lbl_subtitulo.setFont(new java.awt.Font("DejaVu Sans Light", 0, 20)); // NOI18N
        lbl_subtitulo.setForeground(new java.awt.Color(204, 204, 204));
        lbl_subtitulo.setText("Oculta mensajes cifrados en imagenes");

        boton_descifrar.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        boton_descifrar.setText("Descifrar ");
        boton_descifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_descifrarActionPerformed(evt);
            }
        });

        boton_cifrar.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        boton_cifrar.setText("Cifrar ");
        boton_cifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cifrarActionPerformed(evt);
            }
        });

        lbl_propietarios.setForeground(new java.awt.Color(204, 204, 204));
        lbl_propietarios.setText("by Toni & Joselu");

        txt_imagen.setBackground(new java.awt.Color(204, 204, 204));
        txt_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_imagenActionPerformed(evt);
            }
        });

        boton_imagen.setText("Abrir...");
        boton_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_imagenActionPerformed(evt);
            }
        });

        logo_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/photos13_1.png"))); // NOI18N

        img_principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logopc.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(img_principal)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(img_principal)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Fichero.setBackground(new java.awt.Color(204, 204, 204));
        Fichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FicheroActionPerformed(evt);
            }
        });

        BotonFichero.setText("Abrir...");
        BotonFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFicheroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Devanagari Sangam MN", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Fichero a esconder");

        jCheckBox1.setText("Esconder fichero");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boton_descifrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boton_cifrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(lbl_subtitulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(199, 199, 199)
                                        .addComponent(logo_imagen)
                                        .addGap(32, 32, 32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel2))
                                            .addComponent(txt_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addComponent(boton_imagen))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Fichero, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonFichero)))))
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_propietarios)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_subtitulo)
                .addGap(18, 18, 18)
                .addComponent(logo_imagen)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_imagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonFichero)
                    .addComponent(Fichero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_cifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_descifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lbl_propietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        {
            Fichero.setVisible(true);
            BotonFichero.setVisible(true);
        }
        else
        {
            Fichero.setVisible(false);
            Fichero.setText("");
            BotonFichero.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void BotonFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFicheroActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        boolean EsImagen = false;
        int returnValue = fileChooser.showOpenDialog(null);
        if(returnValue == JFileChooser.APPROVE_OPTION)
        {
            File selected = fileChooser.getSelectedFile();
            Fichero.setText(selected.getPath());
        }
    }//GEN-LAST:event_BotonFicheroActionPerformed

    private void FicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FicheroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FicheroActionPerformed

    private void boton_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_imagenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        boolean EsImagen = false;
        int returnValue = fileChooser.showOpenDialog(null);
        if(returnValue == JFileChooser.APPROVE_OPTION)
        {
            File selected = fileChooser.getSelectedFile();
            txt_imagen.setText(selected.getPath());
        }
    }//GEN-LAST:event_boton_imagenActionPerformed

    private void txt_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_imagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_imagenActionPerformed

    private void boton_cifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cifrarActionPerformed

        System.out.println(Fichero.getText());
        if(!Fichero.getText().isEmpty() && !txt_imagen.getText().isEmpty())
        {
            PantallaCifrarFichero pcf;
            try {
                pcf = new PantallaCifrarFichero(txt_imagen.getText(), Fichero.getText());
                pcf.setLocationRelativeTo(null);
                pcf.show();
            } catch (IOException ex) {
                Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else if(!txt_imagen.getText().isEmpty())
        {
            PantallaCifrado pi = new PantallaCifrado("cifrar", txt_imagen.getText());
            pi.setLocationRelativeTo(null);
            pi.show();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No hay una ruta Valida");
        }
    }//GEN-LAST:event_boton_cifrarActionPerformed

    private void boton_descifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_descifrarActionPerformed
        //TODO cambiar por pantallaDescifrar
        System.out.println(Fichero.getText());
        if(!Fichero.getText().isEmpty() && !txt_imagen.getText().isEmpty())
        {
            PantallaDescifrarFichero pcf;
            pcf = new PantallaDescifrarFichero(txt_imagen.getText());
            pcf.setLocationRelativeTo(null);
            pcf.show();

        }
        else if(!txt_imagen.getText().isEmpty())
        {
            PantallaDesencriptacion pi = new PantallaDesencriptacion(txt_imagen.getText());
            pi.setLocationRelativeTo(null);
            pi.show();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No hay una ruta Valida");
        }
    }//GEN-LAST:event_boton_descifrarActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFichero;
    private javax.swing.JTextField Fichero;
    private javax.swing.JButton boton_cifrar;
    private javax.swing.JButton boton_descifrar;
    private javax.swing.JButton boton_imagen;
    private javax.swing.JLabel img_principal;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_propietarios;
    private javax.swing.JLabel lbl_subtitulo;
    private javax.swing.JLabel logo_imagen;
    private javax.swing.JTextField txt_imagen;
    // End of variables declaration//GEN-END:variables
}
