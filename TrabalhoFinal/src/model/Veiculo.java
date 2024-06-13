package model;

public abstract class Veiculo {
    private int id;
    private String marca;


    public Veiculo(int id, String marca){
        this.id=id;
        this.marca=marca;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract float getDiaria();

    public abstract String getModelo();

    @Override
    public String toString() {
        return "Veículo\nId: " + id + "\nMarca: " + marca;
    }

}