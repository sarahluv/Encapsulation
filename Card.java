//************************************************************************
//	Card.java
//
//	A card is represented by a face value and as suit value
//************************************************************************

import java.util.Random;

class Card
{

	//***********************************************************************************
	//  Instance variables
	//		face:   integer representing face value (1-13)
	//		suit:	integer representing suit value (1-4)
	//	 Static constants (1 set for all card objects)
	//		SUITS   Highest integer value to generate for a suit (number of suits)
	//      FACES   Highest integer value to generate for a face (number of faces in a suit)
	//
	//      Suits can be 1=Hearts, 2=Diamonds, 3= Clubs, 4 = Spades
	//      Faces can be 1=Ace, 2-10 as is, 11=Jack, 12=Queen, 13=King
	//***********************************************************************************

	private int face, suit;
	private static final int SUITS = 4;
	private static final int FACES = 13;

	//***********************************************************************************
	//  Constructors
	//***********************************************************************************

	public Card()
	{
		//--------------------------------------
		//  Default constructor.  Generates a random card.
		//--------------------------------------
		Random gen = new Random();
		face = gen.nextInt(FACES) + 1;
		suit = gen.nextInt(SUITS) + 1;
	}

	public Card(int face, int suit)
	{
		//--------------------------------------
		//  A second constructor for setting a card's value when instantiated
		//--------------------------------------
		if (face > 0) {
		    this.face = face;
                } else {
                    this.face = 0;
                }
		if (suit > 0) {
		    this.suit = suit;
                } else {
                    this.suit = 0;
                }
	}
	
	public int getFace() {
	    return face;
        }

        public int getSuit() {
            return suit;
        }
        
        //***********************************************************************************
	//  Mutators for suit and face
	//***********************************************************************************

	public void setFace(int face)
		{	if (face > 0) {
		    this.face = face;
                } }

	public void setSuit(int suit)
		{	if (suit > 0) {
		    this.suit = suit;
                } }

	//***********************************************************************************
	//  getPoints() returns a point value for a card.
	//  Ace = 11, 2-10 as is, and face cards count as 10.
	//***********************************************************************************

	public int getPoints()
	{   int points = 0;
		switch (face)
		{	case 2: case 3:
			case 4: case 5: case 6:
			case 7: case 8: case 9:
				points = face;
				break;
			case 1:
			    points = 11;
			    break;
			default:
				points = 10;
			}
		return points;
	}


 	public String toString()
	{	String faceString, suitString;
		switch (face)
		{	case 10: case 2: case 3:
			case 4: case 5: case 6:
			case 7: case 8: case 9:
				faceString = Integer.toString(face);
				break;
			case 1:
				faceString = "Ace"; break;
			case 11:
				faceString = "Jack"; break;
			case 12:
				faceString = "Queen"; break;
			case 13:
				faceString = "King"; break;
			default:
				faceString = "Unknown face value";
			}
		switch (suit)
		{	case 1:
				suitString = "Hearts"; break;
			case 2:
				suitString = "Diamonds"; break;
			case 3:
				suitString = "Clubs"; break;
			case 4:
				suitString = "Spades"; break;
			default:
				suitString = "Unknown suit";
			}

		return (faceString + " of " + suitString);
	}
}