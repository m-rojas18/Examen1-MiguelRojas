package examen1_miguelrojas;

import java.util.ArrayList;

public class Alumno_Normal extends Alumnos{
    
    private int conocimiento_acum;
    private int nivel_aprendizaje;
    ArrayList<Examenes> list_exams = new ArrayList();

    public Alumno_Normal() {
        super();
    }


    public Alumno_Normal(int conocimiento_acum, int nivel_aprendizaje, String nombre, int edad, String carrera, String lugar_nacimiento, int num_cuenta, String usuario, String contrasena) {
        super(nombre, edad, carrera, lugar_nacimiento, num_cuenta, usuario, contrasena);
        this.conocimiento_acum = conocimiento_acum;
        this.nivel_aprendizaje = nivel_aprendizaje;
    }

    

    public int getConocimiento_acum() {
        return conocimiento_acum;
    }

    public void setConocimiento_acum(int conocimiento_acum) {
        this.conocimiento_acum = conocimiento_acum;
    }

    public int getNivel_aprendizaje() {
        return nivel_aprendizaje;
    }

    public void setNivel_aprendizaje(int nivel_aprendizaje) {
        this.nivel_aprendizaje = nivel_aprendizaje;
    }

    public ArrayList<Examenes> getList_exams() {
        return list_exams;
    }

    public void setList_exams(ArrayList<Examenes> list_exams) {
        this.list_exams = list_exams;
    }
    
    
    
}
