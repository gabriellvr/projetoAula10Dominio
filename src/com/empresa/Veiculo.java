package com.empresa;

public class Veiculo implements Entravel {
    private String placa;
    private String marca;
    private String cor;


    @Override
    public void entrar() {
        System.out.println("Veiculo entrou");
        GerenciarEntrada.listaEntraveis.add(this);
    }

    @Override
    public void sair() {
        System.out.println("Veiculo saiu");
        GerenciarEntrada.listaEntraveis.remove(this);
    }
}
