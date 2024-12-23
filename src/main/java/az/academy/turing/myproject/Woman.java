package az.academy.turing.myproject;

public final class Woman extends Human {
    public Woman(String name, String surname, int year, int iq, DayOfWeek[][] schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello my dear " + getFamily().getPet().getNickName() + ", how are you?");
    }

    public void applyMakeup() {
        System.out.println("I'm putting on my makeup.");
    }
}
