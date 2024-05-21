package edu.joao.bootcamp.modulo2.collections.list.pesquisa.exemplo4;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numeros> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(new Numeros(numero));
    }

    public int calcularSoma(){
        int soma = 0;
        if(!numerosList.isEmpty()){
            for (Numeros n : numerosList){
                soma += n.getNumero();
            }
        }
        return soma;
    }

    public int encontrarMaiorValor(){
        int maiorValor = 0;
        if(!numerosList.isEmpty()){
            for (Numeros n : numerosList){
                if(n.getNumero() > maiorValor){
                    maiorValor = n.getNumero();
                }
            }
        }
        return maiorValor;
    }

    public int encontrarMenorValor(){
        int menorValor = Integer.MAX_VALUE;
        if(!numerosList.isEmpty()){
            for (Numeros n : numerosList){
                if(n.getNumero() < menorValor){
                    menorValor = n.getNumero();
                }
            }
        }
        return menorValor;
    }

    public void exibirNumeros(){
        if(!numerosList.isEmpty()){
            for (Numeros n : numerosList){
                System.out.println("| " + n + " |");
            }
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorValor());
        System.out.println(somaNumeros.encontrarMenorValor());
        somaNumeros.exibirNumeros();
    }

}
