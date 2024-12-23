package az.academy.turing.myproject;

public class Main {
    public static void main(String[] args) {
        Human mother=new Human("Nigar","Sultanova",1990);
        Human father=new Human("Veli","Ehmedov",1988);
        Family family = new Family(mother, father);

        Pet dog = new Dog("Buddy", 5, 70, new String[]{"running", "playing"});
//        Family family = new Family();
        family.setPet(dog);

        Man man = new Man("John", "Doe", 1985, 120, null, family);
        Woman woman = new Woman("Jane", "Doe", 1988, 110, null, family);

        man.greetPet();
        woman.greetPet();

        man.repairCar();
        woman.applyMakeup();

        Fish fish = new Fish("Nemo", 1, 10, new String[]{"swimming", "hiding"});
        Dog dog1 = new Dog("Buddy", 3, 50, new String[]{"running", "barking"});
        DomesticCat cat = new DomesticCat("Whiskers", 2, 30, new String[]{"sleeping", "climbing"});
        RoboCat roboCat = new RoboCat("Robo", 5, 70, new String[]{"charging", "cleaning"});

        String[][] schedule=new String [7][2];
        schedule[DayOfWeek.MONDAY.ordinal()] = new String[]{"Monday", "Voleyball"};
        schedule[DayOfWeek.TUESDAY.ordinal()] = new String[]{"Tuesday", "Read book"};
        schedule[DayOfWeek.WEDNESDAY.ordinal()] = new String[]{"Wednesday", "Work on project"};
        schedule[DayOfWeek.THURSDAY.ordinal()]=new String[]{"Thursday","Meeting with friends"};
        schedule[DayOfWeek.FRIDAY.ordinal()]=new String[]{"Friday","Cinema"};
        schedule[DayOfWeek.SATURDAY.ordinal()]=new String[]{"Saturday","Going to course"};
        schedule[DayOfWeek.SUNDAY.ordinal()]=new String[]{"Friday","Sleeping"};

        System.out.println("Weekly Schedule: ");
for (DayOfWeek dayOfWeek:DayOfWeek.values()){
    System.out.println(dayOfWeek.name() + ":"+ schedule[dayOfWeek.ordinal()].toString());
}



    }
}