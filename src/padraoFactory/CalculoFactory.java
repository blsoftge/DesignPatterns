/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoFactory;

import padraoStrategy.padraoStrategy.estrategias.StrategyCalcFixo;
import padraoStrategy.padraoStrategy.estrategias.StrategyCalcLucro;
import padraoStrategy.padraoStrategy.estrategias.StrategyCalcPrejuizo;
import padraoStrategy.padraoStrategy.estrategias.StrategyCalculo;

/**
 *
 * @author BLSoft
 */
public class CalculoFactory {

    public static StrategyCalculo criarCalculo(String pTipoCalculo) {

        switch (pTipoCalculo) {

            case "FIXO":
                return new StrategyCalcFixo();

            case "LUCRO":
                return new StrategyCalcLucro();

            case "PREJUIZO":
                return new StrategyCalcPrejuizo();

            default:
                return null;

        }
    }
}
