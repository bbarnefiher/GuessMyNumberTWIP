package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stringReader = new Scanner(System.in);
        String[] nameList = {"Anivia", "Lux", "Twisted Fate", "Karma", "Morgana", "Malzahar", "Azir", "Swain", "Taliyah", "Ahri", "Vladimir", "Orianna", "Kennen", "Karthus", "Veigar", "Xerath", "Vel'Koz", "Ryze", "Annie", "Ziggs", "Brand", "Aurelion Sol", "Fiddlesticks", "Heimerdinger", "Viktor", "Cassiopeia", "Zyra", "Syndra", "Zoe", "Lissandra", "Katarina", "Talon", "Leblanc", "Kassadin", "Akali", "Ekko", "Fizz", "Zed", "Zilean", "Kayle", "Jayce", "Yasuo", "Irelia", "Diana", "Galio", "Wukong", "Aatrox", "Kayle", "Mordekaiser", "Ashe"};


        for (int i = 0; i < nameList.length; i++) {
            System.out.print(nameList[i] + ", ");
        }
        System.out.println("\n\nPick a name from the above list, and I will try to guess the name you have chosen.\n");
        Arrays.sort(nameList);


        String computerGuess = nameList[25];

        int arrayIncrem = 25;
        int lastGuess = 25;
        while (true) {



            System.out.println("Is your chosen name further or backwards on the alphabet when compared to the name: " + computerGuess + "\nIf I guessed the correct name, please enter 'correct'.\n");
            String userInput = stringReader.nextLine();

            if (userInput.equalsIgnoreCase("further")) { //closer to Z
                arrayIncrem = arrayIncrem / 2;
                computerGuess = nameList[lastGuess + arrayIncrem];
                lastGuess = lastGuess + arrayIncrem;

            }
            else if (userInput.equalsIgnoreCase("backwards")) { //closer to A
                arrayIncrem = arrayIncrem / 2;
                computerGuess = nameList[lastGuess - arrayIncrem];
                lastGuess = lastGuess - arrayIncrem;

            }
            else if (userInput.equalsIgnoreCase("correct")) { //correct
                System.out.println("Yay I did it");
                System.exit(0);
            }
            else {
                System.out.println("Sorry, I do not know what you mean. Please try again.");
            }
        }
    }
}
