package az.academy.turing.myproject;

public class DomesticCat extends Pet implements Foulable {
    public DomesticCat(String nickName, int age, int trickLevel,String []habits) {
        super(nickName, age, trickLevel,habits);
        setSpecies(Species.DOMESTICCAT);
    }

    @Override
    public void respond() {
        System.out.println("Meow! I am a domestic cat named "+getNickName()+".");
    }

    @Override
    public void foul() {
        System.out.println("Cat scratched the furniture!");
    }
}
