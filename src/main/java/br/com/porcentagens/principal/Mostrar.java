package br.com.porcentagens.principal;

import br.com.porcentagens.modelos.DezPorcento;
import br.com.porcentagens.modelos.VintePorcento;
import java.util.Scanner;

public class Mostrar {
    public static void main(String[] args) {
        //criando objeto da cless VintePorcento e DezPorcento
         DezPorcento calcular = new DezPorcento();
        VintePorcento calculo = new VintePorcento();
        //linha para importar o Scanner
        Scanner ler = new Scanner(System.in);
        //mensagem para mostrar o que é para ser feito na vairável abaixo
    System.out.println("Digite o salário:\nR$");
    //variável para digitar o salário
        double salario = ler.nextDouble();
        //cálculos para saber osvalores que serão acrescentados nos salários
        double calculo1 = salario * calcular.calcularPorcentagem();
        double calculo2= salario * calculo.calcularPorcentagemVinte();
        double valor1 = salario + calculo1;
        double valor2 = salario + calculo2;
                //condição
        if (salario <= 2000) {
            System.out.println("Ira receber, R$" + calculo1 + "a mais.");
            System.out.println( "O salário será:\nR$" + valor1);
        }else if (salario <= 5000){
            System.out.println("Irá receber, R$" + calculo2 + "a mais.");
        System.out.println("O salário será:\nR$" + valor2);
        }else {
        System.out.println("Não teve almento.");
        }


    }
}

