
public class Player {
	public String[] hand;
    public String[] handplayer;

    public int score;
    public String name;
     Card c=new Card();

    public Player() {
        
       hand = new String[52];
       handplayer = new String[26];

        score=0;

    }
    
    public void describe()
    {
        System.out.println("Information of Player:\nName: "+name+" Score: "+score);
    }
    
    public int flip(int i) {
        String rmv=handplayer[i];
        if(rmv.contains("Ace"))
        {
           c.value=14;
        }
        else if(rmv.contains("King"))
        {
           c.value=13;
        }
        else if(rmv.contains("Queen"))
        {
           c.value=12;
        }
        else if(rmv.contains("Jack"))
        {
           c.value=11;
        }
        else if(rmv.contains("Ten"))
        {
           c.value=10;
        }
        else if(rmv.contains("Nine"))
        {
           c.value=9;
        }
        else if(rmv.contains("Eight"))
        {
           c.value=8;
        }
        else if(rmv.contains("Seven"))
        {
           c.value=7;
        }
        else if(rmv.contains("Six"))
        {
           c.value=6;
        }
        else if(rmv.contains("Five"))
        {
           c.value=5;
        }
        else if(rmv.contains("Four"))
        {
           c.value=4;
        }
        else if(rmv.contains("Three"))
        {
           c.value=3;
        }
        else if(rmv.contains("Two"))
        {
           c.value=2;
        }
        
      return c.value;  
    }
   
  public void set()
  {
      int x=0;
      for(int i=0;i<52;i++)
      {
          if(hand[i]==null)
          {
          }
          else
          {
              handplayer[x]=hand[i];
              x++;
          }
      }
     
  }
   
    public void incrementScore()
    {
        score=score+1;
    }
    
}
