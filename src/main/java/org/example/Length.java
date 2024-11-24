package org.example;

public class Length {
    public static void main(String[] args){

        String string = "as";

        //ამოწმებს სტრიქონის სიგრძე ლუწია თუ არა და ბეჭდავს შესაბამის შეტყობინებას
        if (string.length() % 2 == 0){

            System.out.println("სტრიქონის სიგრძე ლუწია!");
        }
        else {
            System.out.println("სტრიქონის სიგრძე კენტია!");
        }
    }
}
