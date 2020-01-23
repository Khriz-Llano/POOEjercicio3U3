package UI;

import BLL.GestionMatricula;
import Llano.Util;
import java.io.IOException;
import javax.swing.JOptionPane;

public class frmRegistroCalificacion extends javax.swing.JInternalFrame {

    private final String Titulo = "Registro de Calificación";
    private GestionMatricula MatriculaBLL = new GestionMatricula();

    private boolean Validar() {
        float nota = (float) this.snnValor.getValue();
        if (nota == 0f) {
            vtnPrincipal.VerMensaje("Calificacion no válida", Titulo, JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void consultarMatricula() throws IOException {
        String numero = this.txtNMatricula.getText();
        MatriculaBLL.Consultar(numero);
        this.txtaDatosMatricula.setText(MatriculaBLL.Imprimir());
    }

    private String Calificar() throws IOException {
        float nota = (float) this.snnValor.getValue();
        String mensaje = MatriculaBLL.Calificar(nota);
        MatriculaBLL.Archivar();
        return mensaje;
    }

    public frmRegistroCalificacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        pnlDatosMatrícula = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDatosMatricula = new javax.swing.JTextArea();
        pnlCalificaciones = new javax.swing.JPanel();
        snnValor = new javax.swing.JSpinner();
        lblValor = new javax.swing.JLabel();
        pnlBuscarMatricula = new javax.swing.JPanel();
        lblNMatricula = new javax.swing.JLabel();
        txtNMatricula = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de Calificaciones");

        lblTitulo.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        lblTitulo.setForeground(java.awt.Color.red);
        lblTitulo.setText("Registro de Calificaciones");

        btnGuardar.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        btnGuardar.setForeground(java.awt.Color.blue);
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        pnlDatosMatrícula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Matrícula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 18))); // NOI18N
        pnlDatosMatrícula.setToolTipText("");

        txtaDatosMatricula.setColumns(20);
        txtaDatosMatricula.setRows(5);
        jScrollPane1.setViewportView(txtaDatosMatricula);

        pnlCalificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Calificaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 18))); // NOI18N

        snnValor.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(20.0f), Float.valueOf(0.01f)));

        lblValor.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        lblValor.setText("Valor:");

        javax.swing.GroupLayout pnlCalificacionesLayout = new javax.swing.GroupLayout(pnlCalificaciones);
        pnlCalificaciones.setLayout(pnlCalificacionesLayout);
        pnlCalificacionesLayout.setHorizontalGroup(
            pnlCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCalificacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblValor)
                .addGap(30, 30, 30)
                .addComponent(snnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        pnlCalificacionesLayout.setVerticalGroup(
            pnlCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalificacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(snnValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlDatosMatrículaLayout = new javax.swing.GroupLayout(pnlDatosMatrícula);
        pnlDatosMatrícula.setLayout(pnlDatosMatrículaLayout);
        pnlDatosMatrículaLayout.setHorizontalGroup(
            pnlDatosMatrículaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosMatrículaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosMatrículaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCalificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlDatosMatrículaLayout.setVerticalGroup(
            pnlDatosMatrículaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosMatrículaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCalificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBuscarMatricula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda de la Matricula", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 18))); // NOI18N

        lblNMatricula.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        lblNMatricula.setText("N° Matricula:");

        btnBuscar.setIcon(new javax.swing.ImageIcon("/home/labctr/Descargas/Buscar.png")); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscarMatriculaLayout = new javax.swing.GroupLayout(pnlBuscarMatricula);
        pnlBuscarMatricula.setLayout(pnlBuscarMatriculaLayout);
        pnlBuscarMatriculaLayout.setHorizontalGroup(
            pnlBuscarMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscarMatriculaLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(lblNMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(53, 53, 53))
        );
        pnlBuscarMatriculaLayout.setVerticalGroup(
            pnlBuscarMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarMatriculaLayout.createSequentialGroup()
                .addGroup(pnlBuscarMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addGroup(pnlBuscarMatriculaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(pnlBuscarMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNMatricula))))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pnlDatosMatrícula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pnlBuscarMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBuscarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDatosMatrícula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (Validar()) {
                String mensaje = this.Calificar();
                vtnPrincipal.VerMensaje(mensaje, Titulo, JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            Util.Imprimir("Errror: " + e.toString());
            vtnPrincipal.VerMensaje("Error al Crear la Matrícula", Titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            this.consultarMatricula();
            vtnPrincipal.VerMensaje("Busqueda correcta", Titulo, JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            Util.Imprimir("\nError" + e.toString() + "\n");
            vtnPrincipal.VerMensaje("Error al buscar Matrícula ", Titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNMatricula;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlBuscarMatricula;
    private javax.swing.JPanel pnlCalificaciones;
    private javax.swing.JPanel pnlDatosMatrícula;
    private javax.swing.JSpinner snnValor;
    private javax.swing.JTextField txtNMatricula;
    private javax.swing.JTextArea txtaDatosMatricula;
    // End of variables declaration//GEN-END:variables
}
