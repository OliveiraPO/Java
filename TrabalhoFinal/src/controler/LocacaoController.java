package controler;

import java.util.ArrayList;
import java.util.List;
import model.Locacao;

public abstract class LocacaoController {
    private static List<Locacao> listaLocacoes = new ArrayList();

    public static void Locar(String cpf, int id){
        System.out.println();
    }

    /*private float calcularCustoTotal() {
        int dias;
        if (veiculo.getDataLocacao() != null && veiculo.getDataEntrega() != null) {
            dias = (int) (veiculo.getDataEntrega().toEpochDay() - veiculo.getDataLocacao().toEpochDay()); 
            return dias * veiculo.getDiaria();
        } else {
            return 0;//.toEpochDay() retorna quantos dias tem de 01/01/1970 até a data desejada
        }
    }*/
}
