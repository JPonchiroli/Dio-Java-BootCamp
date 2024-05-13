package edu.joao.bootcamp.modulo2.POO.Messenger;

public class Telegram extends ServicoDeMensagem{
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
