package BLL;

import BEU.Estudiante;
import Llano.BasePersistencia;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class GestionEstudiante extends BasePersistencia<Estudiante> {

    private List<Estudiante> Estudiantes = new ArrayList<>();
    private final String Directorio = "Estudiantes";

    public GestionEstudiante() {
    }

    public List<Estudiante> getEstudiantes() {
        return Estudiantes;
    }

    public List<Estudiante> leerEstudiantes() throws IOException {
        String Contenido = this.Leer(Directorio, "Estudiantes.json");
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        Type listType = new TypeToken<ArrayList<Estudiante>>() {
        }.getType();
        Estudiantes = gson.fromJson(Contenido, listType);
        return Estudiantes;
    }

    public void Archivar() throws IOException {
        this.Escribir(Directorio, "Estudiantes", Estudiantes);
    }

}
