package com.bancodio;

public interface ContaInterface {

    public interface IConta {

        void sacar(double valor);

        void depositar(double valor);

        void transferir(double valor, IConta contaDestino);

        void imprimirExtrato();
    }
}
