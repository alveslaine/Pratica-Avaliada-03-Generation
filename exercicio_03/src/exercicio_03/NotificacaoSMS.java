package exercicio_03;

public class NotificacaoSMS extends Notificacao {

    public NotificacaoSMS(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem) {
        Validacao.validarMensagem(mensagem);
        System.out.println("Enviando SMS para "+ getDestinatario() + ": " + mensagem);
    }
}