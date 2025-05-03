package model;

public abstract class Dispositivo {
    protected String id;
    protected String nome;
    protected boolean ligado;

    public Dispositivo(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println(nome + " ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println(nome + " desligado.");
    }

    public boolean isLigado() {
        return ligado;
    }

    public abstract void executarAcao();
}
