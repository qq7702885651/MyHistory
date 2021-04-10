package JazvaLearn2OfJeKou.DuoTai.Demo1;

public class Demo {


    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        giveMeAPet(cat);

        giveMeAPet(dog);
    }
    public static void giveMeAPet(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.atHome();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.showMe();
        }
    }
}
