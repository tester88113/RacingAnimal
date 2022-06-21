package lab_07_race;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private int maxSpeed = 20;
    private int animalRandomSpeed = new SecureRandom().nextInt(maxSpeed);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //public Animal(){};
    public Animal(String name, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.name = name;

    }

    public int getAnimalRandomSpeed() {

        return animalRandomSpeed;
    }

    public void setAnimalRandomSpeed(int animalRandomSpeed) {
        this.animalRandomSpeed = animalRandomSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return this.name + " " + this.getAnimalRandomSpeed();
    }


}
