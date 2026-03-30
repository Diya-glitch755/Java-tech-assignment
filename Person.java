public class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Diya", 20);
        Person p2 = new Person("Rahul", 22);

        p1.display();
        p2.display();
    }
} {
    
}
