package model;

public class Carro extends Veiculo{
    private String modelo, marca;
    private float diaria;
    private int assentos,ano;

    public Carro(int id, String marca, String modelo, int ano, float diaria, int assentos) {
        super(id, marca);
        this.modelo = modelo;
        this.ano = ano;
        this.diaria = diaria;
        this.assentos = assentos;
    }
    @Override
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    @Override
    public float getDiaria() {
        return diaria;
    }
    public void setDiaria(float diaria) {
        this.diaria = diaria;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Veículo: " + super.toString() + modelo + "\nDiaria: R$ " + diaria + 
        "\nNúmero de lugares:" + assentos + "\n";
    }
}
