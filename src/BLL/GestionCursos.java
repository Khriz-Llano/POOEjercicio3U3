package BLL;

import BEU.Curso;
import Llano.BasePersistencia;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GestionCursos extends BasePersistencia<Curso> {

    private List<Curso> Cursos = new ArrayList<>();

    public GestionCursos() {

    }

    public List<Curso> getCursos() throws IOException {
        String Contenido = this.Leer("Cursos", "Cursos.json");
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        Type listType = new TypeToken<ArrayList<Curso>>() {
        }.getType();
        Cursos = gson.fromJson(Contenido, listType);
        return Cursos;
    }

}
