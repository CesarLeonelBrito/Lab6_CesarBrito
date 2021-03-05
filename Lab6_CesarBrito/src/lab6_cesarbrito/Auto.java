package lab6_cesarbrito;

public class Auto {

    private int vin;
    private String marca;
    private String modelo;
    private String carroceria;
    private String pasajeros;
    private int maletero;
    private String color;
    private int precio;
    private int potencia;

    public Auto() {
    }

    public Auto(int vin, String marca, String modelo, String carroceria, String pasajeros, int maletero, String color, int precio, int potencia) {
        this.vin = vin;
        this.marca = marca;
        this.modelo = modelo;
        this.carroceria = carroceria;
        this.pasajeros = pasajeros;
        this.maletero = maletero;
        this.color = color;
        this.precio = precio;
        this.potencia = potencia;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getMaletero() {
        return maletero;
    }

    public void setMaletero(int maletero) {
        this.maletero = maletero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "" + vin;
    }

}
