package lab_07_race;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.List;

//Horse:Max 75km/h
//        Tiger:Max 100Km/h
//        Dog:Max 60KM/h*
public class RacingBetweenAnimals {
    public static void main(String[] args) {
        Animal dog = new Dog();

        Animal horse = new Horse();

        Animal tiger = new Tiger();

        RacingBetweenAnimals racing = new RacingBetweenAnimals();
        Animal winner = RacingBetweenAnimals.winner(Arrays.asList(dog, horse, tiger));
        // System.out.println(" the winner is " + winner.getName()+  winner.getAnimalRandomSpeed());
        System.out.println(" the winner is " + winner);
    }

    public static Animal winner(@NotNull List<Animal> animalList) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < animalList.size(); i++) {


            if (max < animalList.get(i).getAnimalRandomSpeed()) {
                max = animalList.get(i).getAnimalRandomSpeed();
                index = i;
            }

        }
        return animalList.get(index);


    }
}




