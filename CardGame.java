//************************************************************************
//	CardGame.java
//
//************************************************************************


import java.util.Scanner;

public class CardGame
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner (System.in);

		//-----------------------------------------------------------------------------------------------
		// New Card objects are instantiated a player's hand of BlackJack
		//-----------------------------------------------------------------------------------------------

		 Card myCard1 = new Card();
		 Card myCard2 = new Card();

		 while (myCard2.getSuit() == myCard1.getSuit() && myCard2.getFace() == myCard1.getFace())
		 {	 System.out.println("Same card");
			 myCard2 = new Card();	}

		 System.out.println(myCard1.toString());
		 System.out.println(myCard2.toString());
		 System.out.println("Points = " + (myCard1.getPoints() + myCard2.getPoints()));


	}

}
