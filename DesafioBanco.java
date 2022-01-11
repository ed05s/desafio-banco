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
public class DesafioBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("venilton");
        
        Conta cc = new ContaCorrente(venilton);
        cc.depositar(10);
        
        Conta poupanca = new ContaPoupanca(venilton);
        cc.transferir(10, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        poupanca.sacar(10);
        
        poupanca.fecharConta();
  
    }
    
}
