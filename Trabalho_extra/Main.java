import model.Lampada;
import model.SensorTemp;
import service.Service;
import interfaces.Conectavel;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        //conexões
        System.out.println("\u001B[33mConectando dispositivos...\u001B[0m");
        Lampada lampada1 = new Lampada("1", "Lâmpada Sala");
        SensorTemp sensor1 = new SensorTemp("2", "Sensor Cozinha");
        System.out.println("\u001B[32mDispositivos conectados com sucesso!\u001B[0m");
        //executando ações
        System.out.println("Executando ações...");
        System.out.println("Aguarde...");
        //ligando e desligando dispositivos
        Conectavel[] dispositivos = {lampada1, sensor1};
        //conectando dispositivos
        for (Conectavel d : dispositivos) {
            d.conectar();
        }
        //executando ações
        System.out.println("\u001B[34mDispositivos conectados com sucesso!\u001B[0m");
        service.ligarDispositivo(lampada1);
        service.executarAcao(lampada1);
        System.out.println("\u001B[34mDispositivos conectados com sucesso!\u001B[0m");
        service.ligarDispositivo(sensor1);
        service.executarAcao(sensor1);
        System.out.println("\u001B[34mDispositivos conectados com sucesso!\u001B[0m");
        service.desligarDispositivo(lampada1);
        service.executarAcao(lampada1);
        System.out.println("\u001B[34mDispositivos conectados com sucesso!\u001B[0m");
        for (Conectavel d : dispositivos) {
            d.desconectar();
        }
    }
}
