package model.interfaces;

import model.enums.Regency;
import model.enums.Sex;

/**
 * Interface para a abstração de uma pessoa
 */
public interface Person {

    /**
     * Obtem o nome da pessoa
     * @return o nome da pessoa
     */
    String getFirstName();

    /**
     * Obtem o sobrenome da pessoa
     * @return o sobrenome da pessoa
     */
    String getSecondName();

    /**
     * Obtem a regencia da pessoa
     * @return regencia da pessoa
     */
    Regency getRegency();

    /**
     * Obtem o sexo da pessoa
     * @return sexo da pessoa
     */
    Sex getSex();
}
