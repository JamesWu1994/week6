import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	 public String[] cards;

	    public Deck() {
	        
	        Card card=new Card();
	       
	        cards=card.name;
	    }
	    
	    public void shuffle()
	    {

			List<String> intList = Arrays.asList(cards);

			Collections.shuffle(intList);

			intList.toArray(cards);

	    }
	public String draw(int i) {
	        return cards[i];
	    }
}
