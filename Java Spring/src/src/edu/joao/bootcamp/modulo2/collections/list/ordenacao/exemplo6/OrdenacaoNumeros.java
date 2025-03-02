package edu.joao.bootcamp.modulo2.collections.list.ordenacao.exemplo6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numero> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente(){
        List<Numero> ordemAscendente = new ArrayList<>(numeroList);
        Collections.sort(ordemAscendente);
        return ordemAscendente;
    }

    public List<Numero> ordenarDecrescente(){
        List<Numero> ordenarDecrescente = new ArrayList<>(numeroList);
        ordenarDecrescente.sort(Collections.reverseOrder());
        return ordenarDecrescente;
    }

    public void exibirNumeros(){
        System.out.println(numeroList);
    }


    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(1);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDecrescente());
        ordenacaoNumeros.exibirNumeros();
    }
}
