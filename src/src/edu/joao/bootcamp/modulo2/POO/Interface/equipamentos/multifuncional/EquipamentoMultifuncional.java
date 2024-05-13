package edu.joao.bootcamp.modulo2.POO.Interface.equipamentos.multifuncional;

import edu.joao.bootcamp.modulo2.POO.Interface.equipamentos.copiadora.Copiadora;
import edu.joao.bootcamp.modulo2.POO.Interface.equipamentos.digitalizadora.Digializadora;
import edu.joao.bootcamp.modulo2.POO.Interface.equipamentos.impressora.Impressora;

public class Equipamento implements Copiadora, Digializadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO VIA EQUIPAMENTO VIA MU");
    }

    @Override
    public void digitalizar() {

    }

    @Override
    public void imprimir() {

    }
}
