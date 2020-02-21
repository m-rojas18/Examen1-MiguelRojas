package examen1_miguelrojas;

public class Alumnos {

    String nombre;
    private int edad;
    private String carrera;
    private String lugar_nacimiento;
    private int num_cuenta;
    private String usuario;
    private String contrasena;
    
    public Alumnos(){
        
    }

    public Alumnos(String nombre, int edad, String carrera, String lugar_nacimiento, int num_cuenta, String usuario, String contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.lugar_nacimiento = lugar_nacimiento;
        this.num_cuenta = num_cuenta;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
   
}
