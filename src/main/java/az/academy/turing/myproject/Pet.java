package az.academy.turing.myproject;

import java.util.Arrays;

public  abstract class Pet {
    private Species species;
    private String nickName;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String nickName, int age, int trickLevel,String[]habits) {
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet( String nickName) {
        this.nickName = nickName;
    }

    public Pet() {

    }


    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am " + getSpecies() + " and I am eating");
    }

    public abstract void respond();

    public void foul() {
        System.out.println("I need to cover it up");
    }




    @Override
    public String toString() {
        return species + "{nickname='" + nickName + "', age=" + age +
                ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
    }

}
