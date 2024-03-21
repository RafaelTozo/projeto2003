public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Rafa", "rafael.tozo@gmail.com", "senha123", 19, true);
        Usuario u2 = new Usuario("Vitor", "vitor.almeida@gmail.com", "password", 16, false);
        Usuario u3 = new Usuario("Alexia", "alexia.benitez@gmail.com", "pass456", 25, true);

        Menu m1 = new Menu("Menu");

        m1.mostrarMenu(u1);

    }
}