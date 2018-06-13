package interactor;

import model.enums.*;

import java.util.Random;

/**
 * Classe para seleção aleatória de características
 */
public class Randomizer {

    /**
     * Método para seleção aleatória de valores dentro de um Enum
     * @param clazz classe do enum
     * @param <T> classe que extende enum
     * @return
     */
    private static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int index = new Random().nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[index];
    }

    /**
     * Obtem um sexo randomico
     * @return um sexo randomico
     */
    public static Sex randomSex(){
        return randomEnum(Sex.class);
    }

    /**
     * Obtem uma regencia randomica
     * @return uma regencia randomica
     */
    public static Regency randomRegency(){
        return randomEnum(Regency.class);
    }

    /**
     * Gera um nome aleatório
     * @param size quantidade de letras do nome
     * @return o nome
     */
    public static String generateRandomName(int size) {

        String consonant = "bcdfghjklmnpqrstvwxyz";
        String vowel = "aeiou";
        Random random = new Random();

        StringBuilder builder = new StringBuilder();
        String[] consonantArray = consonant.split("");
        String[] vowelArray = vowel.split("");

        for (int index = 0; index < size; index++) {
            String n;
            if (index % 2 == 0) {
                n = consonantArray[random.nextInt(consonant.length())];
            } else {
                n = vowelArray[random.nextInt(vowel.length())];
            }

            if (index == 0) {
                n = n.toUpperCase();
            }
            builder.append(n);
        }

        return builder.toString();
    }
}
