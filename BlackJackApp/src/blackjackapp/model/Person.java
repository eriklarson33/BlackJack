/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackapp.model;

import java.util.List;

/**
 *
 * @author eriklarson-laptop
 */
public class Person {
    
    private boolean winner;
    private int totalValue1;
    private int totalValue2;
    private List<Card> playerHand;

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean won) {
        this.winner = won;
    }

    public int getTotalValue1() {
        return totalValue1;
    }

    public void setTotalValue1(int totalValue1) {
        this.totalValue1 = totalValue1;
    }

    public int getTotalValue2() {
        return totalValue2;
    }

    public void setTotalValue2(int totalValue2) {
        this.totalValue2 = totalValue2;
    }

    public List<Card> getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(List<Card> playerHand) {
        this.playerHand = playerHand;
    }
    
    
}
