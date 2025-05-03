package model;

import interfaces.Conectavel;

public class Lampada extends Dispositivo implements Conectavel {

    private boolean luzAcesa;

    public Lampada(String id, String nome) {
        super(id, nome);
        this.luzAcesa = false;
    }

    @Override
    public void executarAcao() {
        luzAcesa = !luzAcesa;
        System.out.println(nome + (luzAcesa ? " acendeu a luz." : " apagou a luz."));
    }

    @Override
    public void conectar() {
        System.out.println(nome + " conectada à rede.");
    }

    @Override
    public void desconectar() {
        System.out.println(nome + " desconectada da rede.");
    }
}
