package edu.joao.bootcamp.modulo2.POO.Interface.estabelecimento;

import edu.joao.bootcamp.modulo2.POO.Interface.equipamentos.impressora.Deskjet;
import edu.joao.bootcamp.modulo2.POO.Interface.equipamentos.impressora.Impressora;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();

        impressora.imprimir();
    }
}
