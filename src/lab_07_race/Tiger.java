package lab_07_race;
//Horse:Max 75km/h
//        Tiger:Max 100Km/h
//        Dog:Max 60KM/h*

public class Tiger extends Animal {
    static final int MAX_SPEED = 100;

    public Tiger() {
        super("tiger", MAX_SPEED);
    }

}
