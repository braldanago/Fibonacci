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
public class Fibonnacci {

    private int n;
    
    public void setNumero(int n) {
        this.n = n;
    }

    public int calcular() throws FiboException {
        int i, fib;
        fib = fibonacci(n);
        return fib;            
    }

    private int fibonacci(int n) throws FiboException {
        if(n < 1) throw new FiboException("No existe el fibonacci!");
        if(n == 1 || n == 2) return 1;
        return fibonacci(n-1)+fibonacci(n-2);        
    }
    
    
}
