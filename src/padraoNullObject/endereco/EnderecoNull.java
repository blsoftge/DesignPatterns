package padraoNullObject.endereco;

public class EnderecoNull extends Endereco{
    public String getRua() {
        return "Essa rua não foi encontrada";
    }

    public String getCep() {
        return "Cep não localizado";
    }
}