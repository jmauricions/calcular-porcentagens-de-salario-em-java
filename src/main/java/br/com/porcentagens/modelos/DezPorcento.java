package br.com.porcentagens.modelos;
//class filha
public class DezPorcento extends Salario {
    //variável que recebe por cento
    private double bonus = 100;
//construtor
    public DezPorcento() {

    }
//método reescrito
    @Override
    //cálculo
    public double calcularPorcentagem() {
        return valorPorcentagem / bonus;
    }
}



