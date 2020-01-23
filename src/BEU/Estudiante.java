package BEU;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Llano.Persona {

    private String Carrrera;
    private List<String> Clubes = new ArrayList<>();

    public Estudiante() {

    }

    public String getCarrrera() {
        return Carrrera;
    }

    public void setCarrrera(String Carrrera) {
        this.Carrrera = Carrrera;
    }

    public void AddClub(String club) {
        if (!club.isEmpty()) {
            Clubes.add(club);
        }
    }

    private List<String> getClubes() {
        return Clubes;
    }

}
