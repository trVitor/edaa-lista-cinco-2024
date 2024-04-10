package exercicio.pkg05.buscabinaria;
import java.util.List;
import java.util.ArrayList;

public class Produto {
    
private final String nome;
private final List<HistoricoPreco> historicoPreco;
final BuscaBinaria buscaBinaria;
private final Ordenacao ordenacao;

public Produto(String nome){
    this.nome = nome;
    this.historicoPreco = new ArrayList<>();
    this.ordenacao =  new Ordenacao();
    this.buscaBinaria =  new BuscaBinaria();
}

public String getNome() {
    return nome;
}

public void adcPreco(String data, Double preco){
    historicoPreco.add(new HistoricoPreco(data, preco));
    ordenacao.quickSort(historicoPreco);
}

public List<HistoricoPreco> getHistoricoPreco(){
    return historicoPreco;  
}

/*public double calculaMundaca(){
    double precoInicial = historicoPreco.get(0).getPreco();
    double precoAtual  = historicoPreco.get(historicoPreco.size() -1).getPreco();
    return ((precoAtual - precoInicial) / precoInicial ) * 100;*/
}

  
