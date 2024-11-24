package org.example;

public class While {
    public static void main(String[] args){

        String string = "j8h92jwzwjqzz9s";

        //ცვლადი გავუტოლე 2-ს, რადგან ათვლას ვიწყებ მესამე ელემენტიდან
        int len = 2;

        // ამოწმებს ყოველ მესამე ელემენტს
        while (len < string.length()){

            //ცვლადი ინახავს სტრინგის მიმდინარე ელემენტს
            char currentStr = string.charAt(len);

            //ამოწმებს რომელიმე სიმბოლო უდრის თუარა 'z'-ს
            if (currentStr == ('z')){
                break;
            }

            //ბეჭდავს მიმდინარე სიმბოლოს
            System.out.println(string.charAt(len));

            //ცვლადს len-ის მნიშვნელობას უმატებს სამს
            len += 3;
        }
    }
}
