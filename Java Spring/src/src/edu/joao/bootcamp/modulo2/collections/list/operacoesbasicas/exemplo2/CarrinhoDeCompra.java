package edu.joao.bootcamp.modulo2.collections.list.operacoesbasicas.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> carrinhoDeCompraList;

    public CarrinhoDeCompra() {
        this.carrinhoDeCompraList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompraList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : carrinhoDeCompraList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        carrinhoDeCompraList.removeAll(itensParaRemover);
    }

    public void calcularValorTotal(){
        double total = 0;
        for(Item i : carrinhoDeCompraList){
            total += i.getPreco() * i.getQuantidade();
        }
        System.out.println("R$" + total);
    }

    public void exibirItens(){
        if(carrinhoDeCompraList.isEmpty()){
            System.out.println("Lista Vazia");
        } else {
            System.out.println(carrinhoDeCompraList);
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.adicionarItem("Sabão", 5.5, 2);
        carrinhoDeCompra.adicionarItem("Amaciante", 10.5, 1);
        carrinhoDeCompra.calcularValorTotal();
        carrinhoDeCompra.exibirItens();
        carrinhoDeCompra.adicionarItem("Amaciante", 10.5, 1);
        carrinhoDeCompra.removerItem("Amaciante");
        carrinhoDeCompra.exibirItens();
    }


}
