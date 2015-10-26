package padraocomposite;

/**
 *
 * @author JuninhSilva
 */
public class TrechoDeAviao implements Trecho{

    private double distancia;
    private String destino;
    
    public TrechoDeAviao(double distancia, String destino){
        this.distancia=distancia;
        this.destino=destino;
    }
    
    @Override
    public void imprime() {
        System.out.println("Distancia percorrida de avi�o: "+ this.distancia + "\nDestino: " + this.destino);
    }    

    @Override
    public double getDistancia() {
        return this.distancia;
    }
}
