package model.interfaces;

/**
 * Interface para a geração de pessoas
 */
public interface PersonFactory {

    /**
     * Gera uma pessoa partindo do nada
     * @return uma nova pessoa
     * @see Person
     */
    Person createRandomPerson();
}
