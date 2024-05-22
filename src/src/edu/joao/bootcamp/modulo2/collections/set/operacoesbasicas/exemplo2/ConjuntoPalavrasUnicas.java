package edu.joao.bootcamp.modulo2.collections.set.operacoesbasicas.exemplo2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributos
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("JavaScript");
        conjuntoPalavrasUnicas.adicionarPalavra("C++");
        conjuntoPalavrasUnicas.adicionarPalavra("Ruby");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Java"));

        conjuntoPalavrasUnicas.removerPalavra("Java");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();


    }
}