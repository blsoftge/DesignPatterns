/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoStrategy;

import padraoStrategy.padraoStrategy.estrategias.StrategyCalcLucro;
import padraoStrategy.padraoStrategy.estrategias.StrategyCalcPrejuizo;

/**
 *
 * @author BLSoft
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StrategyCalcPrejuizo strategyCalcPrejuizo = new StrategyCalcPrejuizo();
        StrategyCalcLucro strategyCalcLucro = new StrategyCalcLucro();

        Produto consoleNovaGeracao = new Produto("Lalystation 5", 500, strategyCalcPrejuizo);
        consoleNovaGeracao.calcularPrecoFinal();
        System.out.println(consoleNovaGeracao);

        consoleNovaGeracao.trocarDeEstrategia(strategyCalcLucro);
        consoleNovaGeracao.calcularPrecoFinal();
        System.out.println(consoleNovaGeracao);
    }
}
