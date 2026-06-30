package exercicio_03;

import java.util.regex.Pattern;

public class Validacao {

    public static void validarMensagem(String mensagem) {
        if (mensagem == null || mensagem.trim().isEmpty()) {
            throw new IllegalArgumentException("Mensagem não pode ser nula ou vazia.");
        }
    }
    public static void validarDestinatario(String destinatario) {
        if (destinatario == null || destinatario.trim().isEmpty()) {
            throw new IllegalArgumentException("Destinatário não pode ser nulo ou vazio.");
        }
        String regexEmail = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        String regexTelefone = "^\\d{10,11}$";

        if (!Pattern.matches(regexEmail, destinatario)&& !Pattern.matches(regexTelefone, destinatario)) {
            throw new IllegalArgumentException("Destinatário inválido (email ou telefone).");
        }
    }
}