package org.example;

public class FunctionAsData {

    protected static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    protected static class DataLoader {

        private final NoArgFunction<Person> dataloader;

        public DataLoader(boolean isDevelopment) {
            this.dataloader = isDevelopment ? this::loadFakePerson : this::loadRealPerson;
        }
        private Person loadRealPerson() {
            System.out.println("Loading person..");
            return new Person("Niharika", 25);
        }

        private Person loadFakePerson() {
            System.out.println("Loading fake person ..");
            return new Person("Batman", 123);
        }
    }

    public static void main(String[] args) {
        final boolean isDevelopment = false;
        DataLoader dataLoader = new DataLoader(isDevelopment);
        System.out.println(dataLoader.dataloader.apply());
//        isDevelopment = false;

    }
}
