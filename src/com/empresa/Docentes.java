package com.empresa;

public class Docentes extends Funcionario implements Entravel{
    @Override
    public void entrar() {
        GerenciarEntrada.listaEntraveis.add(this);
        System.out.println("Docente entrou!");

    }

    @Override
    public void sair() {
        GerenciarEntrada.listaEntraveis.remove(this);
        System.out.println("Docente saiu!");

    }
}
