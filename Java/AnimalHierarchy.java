// AnshumanSarma_WAP to demonstrate multilevel inheritance in Java


class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal {
    public void walk() {
        System.out.println("Mammal is walking");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();    // Method from Animal
        dog.walk();   // Method from Mammal
        dog.bark();   // Method from Dog
    }
}
