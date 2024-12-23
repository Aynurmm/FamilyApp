package az.academy.turing.myproject;

public class RoboCat extends Pet {

    public RoboCat(String nickName, int age, int trickLevel,String []habits) {
        super(nickName, age, trickLevel,habits);
        setSpecies(Species.ROBOCAT);
    }
    @Override
    public void respond() {
        System.out.println("Beep boop! I am RoboCat.");
    }

}
