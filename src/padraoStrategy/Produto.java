/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoStrategy;

import padraoStrategy.padraoStrategy.estrategias.StrategyCalculo;

/**
 *
 * @author BLSoft
 */
public class Produto {
    private String nome;
    private double preco;
    private double precoFinal;
    private StrategyCalculo estrategiaDeCalculo;

    public Produto(String nome, double preco, StrategyCalculo estrategiaDeCalculo) {
        this.nome = nome;
        this.preco = preco;
        this.estrategiaDeCalculo = estrategiaDeCalculo;
    }

    //aqui é onde a estrategia ocorre - trocas dos algoritmos
    public void calcularPrecoFinal(){
        this.precoFinal = this.estrategiaDeCalculo.calcularLucro(this.preco);
    }
    
    public void trocarDeEstrategia(StrategyCalculo novaEstrategia){
        this.estrategiaDeCalculo = novaEstrategia;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + ", precoFinal=" + precoFinal + ", estrategiaDeCalculo=" + estrategiaDeCalculo + '}';
    }
    
}
