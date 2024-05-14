package edu.joao.bootcamp.modulo2.POO.pilares;

public abstract class ServicoDeMensagem {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
}
