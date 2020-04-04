
package presentacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.FiboException;
import logica.Fibonnacci;


public class Modelo {

    private VistaPrincipal ventanaInicial;
    private Fibonnacci sistema;
    
    public void iniciar() {
        getVentanaInicial().setSize(400, 400);
        getVentanaInicial().setVisible(true);
    }

    public VistaPrincipal getVentanaInicial() {
        if(ventanaInicial == null){
            ventanaInicial = new VistaPrincipal(this);
        }
        return ventanaInicial;
    }

    public Fibonnacci getSistema() {
        if(sistema == null){
            sistema = new Fibonnacci();
        }
        return sistema;
    }

    public void calcularFibonacci() {
        // En este mètodo, tomamos los datos de la vista y los pasamos a la logica
        // Luego tomamnos los resultados generados por la logica y los mostramos en la vista
        int n, r;
        n = Integer.parseInt(getVentanaInicial().getTxtNumero().getText());
        
        getSistema().setNumero(n);        
        try{
            r = getSistema().calcular();
            getVentanaInicial().getLblResultado().setText("El Fibonnacci es: "+r);
        } catch (FiboException ex) {
            getVentanaInicial().getLblResultado().setText(ex.getMessage());
        }
    } 
}
