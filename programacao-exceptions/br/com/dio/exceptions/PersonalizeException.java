import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class PersonalizeException {
    
    public static void main(String[] args) {
        String nomeArquivo = "/home/ubuntu/pessoal/repositorio/java/dio-trilha-java-basico/programacao-exceptions/br/com/dio/exceptions/excepion.txt";
        
        imprimirArquivoConsole(nomeArquivo);

    }

    private static void imprimirArquivoConsole(String nomeArquivo)  {

        
        try {
            BufferedReader br = lerArquivo(nomeArquivo);
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while(line != null);
    
            bw.flush();
            br.close();
        } catch (ErroAberturaArquivoException e) {
            System.out.println("Erro abertura arquivo. " + e.getMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }

    private static BufferedReader lerArquivo(String nomeArquivo) throws ErroAberturaArquivoException{
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException e) {
            throw new ErroAberturaArquivoException("Arquivo Não Encontrado", file.getName(), file.getPath());
        }
    }
}

class ErroAberturaArquivoException extends Exception {
    private String NomeDoArquivo;
    private String diretorio;
    
    public ErroAberturaArquivoException(String message, String nomeDoArquivo, String diretorio) {
        super(message + ". Nome " + nomeDoArquivo + " . Caminho " + diretorio);
        NomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ErroAberturaArquivoException {NomeDoArquivo=" + NomeDoArquivo + ", diretorio=" + diretorio + "}";
    }


}