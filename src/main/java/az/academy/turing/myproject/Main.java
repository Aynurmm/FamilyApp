package az.academy.turing.myproject;

public class Main {
    public static void main(String[] args) {

        Pet cat=new Pet(Species.CAT,"Rosie");
        Pet dog=new Pet(Species.DOG,"rex",1,75,new String[]{"eat","drink","sleep"});
        Pet bird=new Pet();


        String[][] schedule=new String [7][2];
        schedule[DayOfWeek.MONDAY.ordinal()] = new String[]{"Monday", "Voleyball"};
        schedule[DayOfWeek.TUESDAY.ordinal()] = new String[]{"Tuesday", "Read book"};
        schedule[DayOfWeek.WEDNESDAY.ordinal()] = new String[]{"Wednesday", "Work on project"};
        schedule[DayOfWeek.THURSDAY.ordinal()]=new String[]{"Thursday","Meeting with friends"};
        schedule[DayOfWeek.FRIDAY.ordinal()]=new String[]{"Friday","Cinema"};
        schedule[DayOfWeek.SATURDAY.ordinal()]=new String[]{"Saturday","Going to course"};
        schedule[DayOfWeek.SUNDAY.ordinal()]=new String[]{"Friday","Sleeping"};




        Human mother=new Human("Nigar","Sultanova",1990);
        Human father=new Human("Veli","Ehmedov",1988);
        Family family = new Family(mother, father);
        Human child=new Human("Leman","Ehmedova",2008,85,new String[][]{{"Monday","Voleyball"},{"Tuesday","Reading"}},family);

        System.out.println();



        System.out.println(mother);
        System.out.println(father);
        System.out.println(child);
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(bird);

        dog.eat();
        cat.eat();
        dog.foul();
        bird.eat();
    }
}