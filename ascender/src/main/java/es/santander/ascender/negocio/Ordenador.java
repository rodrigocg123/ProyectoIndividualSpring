package es.santander.ascender.negocio;

public class Ordenador {
    private int nserie;
    private String marca;
    private double precio;
    private String modelo;

    public int getNserie() {
        return nserie;
    }

    public void setNserie(int nserie) {
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Ordenador(int nserie, String modelo, String marca, double precio) {
        this.nserie = nserie;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public Ordenador(int nserie, String marca) {
        this.nserie = nserie;
        this.marca = marca;
    }

    public Ordenador() {
    }

}
