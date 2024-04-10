package exercicio.pkg05.buscabinaria;
import java.util.List;
import java.util.ArrayList;
public class BuscaBinaria {
    
      public List<Integer>procuraPeriodoInalterado(List<HistoricoPreco> historico, Double precoBuscado){
         List<Integer> intervalo = new ArrayList<>();
         int primeiraOcorrencia = buscaPrimeiraOcorrencia(historico, precoBuscado);
         int ultimaOcorrencia = buscaUltimaOcorrencia(historico, precoBuscado);
         if(primeiraOcorrencia != -1 && ultimaOcorrencia != -1){
             intervalo.add(primeiraOcorrencia);
             intervalo.add(ultimaOcorrencia);
         }
        return intervalo;
      }
          
      private int buscaPrimeiraOcorrencia(List<HistoricoPreco> historico, double precoBuscado){      
        int esq = 0;
        int dir = historico.size() -1;
        int primeiraOcorrencia = -1;
        while (esq <= dir){
            int meio = (esq + dir) / 2;
            double precoMeio = historico.get(meio).getPreco();
            if(precoMeio == precoBuscado){
                primeiraOcorrencia = meio;
                dir = meio - 1;
            }else if (precoMeio < precoBuscado) {
                esq = meio + 1;
            }else{
                dir = meio - 1;
            }
        }
        return primeiraOcorrencia;
    }
      
     private int buscaUltimaOcorrencia(List<HistoricoPreco> historico, double precoBuscado){      
        int esq = 0;
        int dir = historico.size() -1;
        int ultimaOcorrencia = -1;
        while (esq <= dir){
            int meio = (esq + dir) / 2;
            double precoMeio = historico.get(meio).getPreco();
            if(precoMeio == precoBuscado){
                ultimaOcorrencia = meio;
                esq = meio + 1;
            }else if (precoMeio < precoBuscado) {
                esq = meio + 1;
            }else{
                dir = meio - 1;
            }
        }
        return ultimaOcorrencia;
    } 

    int indiceInsercao(List<HistoricoPreco> historicoPreco, String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    
}
