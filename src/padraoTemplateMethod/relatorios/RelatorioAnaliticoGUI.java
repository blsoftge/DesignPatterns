package padraoTemplateMethod.relatorios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import padraoTemplateMethod.model.Produto;

public class RelatorioAnaliticoGUI extends GeradorDeRelatorios {

    @Override
    protected String gerarCabecalho(){
        SimpleDateFormat sdf = new SimpleDateFormat("H:m:s d/M/y G");
        return new String(
            "RELATORIO ANALÍTICO DE PRODUTOS VENDIDOS\n"+
            sdf.format(new Date()) +
            "\nBLSoft Sistemas Dev Corp.\n"
        );
    }

    @Override
    protected String gerarConteudo(List<Produto> produtos) {
        StringBuilder conteudo = new StringBuilder();
        double totalProdutos = 0;
        conteudo.append("\nPRODUTOS VENDIDOS\n");
        for (Produto produto : produtos) {
            totalProdutos += produto.getPreco();
            conteudo.append(produto.getNome() + "R$ " + produto.getPreco() + "\n");
        }
        conteudo.append("\nTOTAL EM R$" + totalProdutos);
        return conteudo.toString();
    }

    @Override
    protected void gerarVisualizacao(String cabecalho, String conteudo) {
        JOptionPane.showMessageDialog(null, cabecalho + conteudo, "Relatório analítico", JOptionPane.INFORMATION_MESSAGE);
    }
    
}