package controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import funcoes.util;
import model.Moto;
import model.Carro;
import model.Veiculo;

public abstract class VeiculoController {
    @SuppressWarnings({"rawtypes", "unchecked" })
    private static List<Veiculo> listaVeiculos = new ArrayList();

    @SuppressWarnings("resource")
    public static void cadastrarVeiculo(){
        int loop=1;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Cadastro de carros");
            System.out.println("2. Cadastro de motos");
            int entrada = scanner.nextInt();
            if(entrada==1){
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
                if(util.verificarVeiculoExistente(listaVeiculos, modelo)){
                    System.out.println("Este veículo ja possui cadastro!\n");
                }else{
                    listaVeiculos.add(new Carro(util.retornaMaiorIdVeiculo(listaVeiculos), marca,
                    modelo, ano, diaria, assentos));
                    System.out.println("Veículo cadastrado com sucesso!\n");
                    loop=0;
                }
            }else if(entrada==2){
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
                if(util.verificarVeiculoExistente(listaVeiculos, modelo)){
                    System.out.println("Este veículo ja possui cadastro!\n");
                }else{
                    listaVeiculos.add(new Moto(util.retornaMaiorIdVeiculo(listaVeiculos), marca,
                    modelo, ano, diaria));
                    System.out.println("Veículo cadastrado com sucesso!\n");
                    loop=0;
                }
            }else{System.out.println("Opção inválida! Digite novamente!\n");}
        }while(loop==1);
    }
}
