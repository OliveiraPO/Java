package model;

public class Moto extends Veiculo{
    private String modelo;
    private float diaria;
    private int ano;

    public Moto(int id, String marca, String modelo, int ano, float diaria) {
        super(id, marca);
        this.modelo = modelo;
        this.ano = ano;
        this.diaria = diaria;
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

    @Override
    public String toString() {
        return "Veículo: " + super.toString() + modelo + "\nDiaria: " + diaria + "\n";
    } 
}
