package padraocomposite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuninhSilva
 */
public class Caminho implements Trecho{
    private List<Trecho> trechos;
    private double distanciaTotalKM;

    public Caminho() {
        this.trechos = new ArrayList<>();
    }
        
    public void setDistanciaTotalKM(double distanciaTotalKM){
        this.distanciaTotalKM += distanciaTotalKM;
    }
    
    public void adiciona(Trecho trecho){
        this.trechos.add(trecho);
        setDistanciaTotalKM(trecho.getDistancia());
    }
    
    public void remove(Trecho trecho){
        this.trechos.remove(trecho);
    }
    
    @Override
    public void imprime() {
        System.out.println("Caminho completo\n");
        for (Trecho trecho : trechos) {
            trecho.imprime();
        }
        System.out.println("Distância Total: " + getDistancia() + " km.");
    }

    @Override
    public double getDistancia() {
        return this.distanciaTotalKM;
    }
    
}
