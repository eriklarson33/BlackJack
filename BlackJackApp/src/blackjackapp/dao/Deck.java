/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackapp.dao;

import blackjackapp.model.Card;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author eriklarson-laptop
 */
public class Deck {
    
    private Map<Integer, Card> gameDeck = new HashMap<>();
    
    private static final String[] suits = {"Diamonds", "Spades", "Clubs", "Hearts"};
    private static final String[] rank = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private static final int[] values = {1,2,3,4,5,6,7,8,9,10,11};
    
    
    private void createDeck() {
        
        for (int cardValue : values) {
            System.out.println("hi.");
        }
        
    }
    
    // Method to pull a card from the deck RANDOMLY
    public Card pullCard() {
        Card cardPicked = new Card();
        return cardPicked;
    }
    
}
