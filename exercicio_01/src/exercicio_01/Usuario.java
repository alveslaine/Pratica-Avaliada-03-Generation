package exercicio_01;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import exercicio_01.Cores;

	public class Usuario {
	    private String nome;
	    private String email;
	    private static List<Usuario> listaUsuarios = new ArrayList<>();

    public Usuario(String nome, String email) {
        validarNome(nome);
        validarEmail(email);
        this.nome = nome;
        this.email = email;
    }
    public static void main(String[] args) {
        criarUsuariosTeste();

        System.out.println("\n================================================");
        System.out.println("                Lista de Usuários              ");
        System.out.println("================================================");
        for (Usuario u : listaUsuarios) {
            u.visualizar();
       }
    } 
    private void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
    }
    private void validarEmail(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (email == null || !Pattern.matches(regex, email)) {
            throw new IllegalArgumentException("Email inválido.");
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        validarNome(nome);
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        validarEmail(email);
        this.email = email;
    }
    public void visualizar() {
        System.out.println("Usuário: " + nome + " | Email: " + email);
    }
    public static void cadastrar(Usuario usuario) {
        listaUsuarios.add(usuario);
		System.out.printf(Cores.TEXT_GREEN + "O User %s foi cadastrado com sucesso!\n"+ Cores.TEXT_RESET, usuario.getNome());
    }
    public static void criarUsuariosTeste() {
        try {
            Usuario u1 = new Usuario("Maria", "maria@email.com");
            cadastrar(u1);

            Usuario u2 = new Usuario("Carlos", "carlos@email.com");
            cadastrar(u2);

            Administrador a1 = new Administrador("João", "joao@email.com", "SuperAdmin");
            cadastrar(a1);
        } catch (Exception e) {
        	System.err.println( "Erro ao criar usuário/administrador: " + e.getMessage());
        }
    }
    
}
