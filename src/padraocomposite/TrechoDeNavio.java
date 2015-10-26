package padraocomposite;

/**
 *
 * @author JuninhSilva
 */
public class TrechoDeNavio implements Trecho{

    private double distancia;
    private String destino;
    
    public TrechoDeNavio(double distancia, String destino){
        this.distancia=distancia;
        this.destino=destino;
    }
    
    @Override
    public void imprime() {
        System.out.println("Distancia percorrida de navio: "+ getDistancia() + "milhas.\nDestino: " + this.destino);
    }

    @Override
    public double getDistancia() {
        return this.distancia;
    }    
}
