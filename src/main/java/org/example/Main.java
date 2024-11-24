package org.example;

public class Main {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 7, 3, 9, 5};

        //ინახავს ლუწი რიცხვების რაოდენობას
        int even = 0;

        //ამოწმებს მასივის ყველა ელემენტს და თუ რომელიმე ლუწია, ცვლადს: "even" უმატებს ერთს
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] % 2 == 0) {
                even += 1;
            }
        }
        //ბეჭდავს შედეგს
        if (even > 0){
            System.out.println("მასივში "+ even +" ლუწი რიცხვია!");
        }
        else{
            System.out.println("მასივში არ არის ლუწი რიცხვი!");
        }
    }
}