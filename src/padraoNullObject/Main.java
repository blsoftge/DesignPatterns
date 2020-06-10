package padraoNullObject;

import padraoNullObject.endereco.Endereco;
import padraoNullObject.pessoa.Pessoa;
import padraoNullObject.pessoa.PessoaFactory;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = PessoaFactory.criarPessoa(
            "Jurandir",
             "Malaquias",
              new Endereco("Rua 1", "1234-789"));
              System.out.println(pessoa1.getEndereco().getCep());

        Pessoa pessoa2 = PessoaFactory.criarPessoa(
            "Joaquim",
             "Juvencio",
              null);
        System.out.println(pessoa2.getEndereco().getCep());


    }
}