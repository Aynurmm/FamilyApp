package az.academy.turing.myproject;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private DayOfWeek[][] schedule;
    private Family family;


    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human(String name, String surname, int year, int iq, DayOfWeek[][] schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }

    public Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public DayOfWeek[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(DayOfWeek[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }


    public void greetPet() {
        System.out.println("Hello, " + family.getPet().getNickName());
    }

    public void describePet() {
        String slyness = (family.getPet().getTrickLevel() > 50) ? "Very sly" : "Almost not sly";
        System.out.println("I have an " + family.getPet().getSpecies() + "is " + family.getPet().getAge() + "years old.He is very  ");
    }

    public boolean feedPet(boolean isFeedingtime) {

        Random random = new Random();
        int randomNumb = random.nextInt(101);

        if (pet == null) {
            System.out.println("No pet assigned to " + name);
            return false;
        }
        if (isFeedingtime) {
            System.out.println("\"Hm... I will feed Jack's dog.\"");
            return true;
        }
        if (!isFeedingtime) {
            if (family.getPet().getTrickLevel() > randomNumb) {
                System.out.println("\"Hm... I will feed Jack's" + family.getPet().getSpecies() + "'s dog.\"");
                return true;
            } else {
                System.out.println("I think Jack is not hungry.");
                return false;
            }

        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Arrays.equals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year +
                ", iq=" + iq + ", schedule= " + Arrays.toString(schedule) + "}";
    }
}

