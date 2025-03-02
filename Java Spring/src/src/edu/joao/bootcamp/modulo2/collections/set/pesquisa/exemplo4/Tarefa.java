package edu.joao.bootcamp.modulo2.collections.set.pesquisa.exemplo4;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean statusConcluido;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isStatusConcluido() {
        return statusConcluido;
    }

    public void setStatusConcluido(boolean statusConcluido) {
        this.statusConcluido = statusConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", statusConcluido=" + statusConcluido +
                '}';
    }
}
