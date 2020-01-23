package BEU;

import Llano.Persona;
import Llano.Unidad;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class Matricula {

    private Calendar Fecha;
    private Estado estado;
    private Persona Estudiante;
    private Curso Curso;
    private final String Numero;
    private final List<Calificacion> Calificaciones = new ArrayList<>();
    //Información
    private float Promedio;

    public Matricula() {
        Fecha = Calendar.getInstance();
        estado = Estado.Registrado;
        UUID NumeroAleatorio = UUID.randomUUID();
        this.Numero = NumeroAleatorio.toString();
    }

    public Calendar getFecha() {
        return Fecha;
    }

    public void setFecha(Calendar Fecha) {
        this.Fecha = Fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Persona getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(Persona Estudiante) {
        this.Estudiante = Estudiante;
    }

    public Curso getCurso() {
        return Curso;
    }

    public void setCurso(Curso Curso) {
        this.Curso = Curso;
    }

    public void setPromedio(float Promedio) {
        this.Promedio = Promedio;
    }

    public String getNumero() {
        return Numero;
    }

    public void CalcularPromedio() {
        if (Calificaciones.isEmpty()) {
            return;
        }
        float suma = 0f;
        for (Calificacion c : Calificaciones) {
            suma += c.getValor();
            // Se puede acceder al atributo porq es una clase interna
        }
        int divisor = this.Calificaciones.size();
        Promedio = (float) suma / (float) divisor;
        if (divisor == 3) {
            if (Promedio > 14) {
                this.estado = Estado.Aprobado;
            } else {
                this.estado = Estado.Reprobado;
            }
        }
    }

    public float CostoAnular() {
        return this.getCurso().CostoAnular();
    }

    public float getPromedio() {
        return Promedio;
    }

    //Este metodo registra la calificacion y retorna un numero
    // 1 si es la nota de la Unidad I
    // 2 si es la nota de la Unidad II
    // 3 si es la nota de la Unidad III
    // 0 si ya tiene todas las notas
    public int AddCalificacion(float v) {
        Calificacion cal = new Calificacion();
        int CuentaNotas = this.Calificaciones.size();
        switch (CuentaNotas) {
            case 0:
                cal.setUnidad(Unidad.I);
                break;
            case 1:
                cal.setUnidad(Unidad.II);
                break;
            case 2:
                cal.setUnidad(Unidad.III);
                break;
            default:
                //En caso de tener todas la notas Retorna 0
                return 0;
        }
        cal.setValor(v);
        cal.setFecha(Calendar.getInstance());
        this.Calificaciones.add(cal);
        this.CalcularPromedio();
        // Retorna el tamaño de la lista
        return this.Calificaciones.size();
    }

    @Override
    public String toString() {
        return "# " + Estudiante.toString();
    }

    public String toSave() {
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        return gson.toJson(this);
    }

    public String ImprimirDetalle() {
        String str = "\n" + this.Estudiante;
        for (Calificacion c : this.Calificaciones) {
            str += "\t\t" + c.getValor();
        }
        str += "\t\t" + this.Promedio + "\n";
        return str;
    }

    class Calificacion {

        private Calendar Fecha;
        private float Valor;
        private Unidad Unidad;

        public Calificacion() {
        }

        public Calendar getFecha() {
            return Fecha;
        }

        public void setFecha(Calendar Fecha) {
            this.Fecha = Fecha;
        }

        public float getValor() {
            return Valor;
        }

        public void setValor(float Valor) {
            this.Valor = Valor;
        }

        public Unidad getUnidad() {
            return Unidad;
        }

        public void setUnidad(Unidad Unidad) {
            this.Unidad = Unidad;
        }

    }

}
