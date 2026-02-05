package edu.cnm.deepdive.cards;

import edu.cnm.deepdive.cards.model.Deck;
import edu.cnm.deepdive.cards.service.Trick;
import edu.cnm.deepdive.cards.service.Trick.TrickResult;
import java.util.random.RandomGenerator;

public class View {

  void perform() {
    System.out.println("Are you Ready For a Card Trick?");
    Deck deck = new Deck();
    System.out.println("Here is the deck we are starting with:");
    System.out.println(deck);
    RandomGenerator rng = RandomGenerator.getDefault();
    Trick trick = new Trick(deck, rng);
    trick.perform();
    System.out.println("Now we'll swap some cards");
    int numSwaps = trick.swap();
    System.out.println("Swapped " + numSwaps + " cards between our piles");
    TrickResult result = trick.getResult();
    System.out.println("Here is the result:");
    System.out.println(result);
  }

}
