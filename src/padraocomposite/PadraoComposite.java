package padraocomposite;

/**
 *
 * @author JuninhSilva
 */
public class PadraoComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caminho caminho = new Caminho();
        Trecho alpinopolisPassos = new TrechoDeCarro(46.0, "Alpinópolis - Passos");
        Trecho passosFranca = new TrechoDeCarro(150.3, "Passos - Franca");
        Trecho francaAeroporto = new TrechoDeCaminhada(3500, "Franca - Aeroporto");
        Trecho aeroportoMontevideu = new TrechoDeAviao(2800, "Aeroporto - Montevideu");
        Trecho montevideuIbiza = new TrechoDeNavio(5000, "Montevideu - Iibza");
        caminho.adiciona(alpinopolisPassos);
        caminho.adiciona(passosFranca);
        caminho.adiciona(passosFranca);
        caminho.adiciona(aeroportoMontevideu);
        caminho.adiciona(montevideuIbiza);
        caminho.imprime();
    }    
}
