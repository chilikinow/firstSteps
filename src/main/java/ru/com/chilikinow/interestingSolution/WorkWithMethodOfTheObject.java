package ru.com.chilikinow.interestingSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkWithMethodOfTheObject {
    public static void main(String[] args) throws IOException {
        Person sasha = new Person();
        Person.initialization(sasha);
        sasha.firstPresentation();
        sasha.wedding("Kim");
        sasha.thaiTraval(true);
    }
}

class Person {
    private String firstName;
    private String secondName;
    private byte age;
    private char sex;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return this.age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return this.sex;
    }


    public static void initialization(Person person) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите Имя: ");
        person.setFirstName(reader.readLine());
        System.out.print("Введите Фамилию: ");
        person.setSecondName(reader.readLine());
        System.out.print("Введите Возраст: ");
        String ageS = reader.readLine();
        person.setAge((byte) Integer.parseInt(ageS));
        System.out.print("Введите Пол: ");
        String sexS = reader.readLine();
        person.setSex(sexS.charAt(0));
        System.out.println();
    }

    /* Конструктор класса Person
    Person(String firstName, String secondName, byte age, char sex){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.secondName = sex;
    }
     */

    void firstPresentation() {
        System.out.print("Hello, my name is " + this.firstName +
                " " + this.secondName + "\n" + "I'm " + this.age + " years old\nI'm ");
        if ((this.sex == 'M') || (this.sex == 'М'))
            System.out.println("Man");
        else
            System.out.println("Woman");
        System.out.println();
    }

    void wedding(String newSecondName) {
        this.secondName = newSecondName;
        System.out.print("New information about me, after wedding:\n" + "My name is: " + this.firstName +
                " " + this.secondName + "\n" + "I'm " + this.age + " years old\nI'm ");
        if (this.sex == 'M')
            System.out.println("Man");
        else
            System.out.println("Woman");

        System.out.println();
    }

    void thaiTraval(boolean decision) {
        if (decision) {
            if (this.sex == 'M') {
                this.sex = 'W';
                this.firstName = "Masha";
                this.secondName += "a";
            } else {
                this.sex = 'M';
                this.firstName = "Misha";
                char[] massString = new char[this.secondName.length()];
                for (int i = 0; i < this.secondName.length(); i++) {
                    massString[i] = this.secondName.charAt(i);
                }
                int end = this.secondName.length();
                char okonchanie = massString[massString.length];
                if (Character.toLowerCase(okonchanie) == Character.toLowerCase('a')) {
                    this.secondName = "";
                    for (int i = 0; i < (massString.length - 1); i++) {
                        this.secondName += massString[i];
                    }
                }

                System.out.print("After travel to Thai =) :\n" + "My name is: " + this.firstName +
                        " " + this.secondName + "\n" + "I'm " + this.age + " years old\nI'm ");
                if (this.sex == 'M')
                    System.out.println("Man");
                else
                    System.out.println("Woman");
                System.out.println();


            }
        }
    }
}