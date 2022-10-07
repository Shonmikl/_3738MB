package task2;

import task1.Ball;
import task1.Lighter;

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
}

class Main {
    public static void main(String[] args) {
        Person person =
                new Person("Artur", "Manchester", Language.JAVA, new Ball("BLACK"));
        Person person1 =
                new Person("Artur", "Manchester", Language.JAVA, new Lighter(200));
    }
}