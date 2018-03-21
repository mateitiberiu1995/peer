import java.util.Random;
public class Rock
{
	//private int move;
	private int PlayerWins=0;
	private int computerWins=0;
	private int Draws=0;
	private int numberGames=0;
	private int ChooseRock=0;
	private int ChoosePaper=0;
	private int ChooseScissors=0;
	private int playerRock=0;
	private int playerPaper=0;
	private int playerScissors=0;
	private Random rand = new Random();
	public String computersMove()
	{
		int random = rand.nextInt(3)+1;
		switch(random)
		{
		case 1:
			numberGames++;
			ChoosePaper++;
			return "Paper";
			//break;
		case 2:
			numberGames++;
			ChooseRock++;
			return "Rock";
		case 3:
			numberGames++;
			ChooseScissors++;
			return "Scissors";
			
		}
		return "ceva";
	}
	public void whoWon(String player,String computer)
	{
		switch(player)
		{
		case "paper":
			playerPaper++;
			if(computer=="Rock")
			{
				PlayerWins++;
				printMe(1);
			}
			if(computer=="Paper")
			{
				Draws++;
				printMe(2);
			}
			else
				if(computer=="Scissors")
				{
					computerWins++;
					printMe(3);
				}
			break;
		case "Paper":
			playerPaper++;
			if(computer=="Rock")
			{
				PlayerWins++;
				printMe(1);
			}
			if(computer=="Paper")
			{
				Draws++;
				printMe(2);
			}
			else
				if(computer=="Scissors")
				{
					computerWins++;
					printMe(3);
				}
			break;
		case "rock":
			playerRock++;
			if(computer=="Rock")
			{
				Draws++;
				printMe(4);
			}
			if(computer=="Paper")
			{
				computerWins++;
				printMe(5);
			}
			else
				if(computer=="Scissors")
				{
					PlayerWins++;
					printMe(6);
				}
			break;
		case "Rock":
			playerRock++;
			if(computer=="Rock")
			{
				Draws++;
				printMe(4);
			}
			if(computer=="Paper")
			{
				computerWins++;
				printMe(5);
			}
			else
				if(computer=="Scissors")
				{
					PlayerWins++;
					printMe(6);
				}
			break;
		case "scissors":
			playerScissors++;
			if(computer=="Rock")
			{
				computerWins++;
				printMe(7);
			}
			if(computer=="Paper")
			{
				PlayerWins++;
				printMe(8);
			}
			else
				if(computer=="Scissors")
				{
					Draws++;
					printMe(9);
				}
			break;
		case "Scissors":
			playerScissors++;
			if(computer=="Rock")
			{
				computerWins++;
				printMe(7);
			}
			if(computer=="Paper")
			{
				PlayerWins++;
				printMe(8);
			}
			else
				if(computer=="Scissors")
				{
					Draws++;
					printMe(9);
				}
			break;
		}
		//System.out.println(player);
	}
	public void printMe(int cases)
	{
		switch(cases)
		{
		case 1:
			System.out.println("Player picks: Paper");
			System.out.println("Computer picks: Rock");
			System.out.println("Paper covers rock. Player wins!");
			break;
		case 2:
			System.out.println("Player picks: Paper");
			System.out.println("Computer picks: Paper");
			System.out.println("Paper clash Paper. It's a draw!");
			break;
		case 3:
			System.out.println("Player picks: Paper");
			System.out.println("Computer picks: Scissors");
			System.out.println("Scissors cuts Paper. Computer wins!");
			break;
		case 4:
			System.out.println("Player picks: Rock");
			System.out.println("Computer picks: Rock");
			System.out.println("Rock hits Rock. It's a draw!");
			break;
		case 5:
			System.out.println("Player picks: Rock");
			System.out.println("Computer picks: Paper");
			System.out.println("Paper covers Rock. Computer Wins!");
			break;
		case 6:
			System.out.println("Player picks: Rock");
			System.out.println("Computer picks: Scissors");
			System.out.println("Rock destroys Scissors. Player wins!");
			break;
		case 7:
			System.out.println("Player picks: Scissors");
			System.out.println("Computer picks: Rock");
			System.out.println("Rock destroys Scissors. Computer wins!");
			break;
		case 8:
			System.out.println("Player picks: Scissors");
			System.out.println("Computer picks: Paper");
			System.out.println("Scissors cuts Paper. Player wins!");
			break;
		case 9:
			System.out.println("Player picks: Scissors");
			System.out.println("Computer picks: Scissors");
			System.out.println("Scissors scissors Scissors. It's a draw!");
			break;
		}
	}
	public int getWins()
	{
		if(PlayerWins>=computerWins)
			return PlayerWins;
		else
			return computerWins;
	}
	public void finalStats()
	{
		System.out.println("Total Games played: " + numberGames);
		float f1 = ((float)computerWins/(float)numberGames);
		int percentage = (int) Math.ceil(f1* 100);
		System.out.println("Number of times Computer Won: " + computerWins + " times  " + percentage + "%");
		f1 = ((float)PlayerWins/(float)numberGames);
		percentage = (int) Math.ceil(f1* 100);
		System.out.println("Number of times Player Won: " + PlayerWins + " times  " + percentage + "%");
		f1 = ((float)Draws/(float)numberGames);
		percentage = (int) Math.ceil(f1* 100);
		System.out.println("Number of Draws: " + Draws + " times  " + percentage + "%");
		if(ChooseRock>=ChoosePaper && ChooseRock>=ChooseScissors)
		{
			f1 = ((float)ChooseRock/(float)numberGames);
			percentage = (int) Math.ceil(f1* 100);
			System.out.println("Most common picked for Computer is Rock: " + ChooseRock + " times  " + percentage + "%");
		}
		else
			if(ChoosePaper>=ChooseRock && ChoosePaper>=ChooseScissors)
			{
				f1 = ((float)ChoosePaper/(float)numberGames);
				percentage = (int) Math.ceil(f1* 100);
				System.out.println("Most common picked for Computer is Paper: " + ChoosePaper + " times  " + percentage + "%");
			}
			else
			{
				f1 = ((float)ChooseScissors/(float)numberGames);
				percentage = (int) Math.ceil(f1* 100);
				System.out.println("Most common picked for Computer is Scissors: " + ChooseScissors + " times  " + percentage + "%");
			}
		if(playerRock>=playerPaper && playerRock>=playerScissors)
		{
			f1 = ((float)playerRock/(float)numberGames);
			percentage = (int) Math.ceil(f1* 100);
			System.out.println("Most common picked for Player is Rock: " + playerRock + " times  " + percentage + "%");
		}
		else
			if(playerPaper>=playerRock && playerPaper>=playerScissors)
			{
				f1 = ((float)playerPaper/(float)numberGames);
				percentage = (int) Math.ceil(f1* 100);
				System.out.println("Most common picked for Player is Paper: " + playerPaper + " times  " + percentage + "%");
			}
			else
			{
				f1 = ((float)playerScissors/(float)numberGames);
				percentage = (int) Math.ceil(f1* 100);
				System.out.println("Most common picked for Player is Scissors: " + playerScissors + " times  " + percentage + "%");
			}
			
	
	}
}