package edu.joao.bootcamp.modulo2.POO.Messenger;

public class Computador {
    public static void main(String[] args) {
        ServicoDeMensagem smi = null;

        String appEscolhido="tlg";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
