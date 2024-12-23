package az.academy.turing.myproject;

public final class Man extends Human {
    public Man(String name, String surname, int year, int iq, DayOfWeek[][] schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    @Override
    public void greetPet() {
        System.out.println("Hey buddy, " + getFamily().getPet().getNickName() + "! Let's go for a walk.");
    }

    public void repairCar() {
        System.out.println("I'm fixing my car.");
    }
}
