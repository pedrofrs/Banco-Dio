package com.bancodio;

import com.bancodio.Cliente;
import com.bancodio.Conta;
import com.bancodio.ContaCorrente;
import com.bancodio.ContaPoupanca;

public class Main {
    public static void main(String[] args) {


        //Objeto Cliente
        Cliente cliente1 = new Cliente("Pedro",
                "Vitor",
                "14/05/1999",
                "Brasileiro");


        //Criando Conta
        Conta conta1 = new ContaCorrente(cliente1);
        Conta conta2 = new ContaPoupanca(cliente1);

        conta1.depositar(1111);
        conta1.imprimirInfosComuns();

        conta2.depositar(1111);











    }
}