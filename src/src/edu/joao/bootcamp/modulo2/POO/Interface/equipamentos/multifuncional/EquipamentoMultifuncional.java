package edu.joao.bootcamp.modulo2.POO.Interface.equipamentos.multifuncional;

import edu.joao.bootcamp.modulo2.POO.Interface.equipamentos.copiadora.Copiadora;
import edu.joao.bootcamp.modulo2.POO.Interface.equipamentos.digitalizadora.Digializadora;
import edu.joao.bootcamp.modulo2.POO.Interface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digializadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
}
