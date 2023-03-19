package zoo;

import java.util.ArrayList;

public class Zoo {

    ArrayList<Animal> zoo = new ArrayList<>();

    public void addAnimal(Animal animal){
        zoo.add(animal);
    }
    public void removeAnimal(Animal animal){
        zoo.remove(animal);
    }
    public void feedAnimal(Animal animal){
        animal.eat();
    }
    public void showAllAnimal(){
        for(Animal animal : zoo) {
            System.out.println(animal);
        }
    }

}
