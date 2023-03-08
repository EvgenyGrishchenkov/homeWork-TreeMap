public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName(String name) {
        return name;
    }
    public String getSurname(String surname) {
        return surname;
    }
    public int getAge(int age) {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age + " лет";
    }

}
