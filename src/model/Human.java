package model;

import model.enums.Regency;
import model.enums.Sex;
import model.interfaces.Person;

/**
 * Classe responsável por referênciar um humano
 * @see Person
 */
public class Human implements Person {

    /**
     * Nome da pessoa
     */
    private String firstName;

    /**
     * Sobreome da pessoa
     */
    private String secondName;

    /**
     * Sexo da pessoa
     */
    private Sex sex;

    /**
     * Regencia da pessoa
     */
    private Regency regency;

    /**
     * Construtor que inicializa as variaveis principais
     * @param firstName Nome da pessoa
     * @param regency Regencia da pessoa
     * @param sex Sexo da pessoa
     */
    public Human(String firstName, String secondName, Sex sex, Regency regency) {

        boolean firstNameValidation = (firstName == null || firstName.isEmpty());
        if (firstNameValidation) {
            throw new IllegalArgumentException("Invalid name.");
        } else {
            this.firstName = firstName;
        }

        boolean secondtNameValidation = (secondName == null || secondName.isEmpty());
        if (secondtNameValidation) {
            throw new IllegalArgumentException("Invalid name.");
        } else {
            this.secondName = secondName;
        }

        boolean regencyValidation = (regency == null);
        if (regencyValidation) {
            throw new IllegalArgumentException("Invalid regence.");
        } else {
            this.regency = regency;
        }

        boolean sexValidation = (sex == null);
        if (sexValidation) {
            throw new IllegalArgumentException("Invalid sex.");
        } else {
            this.sex = sex;
        }
    }

    /**
     * Obtem o nome da pessoa
     * @return o nome da pessoa
     */
    @Override
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Obtem o sobreNome da pessoa
     * @return o sobreNome da pessoa
     */
    @Override
    public String getSecondName() {
        return this.secondName;
    }

    /**
     * Obtem a regencia da pessoa
     * @return regencia da pessoa
     */

    @Override
    public Regency getRegency() {
        return this.regency;
    }

    /**
     * Obtem o sexo da pessoa
     * @return sexo da pessoa
     */
    @Override
    public Sex getSex() {
        return this.sex;
    }
}