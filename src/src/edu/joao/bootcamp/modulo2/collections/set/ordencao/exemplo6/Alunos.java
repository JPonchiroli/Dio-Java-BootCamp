package edu.joao.bootcamp.modulo2.collections.set.ordencao.exemplo6;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos>{
    private long matricula;
    private String nome;
    private double media;

    public Alunos(String nome, long matricula, double media) {
        this.matricula = matricula;
        this.nome = nome;
        this.media = media;
    }

    @Override
    public int compareTo(Alunos a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return matricula == alunos.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", media=" + media +
                '}';
    }
}

class ComparatorPorNota implements Comparator<Alunos> {
    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}