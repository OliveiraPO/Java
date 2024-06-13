package model;

public class Locacao {
    private int id;
    private Veiculo veiculo;
    private Cliente user;
    private float valorLocacao;
    
    public Locacao(int id, Veiculo veiculo, Cliente user, float valorLocacao) {
        this.id=id;
        this.veiculo = veiculo;
        this.user = user;
        this.valorLocacao = valorLocacao;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public Cliente getUser() {
        return user;
    }
    public void setUser(Cliente user) {
        this.user = user;
    }
    public float getValorLocacao() {
        return valorLocacao;
    }
    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    @Override
    public String toString() {
        return "Locação\n\n" + user + "\n" + veiculo + "\nValor Total: R$ " + valorLocacao;
    }

}
