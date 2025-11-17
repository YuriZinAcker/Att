import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        String nomeArquivo = "tabuada_" + num + ".txt";

        try {
            FileWriter fw = new FileWriter(nomeArquivo);

            for (int i = 1; i <= 10; i++) {
                fw.write(num + " x " + i + " = " + (num * i) + "\n");
            }

            fw.close();
            System.out.println("Arquivo '" + nomeArquivo + "' criado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo.");
        }
    }
}