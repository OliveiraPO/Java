package view;

import java.util.Scanner;
import controler.VeiculoController;

public class VeiculoView {

    public static Scanner scanner = new Scanner(System.in);

    public static void menuVeículo()throws Exception{
        int escolha=1;
      do{
        try{  
            System.out.println("\n**** MENU ****\n");
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Veículos disponíveis");
            System.out.println("3. Alterar veículo");
            System.out.println("4. Deletar veículo");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: \n");
            escolha = scanner.nextInt();

            switch (escolha) {
            case 0:
                System.out.println("\nJava-i ? Volte sempre !\n");
            break;
            case 1:
                VeiculoView.cadastrarView();
                break;
            case 2:
                VeiculoController.listaVeiculos();
            break;
            case 3:
                VeiculoView.alterarView();
            break;
            case 4:
                VeiculoView.deletarView();;
            break;
            default:
                    throw new Exception("Opção inválida! Tente novamente...\n");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
      }while(escolha!=0);
    }

    public static void cadastrarView() throws Exception {
        int entrada=1;
        int loop=1;
            do{
                try{
                    System.out.println("1. Cadastro de carros");
                    System.out.println("2. Cadastro de motos");
                    entrada = scanner.nextInt();
                    if (entrada == 1) {
                        System.out.println("Informações para cadastro do Veículo\n");
                        System.out.println("Marca:");
                        scanner.nextLine();
                        String marca = scanner.nextLine();
                        System.out.println("Modelo:");
                        String modelo = scanner.nextLine();
                        System.out.println("Ano:");
                        int ano = scanner.nextInt();
                        System.out.println("Placa:");
                        scanner.nextLine();
                        String placa = scanner.nextLine();
                        System.out.println("Preço diaria:");
                        float diaria = scanner.nextFloat();
                        System.out.println("Número de assentos:");
                        int assentos = scanner.nextInt();
                        VeiculoController.cadastrarVeiculo(entrada, marca, modelo, ano, placa, diaria, assentos);
                        loop=0;
                    } else if (entrada == 2) {
                        System.out.println("Informações para cadastro do Veículo\n");
                        System.out.println("Marca: ");
                        scanner.nextLine();
                        String marca = scanner.nextLine();
                        System.out.println("Modelo: ");
                        String modelo = scanner.nextLine();
                        System.out.println("Ano:");
                        int ano = scanner.nextInt();
                        System.out.println("Placa: ");
                        scanner.nextLine();
                        String placa = scanner.nextLine();
                        System.out.println("Preço diaria: ");
                        float diaria = scanner.nextFloat();
                        System.out.println("Número de assentos: ");
                        int assentos = scanner.nextInt();
                        VeiculoController.cadastrarVeiculo(entrada, marca, modelo, ano, placa, diaria, assentos);
                        loop=0;
                    }else{
                        throw new Exception("Opção inválida! Tente novamente!\n");
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
        }while(loop==1);
    }
    public static void alterarView() {
        int loop = 1;
    
        do {
            try {
                System.out.println("Digite a placa do Veículo:");
                String placa = scanner.nextLine();
                
                System.out.println("\n1. Alterar marca");
                System.out.println("2. Alterar modelo");
                System.out.println("3. Alterar placa");
                System.out.println("4. Alterar ano");
                System.out.println("5. Alterar diaria");
                System.out.println("6. Alterar número de assentos");
                System.out.println("0. Sair");
                int entrada = scanner.nextInt();
                scanner.nextLine();
    
                switch (entrada) {
                    case 1:
                        System.out.println("Nova Marca:");
                        String marca = scanner.nextLine(); 
                        if (VeiculoController.alterarString(placa, entrada, marca)) {
                            loop = 0;
                        }
                        break;
                    case 2:
                        System.out.println("Novo Modelo:");
                        String modelo = scanner.nextLine();
                        if (VeiculoController.alterarString(placa, entrada, modelo)) {
                            loop = 0;
                        }
                        break;
                    case 3:
                        System.out.println("Nova Placa:");
                        String novaPlaca = scanner.nextLine();
                        if (VeiculoController.alterarString(placa, entrada, novaPlaca)) {
                            loop = 0;
                        }
                        break;
                    case 4:
                        System.out.println("Novo Ano:");
                        int ano = scanner.nextInt();
                        if (VeiculoController.alterarAno(placa, ano)) {
                            loop = 0;
                        }
                        break;
                    case 5:
                        System.out.println("Novo Preço diária:");
                        float diaria = scanner.nextFloat();
                        if (VeiculoController.alterarDiaria(placa, diaria)) {
                            loop = 0;
                        }
                        break;
                    case 6:
                        System.out.println("Novo Número de assentos:");
                        int assentos = scanner.nextInt();
                        if (VeiculoController.alterarAssentos(placa, assentos)) {
                            loop = 0;
                        }
                        break;
                    case 0:
                        loop = 0;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        } while (loop == 1);
    }
    public static void deletarView() throws Exception{
        int loop = 1;
        do{
            try{    
                System.out.println("\n0. Sair");
                System.out.println("Digite a placa do veículo:");
                String placa=scanner.nextLine();
                if(placa.equals("0")){loop=0;}else{

                    if(VeiculoController.deletarVeiculo(placa)){
                        loop = 0;
                    }
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }while(loop==1);
    }

}
