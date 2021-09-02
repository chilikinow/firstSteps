package ru.com.chilikinow.interestingSolution;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/

public class CatsRelationships {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother);

        String brotherName = reader.readLine();
        Cat catBrother = new Cat(brotherName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandFather.toString());
        System.out.println(catGrandMother.toString());
        System.out.println(catFather.toString());
        System.out.println(catMother.toString());
        System.out.println(catBrother.toString());
        System.out.println(catDaughter.toString());
    }

    public static class Cat {
        private String name;
        private Cat parentFather;
        private Cat parentMother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent){
            if (name.startsWith("папа")) {
                this.name = name;
                this.parentFather = parent;
            }
            else {
                this.name = name;
                this.parentMother = parent;
            }
        }

        Cat(String name, Cat parentFather, Cat parentMother){
            this(name);
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }

        @Override
        public String toString() {
            if (parentFather == null && parentMother == null)
                return "The cat's name is " + this.name + ", no mother , no father ";
            else {
                if (parentFather != null && parentMother != null)
                    return "The cat's name is " + name + ", mother is " + parentMother.name + ", father is " + parentFather.name;
                else {
                    if (parentMother == null)
                        return "The cat's name is " + this.name + ", no mother, father is " + parentFather.name;
                    if (parentFather == null)
                        return "The cat's name is " + name + ", mother is " + parentMother.name + ", no father ";
                    else
                        return "The cat's name is " + this.name + ", no mother, father is " + parentFather.name;
                }
            }
        }
    }

}