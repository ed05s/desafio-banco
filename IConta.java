/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiobanco;

/**
 *
 * @author ADMIN
 */
public interface IConta {
    
     void sacar( double valor);
        
    
     void depositar(double valor);
     
     void imprimirExtrato();
        
    /**
     *
     * @param valor
     * @param contaDestino
     */
    void transferir(double valor, Conta contaDestino);
        
       
}
