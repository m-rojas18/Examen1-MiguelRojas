package examen1_miguelrojas;

public class Examenes {
    
    private Clase clas = new Clase();
    private int conocimiento_requerido;
    private String tema;
    private int puntaje;

    public Examenes() {
    }

    public Examenes(int conocimiento_requerido, String tema, int puntaje) {
        this.conocimiento_requerido = conocimiento_requerido;
        this.tema = tema;
        this.puntaje = puntaje;
    }

    public Clase getClas() {
        return clas;
    }

    public void setClas(Clase clas) {
        this.clas = clas;
    }

    public int getConocimiento_requerido() {
        return conocimiento_requerido;
    }

    public void setConocimiento_requerido(int conocimiento_requerido) {
        this.conocimiento_requerido = conocimiento_requerido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
}
