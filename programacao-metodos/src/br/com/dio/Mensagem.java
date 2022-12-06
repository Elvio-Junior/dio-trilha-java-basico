package br.com.dio;

public class Mensagem {
  
    public static void obterMensagem(int hora) {

        switch(hora) {
            case 1:
            case 2:
                mensagemBomDia();
                break;
            case 3:
            case 4:
                mensagemBoaTarde();
                break;
            case 5:
            case 6:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora Invalida");
                break;
        }
    }

    private static void mensagemBoaNoite() {
        System.out.println("Boa noite");
    }

    private static void mensagemBoaTarde() {
        System.out.println("Boa tarde");
    }

    private static void mensagemBomDia() {
        System.out.println("Bom dia");
    }
}
