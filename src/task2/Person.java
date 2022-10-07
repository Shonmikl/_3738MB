package task2;

import task1.Ball;
import task1.Lighter;

import java.util.Scanner;

public class Person {

    String name;
    String location;
    Language language;

    Ball ball;
    Lighter lighter;

    public Person(String name, String location, Language language, Ball ball) {
        this.name = name;
        this.location = location;
        this.language = language;
        this.ball = ball;
    }

    public Person(String name, String location, Language language, Lighter lighter) {
        this.name = name;
        this.location = location;
        this.language = language;
        this.lighter = lighter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", language=" + language +
                ", ball=" + ball +
                ", lighter=" + lighter +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person =
                new Person("Artur", "scanner.next()", Language.JAVA, new Ball("BLACK"));
        System.out.println(person);
//        String s = "abc";
//        System.out.println(s);
//
//        int i = 333;
//        System.out.println(i);
    }
}