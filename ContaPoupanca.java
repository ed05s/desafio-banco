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
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

   @Override
   public void imprimirExtrato(){
       System.out.println("***imprimir extrato da conta poupança***");
       super.iprimirInfosComuns();
   }
}
