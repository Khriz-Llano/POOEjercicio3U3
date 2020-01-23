package BLL;

import BEU.Curso;
import BEU.Estado;
import BEU.Estudiante;
import BEU.Matricula;
import Llano.BaseBLLCRUD;
import Llano.BasePersistencia;
import Llano.Util;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestionMatricula extends BasePersistencia<Matricula> implements BaseBLLCRUD<Matricula> {

    private Matricula Matricula;
    private final String Directorio = "Matriculas";

    public GestionMatricula() {
    }

    public void setMatricula(Matricula Matricula) {
        this.Matricula = Matricula;
    }

    public String Calificar(float valor) {
        String mensaje = " ";
        int num = this.Matricula.AddCalificacion(valor);
        switch (num) {
            case 0:
                mensaje = "Todas la notas estan registradas.";
                break;
            case 1:
                mensaje = "Calificacion de la Unidad I Ingresada Correctamente.";
                break;
            case 2:
                mensaje = "Calificacion de la Unidad II Ingresada Correctamente.";
                break;
            case 3:
                mensaje = "Calificacion de la Unidad III Ingresada Correctamente.";
                break;
            default:
                mensaje = "Hubo un Error al Ingresar la Calificacion";
                break;
        }
        return mensaje;
    }

    public void Promediar() {
        this.Matricula.CalcularPromedio();
    }

    public String ImprimirDetalle() {
        return this.Matricula.ImprimirDetalle();
    }

    public String Imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante: ").append(Matricula.getEstudiante()).append("\n");
        sb.append("Curso: ").append(Matricula.getCurso().getTitulo()).append("\n");
        sb.append("Promedio: ");
        sb.append(Matricula.getPromedio());
        sb.append(Matricula.ImprimirDetalle());
        return sb.toString();
    }

    public void Archivar() throws IOException {
        this.Escribir(Directorio, this.Matricula.getNumero(), Matricula);
    }

    public List<Matricula> Reportar(String Titulo) throws IOException {
        List<Matricula> Resultado = new ArrayList<>();
        List<String> Contenidos = this.LeerDirectorio(Directorio, Titulo);
        for (String texto : Contenidos) {
            GsonBuilder gb = new GsonBuilder();
            gb.setPrettyPrinting();
            Gson gson = gb.create();
            try {
                Matricula m = gson.fromJson(texto, Matricula.class);
                Resultado.add(m);
            } catch (JsonSyntaxException e) {
                Util.Imprimir("El texto no se pudo convertir en Matricula\n");
                Util.Imprimir(e.toString() + "\n");
            }
        }
        return Resultado;
    }

    public void Configurar(Curso cr, Estudiante est) {
        this.Matricula.setCurso(cr);
        this.Matricula.setEstudiante(est);
    }

    public String Anular() {
        String str = " ";
        Matricula.setEstado(Estado.Anulado);
        str += "\n\033[32mSe ha Anulado la matricula Correctamente.";
        str += "\nEl costo por Anular la Matricula es: " + this.Matricula.CostoAnular() + "$";
        return str;
    }

    @Override
    public void Crear() {
        Matricula = new Matricula();
    }

    @Override
    public void Consultar(String id) throws IOException {
        String archivo = id + ".json";
        String contenido = this.Leer(Directorio, archivo);
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        Matricula = gson.fromJson(contenido, Matricula.class);
    }

    @Override
    public void Actualizar() throws IOException {
    }

    @Override
    public void Eliminar() throws IOException {
    }

}
