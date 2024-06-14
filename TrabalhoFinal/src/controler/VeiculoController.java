package controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import funcoes.util;
import model.Moto;
import model.Carro;
import model.Veiculo;

public abstract class VeiculoController {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static List<Veiculo> listaVeiculos = new ArrayList();

    static{
    listaVeiculos.add(new Carro(util.retornaMaiorIdVeiculo(listaVeiculos),"Peugeot","307",2011,300f,5,3));
    listaVeiculos.add(new Moto(util.retornaMaiorIdVeiculo(listaVeiculos),"Honda","Titan 125",2003,50f,5));
    listaVeiculos.add(new Carro(util.retornaMaiorIdVeiculo(listaVeiculos),"Audi","A3",2019,400f,5,1));
    }

    @SuppressWarnings("resource")
    public static void cadastrarVeiculo() {
        int loop = 1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Cadastro de carros");
            System.out.println("2. Cadastro de motos");
            int entrada = scanner.nextInt();
            if (entrada == 1) {
                System.out.println("Informações para cadastro do Veículo\n");
                System.out.println("Marca:");
                String marca = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Modelo:");
                String modelo = scanner.nextLine();
                System.out.println("Ano:");
                int ano = scanner.nextInt();
                System.out.println("Preço diaria:");
                float diaria = scanner.nextFloat();
                System.out.println("Número de assentos:");
                int assentos = scanner.nextInt();
                System.out.println("Quantidade disponível:");
                int quantidadeDisponivel = scanner.nextInt();
                if (util.verificarVeiculoExistente(listaVeiculos, modelo, ano)!=null) {
                    System.out.println("Este veículo ja possui cadastro!\n");
                } else {
                    listaVeiculos.add(new Carro(util.retornaMaiorIdVeiculo(listaVeiculos), marca,
                    modelo, ano, diaria, assentos, quantidadeDisponivel));
                    System.out.println("Veículo cadastrado com sucesso!\n");
                    loop = 0;
                }
            } else if (entrada == 2) {
                System.out.println("Informações para cadastro do Veículo\n");
                System.out.println("Marca: ");
                String marca = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Modelo: ");
                String modelo = scanner.nextLine();
                System.out.println("Ano:");
                int ano = scanner.nextInt();
                System.out.println("Preço diaria: ");
                float diaria = scanner.nextFloat();
                System.out.println("Quantidade disponível:");
                int quantidadeDisponivel = scanner.nextInt();
                if (util.verificarVeiculoExistente(listaVeiculos, modelo, ano) != null) {
                    System.out.println("Este veículo ja possui cadastro!\n");
                } else {
                    listaVeiculos.add(new Moto(util.retornaMaiorIdVeiculo(listaVeiculos), marca,
                    modelo, ano, diaria, quantidadeDisponivel));
                    System.out.println("Veículo cadastrado com sucesso!\n");
                    loop = 0;
                }
            } else {
                System.out.println("Opção inválida! Digite novamente!\n");
            }
        } while (loop == 1);
    }

    public static void alterarVeiculo(){
        int loop=1;
        do{
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informações para alteração do Veículo\n");
            System.out.println("Modelo:");
            String modelo = scanner.nextLine();
            System.out.println("Ano:");
            int ano = scanner.nextInt();
            if(util.verificarVeiculoExistente(listaVeiculos, modelo, ano)!=null){
                Veiculo veiculo = util.verificarVeiculoExistente(listaVeiculos, modelo, ano);
                System.out.println("Informe o novo valor da diária:");
                veiculo.setDiaria(scanner.nextFloat());
                System.out.println("Valor alterado!\n");
                loop=0;
            }else{
                System.out.println("Veículo não encontrado, tente novamente...\n");
            }
        }while(loop==1);
    }

    public static void listaVeiculos(){
        System.out.println("\nVeículos Disponíveis");
        for (int i = 0; i < listaVeiculos.size(); i++) {
            Veiculo veiculo = listaVeiculos.get(i);
            System.out.println(veiculo.toString());
        }
    }

    public static void deletarVeiculo(){
        System.out.println("\nInformações para deletar veículo\n");
        int loop=1;
        do{
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            System.out.println("Modelo:");
            String modelo = scanner.nextLine();
            System.out.println("Ano:");
            int ano = scanner.nextInt();
            Veiculo veiculo = util.verificarVeiculoExistente(listaVeiculos, modelo, ano);
            if(veiculo!=null){
                util.deletaVeiculo(listaVeiculos, veiculo);
                System.out.println("Veículo deletado!\n");
                loop=0;
            }else{
                System.out.println("Veículo não encontrado, tente novamente...\n");
            }
        }while(loop==1);
    }
}
