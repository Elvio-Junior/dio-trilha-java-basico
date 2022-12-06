package br.com.dio.exercicios;
/*
* Receber a temperatura media dos 6 primeiros meses do ano e aramzene em uma lista
* Calcular a media semestral das temperaturas 
* Mostrar todas as temperaturas acima desta média
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Temperatura {
    private String mes;
    private double temperatura;

    public Temperatura(String mes, double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }
    public String getMes() {
        return mes;
    }
    public double getTemperatura() {
        return temperatura;
    }
    @Override
    public String toString() {
        return "{mes=" + mes + ", temperatura=" + temperatura + "}";
    }
   
}
public class ListTemperaturaMedia {
    public static void main(String[] args) {

        List<Temperatura> temperaturas = new ArrayList<Temperatura>();
        List<Temperatura> temperaturasAcimaMedia = new ArrayList<Temperatura>();

        String mes = "";
        double temperatura = 0d, mediaSemestral = 0d, somaTemperatura = 0d;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o mes -> ");
            mes = leitor.next();
            System.out.print("Digite a temperatura -> ");
            temperatura = leitor.nextDouble();
            temperaturas.add(new Temperatura(mes, temperatura));
            
        }

        for (Temperatura temp : temperaturas) {
            somaTemperatura += temp.getTemperatura();
        }

        mediaSemestral = somaTemperatura / temperaturas.size();

        System.out.println("Temperaturas cadastradas -> " + temperaturas);
        System.out.println("Media Semestral das Temperaturas -> " + mediaSemestral);

        for (Temperatura temp : temperaturas) {
            if (temp.getTemperatura() >= mediaSemestral) temperaturasAcimaMedia.add(temp);

        }

        System.out.println("Temperaturas acima da media -> " + temperaturasAcimaMedia);
    }
    
}
