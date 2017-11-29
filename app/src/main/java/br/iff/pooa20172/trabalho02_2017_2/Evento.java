package br.iff.pooa20172.trabalho02_2017_2;

/**
 * Created by Higor on 29/11/2017.
 */

public class Evento {
    private String nome;
    private int imagem;

    public Evento(String nome, int imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
