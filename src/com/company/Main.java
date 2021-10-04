package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Gustavo", 20);
        Filme f1 = new Filme("Piratas do caribe",24);
        System.out.println("Dados de ingresso:  Filme = {" + f1.nome + "} preço = {R$" + f1.preco + " reais} Nome do espectador: {"+ c1.nome + "} idade: {" + c1.idade + " anos}");

    }
}
