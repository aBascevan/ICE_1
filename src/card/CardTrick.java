/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * 
 * Student: Alexander Bascevan
 * ID: 991566471
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Random rand = new Random();//create random number generator called rand
        
        Card[] magicHand = new Card[7];
     
        for (int i=0; i<magicHand.length; i++) {
            Card c = new Card();
            
            c.setValue(rand.nextInt(12));
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            
            magicHand[i] = c;
        }
      
        printMagicHand(magicHand);//print out magic hand

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        compareCard(magicHand);//compare user entered card to magic hand
        
        //check if lucky card 5 of spades is in magic hand
        luckyCard(magicHand);
        
    }//end of main method

    //print out magic hand
    public static void printMagicHand(Card[] magicHand){
        System.out.println("\nMagic Hand:");
        for(int i=0;i<magicHand.length;i++){
            String str = String.format("%-4s %-4s %s", magicHand[i].getValue(), " of ", magicHand[i].getSuit());
            System.out.println(str);
        }
    }//end of printMagicHand


    //prompt for user input, compare to magic hand, output if it matches or not
    public static void compareCard(Card[]magicHand){

        Scanner input = new Scanner(System.in);//create scanner object called input

        //prompt for user input for card choice
        System.out.println("\nPick any Card: ");
        System.out.println("Please input a card value between 1 - 13");
        int val = Integer.parseInt(input.nextLine());
        
        System.out.println("Please input a suit:");
        String suit = input.nextLine();

        //compare user entered card to magic hand
        int i = 0;
        do{
            if(val == magicHand[i].getValue() && suit.equalsIgnoreCase(magicHand[i].getSuit())){
                System.out.println("\nYour card " + magicHand[i].getValue() + " of " + magicHand[i].getSuit() +  " is in the magic hand");
                break;
            }
            i++;
            if(i >= 6){
                System.out.println("\nYour card " + magicHand[i].getValue() + " of " + magicHand[i].getSuit() +  " is NOT in the magic hand");
                break;
            }
        }while(true);

        input.close();//close scanner input

    }//end of compareCard


    public static void luckyCard(Card[] magicHand){
      LuckyCard lc = new LuckyCard();
      int i = 0;
        do{
            if(lc.getValue() == magicHand[i].getValue() && lc.getSuit().equalsIgnoreCase(magicHand[i].getSuit())){
                System.out.println("\nYour card Lucky Card " + lc.getValue() + " of " + lc.getSuit() +  " is in the magic hand\n");
                break;
            }
            i++;
            if(i >= 6){
                System.out.println("\nYour Lucky Card " + lc.getValue() + " of " + lc.getSuit() +  " is NOT in the magic hand\n");
                break;
            }
        }while(true);
    }
    
}//end of CardTrick Class
