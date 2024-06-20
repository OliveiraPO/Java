package funcoes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import model.Veiculo;

public abstract class Ser {

    private static final File ARQUIVO_VEICULOS = new File("src/obj/veiculo.ser");

    public static void salvarVeiculos(List<Veiculo> veiculos) throws Exception{
        try {
            ARQUIVO_VEICULOS.getParentFile().mkdirs();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO_VEICULOS));
            oos.writeObject(veiculos);
        } catch (IOException e) {
            throw new Exception("Não foi possível salvar os veículos", e);
        }
    }

    public static List<Veiculo> carregarVeiculos() throws Exception{
        try {
            if (ARQUIVO_VEICULOS.exists() && ARQUIVO_VEICULOS.isFile()) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO_VEICULOS));
                return (List<Veiculo>) ois.readObject();
            }else{
                throw new Exception("Arquivo inválido");
            }
            
        } catch (Exception e) {
            throw new Exception("Não foi possivel ler o arquivo");
        }

    }

}

