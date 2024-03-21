public class Usuario {
    private String username;
    private String email;

    private String senha;
    private int idade;
    private boolean verificado;

    public Usuario(String username, String email, String senha, int idade, boolean verificado){
        this.username = username;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
        this.verificado = verificado;
    }

}
