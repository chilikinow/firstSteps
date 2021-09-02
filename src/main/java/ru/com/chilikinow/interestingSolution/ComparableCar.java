package ru.com.chilikinow.interestingSolution;

public class ComparableCar {
    private String name;
    private int dateMade;
    private int mussle;

    public ComparableCar(String name){
        this.name = name;
        this.dateMade = 2020;
        this.mussle = 100;
    }

    public ComparableCar(String name, int dateMade){
        this(name);
        this.dateMade = dateMade;
        this.mussle = 100;
    }

    public ComparableCar(String name, int dateMade, int mussle){
        this(name, dateMade);
        this.mussle = mussle;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getDateMade(){
        return this.dateMade;
    }

    public void setDateMade(int date){
        this.dateMade = date;
    }

    public int getMussle(){
        return this.mussle;
    }

    public void setMussle(int mussle){
        this.mussle = mussle;
    }

    public String toString(){
        return "Model: " + this.name + ", year made:" + this.dateMade + ", angin mussle: " + this.mussle;
    }

    public int compareName(ComparableCar comparableCar){
        return this.name.compareTo(comparableCar.getName());
    }

    public int compareYear(ComparableCar comparableCar){
        Integer dateMade1 = this.dateMade;
        Integer gateMade2 = comparableCar.getDateMade();
        return dateMade1.compareTo(gateMade2);
    }

    public int compareMussle(ComparableCar comparableCar){
        Integer mussle1 = this.mussle;
        Integer mussle2 = comparableCar.getMussle();
        return mussle1.compareTo(mussle2);
    }





}
