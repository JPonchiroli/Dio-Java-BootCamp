package edu.joao.bootcamp.modulo2.POO.pilares;

public class MSNMessenger extends ServicoDeMensagem {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
}
