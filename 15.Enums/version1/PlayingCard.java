package cards.domain;
public class PlayingCard
{
	public static final int SUIT_SPADES=0;
	public static final int SUIT_HEARTS=0;
	public static final int SUIT_CLUBS=0;
	public static final int SUIT_DIAMONDS=0;
	
	private int suit;
	private int rank;
	
	public PlayingCard(int suit,int rank)
	{
		this.suit=suit;
		this.rank=rank;
	}
	
	public int getSuit()
	{
		return suit;
	}
	
	public String getSiteName()
	{
		String name="";
		switch(suit)
		{
			case SUIT_SPADES:
				name="spades";
				break;
			
			case SUIT_HEARTS:
				name="hearts";
				break;
			
			case SUIT_CLUBS:
				name="clubs";
				break;				
			
			case SUIT_DIAMONDS:
				name="diamonds";
				break;
				
			default:
				System.out.println("Invalid suit");
				break;
		}
		return name;	
	}
	
	public int getRank()
	{
		return rank;
	}
}	