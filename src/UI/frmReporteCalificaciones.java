package UI;

import BEU.Curso;
import BEU.Matricula;
import BLL.GestionCursos;
import BLL.GestionMatricula;
import Llano.Util;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmReporteCalificaciones extends javax.swing.JInternalFrame {
    
    private final String Titulo = "Reporte de Calificaciones";
    private GestionCursos CursosBLL = new GestionCursos();
    private GestionMatricula MatriculaBLL = new GestionMatricula();
    private List<Curso> Cursos;
    private final DefaultTableModel dtmCalificaciones = new DefaultTableModel();
    private List<Matricula> Calificaciones;
    
    private void LeerCurso() {
        try {
            Curso ficticio = new Curso("-Seleccione-", 0.0f, "");
            this.cmbCurso.addItem(ficticio);
            Cursos = CursosBLL.getCursos();
            //Exprecion lambda
            Cursos.forEach((c) -> {
                this.cmbCurso.addItem(c);
            });
        } catch (Exception e) {
            Util.Imprimir("Error: " + e.toString() + "\n");
            vtnPrincipal.VerMensaje("Error al leer cursos", Titulo, JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void ConfigurarModeloTabla() {
        String[] Columnas = {"Nombre", "Promedio", "Estado"};
        dtmCalificaciones.setColumnIdentifiers(Columnas);
        this.tblReporteCalificaciones.setModel(dtmCalificaciones);
    }
    
    private void MostrarCalificaciones() {
        int lim = this.dtmCalificaciones.getRowCount() - 1;
        for (int i = lim; i >= 0; i--) {
            this.dtmCalificaciones.removeRow(i);
        }
        for (Matricula m : Calificaciones) {
            Vector fila = new Vector();
            fila.addElement(m.getEstudiante());
            fila.addElement(m.getPromedio());
            fila.addElement(m.getEstado());
            this.dtmCalificaciones.addRow(fila);
        }
        this.tblReporteCalificaciones.setModel(dtmCalificaciones);
    }
    
    private void BuscarMatriculas() throws IOException {
        Curso Seleccionado = (Curso) this.cmbCurso.getSelectedItem();
        Calificaciones = MatriculaBLL.Reportar(Seleccionado.getTitulo());
        MostrarCalificaciones();
    }
    
    public frmReporteCalificaciones() {
        initComponents();
        LeerCurso();
        ConfigurarModeloTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCurso = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        cmbCurso = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporteCalificaciones = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reporte de Calificaciones");

        lblCurso.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        lblCurso.setText("Curso:");

        btnBuscar.setIcon(new javax.swing.ImageIcon("/home/labctr/Descargas/Buscar.png")); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblReporteCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblReporteCalificaciones);

        lblTitulo.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        lblTitulo.setForeground(java.awt.Color.darkGray);
        lblTitulo.setText("Reporte de Calificaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblCurso)
                        .addGap(32, 32, 32)
                        .addComponent(cmbCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCurso)
                    .addComponent(lblCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            this.BuscarMatriculas();
            vtnPrincipal.VerMensaje("Busqueda correcta ", Titulo, JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            Util.Imprimir("\nError" + e.toString() + "\n");
            vtnPrincipal.VerMensaje("Error al buscar Matrícula ", Titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<Curso> cmbCurso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblReporteCalificaciones;
    // End of variables declaration//GEN-END:variables
}
