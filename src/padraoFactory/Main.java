/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoFactory;

import padraoStrategy.Produto;

/**
 *
 * @author BLSoft
 */
public class Main {

    public static void main(String[] args) {
        
        Produto console = new Produto("Lalystation 5", 500, CalculoFactory.criarCalculo("FIXO"));
        console.calcularPrecoFinal();
        System.out.println(console);
        
        console.trocarDeEstrategia(CalculoFactory.criarCalculo("PREJUIZO"));
        console.calcularPrecoFinal();
        System.out.println(console);
        
        console.trocarDeEstrategia(CalculoFactory.criarCalculo("LUCRO"));
        console.calcularPrecoFinal();
        System.out.println(console);
        
    }
}
