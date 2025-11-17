import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Agenda {
    private ArrayList<Contatinho> lista = new ArrayList<>();

    public void addContatinho(Contatinho c) {
        lista.add(c);
    }

    public void ordenarLista() {
        Collections.sort(lista, Comparator.comparing(Contatinho::getNome, String.CASE_INSENSITIVE_ORDER));
    }

    public void salvarLista() {
        ordenarLista();

        try (FileWriter fw = new FileWriter("contatinhos.txt")) {
            for (Contatinho c : lista) {
                fw.write(c.toFileString());
                fw.write(System.lineSeparator());
            }
            System.out.println("Arquivo 'contatinhos.txt' salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    public Contatinho buscarPorNome(String nomeBuscado) {
        File arq = new File("contatinhos.txt");
        if (!arq.exists()) {
            System.out.println("Arquivo 'contatinhos.txt' não existe.");
            return null;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] p = linha.split("#", -1); 
                if (p.length >= 4) {
                    String nome = p[0];
                    String email = p[1];
                    String telefone = p[2];
                    String categoria = p[3];

                    if (nome.equalsIgnoreCase(nomeBuscado)) {
                        return new Contatinho(nome, email, telefone, categoria);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return null;
    }
}
