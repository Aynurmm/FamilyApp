package az.academy.turing.myproject;

public class Dog extends Pet implements Foulable {
    public Dog(String nickName, int age, int trickLevel,String[] habits) {
        super(nickName, age, trickLevel,habits);
        setSpecies(Species.DOG);
    }

    @Override
    public void respond() {
        System.out.println("Woof! I am a dog.");
    }

    @Override
    public void foul() {
        System.out.println("Dog made a mess in the garden!");
    }
}
