package examen1_miguelrojas;

import java.util.ArrayList;

public class Tutor extends Alumnos{
    ArrayList<Clase> listClases= new ArrayList();
    private int ganancias;
    private int tutoriad_dadas;
    private int nivel_ensenanza;
    
    public Tutor(){
        super();
    }


    public Tutor(int ganancias, int tutoriad_dadas, int nivel_ensenanza, String nombre, int edad, String carrera, String lugar_nacimiento, int num_cuenta, String usuario, String contrasena) {
        super(nombre, edad, carrera, lugar_nacimiento, num_cuenta, usuario, contrasena);
        this.ganancias = ganancias;
        this.tutoriad_dadas = tutoriad_dadas;
        this.nivel_ensenanza = nivel_ensenanza;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getTutoriad_dadas() {
        return tutoriad_dadas;
    }

    public void setTutoriad_dadas(int tutoriad_dadas) {
        this.tutoriad_dadas = tutoriad_dadas;
    }

    public int getNivel_ensenanza() {
        return nivel_ensenanza;
    }

    public void setNivel_ensenanza(int nivel_ensenanza) {
        this.nivel_ensenanza = nivel_ensenanza;
    }

    public ArrayList<Clase> getListClases() {
        return listClases;
    }

    public void setListClases(ArrayList<Clase> listClases) {
        this.listClases = listClases;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
