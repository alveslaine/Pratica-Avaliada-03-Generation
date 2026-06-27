package exercicio_03;

public class NotificacaoSMS extends Notificacao{
	String telefone;

	public NotificacaoSMS(String destinatario, String telefone) {
		super(destinatario);
		this.telefone = telefone;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public void enviar(String mensagem) {
		
	}
}
