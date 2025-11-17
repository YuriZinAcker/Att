public class App3 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addContatinho(new Contatinho("Nick Ferreira", "nick@gmail.com", "83988888", "Professor"));
        agenda.addContatinho(new Contatinho("Ana Clara", "ana@gmail.com", "99999999", "Amiga"));
        agenda.addContatinho(new Contatinho("Bruno", "bruno@hotmail.com", "98888888", "Trabalho"));
        agenda.addContatinho(new Contatinho("Carlos", "carlos@ex.com", "97777777", "Parente"));

        agenda.salvarLista();
    }
}
