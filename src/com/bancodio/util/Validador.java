package com.bancodio.util;

public class Validador {

    public static boolean validarSaque(double saque, double saldo){
        if (saque > saldo) {
            System.out.println("INVALIDO");
            return false;
        }
        return true;
    }
    public static boolean validarValor (double valor){
        try {
            Double.valueOf(valor);
            return true;
        }
        catch (Exception e){
            System.out.println("ERRO");
            return false;
        }
    }

}
