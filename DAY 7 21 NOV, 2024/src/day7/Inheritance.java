//intheritance (1.Single, 2.Hierarchical, 3.Multilevel(Extends), 4.Miltiple(not supported)(implements))Hybrid
//class-class=extends
//class-interface= implements
//interface-interface=extends
package day7;

//Super class
/*
class Animal{
    void Eat(){
        
        System.out.println("I can Eat");
        
    }
}
//clild class
class Dog extends Animal{
    void sound(){
        System.out.println("Bark... Bark...");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Mew... Mew...");
    }
}

class Taxido extends Cat{
    void color(){
        System.out.println("black and white");
    }
}
interface Animals{
}
*/
abstract class Animal{
    void Eat(){
        System.out.println("I can Eat");
    }
    abstract void Cat();
}
class Cat extends Animal{
    
    @Override
    void Cat(){
      System.out.println("Mew Mew");  
    }
    
}


public class Inheritance {


    public static void main(String[] args) {
        
    //   Dog d1 = new Dog();
       Cat c1 = new Cat();
    //   Taxido t1 = new Taxido();
        
    //   d1.Eat();
      // d1.sound();
       
       c1.Eat();
       c1.Cat();
       
     //  t1.Eat();
       //t1.color(); 
        
       System.out.println("Hello World");
    }
    
}
