package lt.bt.Uzdaviniai.inheritance.farm.animals;

import lt.bt.Uzdaviniai.inheritance.Animal;

public class dog extends Animal {

    private String balsas="au au";

    @Override
    public String toString(){
        return balsas;
    }
}
