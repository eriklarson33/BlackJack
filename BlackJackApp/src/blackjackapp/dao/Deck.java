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
    private static final String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private static final int[] values = {1,2,3,4,5,6,7,8,9,10,11};
    
    
    private void createDeck() {
        Card currentCard = new Card();
        
        for (int i = 0; i<=suits.length; i++) {
            currentCard.setSuit(suits[i]);
            
            for (int j = 0; j<=rank.length; j++) {
                currentCard.setRank(rank[j]);
                
                switch(rank[j]) {
                    case "Ace":
                        currentCard.setCardValue(1);
                        break;
                    case "2":
                        currentCard.setCardValue(2);
                        break;
                    default:
                        System.out.println("We have a problem assigning ranks.");
                }
            }
        }
        
//        for (int i = 0; i <= 52; i++) {
//            Card currentCard = new Card();
//            currentCard.setCardId(i);
//            for(int j= 0; j<suits.length; j++) {
//                
//            }
//            
//            
//        }
        
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
