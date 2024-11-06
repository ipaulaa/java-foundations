import model.Dog;
import model.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person tom = new Person("Tom", "Smith", LocalDate.of(1984, 6, 15));
        Person janet = new Person("Janet", "Jackson", LocalDate.of(1985, 12, 3));
        Dog figo = new Dog("Figo", LocalDate.of(2018, 1, 1));

        tom.setSpouse(janet);
        tom.setPet(figo);

        System.out.println(tom);
        figo.bark();
    }
}
