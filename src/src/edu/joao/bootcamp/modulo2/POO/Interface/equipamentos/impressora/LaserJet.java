package edu.joao.bootcamp.modulo2.POO.Interface.equipamentos.impressora;

public class LaserJet implements Impressora{


    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO COM LaserJet");
    }
}
