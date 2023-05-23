package br.com.porcentagens.modelos;
//class filha
public class VintePorcento extends Salario{
    //variável da porcentagem
    private double cem = 100;
//método construtor
    public VintePorcento() {

    }
//reescrita do método
    @Override
    public double calcularPorcentagemVinte() {
        //cálculo
return valorPorcentagemVinte / cem;
    }
}

