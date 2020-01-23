package UI;

import javax.swing.JOptionPane;

public class vtnPrincipal extends javax.swing.JFrame {

    public static void VerMensaje(String mensaje, String Titulo, int tipo) {
        JOptionPane.showMessageDialog(null, mensaje, Titulo, tipo);
    }

    public vtnPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniMatricula = new javax.swing.JMenuItem();
        mniCalificacion = new javax.swing.JMenuItem();
        mnuEstudiantes = new javax.swing.JMenu();
        mniNuevoEstudiante = new javax.swing.JMenuItem();
        mniReporteCalificaciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Matricula");

        mniMatricula.setText("Crear");
        mniMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMatriculaActionPerformed(evt);
            }
        });
        jMenu1.add(mniMatricula);

        mniCalificacion.setText("Calificar");
        mniCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCalificacionActionPerformed(evt);
            }
        });
        jMenu1.add(mniCalificacion);

        jMenuBar1.add(jMenu1);

        mnuEstudiantes.setText("Estudiantes");

        mniNuevoEstudiante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mniNuevoEstudiante.setText("Nuevo");
        mniNuevoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNuevoEstudianteActionPerformed(evt);
            }
        });
        mnuEstudiantes.add(mniNuevoEstudiante);

        mniReporteCalificaciones.setText("Reporte Calificaciones");
        mniReporteCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniReporteCalificacionesActionPerformed(evt);
            }
        });
        mnuEstudiantes.add(mniReporteCalificaciones);

        jMenuBar1.add(mnuEstudiantes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMatriculaActionPerformed
        frmRegistroMatricula frmMatricula = new frmRegistroMatricula();
        this.DesktopPane.add(frmMatricula);
        frmMatricula.show();
    }//GEN-LAST:event_mniMatriculaActionPerformed

    private void mniCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCalificacionActionPerformed
        frmRegistroCalificacion frmCalificacion = new frmRegistroCalificacion();
        this.DesktopPane.add(frmCalificacion);
        frmCalificacion.show();
    }//GEN-LAST:event_mniCalificacionActionPerformed

    private void mniNuevoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNuevoEstudianteActionPerformed
        frmRegistroEstudiante frmEstudiante = new frmRegistroEstudiante();
        this.DesktopPane.add(frmEstudiante);
        frmEstudiante.show();
    }//GEN-LAST:event_mniNuevoEstudianteActionPerformed

    private void mniReporteCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniReporteCalificacionesActionPerformed
        frmReporteCalificaciones frmReporte = new frmReporteCalificaciones();
        this.DesktopPane.add(frmReporte);
        frmReporte.show();
    }//GEN-LAST:event_mniReporteCalificacionesActionPerformed

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
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniCalificacion;
    private javax.swing.JMenuItem mniMatricula;
    private javax.swing.JMenuItem mniNuevoEstudiante;
    private javax.swing.JMenuItem mniReporteCalificaciones;
    private javax.swing.JMenu mnuEstudiantes;
    // End of variables declaration//GEN-END:variables
}
