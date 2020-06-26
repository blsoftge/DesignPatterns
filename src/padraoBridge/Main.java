/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoBridge;

import java.util.ArrayList;
import java.util.List;

import padraoBridge.model.Produto;
import padraoBridge.relatorios.GeradorDeRelatorios;
import padraoBridge.relatorios.RelatorioAnalitico;
import padraoBridge.relatorios.RelatorioSimples;
import padraoBridge.visualizadores.VisualizacaoConsole;
import padraoBridge.visualizadores.VisualizacaoGUI;

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
        produtos.add(new Produto("Peteca", 5));
        
        VisualizacaoConsole visualizacaoConsole = new VisualizacaoConsole();
        VisualizacaoGUI visualizacaoGUI = new VisualizacaoGUI();

        GeradorDeRelatorios relatorioSimples = new RelatorioSimples(visualizacaoGUI);
        relatorioSimples.gerarRelatorios(produtos);

        GeradorDeRelatorios relatorioAnalitico = new RelatorioAnalitico(visualizacaoConsole);
        relatorioAnalitico.gerarRelatorios(produtos);
    }
}
