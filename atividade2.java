import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        String nomeArquivo = "tabuada_" + num + ".txt";
        File arquivo = new File(nomeArquivo);

        if (!arquivo.exists()) {
            System.out.println("O arquivo '" + nomeArquivo + "' não existe.");
            return;
        }

        try {
            Scanner leitor = new Scanner(arquivo);
            System.out.println("\nConteúdo do arquivo:");

            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o arquivo.");
        }
    }
}