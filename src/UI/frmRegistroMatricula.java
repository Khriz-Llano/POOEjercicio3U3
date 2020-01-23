package UI;

import BEU.Curso;
import BEU.Estudiante;
import BLL.GestionCursos;
import BLL.GestionEstudiante;
import BLL.GestionMatricula;
import Llano.Util;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

public class frmRegistroMatricula extends javax.swing.JInternalFrame {

    private final String Titulo = "Registro de Matricula";
    //Servicio //Bussiness Logic Layer
    private GestionCursos CursosBLL = new GestionCursos();
    private GestionEstudiante EstudianteBLL = new GestionEstudiante();
    private GestionMatricula MatriculaBLL = new GestionMatricula();
    private List<Estudiante> Estudiantes;
    private List<Curso> Cursos;

    private boolean Validar() {
        Curso cr = (Curso) this.cmbCursos.getSelectedItem();
        if (cr.getTitulo().equals("--Seleccione--")) {
            vtnPrincipal.VerMensaje("Curso no Valido", Titulo, JOptionPane.WARNING_MESSAGE);
            return false;
        }
        Estudiante est = (Estudiante) this.cmbEstudiantes.getSelectedItem();
        if (est.getNombre().equals("--Seleccione--")) {
            vtnPrincipal.VerMensaje("Estudiante no Valido", Titulo, JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void CrearMatricula() throws IOException {
        if (Validar()) {
            Curso cr = (Curso) this.cmbCursos.getSelectedItem();
            Estudiante est = (Estudiante) this.cmbEstudiantes.getSelectedItem();
            MatriculaBLL.Crear();
            MatriculaBLL.Configurar(cr, est);
            MatriculaBLL.Archivar();
        }
    }

    private void LeerCursos() {
        try {
            Curso Ficticio = new Curso("--Seleccione--", 0.0f, "");
            this.cmbCursos.addItem(Ficticio);
            Cursos = CursosBLL.getCursos();
            //Expresion Lmbda
            Cursos.forEach((c) -> {
                this.cmbCursos.addItem(c);
            });
        } catch (Exception e) {
            Util.Imprimir("Errror: " + e.toString());
            vtnPrincipal.VerMensaje("Error al Leer los Cursos", Titulo, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LeerEstudiantes() {
        try {
            Estudiante Ficticio = new Estudiante();
            Ficticio.setNombre("--Seleccione--");
            Ficticio.setApellido("");
            this.cmbEstudiantes.addItem(Ficticio);

            Estudiantes = EstudianteBLL.leerEstudiantes();
            //Expresion Lmbda
            Estudiantes.forEach((est) -> {
                this.cmbEstudiantes.addItem(est);
            });
        } catch (Exception e) {
            Util.Imprimir("Errror: " + e.toString());
            vtnPrincipal.VerMensaje("Error al Leer los Estudiantes", Titulo, JOptionPane.ERROR_MESSAGE);
        }
    }

    public frmRegistroMatricula() {
        initComponents();
        LeerCursos();
        LeerEstudiantes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistroMatricula = new javax.swing.JLabel();
        lblEstudiante = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();
        cmbEstudiantes = new javax.swing.JComboBox<>();
        cmbCursos = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de Matricula");

        lblRegistroMatricula.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        lblRegistroMatricula.setForeground(java.awt.Color.red);
        lblRegistroMatricula.setText("REGISTRO DE MATRICULA");

        lblEstudiante.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        lblEstudiante.setText("Estudiante:");

        lblCurso.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        lblCurso.setText("Curso:");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblRegistroMatricula)
                                .addGap(47, 47, 47))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCurso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEstudiante, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbEstudiantes, 0, 396, Short.MAX_VALUE)
                            .addComponent(cmbCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistroMatricula)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstudiante)
                    .addComponent(cmbEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurso)
                    .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (this.Validar()) {
                CrearMatricula();
                vtnPrincipal.VerMensaje("Matricula creada Correctamente", Titulo, JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            Util.Imprimir("Errror: " + e.toString());
            vtnPrincipal.VerMensaje("Error al Crear la Matrícula", Titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Curso> cmbCursos;
    private javax.swing.JComboBox<Estudiante> cmbEstudiantes;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblRegistroMatricula;
    // End of variables declaration//GEN-END:variables
}
