import abcd.Animal;
import xyz.Bird;

/**
 * Created by cerebro on 05/03/16.
 */
public class Demo {

    // public - access from anywhere
    // protected - access from same package classes and subclasses of even other packages
    // default - access from same package classes
    // private - access from only same class

    // inside static nested class we can't call non static methods of parent class
    // inside non static nested class we can call non static methods of parent class
    // using ParentClass.this

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.setAge(20);
        animal2.setAge(30);

        System.out.println(animal2.isOlderThan(animal1));

        Animal.StaticNestedClass var1;
        Animal.NonStaticNestedClass var2;

        var1 =  new Animal.StaticNestedClass();
        var2 =  animal1.new NonStaticNestedClass();
        Animal.NonStaticNestedClass var3 = animal1.new NonStaticNestedClass();
        Animal.NonStaticNestedClass var4 = animal2.new NonStaticNestedClass();

        var2.printSomething(); //this var2, Animal.this animal1
        var3.printSomething(); //this var3, Animal.this animal1
        var4.printSomething(); //this var4, Animal.this animal2
    }

}
