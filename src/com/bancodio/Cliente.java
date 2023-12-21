package com.bancodio;

public class Cliente {
    private String nomeCliente;
    private String sobreNome;
    private String dataNascimento;
    private String nacionalidade;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Cliente(String nomeCliente, String sobreNome, String dataNascimento, String nacionalidade) {
        this.nomeCliente = nomeCliente;
        this.sobreNome = sobreNome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
    }
}
