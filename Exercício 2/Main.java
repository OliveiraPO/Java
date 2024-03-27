import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Formato da data brasileira
        String formatoBrasileiro = "dd/MM/yyyy";

        // Exemplo de data no formato brasileiro
        String dataString = "26/03/2024";

        // Criando um DateTimeFormatter para o formato brasileiro
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatoBrasileiro);

        // Convertendo a string para LocalDate
        LocalDate data = LocalDate.parse(dataString, formatter);
        System.out.println("Data convertida: " + data);
        System.out.println("Data formatada: "+ data.format(formatter));
    }
}