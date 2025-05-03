package model;

import interfaces.Conectavel;
import java.util.Random;

public class SensorTemp extends Dispositivo implements Conectavel {

    public SensorTemp(String id, String nome) {
        super(id, nome);
    }

    @Override
    public void executarAcao() {
        double temperatura = new Random().nextDouble() * 40;
        System.out.printf("%s mediu a temperatura: %.2f°C%n", nome, temperatura);
    }

    @Override
    public void conectar() {
        System.out.println(nome + " conectado à rede.");
    }

    @Override
    public void desconectar() {
        System.out.println(nome + " desconectado da rede.");
    }
}
