package edu.crespo.primeiraparte;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smarTv = new SmartTv();

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.aumentarVolume();
        System.out.println("Volume Atual: " + smarTv.volume);

        System.out.println("Canal Atual: " + smarTv.canal);
        smarTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smarTv.canal);

        System.out.println("Tv ligada? " + smarTv.ligada);

        smarTv.ligar();
        System.out.println("Novo Status -> Tv ligada? " + smarTv.ligada);

        smarTv.desligar();
        System.out.println("Novo Status -> Tv ligada? " + smarTv.ligada);
    }
}
