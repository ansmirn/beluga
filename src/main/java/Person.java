public class Person {

    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Nikolay";
        person.lastName = "Baskov";
        person.age = 33;
        person.introduce();
    }

    public void introduce() {
        System.out.println("Привет, меня зовут " + firstName + " " + lastName + "." + " Мне " + age + " года.");
    }

}

