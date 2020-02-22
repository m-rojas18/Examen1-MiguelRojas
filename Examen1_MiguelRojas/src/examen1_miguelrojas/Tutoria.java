package examen1_miguelrojas;

import java.util.ArrayList;
import java.util.Date;

public class Tutoria {
    private int hora;
    private int aula;
    private int dia;
    private int clase;
    private int mes;
    private int anio;
    private String tema;
    Tutor tutorReserva = new Tutor();
    ArrayList<Alumno_Normal> listaAlumn = new ArrayList();
    
    
    public Tutoria(){
        
    }

    public Tutoria(int hora, int aula, int dia, int clase, int mes, int anio, String tema) {
        this.hora = hora;
        this.aula = aula;
        this.dia = dia;
        this.clase = clase;
        this.mes = mes;
        this.anio = anio;
        this.tema = tema;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public ArrayList<Alumno_Normal> getListaAlumn() {
        return listaAlumn;
    }

    public void setListaAlumn(ArrayList<Alumno_Normal> listaAlumn) {
        this.listaAlumn = listaAlumn;
    }

    public Tutor getTutorReserva() {
        return tutorReserva;
    }

    public void setTutorReserva(Tutor tutorReserva) {
        this.tutorReserva = tutorReserva;
    }
    
    
    
    
}
