package model.enums;

import model.interfaces.Person;

/**
 * Obtem o tipo de regência da 'Person'
 * @see Person
 */
public enum Regency {

    WARRIOR("Warrior"), WIZARD("Wizard"), 
    ORACLE("Oracle"), WILY("Wily"), 
    SHOOTER("Shooter"), TAMER("Tamer"),
    ILLUSIONIST("Illusionist"), SUMMONER("Summoner"),
    METAPHISIC("Metaphisic"), RUNIC("Runic"),
    GRUNPH("Grunph"), ARCAN("Arcan");

    /**
     * O tipo de regência
     */
    private String value;

    /**
     * Construtor de Enum
     * @param value O tipo de regência
     */
    Regency(String value) {
        this.value = value;
    }

    /**
     * Obtem a regência
     * @return O tipo de regência
     */
    public String getName() {
        return this.value;
    }
}
