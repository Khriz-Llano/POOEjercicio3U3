package BEU;

public class Curso {

    private String Titulo;
    private float Costo;
    private String Descripcion;

    public Curso(String Titulo, float Costo, String Descripcion) {
        this.Titulo = Titulo;
        this.Costo = Costo;
        this.Descripcion = Descripcion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public float getCosto() {
        return Costo;
    }

    public void setCosto(float Costo) {
        this.Costo = Costo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return Titulo;
    }

    public float CostoAnular() {
        return this.getCosto() * 0.1f;
    }

}
