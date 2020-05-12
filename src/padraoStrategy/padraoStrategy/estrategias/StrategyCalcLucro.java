/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoStrategy.padraoStrategy.estrategias;

/**
 *
 * @author BLSoft
 */
public class StrategyCalcLucro implements StrategyCalculo{

    private final int LUCRO = 2;
    
    @Override
    public double calcularLucro(double preco) {
        return preco * LUCRO;
    }
    
}
