package edu.joao.bootcamp.modulo2.collections.map.ordenacao.exemplo6;

import java.util.*;

public class LivrariaOnline{
    private Map<String, Livro> livrariaMap;

    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livrariaMap.put(link, livro);
    }

    public void removerLivro(String titulo){
        livrariaMap.remove(titulo);
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrariaMap.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirlivrariaMapOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrariaMapParaOrdenarPorAutor = new ArrayList<>(livrariaMap.entrySet());

        Collections.sort(livrariaMapParaOrdenarPorAutor, new ComparatorPorAutor());

        Map<String, Livro> livrariaMapOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrariaMapParaOrdenarPorAutor) {
            livrariaMapOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrariaMapOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarlivrariaMapPorAutor(String autor) {
        Map<String, Livro> livrariaMapPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                livrariaMapPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrariaMapPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrariaMapMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livrariaMap.isEmpty()) {
            for (Livro livro : livrariaMap.values()) {
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, Livro> entry: livrariaMap.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livrariaMap.get(entry.getKey());
                livrariaMapMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrariaMapMaisCaros;
    }

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrariaMapMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livrariaMap.isEmpty()) {
            for (Livro livro : livrariaMap.values()) {
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, Livro> entry: livrariaMap.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livrariaMap.get(entry.getKey());
                livrariaMapMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrariaMapMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livrariaMap à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        // Exibe todos os livrariaMap ordenados por preço
        System.out.println("livrariaMap ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        //Exibe todos os livrariaMap ordenados por autor
        System.out.println("livrariaMap ordenados por autor: \n" + livrariaOnline.exibirlivrariaMapOrdenadosPorAutor());

        // Pesquisa livrariaMap por autor
        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarlivrariaMapPorAutor(autorPesquisa);

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livrariaMap);

    }
}
