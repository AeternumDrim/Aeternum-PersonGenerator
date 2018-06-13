package provider;

import interactor.Randomizer;
import model.*;
import model.enums.Regency;
import model.enums.Sex;
import model.interfaces.Person;
import model.interfaces.PersonFactory;

import java.util.Random;

/**
 * Classe responsavel por gerar uma pessoa aleatoriamente
 * @see PersonFactory
 */
public class HumanFactory implements PersonFactory {

    /**
     * Tamanho máximo de nome
     */
    private int maxNameSize;

    /**
     * Tamanho miinimo de nome
     */
    private int minNameSize;

    /**
     * Construtor responsável por inicializar as variaveis principais
     */
    public HumanFactory(int maxNameSize, int minNameSize) {
        this.maxNameSize = maxNameSize;
        this.minNameSize = minNameSize;
    }

    /**
     * Gera uma pessoa partindo do nada
     * @return uma nova pessoa
     * @see Person
     */
    @Override
    public Person createRandomPerson() {

        Random random = new Random();

        int constant = this.maxNameSize - this.minNameSize;
        int firstNameSize = this.minNameSize + random.nextInt(constant);
        int secondNameSize = this.minNameSize + random.nextInt(constant);

        String firstName = Randomizer.generateRandomName(firstNameSize);
        String secondName = Randomizer.generateRandomName(secondNameSize);
        Sex sex = Randomizer.randomSex();
        Regency regency = Randomizer.randomRegency();

        return new Human(firstName, secondName, sex, regency);
    }
}
