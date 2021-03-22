
public class Card {
	public int value;
    public String[] name={"Ace of Spades", "Ace of Hearts","Ace of Diamonds", "Ace of Clubs",
    "King of Spades", "King of Hearts","King of Diamonds", "King of Clubs",
    "Queen of Spades", "Queen of Hearts","Queen of Diamonds", "Queen of Clubs",
    "Jack of Spades", "Jack of Hearts","Jack of Diamonds", "Jack of Clubs",
    "Ten of Spades", "Ten of Hearts","Ten of Diamonds", "Ten of Clubs",
    "Nine of Spades", "Nine of Hearts","Nine of Diamonds", "Nine of Clubs",
    "Eight of Spades", "Eight of Hearts","Eight of Diamonds", "Eight of Clubs",
    "Seven of Spades", "Seven of Hearts","Seven of Diamonds", "Seven of Clubs",
    "Six of Spades", "Six of Hearts","Six of Diamonds", "Six of Clubs",
    "Five of Spades", "Five of Hearts","Five of Diamonds", "Five of Clubs",
    "Four of Spades", "Four of Hearts","Four of Diamonds", "Four of Clubs",
    "Three of Spades", "Three of Hearts","Three of Diamonds", "Three of Clubs",
    "Two of Spades", "Two of Hearts","Two of Diamonds", "Two of Clubs"};
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

        
    public void describe()
    {
        System.out.println("The card is "+ value+".");
    }
    
   
}
