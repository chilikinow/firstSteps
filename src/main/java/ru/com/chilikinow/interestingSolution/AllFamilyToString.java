package ru.com.chilikinow.interestingSolution;

import java.util.ArrayList;

public class AllFamilyToString {
    public static void main(String[] args) {
        ArrayList <Human> forToStringChild = new ArrayList<>();
        ArrayList <Human> childrenFM = new ArrayList<Human>();
        Human child3 = new Human("Седых Ольга", false, 3, forToStringChild);
        Human child2 = new Human("Седых Павел",true, 7, forToStringChild);
        Human child1 = new Human("Седых Юлия", false,10, forToStringChild);
        childrenFM.add(child1);
        childrenFM.add(child2);
        childrenFM.add(child3);
        ArrayList <Human> childrenGFM1 = new ArrayList<Human>();
        ArrayList <Human> childrenGFM2 = new ArrayList<Human>();
        Human father = new Human("Седых Артем",true,30,childrenFM);
        Human mother = new Human("Барто Евгения", false, 28, childrenFM);
        childrenGFM1.add(father);
        childrenGFM2.add(mother);
        Human grandFather1 = new Human("Седых Виктор", true, 70,childrenGFM1);
        Human grandFather2 = new Human("Барто Анатолий", true, 75,childrenGFM2);
        Human grandMother1 = new Human("Седых Ирина", false, 72,childrenGFM1);
        Human grandMother2 = new Human("Барто Елена", false, 68,childrenGFM2);

        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList <Human> children;

        public Human(String name, boolean sex, int age, ArrayList <Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
