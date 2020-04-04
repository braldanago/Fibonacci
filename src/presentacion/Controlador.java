/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Estudiantes
 */
public class Controlador implements ActionListener{

    private final VistaPrincipal ventana;

    public Controlador(VistaPrincipal aThis) {
        ventana = aThis;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        ventana.getModelo().calcularFibonacci();
    }
    
}
