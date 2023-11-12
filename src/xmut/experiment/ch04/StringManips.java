package xmut.experiment.ch04;

import java.util.Locale;
import java.util.Scanner;

public class StringManips {
    public static void main(String[] args) {

        String middle3;
        String city;
        String state;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your city and state: ");
        city = sc.nextLine();
        state = sc.nextLine();
        System.out.println(state.toUpperCase() + city.toLowerCase(Locale.ROOT) + state.toUpperCase());

        String phrase = new String("This is a String test.");
        int phraseLength;// nber of characters in the phrase String
        int middleIndex; //index of the niddle character in the String
        String firstHalf;
        String secondHalf;
        String switchedPhrase;

        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;

        middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
        System.out.println("middle3 value is " + middle3);

        firstHalf = phrase.substring(0, middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);

        switchedPhrase = secondHalf.concat(firstHalf);
        switchedPhrase = switchedPhrase.replace(" ", "*");

        System.out.println();
        System.out.println("Original phrase: " + phrase);
        System.out.println("Length of the phrase: " + phraseLength + " characters");
        System.out.println("Index of the middle: " + middleIndex);
        System.out.println("Character at the middle index: " + phrase.charAt(middleIndex));
        System.out.println("Switched phrase: " + switchedPhrase);
        System.out.println();

    }
}
