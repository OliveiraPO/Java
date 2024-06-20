package model;

import java.io.Serializable;
import java.util.List;

public abstract class Veiculo implements Comparable <Veiculo>, Serializable{
    private static final long serialVersionUID = 1L;
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

    public abstract int getAno();

    public abstract void setDiaria(float diaria);

    public abstract String getPlaca();
    
    public abstract void setModelo(String modelo);

    public abstract void setAno(int ano);

    public abstract void setPlaca(String placa);

    public abstract void setAssentos(int assentos);

    public static Veiculo verificarVeiculoExistente(List<Veiculo> lista, String placa) {
        for (Veiculo veiculo : lista) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    @Override
    public int compareTo(Veiculo veiculo) {
        return marca.compareTo(veiculo.getMarca());
    }
    @Override
    public String toString() {
        return "\nId: " + id + "\nMarca: " + marca;
    }

}