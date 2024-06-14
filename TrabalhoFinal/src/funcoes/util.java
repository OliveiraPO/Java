package funcoes;

import java.util.List;

import model.Cliente;
import model.Locacao;
import model.Veiculo;

public abstract class util {

    public static int retornaMaiorIdLocacao(List<Locacao> lista){
        int aux = 0;
        if(lista.isEmpty()){
            return 1;
        }else{
                for (Locacao locacao : lista) {
                    for(int i=0;i<locacao.getId();i++){
                        aux = locacao.getId();
                }
            } 
        }return aux+1;       
    }
    public static int retornaMaiorIdVeiculo(List<Veiculo> lista){
        int aux = 0;
        if(lista.isEmpty()){
            return 1;
        }else{
                for (Veiculo veiculo : lista) {
                    for(int i=0;i<veiculo.getId();i++){
                        aux = veiculo.getId();
                }
            } 
        }return aux+1;       
    }
    public static Veiculo verificarVeiculoExistente(List<Veiculo> lista, String modelo, int ano) {
        for (Veiculo veiculo : lista) {
            if (veiculo.getModelo().equalsIgnoreCase(modelo) && veiculo.getAno()==ano) {
                return veiculo;
            }
        }
        return null;
    }
    public static void deletaVeiculo(List<Veiculo> lista, Veiculo veiculo){
        lista.remove(veiculo);
    }
    //public static boolean alterarVeiculo();
}
    