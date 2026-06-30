package exercicio_02;

import java.util.ArrayList;

public class TestaCarros {

    public static void main(String[] args) {

        System.out.println("===================================================================");
        System.out.println("                          Testes de Carros                         ");
        System.out.println("===================================================================");

        ArrayList<String> erros = new ArrayList<>();
        testarCarro("Tesla Model 3", 0, 20, 10, erros);
        testarCarro("BYD Dolphin", 20, 50, 0, erros);
        testarCarro("Fiat 500e", 40, 5, 10, erros);
        testarCarro("Volvo EX30", 60, 120, 10, erros);
        System.out.println("\n========================== EXCEÇÕES ==========================");
        for (String erro : erros) {
            System.err.println(erro);
        }
    }
    public static CarroEletrico criarCarroEletrico(String modelo, int velocidade, int bateria) {
        return new CarroEletrico(modelo, velocidade, bateria);
    }
    public static void testarCarro(String modelo, int velocidade, int bateria, int aceleracao, ArrayList<String> erros) {
        try {
            System.out.println("Modelo: " + modelo);
            System.out.println("Velocidade inicial: " + velocidade + " km/h");
            System.out.println("Bateria: " + bateria + "%");
            System.out.println("Aceleração: " + aceleracao + " km/h");

            CarroEletrico carro = criarCarroEletrico(modelo, velocidade, bateria);
            carro.acelerar(aceleracao);
            System.out.println("\nModelo: " + carro.getModelo());
            System.out.println("Velocidade atual: " + carro.getVelocidade() + " km/h");
            System.out.println("Bateria restante: " + carro.getNivelBateria() + "%");

        } catch (Exception e) {
            erros.add("Erro no " + modelo + ": " + e.getMessage());
        }
        System.out.println("------------------------------------------------------------");
    }
}