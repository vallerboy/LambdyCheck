package pl.oskarpolak.animals.checker;

import pl.oskarpolak.animals.Animal;
import pl.oskarpolak.animals.AnimalChecker;

/**
 * Created by OskarPraca on 2017-05-27.
 */
public class CheckRun implements AnimalChecker {
    @Override
    public boolean checkSkill(Animal animal) {
        return animal.isCanRun();
    }
}
