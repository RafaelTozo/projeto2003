public class Menu {
    private String nomeMenu;

    public Menu(String nomeMenu){
        this.nomeMenu = nomeMenu;
    }

    public void mostrarMenu(Usuario u1){
        System.out.println(u1.getUsername());
        System.out.println(u1.getIdade());
        System.out.println(u1.getEmail());
        System.out.println(u1.getSenha());
        System.out.println(u1.getVerificado());
    }

    public void MostrarOpcoes(){

        System.out.println("Selecione uma das opcoes de 1-5");
        System.out.println("1 - Cadastrar usuário;");
        System.out.println("2 - Entrar em usuário existente;");
        System.out.println("3 - Renomear usuário;");
        System.out.println("4 - Alterar senha");
        System.out.println("5 - Deletar usuário");

    }
}
