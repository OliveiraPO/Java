package model;

public interface VeiculoInterface {

    int getId();
    void setId(String id);

    String getMarca();
    void setMarca(String marca);
    
    void start();
    void stop();
}
