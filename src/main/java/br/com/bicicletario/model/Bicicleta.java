package br.com.bicicletario.model;

public class Bicicleta {
    private int id;
    private String codigo;

    public Bicicleta(int id, String codigo) {
        this.id = id;
        this.codigo = codigo;
    }

    public Bicicleta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
