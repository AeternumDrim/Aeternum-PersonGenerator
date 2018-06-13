package model.enums;

import model.interfaces.Person;

/**
 * Tipo de sexo das 'Person'
 * @see Person
 */
public enum Sex {

    MALE("Male"), FEMALE("Female");

    /**
     * Tipo da 'Person'
     */
    private String value;

    /**
     * Construtor de Enum
     * @param value O tipo de sexo da 'Person'
     */
    Sex(String value) {
        this.value = value;
    }

    /**
     * Obtem o tipo de sexo da 'Person'
     * @return O sexo da 'Person'
     */
    public String getName() {
        return this.value;
    }
}
