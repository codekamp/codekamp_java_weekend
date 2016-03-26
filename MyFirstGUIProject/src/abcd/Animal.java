package abcd;

/**
 * Created by cerebro on 14/03/16.
 */
public class Animal {
    public static int averageAge = 30;
    int age = 10;

    public int getAge() {
        return Animal.averageAge;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOlderThan(Animal otherAnimal) {
        if(age > otherAnimal.age) {
            return true;
        } else {
            return false;
        }
    }

    public static class StaticNestedClass {
        public void printSomething() {
            System.out.println(Animal.averageAge);
        }
    }

    public class NonStaticNestedClass {
        public void printSomething() {
            Animal.this
        }
    }

}
