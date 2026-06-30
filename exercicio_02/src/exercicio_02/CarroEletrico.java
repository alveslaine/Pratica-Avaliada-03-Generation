package exercicio_02;

public class CarroEletrico extends Carro {
    private int nivelBateria;

    public static final int consumoPorAceleracao = 2;
    public CarroEletrico(String modelo, int velocidade, int nivelBateria) {
        super(modelo, velocidade);
        Validacao.validarNivelBateria(nivelBateria);
        this.nivelBateria = nivelBateria;
    }
    public int getNivelBateria() {
        return nivelBateria;
    }
    public void setNivelBateria(int nivelBateria) {
        Validacao.validarNivelBateria(nivelBateria);
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void acelerar(int valor) {
        Validacao.validarAceleracao(valor);
        int consumo = valor * consumoPorAceleracao;
        Validacao.validarConsumoBateria(consumo, nivelBateria);
        nivelBateria -= consumo;
        setVelocidade(getVelocidade() + valor);
    }

    @Override
    public void visualizar() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Velocidade atual: " + getVelocidade() + " km/h");
        System.out.println("Bateria restante: " + nivelBateria + "%");
    }
}