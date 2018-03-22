import cards.domain.PlayingCard;
public class TestPlayingCard
{
	public static void main(String[]args)
	{
		PlayingCard card1=new PlayingCard(PlayingCard.SUIT_SPADES,2);
		System.out.println("card1 is th "+card1.getRank()+ "of "+card1.getSuitName());
		
		//Here you can create duplicate cards also -- no security
		PlayingCard card2=new PlayingCard(47,2);
		System.out.println("card2 is th "+card2.getRank()+ "of "+card2.getSuitName());
	}
}
	