package com.bancodio;

import com.bancodio.util.Validador;

public abstract class Conta extends Banco implements ContaInterface {
    private static int SEQUENCIA = 1;
    private static final int AGENCIA = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected boolean status;

    protected Cliente cliente;

    public Conta(Cliente cliente){
          this.numero = SEQUENCIA++;
          this.agencia = AGENCIA;
          this.saldo = 0;
          this.status = true;
          this.cliente = cliente;
    }

    public void depositar(double valorDeposito){
           saldo += valorDeposito;
    }
    public void sacar(double saque){
          if (Validador.validarSaque(saque, saldo) && Validador.validarValor(saque)){
              saldo -= saque;
          }
    }

    public void transferir(double valor, Conta conta){
          if(Validador.validarSaque(valor, this.saldo)){
              this.sacar(valor);
              conta.depositar(valor);
          }
      }



    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }


    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s", cliente.getNomeCliente()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }


}
