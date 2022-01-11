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
public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
    
    
     public Conta( Cliente cliente){
      this.agencia = Conta.AGENCIA_PADRAO;
      this.numero = SEQUENCIAL++;
      this.cliente = cliente;
      
      
   }
   
    
    

    public int getAgencia() {
        return agencia;
    }

   

    public int getNumero() {
        return numero;
    }



   

    @Override
    public void sacar(double valor) {
        if(saldo<0){
            System.out.println("voce não possui saldo o suficiente");   
        }else{
         saldo-=valor; 
        }
    }

    @Override
    public void depositar(double valor) {
       saldo+=valor;  
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println();  
    }
    public void fecharConta(){
        if(saldo>0){
            System.out.println(" impossivel fechar a conta voce possui creditos de " + this.saldo); 
        }else if( saldo <0){
            System.out.println(" imposssível fechar a conta voce  possui um débito de "+this.saldo);  
        }else{
            System.out.println("fechando conta");
        }
            
    }
    
   
    protected void iprimirInfosComuns(){
         
       System.out.println(String.format("titular : %s",this.cliente.getNome()));
       System.out.println(String.format("agencia : %d",this.agencia));
       System.out.println(String.format("numero : %d",this.numero));
       System.out.println(String.format("saldo : %.2f",this.saldo));
    }
    
    
  
}
