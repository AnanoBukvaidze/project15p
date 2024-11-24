package org.example;

public class Main5 {
    public static void main(String[] args) {
        //ვიძახებთ მეთოდს და ვაწვდით სასურველ პარამეტრებს
        hasTeen(3, 13, 1);
    }

    //მეთოდი იღებს რიცხვით პარამეტრებს და ამოოწმებს რომელიმე თუა 13-დან 20-მდე
    static void hasTeen(int x, int y, int z){
        if(x >= 13 && x <= 19 || y >= 13 && y <= 19 || z >= 13 && z <= 19){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

}
