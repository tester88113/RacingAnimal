package lab_07_race;
//Horse:Max 75km/h
//        Tiger:Max 100Km/h
//        Dog:Max 60KM/h*

public class Horse extends Animal{
    static final int MAX_SPEED= 75;

    public Horse()
    {
        super("horse", MAX_SPEED);
    }

}
