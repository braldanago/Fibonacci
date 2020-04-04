/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Estudiantes
 */
public class FiboException extends Exception {

    public FiboException(String no_existe_el_fibonacci) {
        super(no_existe_el_fibonacci);
    }
    
}
