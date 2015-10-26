package padraocomposite;

/**
 *
 * @author JuninhSilva
 */
public class TrechoDeCaminhada implements Trecho{
    
    private double distancia;
    private String destino;
    
    public TrechoDeCaminhada(double distancia, String destino){
        this.distancia=distancia;
        this.destino=destino;
    }
    
    @Override
    public void imprime() {
        System.out.println("Distancia de caminhada: "+ this.distancia + "\nDestino: " + this.destino);
    }
    
    @Override
    public double getDistancia() {
        return this.distancia/1000;
    }
}
