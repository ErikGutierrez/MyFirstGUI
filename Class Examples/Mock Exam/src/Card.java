

public class Card {
	
	private String suit; //Suit of a card, it goes between Diamond, Spade, Club or Heart
	private int rank; // Rank of a card, it goes between 1 till 13 (In order of A, 2, 3,..., 10, J, Q, K)

	/**
	 * A constructor that requires a suit and rank input to initialize a card
	 * @param suit
	 * @param rank
	 */
	public Card(String suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	/**
	 * A constructor that uses a different Card to initialize the new card.
	 * @param otherC
	 */
	public Card(Card otherC) {
		rank = otherC.getRank();
		suit = otherC.getSuit();
	}
	
	
	/**
	 * Override of the method toSting this helps us control how to print a card object.
	 * @return The string "[R,S]" where R is rank and S is suit
	 */
	@Override
	public String toString() {
		return "[" + rank  + "," + suit + "]";
	}

	/**
	 * Override of the equals method to control how card objects are to be compared.
	 * @return comparison 
	 */
	@Override
	public boolean equals(Object c2) {
		if (!(c2 instanceof Card)) {
			throw new RuntimeException("Illegal argument to Card.equals()");
		}
		Card card2 = (Card) c2;
		return ((this.getSuit().equals(card2.getSuit())) && 
				(this.getRank() == card2.getRank()));
	}


	public String getSuit() {
		return suit;
	}



	public int getRank() {
		return rank;
	}
	


	public void setSuit(String suit) {
		this.suit = suit;
	}



	public void setRank(int rank) {
		this.rank = rank;
	}



	public boolean sameSuitAs(Card card2) {
		return (this.getSuit().equals(card2.getSuit()));
	}



	public boolean sameRankAs(Card card2) {
		return (this.getRank() == card2.getRank());
	}
	


	public boolean isAnA() { 
		if (this.rank == 1)
			return true;
		else
			return false;
	}
	
	
    public boolean isPair(Card c) {
        if (rank == c.getRank())
        	return true;
        else
        	return false;
    }
    
    /**
	 * Checks if three cards have the same suit and rank
	 * @param c1, c2
	 * @return boolean
	 */
    public boolean isTrio(Card c1, Card c2) {
        if (rank == c1.getRank() && rank == c2.getRank() && c1.getRank() == c2.getRank())
        {
        	if (suit.equals(c1.getSuit()) && suit.equals(c2.getSuit()) && c1.getSuit().equals(c2.getSuit()))
        		return true;
        	
        	else return false;
        }
        else
        	return false;  
    }

    /**
	 * Checks if four cards have the same suit and rank
	 * @param c1, c2, c3
	 * @return boolean
	 */
    public boolean isFourTuple(Card c1, Card c2, Card c3) {
    	if (rank == c1.getRank() && rank == c2.getRank() && rank == c3.getRank() && 
    			c1.getRank() == c2.getRank() && c1.getRank() == c3.getRank() &&
    				c2.getRank() == c3.getRank())
        {
        	if (suit.equals(c1.getSuit()) && suit.equals(c2.getSuit()) && suit.equals(c3.getSuit()) &&
        			c1.getSuit().equals(c2.getSuit()) &&  c1.getSuit().equals(c3.getSuit()) &&
        				c3.getSuit().equals(c2.getSuit()))
        		return true;
        	
        	else return false;
        }
        else
        	return false;   
    }
    
   
    /**
     * A method that checks if the target card c1 is a rank
 	* higher than the object card.
 	* @return boolean
     */
    public boolean isConsecutive(Card c1) {
    	return rank + 1 == c1.getRank();
    }
    
    /**
	 * A method that returns true as soon a it has found
	 * that the given card exist in the deck
	 * @param target
	 * @return boolean
	 */
	public boolean cardExistsIn(Card[] deck) {
	    for (Card cards : deck)
	    {
	    	if (cards.getRank() == rank)
	    		return true;
	    	
	    	if (cards.getSuit().equals(suit))
	    		return true;
	    }	
		return false; 
	}
	
	/**
	 * A method that returns true as soon as it has found an existing pair
	 * in the deck
	 * @return boolean
	 */
	public boolean pairExists(Card[] deck) {
		boolean pairFound = false;
		for (Card i : deck)
			for (Card j : deck)
			{
				if ((i.getRank() == j.getRank() && !i.getSuit().equals(j.getSuit())) || (i.getRank() != j.getRank() && i.getSuit().equals(j.getSuit())))
				{
					pairFound = true;
					break;
				}
				
				if (pairFound)
					break;
			}
		if (pairFound)
			return true;
		else
			return false;
		
	}
	
	
	public boolean isFlush(Card[] deck) {
		int cardCount = 0;
		
		for (Card i : deck)
			for (Card j : deck)
				if (i.getSuit().equals(j.getSuit()))
					cardCount += 1;
		
		if (cardCount == deck.length)
			return true;
		
		else		
			return false;
	}
	
	
	public boolean isConsecutiveStraight(Card[] deck) {
		int cardCount = 0;
		
		for (Card i : deck)
			for (Card j : deck)
				if (i.getRank() <= j.getRank())
					cardCount += 1;
		
		if (cardCount == deck.length)
			return true;
		
		else		
			return false;
	}
	
	
	public boolean isConsecutiveStraightFlush(Card[] arr) {
		int cardCount = 0;
		
		for (Card i : arr)
			for (Card j : arr)
				if ((i.getRank() <= j.getRank()) && (i.getSuit().equals(j.getSuit())))
					cardCount += 1;
		
		if (cardCount == arr.length)
			return true;
		
		else		
			return false;
	}
}

