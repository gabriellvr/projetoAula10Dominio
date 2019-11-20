package com.empresa;

public class Main {

    public static void main(String[] args) {

        Veiculo v = new Veiculo();
        Aluno al = new Aluno();
        Docentes d = new Docentes();
        Administrativo ad = new Administrativo();

        v.entrar();
        al.entrar();
        d.entrar();
        ad.entrar();

        al.sair();

        System.out.println("Há " + GerenciarEntrada.listaEntraveis.size() + " pessoas dentro da instituição!");

    }
}
