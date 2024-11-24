package org.example;

public class Main4 {
    public static void main(String[] args) {
        //ვიძახებთ მეთოდს და ვაწვდით პარამეტრს
        checkNumber(2);
    }

    //მეთოდი იღებს რიცხვით პარამეტრს და ბეჭდავს პარამეტრი დადებითია, უარყოფითი თუ ნოლი
    static void checkNumber(int x){

        if (x > 0){
            System.out.println("დადებითი!");
        }
        else if (x < 0) {
            System.out.println("უარყოფითი!");
        }
        else{
            System.out.println("ნოლი!");
        }
    }
}
