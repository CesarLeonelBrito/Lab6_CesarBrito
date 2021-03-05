package lab6_cesarbrito;

import java.util.ArrayList;

public class Cliente {
    
    private int id;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String trabajo;
    private String usuario;
    private String password;
    private int dinero;
    private ArrayList<Auto> carros = new ArrayList();

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido, String nacionalidad, String trabajo, String usuario, String password, int dinero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.trabajo = trabajo;
        this.usuario = usuario;
        this.password = password;
        this.dinero = dinero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Auto> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Auto> carros) {
        this.carros = carros;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
