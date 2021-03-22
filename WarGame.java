
public class WarGame {

	public static void main(String[] args) {
        System.out.println("War Game Started");
        Deck d=new Deck();
        Player player1=new Player();
        Player player2=new Player();
       
        d.shuffle();
        int x;
        System.out.println("The Cards are being Shuffled and distributed amoung two Players!");
        for(int i=0; i<52;i++)
        {
            x=i;
            String temp=d.draw(i);
            
            if((x%2)==0)
            {
                System.out.println("-----------------------------");

                player1.hand[i]=temp;
                System.out.println("Player1: "+ player1.hand[i]);  
            }
            else
            {
               player2.hand[i]=temp;
             System.out.println("Player2: "+ player2.hand[i]);
             System.out.println("-----------------------------");
            }
              
        }
        
       player1.set();
       player2.set();

        System.out.println("The Cards of Player 1 (This information is shown for user's convience, but should be hidden)");
        for(int i=0; i<26;i++)
        {
            System.out.println(player1.handplayer[i]);
        }
         System.out.println("\n------------------------------------------");

        System.out.println("The Cards of Player 2 (This information is shown for user's convience, but should be hidden)");
        for(int i=0; i<26;i++)
        {
            System.out.println(player2.handplayer[i]);
        }
         System.out.println("\n");
        
        System.out.println("Cards are being Flipped and shown\n");
        System.out.println("The Score is being Calculated");
        for(int i=0; i<26;i++)
        {
           

            if(player1.flip(i)>player2.flip(i))
            {
             
                player1.incrementScore();
            }
            else if(player1.flip(i)< player2.flip(i))
            {
                player2.incrementScore();
            }
            else if(player1.flip(i)==player2.flip(i))
            {
                player1.incrementScore();
                player2.incrementScore();

            }
            
      }
        System.out.println("The Score of Player 1 is "+player1.score);
        System.out.println("The Score of Player 2 is "+player2.score);

        
        if(player1.score>player2.score)
        {
            System.out.println("Player 1 wins");
        }
        else  if(player1.score<player2.score)
        {
            System.out.println("Player 2 wins");
        }
        else if(player1.score==player2.score)
        {
            System.out.println("Match Draws");
        }

    }

}
