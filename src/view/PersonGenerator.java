package view;

import com.google.gson.Gson;
import model.interfaces.Person;
import model.interfaces.PersonFactory;
import provider.HumanFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Classe responsável por criar um mundo.
 */
public class PersonGenerator {

    /**
     * Gera uma lista de pessoas randomicamente
     */
    public List<Person> generateRandomPersonList(PersonFactory factory, int ammount) {

        List<Person> personList = new ArrayList();

        for(int i = 0; i < ammount; i++)
            personList.add(factory.createRandomPerson());

        return(personList);
    }

    public void createFile(List<Person> personList, String arquivo){

        try {
            Gson gson = new Gson();
            FileOutputStream outputStream = new FileOutputStream(arquivo);
            byte[] strToBytes = gson.toJson(personList).getBytes();
            outputStream.write(strToBytes);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Não foi possivel serializar o objeto.");
        }
    }
}
