/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.Presentacion;

import org.Infraestructure.Models.PersonaModel;
import org.Services.PersonaService;


/**
 *
 * @author Dell-Latitude
 */
public class modificacionPersona extends javax.swing.JFrame {
    private PersonaService persona1;
    /**
     * Creates new form modificacionPersona
     */
    public modificacionPersona() {
        initComponents();
        this.setLocationRelativeTo(null);
        persona1 = new PersonaService("postgres", "1234", "localhost", "5432", "optativo2");
    }
    private void consultarPersonas(String filtrarPor, String filtro) {
        switch (filtrarPor) {
            case "id" -> cargarDatos(persona1.consultarPorId(Integer.parseInt(filtro)));
        } 
        
    }
    
    private void cargarDatos(PersonaModel persona){
        idpersona.setText(String.valueOf(persona.getId_persona()));
        idciudad.setText(String.valueOf(persona.getId_ciudad()));
        nom.setText(persona.getNombre());
        ape.setText(persona.getApellido());
        tipodoc.setSelectedItem(persona.getTipoDocumento());
        documento.setText(persona.getNroDocumento());
        direc.setText(persona.getDireccion());
        ema.setText(persona.getEmail());
        celu.setText(persona.getCelular());
        estad.setSelectedItem(persona.getEstado());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipodoc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        direc = new javax.swing.JTextField();
        celu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ema = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        idciudad = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        estad = new javax.swing.JComboBox<>();
        idpersona = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ape = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        documento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tipodoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de identidad", "pasaporte" }));

        jLabel7.setText("Dirección:");

        jLabel8.setText("Celular:");

        direc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direcActionPerformed(evt);
            }
        });

        jLabel9.setText("Email:");

        jLabel10.setText("Estado Civil:");

        idciudad.setEditable(false);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel1.setText("Actualizacion y Busqueda de Personas");

        jLabel11.setText("Id Ciudad");

        jLabel2.setText("Id Persona:");

        estad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "soltero", "casado", "viudo" }));

        idpersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idpersonaKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        jLabel12.setText("Colocar el ID Persona del registro a utilizarse para realizar la busqueda y darle enter");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        ape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apeActionPerformed(evt);
            }
        });

        jLabel5.setText("Número de Documento");

        jLabel6.setText("Tipo de documento:");

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel12)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(documento)
                                        .addComponent(tipodoc, 0, 240, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(idpersona, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                        .addComponent(nom)
                                        .addComponent(ape)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Modificar)
                                            .addGap(30, 30, 30)
                                            .addComponent(eliminar)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(direc)
                                        .addComponent(celu)
                                        .addComponent(ema)
                                        .addComponent(idciudad)
                                        .addComponent(estad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(atras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salir)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(direc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(celu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(ema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(estad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(idciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(atras)
                    .addComponent(Modificar)
                    .addComponent(eliminar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void direcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direcActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void apeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apeActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        int id_persona = Integer.parseInt(idpersona.getText().trim());
        String nombre = nom.getText();
        String apellido = ape.getText();
        String tipoDocumento = tipodoc.getSelectedItem().toString();
        String nrodocumento = documento.getText().trim();
        String direccion = direc.getText();
        String celular = celu.getText();
        String email = ema.getText();
        String estado = estad.getSelectedItem().toString();
        
        PersonaModel personaActualizada = new PersonaModel();
        personaActualizada.setId_persona(id_persona);
        personaActualizada.setNombre(nombre);
        personaActualizada.setApellido(apellido);
        personaActualizada.setTipoDocumento(tipoDocumento);
        personaActualizada.setNroDocumento(nrodocumento);
        personaActualizada.setDireccion(direccion);
        personaActualizada.setCelular(celular);
        personaActualizada.setEmail(email);
        personaActualizada.setEstado(estado);
        persona1.modificarPersona(personaActualizada);
        
        idpersona.setText("");
        nom.setText("");
        ape.setText("");
        tipodoc.setSelectedIndex(0); 
        documento.setText("");
        direc.setText("");
        celu.setText("");
        ema.setText("");
        estad.setSelectedIndex(0);
        idpersona.setEditable(true);
                                          
    }//GEN-LAST:event_ModificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       int id_persona = Integer.parseInt(idpersona.getText().trim());
       persona1.eliminarPersona(id_persona);
       idpersona.setText("");
       nom.setText("");
       ape.setText("");
       tipodoc.setSelectedIndex(0); 
       documento.setText("");
       direc.setText("");
       celu.setText("");
       ema.setText("");
       estad.setSelectedIndex(0);
       idpersona.setEditable(true);
    }//GEN-LAST:event_eliminarActionPerformed

    private void idpersonaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idpersonaKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            consultarPersonas("id", idpersona.getText().trim());
            idpersona.setEditable(false);
            idciudad.setEditable(false);
        }
    }//GEN-LAST:event_idpersonaKeyPressed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
       menuActualizacion nuevo = new menuActualizacion();
      nuevo.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(modificacionPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificacionPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificacionPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificacionPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificacionPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField ape;
    private javax.swing.JButton atras;
    private javax.swing.JTextField celu;
    private javax.swing.JTextField direc;
    private javax.swing.JTextField documento;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField ema;
    private javax.swing.JComboBox<String> estad;
    private javax.swing.JTextField idciudad;
    private javax.swing.JTextField idpersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nom;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox<String> tipodoc;
    // End of variables declaration//GEN-END:variables
}