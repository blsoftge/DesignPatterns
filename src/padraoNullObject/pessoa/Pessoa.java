package padraoNullObject.pessoa;

import padraoNullObject.endereco.Endereco;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private Endereco endereco;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}