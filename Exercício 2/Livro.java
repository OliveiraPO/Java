import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Livro{
    private String titulo,autor;
    private String dataPub;
    private DateTimeFormatter brasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Livro(String titulo,String autor,String dataPub){
        this.titulo = titulo;
        this.autor = autor;
        this.dataPub = dataPub;       
    }

    private int calculaIdade(String date){ 
        int idade;
        LocalDate data = LocalDate.parse(date, brasil);
        LocalDate hoje = LocalDate.now();
        /*if(data.getYear()>hoje.getYear()){
            return 0;
        }else if(data.getYear()==hoje.getYear()&&data.getMonthValue()>hoje.getMonthValue()){
            return 0;            
         }else */if(data.getYear()==hoje.getYear()&&data.getMonthValue()==hoje.getMonthValue()&&data.getDayOfMonth()>hoje.getDayOfMonth()){
            return 0;
          }if(data.getYear()<hoje.getYear()&&data.getMonthValue()<=hoje.getMonthValue()&&data.getDayOfMonth()<=hoje.getDayOfMonth()){
             idade = hoje.getYear()-data.getYear();
           }else{
             idade = (hoje.getYear()-data.getYear())-1;
            }
        return idade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataPub() {
        return dataPub;
    }

    public void setDataPub(String dataPub) {
        this.dataPub = dataPub;
    }

    public String Informacoes(){
        return "Título: "+this.titulo+"\nAutor: "+this.autor+"\nData de publicação: "+this.dataPub+"\nTempo lançado: "+calculaIdade(this.dataPub)+" anos";
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", dataPub=" + dataPub + "]";
    }

}