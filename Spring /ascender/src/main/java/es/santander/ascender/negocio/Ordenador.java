package es.santander.ascender.negocio;

public class Ordenador {
    private double nserie;
    private String modelo; 
    private String marca;
    private int precio;
    public double getNserie() {
        return nserie;
    }
    public void setNserie(double nserie) {
        this.nserie = nserie;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Ordenador(double nserie, String modelo, String marca, int precio) {
        this.nserie = nserie;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }
    public Ordenador(double nserie) {
        this.nserie = nserie;
    }
    public Ordenador() {
    }
}
