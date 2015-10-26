package padraocomposite;

/**
 *
 * @author JuninhSilva
 */
public class TrechoDeCarro implements Trecho{
    
    private double distancia;
    private String destino;
    
    public TrechoDeCarro(double distancia, String destino){
        this.distancia=distancia;
        this.destino=destino;
    }
    
    @Override
    public void imprime() {
        System.out.println("Distancia de caminhada: "+ this.distancia + "\nDestino: " + this.destino);
    }

    @Override
    public double getDistancia() {
        return this.distancia;
    }
    
}
