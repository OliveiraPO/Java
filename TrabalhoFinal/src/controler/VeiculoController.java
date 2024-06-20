package controler;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import funcoes.util;
import model.Moto;
import model.Carro;
import model.Veiculo;
import funcoes.Log;
import funcoes.Ser;


public abstract class VeiculoController {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static List<Veiculo> listaVeiculos = new ArrayList();
    private static boolean listaVazia = true;

    static{
        try {
            listaVeiculos = Ser.carregarVeiculos();
        } catch (Exception e) {
            //listaVeiculos = inicializarVeiculos(); 
            listaVazia = false;
            //e.printStackTrace();
        }
    }

   /* private static List<Veiculo> inicializarVeiculos() {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro(util.retornaMaiorIdVeiculo(veiculos),"Peugeot","307",2011, "AUV-9S70", 300f,5));
        veiculos.add(new Moto(util.retornaMaiorIdVeiculo(veiculos),"Honda","Titan 125",2003, "AHB-8F50", 50f, 2));
        veiculos.add(new Carro(util.retornaMaiorIdVeiculo(veiculos),"Audi","A3",2019,"AJB-9S34", 400f,5));
        return veiculos;
    } */

    public static void cadastrarVeiculo(int entrada, String marca, String modelo, int ano, String placa, float diaria, int assentos) throws Exception {
        if(entrada==1){
            if (util.verificarVeiculoExistente(listaVeiculos, placa)!=null) {
                throw new Exception("Este veículo ja possui cadastro!\n");
            } else {
                Veiculo veiculo = new Carro(util.retornaMaiorIdVeiculo(listaVeiculos), marca, modelo, ano, placa, diaria, assentos);
                listaVeiculos.add(veiculo);
                System.out.println("Veículo cadastrado com sucesso!\n");
                Log.escrever("Veículo " + veiculo.getMarca() + " " + veiculo.getModelo() + " placa: " + veiculo.getPlaca() + " foi cadastrado no dia " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + 
                " às " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
                Ser.salvarVeiculos(listaVeiculos);
            }
        }
        else if (entrada == 2) {
            if (util.verificarVeiculoExistente(listaVeiculos, placa) != null) {
                throw new Exception("Este veículo ja possui cadastro!\n");
            } else {
                Veiculo veiculo = new Moto(util.retornaMaiorIdVeiculo(listaVeiculos), marca,
                modelo, ano, placa, diaria, assentos);
                listaVeiculos.add(veiculo);
                System.out.println("Veículo cadastrado com sucesso!\n");
                Log.escrever("Veículo " + veiculo.getMarca() + " " + veiculo.getModelo() + " placa: " + veiculo.getPlaca() + " foi cadastrado no dia " + 
                LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " às " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
                Ser.salvarVeiculos(listaVeiculos);
            }
        }
    }
    public static boolean alterarString(String placa, int entrada, String atributo) throws Exception{
            if(util.verificarVeiculoExistente(listaVeiculos, placa)!=null){
                Veiculo veiculo = util.verificarVeiculoExistente(listaVeiculos, placa);
                switch (entrada) {
                    case 1:
                        veiculo.setMarca(atributo);
                        System.out.println("Marca alterada!");
                        Log.escrever("Veículo " + veiculo.getMarca() + " " + veiculo.getModelo() + " placa: " + veiculo.getPlaca() + " foi alterado a marca no dia " + 
                        LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " às " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
                    break;
                    case 2:
                        veiculo.setModelo(atributo);
                        System.out.println("Modelo alterado!");
                        Log.escrever("Veículo " + veiculo.getMarca() + " " + veiculo.getModelo() + " placa: " + veiculo.getPlaca() + " foi alterado o modelo no dia " + 
                        LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " às " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
                    break;
                    case 3:
                        veiculo.setPlaca(atributo);
                        System.out.println("Placa alterada!");
                        Log.escrever("Veículo " + veiculo.getMarca() + " " + veiculo.getModelo() + " placa: " + veiculo.getPlaca() + " foi alterado a placa no dia " + 
                        LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " às " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
                    break;
                }
                Ser.salvarVeiculos(listaVeiculos);
                return true;
            }else{
                throw new Exception("Veículo não encontrado, tente novamente...\n");
            }
    }
    public static boolean alterarAno(String placa, int ano) throws Exception{
        if(util.verificarVeiculoExistente(listaVeiculos, placa)!=null){
            Veiculo veiculo = util.verificarVeiculoExistente(listaVeiculos, placa);
            veiculo.setAno(ano);
            Log.escrever("Veículo " + veiculo.getMarca() + " " + veiculo.getModelo() + " placa: " + veiculo.getPlaca() + " foi alterado o ano no dia " + 
            LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " às " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
            Ser.salvarVeiculos(listaVeiculos);
            return true;
        }else{
            throw new Exception("Veículo não encontrado, tente novamente...\n");
        }
    }
    public static boolean alterarDiaria(String placa, float diaria) throws Exception{
        if(util.verificarVeiculoExistente(listaVeiculos, placa)!=null){
            Veiculo veiculo = util.verificarVeiculoExistente(listaVeiculos, placa);
            veiculo.setDiaria(diaria);
            Log.escrever("Veículo " + veiculo.getMarca() + " " + veiculo.getModelo() + " placa: " + veiculo.getPlaca() + " foi alterado a diaria no dia " + 
            LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " às " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
            Ser.salvarVeiculos(listaVeiculos);
            return true;
        }else{
            throw new Exception("Veículo não encontrado, tente novamente...\n");
        }
    }
    public static boolean alterarAssentos(String placa, int assentos) throws Exception{
        if(util.verificarVeiculoExistente(listaVeiculos, placa)!=null){
            Veiculo veiculo = util.verificarVeiculoExistente(listaVeiculos, placa);
            veiculo.setAssentos(assentos);
            Log.escrever("Veículo " + veiculo.getMarca() + " " + veiculo.getModelo() + " placa: " + veiculo.getPlaca() + " foi alterado o número de assentos no dia " + 
            LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " às " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
            Ser.salvarVeiculos(listaVeiculos);
            return true;
        }else{
            throw new Exception("Veículo não encontrado, tente novamente...\n");
        }
    }
    public static void listaVeiculos(){
        if(listaVazia==false){
            System.out.println("\nNão existem veículos no sistema, cadastre-os!");
        }else{
            Collections.sort(listaVeiculos, (r1,r2) -> r1.getMarca().compareToIgnoreCase(r2.getMarca()));
            System.out.println("\nVeículos Disponíveis");
            for (int i = 0; i < listaVeiculos.size(); i++) {
                Veiculo veiculo = listaVeiculos.get(i);
                System.out.println(veiculo.toString());
            }
        }
    }
    public static boolean deletarVeiculo(String placa) throws Exception{
        Veiculo veiculo = util.verificarVeiculoExistente(listaVeiculos, placa);
        if(veiculo!=null){
            listaVeiculos.remove(veiculo);
            System.out.println("Veículo deletado!\n");
            Log.escrever("Veículo " + veiculo.getMarca() + " " + veiculo.getModelo() + " placa: " + veiculo.getPlaca() + " foi deletado no dia " + 
            LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " às " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
            Ser.salvarVeiculos(listaVeiculos);
            return true;
        }else{
            throw new Exception("Veículo não encontrado, tente novamente...\n");
        }
    }
}
