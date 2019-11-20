package com.empresa;

public class Aluno extends Pessoa implements Entravel {
    private int ra;
    private String curso;

    @Override
    public void entrar() {
        GerenciarEntrada.listaEntraveis.add(this);
        System.out.println("Aluno entrou!");


    }

    @Override
    public void sair() {
        GerenciarEntrada.listaEntraveis.remove(this);
        System.out.println("Aluno saiu!");

    }
}
