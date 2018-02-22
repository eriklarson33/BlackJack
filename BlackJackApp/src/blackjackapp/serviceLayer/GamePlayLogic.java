/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackapp.serviceLayer;

import blackjackapp.dao.Deck;
import blackjackapp.model.Person;

/**
 *
 * @author eriklarson-laptop
 */
public class GamePlayLogic {
    
    boolean gameWon;
    Person player1;
    Person dealer;
    
    Deck deck = new Deck();
    
    public void gameSetUp() {
        deck.createDeck();
        Person player1 = new Person();
        Person dealer = new Person();
        
        
    }
    
}
