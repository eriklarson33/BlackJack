/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackapp.dao;

import blackjackapp.model.Card;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author eriklarson-laptop
 */
public class Deck {
    
    //private Map<Integer, Card> gameDeck = new HashMap<>();
    private List<Card> gameDeck = new ArrayList<>();
    
    private static final String[] suits = {"Diamonds", "Spades", "Clubs", "Hearts"};
    private static final String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private static final int[] values = {1,2,3,4,5,6,7,8,9,10,11};
    
    
    public void createDeck() {
        
        for (int i = 0; i<=suits.length; i++) {
            
            
            for (int j = 0; j<=rank.length; j++) {
                Card currentCard = new Card();
                currentCard.setSuit(suits[i]);
                currentCard.setRank(rank[j]);
                
                switch(rank[j]) {
                    case "Ace":
                        currentCard.setCardValue1(1);
                        currentCard.setCardValue2(11);
                        break;
                    case "2":
                        currentCard.setCardValue1(2);
                        break;
                    case "3":
                        currentCard.setCardValue1(3);
                        break;
                    case "4":
                        currentCard.setCardValue1(4);
                        break;
                    case "5":
                        currentCard.setCardValue1(5);
                        break;
                    case "6":
                        currentCard.setCardValue1(6);
                        break;
                    case "7":
                        currentCard.setCardValue1(7);
                        break;
                    case "8":
                        currentCard.setCardValue1(8);
                        break;
                    case "9":
                        currentCard.setCardValue1(9);
                        break;
                    case "10":
                        currentCard.setCardValue1(10);
                        break;
                    case "Jack":
                        currentCard.setCardValue1(10);
                        break;
                    case "Queen":
                        currentCard.setCardValue1(10);
                        break;
                    case "King":
                        currentCard.setCardValue1(10);
                        break;
                    default:
                        System.out.println("We have a problem assigning ranks.");
                }
                gameDeck.add(currentCard);
            }
        }
        
    }
    
    // Method to pull a card from the deck RANDOMLY
    public Card pullCard() {
        
        
        Random cardPicker = new Random();
        int ranIndex = cardPicker.nextInt(gameDeck.size());
        Card cardPicked = gameDeck.remove(ranIndex);
        
        return cardPicked;
    }
    
}
