package model;

//import Veiculo;
import java.time.LocalDate;

public class Cliente {
    private String nome, telefone, email, cpf;
    private LocalDate dataNascimento;
    private Veiculo veiculoLocado = null;

    public Cliente(String nome, String telefone, String email, String cpf, 
    LocalDate dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Veiculo getVeiculoLocado() {
        return veiculoLocado;
    }
    public void setVeiculoLocado(Veiculo veiculoLocado) {
        this.veiculoLocado = veiculoLocado;
    }

    @Override
    public String toString() {
        if(veiculoLocado!=null){
            return "Cliente\nNome: " + nome + "\nTelefone: " + telefone + "\nE-mail: " + email + 
            "\nCPF: " + cpf + "\nData de nascimento: " + dataNascimento + "\nVeiculo locado: " + veiculoLocado + "\n";
        }else{
            return "Cliente\nNome: " + nome + "\nTelefone: " + telefone + "\nE-mail: " + email + 
            "\nCPF: " + cpf + "\nData de nascimento: " + dataNascimento + "\n";
        }
    }
}
