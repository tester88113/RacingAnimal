package lab_08;
import static lab_08.Animal.Builder;
public class TestAnimalBuilder {


    public void setBuilder(Animal.Builder builder) {
        Builder buildTest = new Builder();
        Builder animal = builder
                .setName("horse");


        System.out.println(animal);
    }

}
