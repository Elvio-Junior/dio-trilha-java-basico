import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CheckedException {
    public static void main(String[] args) {
        String nomeArquivo = "/home/ubuntu/pessoal/repositorio/java/dio-trilha-java-basico/programacao-exceptions/br/com/dio/exceptions/exception.txt";
        try {
            imprimirArquivoConsole(nomeArquivo);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Erro ao imprimir o arquivo");
            e.printStackTrace();
        }

    }

    private static void imprimirArquivoConsole(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(line != null);

        bw.flush();
        br.close();

    }
}
