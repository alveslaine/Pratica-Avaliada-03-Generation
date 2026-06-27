package exercicio_02;

public class CarroEletrico extends Carro{
	private int bateria;

	public CarroEletrico(String modelo, int velocidade, int bateria) {
		super(modelo, velocidade);
		this.bateria = bateria;
	}
	public int getBateria() {
		return bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	@Override
	public void Acelerar(int valor) {
		
	}
	@Override
	public void Visualizar() {
		
	}

}
