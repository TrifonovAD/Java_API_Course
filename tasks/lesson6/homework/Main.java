package tasks.lesson6.homework;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[7];
        persons[0] = new Person("John",  "Dow", 25, "Male", "755 Hal Neck Suite 135 Lake Garretview", 1);
        persons[1] = new Person("Gerald",  "Hill", 8, "Male", "108 Casey Trail Apt. 843 West Fred", 2);
        persons[2] = new Person("Hollie",  "Perry", 32, "Female", "87963 Gislason Glen Suite 981 Estellaburgh", 3);
        persons[3] = new Person("Elinor",  "Gibson", 16, "Female", "99328 Maybelle Unions North Alfonsostad",4);
        persons[4] = new Person("Patrick",  "West", 54, "Male", "41370 Ritchie Stravenue Apt. 284 Armstrongville", 5);
        persons[5] = new Person("John",  "Dow", 25, "Male", "755 Hal Neck Suite 135 Lake Garretview", 1);
        persons[6] = new Person("John",  "Dow", 25, "Male", "755 Hal Neck Suite 135 Lake Garretview", 6);

        for (int i = 0; i < persons.length; i++) {
            int age = persons[i].getAge();
            if (age > 20) {
                System.out.println(persons[i]);
                System.out.println();
            }

        }
        System.out.println(persons[0].equals(persons[5]));
        System.out.println(persons[0].equals(persons[6]));
        System.out.println(persons[2].hashCode());



    }
}
