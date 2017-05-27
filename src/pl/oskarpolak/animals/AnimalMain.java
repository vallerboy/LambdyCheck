package pl.oskarpolak.animals;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OskarPraca on 2017-05-27.
 */
public class AnimalMain {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Animal("Oskarda", true, true ,true));
        animalList.add(new Animal("Kangarooo", true, false ,true));
        animalList.add(new Animal("Papigu", false, true ,true));
        animalList.add(new Animal("Ptasznik", false, false ,false));



    }

    private static void checker(List<Animal> animals, AnimalChecker animalChecker){

    }
}
