package edu.joao.bootcamp.modulo2.POO.Interface.equipamentos.impressora;

public class Deskjet implements Impressora{
    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO COM DeskJet");
    }
}
