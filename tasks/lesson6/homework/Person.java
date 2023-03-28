package tasks.lesson6.homework;

public class Person {

    private String name;
    private String surname;
    private int age;
    private String sex;
    private String adress;
    private int uniqId;

    Person(String name, String surname, int age, String sex, String adress, int uniqId) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.adress = adress;
        this.uniqId = uniqId;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s, %d). \n%s", name, surname, sex, age, adress);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person anotherPerson = (Person) obj;
        return name.equals(anotherPerson.name) && surname.equals(anotherPerson.surname) && uniqId == anotherPerson.uniqId;
    }
    @Override
    public int hashCode() {
        return name.length() * 13 + surname.length() * 47 + uniqId;
    }
}