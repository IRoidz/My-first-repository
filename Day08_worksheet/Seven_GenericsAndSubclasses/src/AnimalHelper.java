public class AnimalHelper {
    public static Animal doSomething(Box<Animal> animalBox) {
        animalBox.setData(new Animal());
        animalBox.setData(new Dog());
        return animalBox.getData();
    }
}
