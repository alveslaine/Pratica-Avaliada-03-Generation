package exercicio_02;

public class Validacao {

    public static void validarAceleracao(int aceleracao) {

        if (aceleracao <= 0) {
            throw new IllegalArgumentException("A aceleração deve ser maior que zero.");
        }
    }
    public static void validarVelocidade(int velocidade) {
        if (velocidade < 0) {
            throw new IllegalArgumentException("A velocidade não pode ser negativa.");
        }
    }
    public static void validarNivelBateria(int nivel) {
        if (nivel < 0 || nivel > 100) {
            throw new IllegalArgumentException("O nível da bateria deve estar entre 0 e 100.");
        }
    }
    public static void validarConsumoBateria(int consumo, int nivelAtual) {
        if (consumo > nivelAtual) {
            throw new IllegalArgumentException("Bateria insuficiente para essa aceleração.");
        }
    }
}