package zoo;

public class Animal {
    private String name;
    private String food;

    public Animal(String name, String food) {
        this.name = name;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    public void eat(){
        System.out.println(name + " eating " + food);
    }

    @Override
    public String toString() {
        return "Animal type -> "+name + " : eating -> " + food;
    }
}
