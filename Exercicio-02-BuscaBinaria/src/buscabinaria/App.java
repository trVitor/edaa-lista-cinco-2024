package exercicio.pkg05.buscabinaria;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Produto produto = new Produto("Televisão");

        produto.adcPreco("2024-01-16", 1000.0); // Preço em 1º de janeiro de 2024
        produto.adcPreco("2024-04-11", 950.0); // Preço em 8 de abril de 2024
        produto.adcPreco("2024-02-12", 1050.0); // Preço em 15 de agosto de 2024
        produto.adcPreco("2024-03-16", 1000.0);
        produto.adcPreco("2024-05-17", 1000.0);
        produto.adcPreco("2024-06-18", 1000.0);
        
        System.out.println("");
        System.out.println("Historico do Produto " + produto.getNome()+ ":" + "\n");
        for(HistoricoPreco entrada : produto.getHistoricoPreco()){
        System.out.println("Data: " + entrada.getData() + ", Valor $" + entrada.getPreco());
        }
        
        List<Integer> periodoInalterado = produto.buscaBinaria.procuraPeriodoInalterado(produto.getHistoricoPreco(), 1000.0);
        if(!periodoInalterado.isEmpty()){
            int primeiraOcorrencia = periodoInalterado.get(0);
            int ultimaOcorrencia = periodoInalterado.get(1);
            System.out.println("\nPeríodo em que o preço permaneceu inalterado: " + produto.getHistoricoPreco().get(primeiraOcorrencia).getData() + " até "  + produto.getHistoricoPreco().get(ultimaOcorrencia).getData());
          }else{
            System.out.println("O preço não permaneceu inalterado em nenhum momento.");
      }      
   } 
}
    

