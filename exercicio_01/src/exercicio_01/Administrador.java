package exercicio_01;

public class Administrador extends Usuario {
    private String nivelAcesso;

    public Administrador(String nome, String email, String nivelAcesso) {
        super(nome, email);
        this.nivelAcesso = nivelAcesso;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public void visualizar() {
        System.out.println(Cores.TEXT_YELLOW + "Administrador: " + getNome() + " | Email: " + getEmail() + " | Nível de Acesso: " + nivelAcesso + Cores.TEXT_RESET);
    }
}
