package az.academy.turing.myproject;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        if (mother == null || father == null) {
            System.out.println("Both parents must be provided to create a family.");
        }
        this.mother = mother;
        this.father = father;
        this.children=new Human[0];


    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }


    public void addChild(Human  child){
        Human[] newChildren = new Human[children.length + 1];

        for (int i = 0; i < children.length; i++) {
            newChildren[i] = children[i];
        }
        newChildren[newChildren.length-1]=child;

        this.children=newChildren;
        this.children = newChildren;
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) {
            System.out.println("Invalid index");
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j++] = children[i];
            } else {
                children[i].setFamily(null); // Child-family bağlantısını kaldır
            }
        }
        children = newChildren;
        return true;
    }

    public int countFamily() {
        return 2 + children.length; // Anne ve baba + çocuk sayısı
    }
    @Override
    public String toString() {
        return "Family{" +
                "mother=" + (mother != null ? mother.toString() : "No mother") +
                ", father=" + (father != null ? father.toString() : "No father") +
                ", children=" + Arrays.toString(children) +
                ", pet=" + (pet != null ? pet.toString() : "No pet") +
                '}';
    }
}
