package com.company;

public class Filme {

    public Filme() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Filme(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String nome ;
    public int preco ;
}
