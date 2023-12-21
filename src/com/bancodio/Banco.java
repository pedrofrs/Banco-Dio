package com.bancodio;

import java.util.List;

public class Banco {
    private String nomeBanco;
    private String endercoBanco;
    private String siteBanco;
    private List<Conta> contas;

    private static final String NOME_BANCO = "BANCO DIO";
    public Banco(){
        this.nomeBanco = NOME_BANCO;
        this.endercoBanco = "Avenida Recife 1800";
        this.siteBanco = "www.banco-dio.com.br";

    }

    public String getNomeBanco() {
        return nomeBanco;
    }


    public String getEndercoBanco() {
        return endercoBanco;
    }

    public String getSiteBanco() {
        return siteBanco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
