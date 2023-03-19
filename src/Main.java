import zoo.*;

public class Main {

    public static void main(String[] args) {
        Animal elephant = new Elephant();
        Animal jaguar = new Jaguar();
        Animal zebra = new Zebra();
        Animal wolf = new Wolf();
        Animal lion = new Lion();

        Zoo zoo = new Zoo();
        zoo.addAnimal(elephant);
        zoo.addAnimal(jaguar);
        zoo.addAnimal(zebra);
        zoo.addAnimal(wolf);
        zoo.addAnimal(lion);

        zoo.showAllAnimal();
        zoo.feedAnimal(elephant);
        zoo.removeAnimal(elephant);
        zoo.showAllAnimal();
    }
}
