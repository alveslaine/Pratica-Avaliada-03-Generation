package exercicio_03;

public class TestaMensagem {

    public static void main(String[] args) {

        System.out.println("============================================================");
        System.out.println("                 Teste de Notificações");
        System.out.println("============================================================");

        testeEmailValido();
        testeSMSValido();
        testeMensagemVazia();
        testeDestinatarioVazio();
        testeTipoInvalido();
    }
    public static void criarNotificacao(String tipo, String destinatario, String mensagem) {
        if (tipo.equalsIgnoreCase("Email")) {
            NotificacaoEmail email = new NotificacaoEmail(destinatario);
            email.enviar(mensagem);
        } else if (tipo.equalsIgnoreCase("SMS")) {
            NotificacaoSMS sms = new NotificacaoSMS(destinatario);
            sms.enviar(mensagem);
        } else {
            throw new IllegalArgumentException("Tipo inválido. Use Email ou SMS.");
        }
    }
    public static void testeEmailValido() {
        try {
            System.out.println(Cores.TEXT_GREEN + "\n-------------------- EMAIL VÁLIDO --------------------" +Cores.TEXT_RESET);
            criarNotificacao("Email", "maria@email.com","Olá Maria!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public static void testeSMSValido() {
        try {
            System.out.println(Cores.TEXT_GREEN +"\n---------------------- SMS VÁLIDO ----------------------"+ Cores.TEXT_RESET);
            criarNotificacao("SMS", "11987654321", "Código 1234");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public static void testeMensagemVazia() {
        try {
            System.out.println(Cores.TEXT_RED + "\n------------------- MENSAGEM VAZIA --------------------"+ Cores.TEXT_RESET);
            criarNotificacao("Email", "teste@email.com", "");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public static void testeDestinatarioVazio() {
        try {
            System.out.println(Cores.TEXT_RED +"\n------------------ DESTINATÁRIO VAZIO --------------------"+ Cores.TEXT_RESET);
            criarNotificacao("SMS", "", "Mensagem teste");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public static void testeTipoInvalido() {
        try {
            System.out.println(Cores.TEXT_RED +"\n-------------------- TIPO INVÁLIDO --------------------"+ Cores.TEXT_RESET);
            criarNotificacao("Push", "teste@email.com", "Mensagem teste");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}