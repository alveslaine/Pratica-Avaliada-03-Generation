package exercicio_03;

public class NotificacaoEmail extends Notificacao {
	String email;

	public NotificacaoEmail(String destinatario, String email) {
		super(destinatario);
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
    public void enviar(String mensagem) {
		
	}
}
