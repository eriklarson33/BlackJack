/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackapp.model;

/**
 *
 * @author eriklarson-laptop
 */
public class Card {
    
    private String suit;
    private String rank;
    private int cardValue1;
    private int cardValue2;
    private int cardId;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getCardValue1() {
        return cardValue1;
    }

    public void setCardValue1(int cardValue) {
        this.cardValue1 = cardValue;
    }
    
    public int getCardValue2() {
        return cardValue1;
    }

    public void setCardValue2(int cardValue) {
        this.cardValue2 = cardValue;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
    
    
    
}
