
package exercise6;


abstract class Animal {
    abstract void makeSound();

    void eat() {
        System.out.println("It can eat");
    }
}

interface Pet {
    void showAffection();
}

interface Wild {
    void hunt();
}


class Dog extends Animal implements Pet {
    @Override
    void makeSound() {
        System.out.println("The dog barks woff woff");
    }
  
    @Override
    public void showAffection() {
        System.out.println("Dog shows afection");
    }
}

class Husky extends Dog implements Wild {
    void displayBreed() {
        System.out.println("Huskeys are White");
    }

    @Override
    public void hunt() {
        System.out.println("Dogs can Hunt.");
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Husky husky = new Husky();

        husky.makeSound();
        husky.eat();
        
        husky.showAffection();
        husky.hunt();
        
        husky.displayBreed();
    }
}