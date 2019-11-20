package com.empresa;

public class Administrativo extends Funcionario implements Entravel {
    @Override
    public void entrar() {
        GerenciarEntrada.listaEntraveis.add(this);
        System.out.println("Funcionario administrativo entrou!");

    }

    @Override
    public void sair() {
        GerenciarEntrada.listaEntraveis.remove(this);
        System.out.println("Funcionario administrativo saiu!");

    }
}
