package service;

import model.Dispositivo;

public class Service {

    public void ligarDispositivo(Dispositivo dispositivo) {
        if (!dispositivo.isLigado()) {
            dispositivo.ligar();
        } else {
            System.out.println(dispositivo.getClass().getSimpleName() + " já está ligado.");
        }
    }

    public void desligarDispositivo(Dispositivo dispositivo) {
        if (dispositivo.isLigado()) {
            dispositivo.desligar();
        } else {
            System.out.println(dispositivo.getClass().getSimpleName() + " já está desligado.");
        }
    }

    public void executarAcao(Dispositivo dispositivo) {
        if (dispositivo.isLigado()) {
            dispositivo.executarAcao();
        } else {
            System.out.println(dispositivo.getClass().getSimpleName() + " está desligado e não pode executar ação.");
        }
    }
}
