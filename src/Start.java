import model.interfaces.Person;
import model.interfaces.PersonFactory;
import provider.HumanFactory;
import view.PersonGenerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * Classe inicial do projeto
 */
public class Start {

    /**
     * Tamanho maximo de nome de pessoas
     */
    private static int MAX_NAME_SIZE;

    /**
     * Tamanho minimo de nome de pessoas
     */
    private static int MIN_NAME_SIZE;

    /**
     * Tamanho de pessoas a serem geradas
     */
    private static int PERSON_AMMOUNT;

    /**
     * Arquivo de saida de pessoas
     */
    private static String OUTPUT_FILE_NAME;

    /**
     * Método inicial
     * @param args parametros de sistema
     */
    public static void main(String[] args) {

        if(args.length > 0) {

            String arquivo = args[0];

            try {

                PersonGenerator generator = new PersonGenerator();
                initializeProperties(arquivo);

                PersonFactory humanFactory = new HumanFactory( MAX_NAME_SIZE, MIN_NAME_SIZE );
                List<Person> lista = generator.generateRandomPersonList(humanFactory, PERSON_AMMOUNT);

                generator.createFile(lista, OUTPUT_FILE_NAME);

            } catch (IOException exception) {
                System.out.println("Não foi possivel ler o arquivo: " + arquivo);
            }
        }else{
            System.out.println("O arquivo de configuração não foi declarado");
        }
    }

    private static void initializeProperties(String arquivo) throws IOException {
        InputStream input = new FileInputStream(arquivo);
        Properties properties = new Properties();
        properties.load(input);

        MAX_NAME_SIZE = Integer.parseInt(properties.getProperty("MAX_NAME_SIZE"));
        MIN_NAME_SIZE = Integer.parseInt(properties.getProperty("MIN_NAME_SIZE"));
        PERSON_AMMOUNT = Integer.parseInt(properties.getProperty("PERSON_AMMOUNT"));

        OUTPUT_FILE_NAME = properties.getProperty("OUTPUT_FILE_NAME");
    }
}
