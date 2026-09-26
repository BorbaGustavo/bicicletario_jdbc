package br.com.bicicletario.model;

public class Vaga {
    private int id;
    private  int numero_vaga;
    private String status;

    public Vaga(int id, int numero_vaga, String status) {
        this.id = id;
        this.numero_vaga = numero_vaga;
        this.status = status;
    }

    public Vaga() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_vaga() {
        return numero_vaga;
    }

    public void setNumero_vaga(int numero_vaga) {
        this.numero_vaga = numero_vaga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
