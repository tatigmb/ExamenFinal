/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.Presentacion;

import java.awt.Color;

/**
 *
 * @author Dell-Latitude
 */
public class MenuRegistros extends javax.swing.JFrame {

    /**
     * Creates new form MenuRegistros
     */
    public MenuRegistros() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonNwRegis = new javax.swing.JButton();
        jButtonMyEregis = new javax.swing.JButton();
        jButtonsalirP = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel1.setText("Menú de Registros");

        jButtonNwRegis.setText("Nuevo Registro");
        jButtonNwRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNwRegisMouseClicked(evt);
            }
        });

        jButtonMyEregis.setText("Modificar y Eliminar Registros");
        jButtonMyEregis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMyEregisMouseClicked(evt);
            }
        });
        jButtonMyEregis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyEregisActionPerformed(evt);
            }
        });

        jButtonsalirP.setBackground(new java.awt.Color(255, 102, 102));
        jButtonsalirP.setText("Salir");
        jButtonsalirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsalirPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonsalirP)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonMyEregis, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(jButtonNwRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jButtonNwRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonMyEregis, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButtonsalirP)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMyEregisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyEregisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMyEregisActionPerformed

    private void jButtonNwRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNwRegisMouseClicked
       nuevoRegistro newRegistro = new nuevoRegistro();
        newRegistro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonNwRegisMouseClicked

    private void jButtonMyEregisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMyEregisMouseClicked
        menuActualizacion actualizar = new menuActualizacion();
        actualizar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMyEregisMouseClicked

    private void jButtonsalirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalirPActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButtonsalirPActionPerformed

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
            java.util.logging.Logger.getLogger(MenuRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRegistros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonMyEregis;
    private javax.swing.JButton jButtonNwRegis;
    private javax.swing.JButton jButtonsalirP;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
