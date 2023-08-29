package demo.maps.objectkey;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return this.name;
    }

    public int age() {
        return this.age;
    }

    @Override
    public int hashCode() {
        // int hashCode = super.hashCode();
        int hashCode = Objects.hash(this.name, this.age);
        System.out.println("Hash Code Called --> " + hashCode);
        return hashCode;
    }

    @Override
    public boolean equals(Object o) {
        // return true;
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Dog dog = (Dog) o;
        if (this.name.equals(dog.name) && this.age == dog.age) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dog [name=" + this.name + "], [age=" + this.age + "]";
    }
}