package exercicio_03;

public class Notificacao {
    private String destinatario;

    public Notificacao(String destinatario) {
        Validacao.validarDestinatario(destinatario);
        this.destinatario = destinatario;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        Validacao.validarDestinatario(destinatario);
        this.destinatario = destinatario;
    }
    public void enviar(String mensagem) {
        Validacao.validarMensagem(mensagem);
        System.out.println("Enviando notificação para " + destinatario + ": " + mensagem);
    }
}