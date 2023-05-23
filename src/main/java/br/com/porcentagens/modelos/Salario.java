package br.com.porcentagens.modelos;

//class principal
public class Salario {
    //variáveis com os valores das porcentagens
    protected double valorPorcentagem = 10;
    protected double valorPorcentagemVinte = 20;
//construtor
    public Salario() {

    }
//métodos
    public double calcularPorcentagem() {
        return  valorPorcentagem;
    }

    public double calcularPorcentagemVinte() {
        return valorPorcentagemVinte;
    }
}


