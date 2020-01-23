package UI;

import BEU.Estudiante;
import BLL.GestionEstudiante;
import Llano.Util;
import java.io.IOException;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class frmRegistroEstudiante extends javax.swing.JInternalFrame {

    private final String Titulo = "Registro de estudiante";
    private GestionEstudiante EstudianteBLL = new GestionEstudiante();

    private void IniciarListado() throws IOException {
        EstudianteBLL.leerEstudiantes();
    }

    private String VerificarClub(JCheckBox chk) {
        if (chk.isSelected()) {
            return chk.getText();
        }
        return "";
    }

    private void CrearEstudiante() {
        Estudiante nuevo = new Estudiante();
        nuevo.setCedula(this.txtCedula.getText());
        nuevo.setNombre(this.txtNombres.getText());
        nuevo.setApellido(this.txtApellidos.getText());
        nuevo.setCarrrera(this.cmbCarerra.getSelectedItem().toString());
        nuevo.AddClub(this.VerificarClub(this.chkAjedrez));
        nuevo.AddClub(this.VerificarClub(this.chkBoxeo));
        nuevo.AddClub(this.VerificarClub(this.chkCine));
        nuevo.AddClub(this.VerificarClub(this.chkDanza));
        nuevo.AddClub(this.VerificarClub(this.chkFutbol));
        nuevo.AddClub(this.VerificarClub(this.chkMusica));
        nuevo.AddClub(this.VerificarClub(this.chkRobotica));
        nuevo.AddClub(this.VerificarClub(this.chkSoftware));
        nuevo.AddClub(this.VerificarClub(this.chkVolley));
        EstudianteBLL.getEstudiantes().add(nuevo);
    }

    private void Archivar() throws IOException {
        EstudianteBLL.Archivar();
    }

    public frmRegistroEstudiante() {
        initComponents();
        try {
            this.IniciarListado();
        } catch (IOException e) {
            Util.Imprimir(e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pnlDatosPersonales = new javax.swing.JPanel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        pnlDatosAcademicos = new javax.swing.JPanel();
        lblCarrera = new javax.swing.JLabel();
        cmbCarerra = new javax.swing.JComboBox<>();
        pnlDatosExtraCurriculares = new javax.swing.JPanel();
        chkDanza = new javax.swing.JCheckBox();
        chkCine = new javax.swing.JCheckBox();
        chkRobotica = new javax.swing.JCheckBox();
        chkMusica = new javax.swing.JCheckBox();
        chkVolley = new javax.swing.JCheckBox();
        chkAjedrez = new javax.swing.JCheckBox();
        chkSoftware = new javax.swing.JCheckBox();
        chkBoxeo = new javax.swing.JCheckBox();
        chkFutbol = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de Estudiante");

        lblTitulo.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        lblTitulo.setForeground(java.awt.Color.red);
        lblTitulo.setText("Registro de Calificaciones");

        pnlDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Personales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 18))); // NOI18N

        lblNombres.setText("Nombres:");

        lblApellidos.setText("Apellidos:");

        lblCedula.setText("Cedula:");

        javax.swing.GroupLayout pnlDatosPersonalesLayout = new javax.swing.GroupLayout(pnlDatosPersonales);
        pnlDatosPersonales.setLayout(pnlDatosPersonalesLayout);
        pnlDatosPersonalesLayout.setHorizontalGroup(
            pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(lblNombres)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombres))
                    .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(lblCedula)
                        .addGap(32, 32, 32)
                        .addComponent(txtCedula))
                    .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(lblApellidos)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidos)))
                .addContainerGap())
        );
        pnlDatosPersonalesLayout.setVerticalGroup(
            pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatosAcademicos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Academicos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 18))); // NOI18N

        lblCarrera.setText("Carrera:");

        cmbCarerra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería de Software", "Ingeniería Electronica", "Ingeniería Electromecanica", "Ingeniería Mecatronica", "Ingeniería de Software", "Ingeniería de Automotriz" }));

        javax.swing.GroupLayout pnlDatosAcademicosLayout = new javax.swing.GroupLayout(pnlDatosAcademicos);
        pnlDatosAcademicos.setLayout(pnlDatosAcademicosLayout);
        pnlDatosAcademicosLayout.setHorizontalGroup(
            pnlDatosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosAcademicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCarrera)
                .addGap(18, 18, 18)
                .addComponent(cmbCarerra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDatosAcademicosLayout.setVerticalGroup(
            pnlDatosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosAcademicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCarerra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarrera))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatosExtraCurriculares.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Extra Curriculares", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 18))); // NOI18N

        chkDanza.setText("Club de Danza");

        chkCine.setText("Club de Cine");

        chkRobotica.setText("Club de Robotica");

        chkMusica.setText("Club de Musica");

        chkVolley.setText("Club de Volley");

        chkAjedrez.setText("Club de Ajedrez");

        chkSoftware.setText("Club de Software");

        chkBoxeo.setText("Club de Boxeo");

        chkFutbol.setText("Club de Futbol");

        javax.swing.GroupLayout pnlDatosExtraCurricularesLayout = new javax.swing.GroupLayout(pnlDatosExtraCurriculares);
        pnlDatosExtraCurriculares.setLayout(pnlDatosExtraCurricularesLayout);
        pnlDatosExtraCurricularesLayout.setHorizontalGroup(
            pnlDatosExtraCurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosExtraCurricularesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosExtraCurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkSoftware)
                    .addComponent(chkCine)
                    .addComponent(chkDanza))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosExtraCurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkRobotica)
                    .addComponent(chkMusica)
                    .addComponent(chkBoxeo))
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(pnlDatosExtraCurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAjedrez, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkFutbol)
                    .addComponent(chkVolley)))
        );
        pnlDatosExtraCurricularesLayout.setVerticalGroup(
            pnlDatosExtraCurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosExtraCurricularesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosExtraCurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDanza)
                    .addComponent(chkRobotica)
                    .addComponent(chkVolley))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosExtraCurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMusica)
                    .addComponent(chkAjedrez)
                    .addComponent(chkSoftware))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosExtraCurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCine)
                    .addComponent(chkBoxeo)
                    .addComponent(chkFutbol))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        btnGuardar.setForeground(java.awt.Color.blue);
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatosExtraCurriculares, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatosAcademicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(pnlDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDatosAcademicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDatosExtraCurriculares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            CrearEstudiante();
            Archivar();
            vtnPrincipal.VerMensaje("Estudiante Agregado Correctamente", Titulo, JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            vtnPrincipal.VerMensaje("Error al Guardar el Estudiante", Titulo, JOptionPane.ERROR_MESSAGE);
            Util.Imprimir(e.toString());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chkAjedrez;
    private javax.swing.JCheckBox chkBoxeo;
    private javax.swing.JCheckBox chkCine;
    private javax.swing.JCheckBox chkDanza;
    private javax.swing.JCheckBox chkFutbol;
    private javax.swing.JCheckBox chkMusica;
    private javax.swing.JCheckBox chkRobotica;
    private javax.swing.JCheckBox chkSoftware;
    private javax.swing.JCheckBox chkVolley;
    private javax.swing.JComboBox<String> cmbCarerra;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDatosAcademicos;
    private javax.swing.JPanel pnlDatosExtraCurriculares;
    private javax.swing.JPanel pnlDatosPersonales;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
