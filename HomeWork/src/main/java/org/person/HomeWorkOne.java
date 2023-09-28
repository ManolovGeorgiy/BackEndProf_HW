package org.person;

public class HomeWorkOne {

    public static void main (String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Georgiy", "Georgiy Manolov", 38);



        person1.setName("Anna");
        person1.setFullName("Anna Nesterenko");
        person1.setAge(32);

        System.out.println(person1);
        System.out.println(person2);


        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}


