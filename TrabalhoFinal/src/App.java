import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controler.VeiculoController;

import java.time.LocalDate;

import model.Carro;
import model.Locacao;
import model.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        /*Cliente user1 = new Cliente("Vinícius", "995862760", "vini@ioto.com",
         "32975275269", LocalDate.parse("15/04/2003",formatter));

        System.out.println(user1.toString());

        Carro c1 = new Carro(LocalDate.parse("15/04/2003",formatter), LocalDate.parse("20/04/2003",formatter),
          "Gol"   , "Volkswagem", 150f, 5);

        System.out.println(c1.toString());

        Locacao l1 = new Locacao(c1, user1);

        System.out.println(l1.toString());*/
      System.out.println("Seja bem vido à Java-i Locar!\n\n");
      int escolha;
      do{  
        System.out.println("**** MENU ****\n");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Cadastrar veículo");
        System.out.println("Escolha uma opção: ");
        System.out.println("0. Sair");
        escolha = scanner.nextInt();

        switch (escolha) {
          case 1:
              VeiculoController.cadastrarVeiculo();
            break;
        
          default:
            break;
        }
      }while(escolha!=0);


    }
}
