package lt.bt.Uzdaviniai.inheritance;

import lt.bt.Uzdaviniai.inheritance.farm.animals.*;

public class Farm {
    public static void main(String[] args) {

        Animal cat  = new cat();
        Animal dog = new dog();
        Animal sheep  = new cheep();
        Animal cow  = new cow();
        Animal chicken  = new chicken();

        Animal[] animals = {sheep, cat, dog, chicken, dog, cat, sheep, cow, sheep, chicken, cat};

        int catNum = 0;
        int dogNum = 0;
        int cowNum = 0;
        int sheepNum = 0;
        int chickenNum = 0;

        for(int i =0; i<animals.length; i++) {
            if(animals[i] instanceof cat) {
                catNum++;
            } else if (animals[i] instanceof dog) {
                dogNum++;
            } else if (animals[i] instanceof cow) {
                cowNum++;
            } else if (animals[i] instanceof cheep) {
                sheepNum++;
            } else if (animals[i] instanceof chicken) {
                chickenNum++;
            }
        }
        System.out.println("Cats: "+catNum+" "+cat+". Dogs: "+dogNum+" "+dog+". Cows: "+ cowNum+" "+cow+". Sheep: "+sheepNum+" "+sheep+". Chicken: "+chickenNum +" "+ chicken+".");
    }
}