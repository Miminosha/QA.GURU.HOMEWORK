package Homework;

public class Taxi {
    int numberOfPersons;
    String classOfTaxi;

    public Taxi (int numberOfPersons, String classOfTaxi){
        this.numberOfPersons = numberOfPersons;
        this.classOfTaxi = classOfTaxi;
    }

    void autoCount(){
        if (numberOfPersons <= 4){
            System.out.println("Вам будет достаточно одной машины!");
        } else {
            System.out.println("Мы не можем посадить вас в одну машину, готовы заказать больше?");
        }
    }

    void autoClass(){
        System.out.println("Подыщем для вас авто класса " + classOfTaxi + "!");
    }
}

