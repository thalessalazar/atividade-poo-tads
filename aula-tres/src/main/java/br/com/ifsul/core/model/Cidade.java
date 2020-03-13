package br.com.ifsul.core.model;


public class Cidade {

    private String nome;
    private String sigla;
    private Estado estado;

    public Cidade(){}

    public Cidade(Estado estado) {
        this.estado = estado;
    }
}