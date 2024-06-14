package model;

public class Moto extends Veiculo{
    private String modelo;
    private float diaria;
    private int ano, quantidadeDisponivel;

    public Moto(int id, String marca, String modelo, int ano, float diaria, int quantidadeDisponivel) {
        super(id, marca);
        this.modelo = modelo;
        this.ano = ano;
        this.diaria = diaria;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    @Override
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
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
    @Override
    public void setDiaria(float diaria) {
        this.diaria = diaria;
    }
    @Override
    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }
    @Override
    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    @Override
    public String toString() {
        return super.toString() + "\nModelo: " + modelo + "\nAno: " + ano + "\nDiaria: " + diaria + "\n";
    } 
}
