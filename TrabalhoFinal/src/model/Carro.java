package model;

public class Carro extends Veiculo{
    private static final long serialVersionUID = 1L;
    private String modelo, placa;
    private float diaria;
    private int assentos, ano;

    public Carro(int id, String marca, String modelo, int ano, String placa, float diaria, int assentos) {
        super(id, marca);
        this.modelo = modelo;
        this.ano = ano;
        this.diaria = diaria;
        this.assentos = assentos;
        this.placa = placa;
    }
    @Override
    public String getModelo() {
        return modelo;
    }
    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public int getAno() {
        return ano;
    }
    @Override
    public void setAno(int ano) {
        this.ano = ano;
    }
    @Override
    public float getDiaria() {
        return diaria;
    }
    @Override
    public void setDiaria(float diaria) {
        this.diaria = diaria;
    }
    @Override
    public String getPlaca() {
        return placa;
    }
    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAssentos() {
        return assentos;
    }
    @Override
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    @Override
    public String toString() {
        return super.toString() + "\nModelo: " + modelo + "\nAno: " + ano + "\nPlaca: " + placa + "\nDiaria: R$ " + diaria + 
        "\nNúmero de lugares:" + assentos + "\n";
    }
}
