package pl.oskarpolak.animals;

import pl.oskarpolak.animals.checker.CheckJump;
import pl.oskarpolak.animals.checker.CheckRun;
import pl.oskarpolak.animals.checker.CheckSpeak;

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



        // ZAMIENIAMY NA LAMBDY
//        AnimalChecker checkJump = new CheckJump();
//        AnimalChecker checkRun = new CheckRun();
//        AnimalChecker checkSpeak = new CheckSpeak();

        checker(animalList, );
        checker(animalList, checkRun);
    }

    private static void checker(List<Animal> animals, AnimalChecker animalChecker){
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " : " + animalChecker.checkSkill(animal));
        }
    }
}
