package edu.joao.bootcamp.modulo2.POO.Interface.equipamentos.digitalizadora;

public class Scanner implements Digializadora{

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO");
    }
}
