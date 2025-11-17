import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.print("Digite o nome para buscar: ");
        String nome = sc.nextLine().trim();

        Contatinho c = agenda.buscarPorNome(nome);

        if (c == null) {
            System.out.println("Contatinho não encontrado!");
        } else {
            System.out.println("Contatinho encontrado:");
            System.out.println("Nome: " + c.getNome());
            System.out.println("Email: " + c.getEmail());
            System.out.println("Telefone: " + c.getTelefone());
            System.out.println("Categoria: " + c.getCategoria());
        }

        sc.close();
    }
}
