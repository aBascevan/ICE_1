package card;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexanderbascevan
 * Student: Alexander Bascevan
 * ID: 991566471
 */
public class LuckyCard {
    private int value = 5;
    private String suit = "Spades";

    public int getValue() {
        return this.value;
    }

    public String getSuit() {
        return this.suit;
    }

    public String toString() {
        return "The Lucky Card is: " + getValue() + " of " + getSuit();
    }

}//end of LuckyCard Class
