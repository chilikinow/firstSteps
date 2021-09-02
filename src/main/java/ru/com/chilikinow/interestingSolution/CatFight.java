package ru.com.chilikinow.interestingSolution;

public class CatFight {
    public int age;
    public int weight;
    public int strength;

    public CatFight(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(CatFight anotherCat) {
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int score = ageScore + weightScore + strengthScore;
        return score > 0;

    }

    public static void main(String[] args) {

    }
}
