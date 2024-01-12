import domain.Person;

public class MainBasic {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Person personA = new Person("Lukas", "Mustermann", "männlich", 19);
        Person personB = new Person("Lena", "Marie", "weiblich", 19);
        Person personC = new Person("Bruno", "Lecker", "männlich", 19);

        personA.heiraten(personB);
        personC.heiraten(personB);
        personB.scheiden(personA);
        personB.heiraten(personC);
    }
}
