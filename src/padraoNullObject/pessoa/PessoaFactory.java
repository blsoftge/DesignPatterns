package padraoNullObject.pessoa;

import padraoNullObject.endereco.Endereco;
import padraoNullObject.endereco.EnderecoNull;

public class PessoaFactory {
    public static Pessoa criarPessoa(String nome, String sobrenome, Endereco endereco){
        Pessoa pessoa = new Pessoa(nome, sobrenome);

        if(endereco == null){
            pessoa.setEndereco(new EnderecoNull());
        }else{
            pessoa.setEndereco(endereco);
        }

        return pessoa;
    }
}