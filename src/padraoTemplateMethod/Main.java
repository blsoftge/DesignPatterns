/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoTemplateMethod;

import java.util.ArrayList;
import java.util.List;

import padraoTemplateMethod.model.Produto;
import padraoTemplateMethod.relatorios.GeradorDeRelatorios;
import padraoTemplateMethod.relatorios.RelatorioAnaliticoGUI;
import padraoTemplateMethod.relatorios.RelatorioSimpleConsole;

/**
 *
 * @author BLSoft
 */
public class Main {

    public static void main(String[] args) {
       
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Mouse", 10));
        produtos.add(new Produto("Computador", 1999));
        produtos.add(new Produto("LexLox 360", 500));

        GeradorDeRelatorios relatorioSimplesConsole = new RelatorioSimpleConsole();
        relatorioSimplesConsole.gerarRelatorios(produtos);

        GeradorDeRelatorios relatorioAnaliticoGUI = new RelatorioAnaliticoGUI();
        relatorioAnaliticoGUI.gerarRelatorios(produtos);

    }
}
