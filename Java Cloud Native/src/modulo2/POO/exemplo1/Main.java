package modulo2.POO.exemplo1;

public class Main {
    public static void main(String[] args) {
        var male = new Person("John");
        male.setAge(34);

        var female = new Person("Mary");
        female.setAge(23);

        System.out.println("Male: " + male);
        System.out.println("Female: " + female);
    }
}
