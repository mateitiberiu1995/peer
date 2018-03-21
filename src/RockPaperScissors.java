import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.*;
import java.awt.Toolkit;
import java.io.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashMap<String, String> map = new HashMap<>();
		try{
		FileInputStream fstream = new FileInputStream("textfile.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		String strLine;
		String message=null;
		//String something;
		//Loop through and check if a header or footer line, if not
		//equate a substring to a temp variable and print it....
		map=initialize(map);
		while ((strLine = br.readLine()) != null)   
		{
		  for(int i=0;i<strLine.length();i++)
		  {
			  //something=strLine.charAt(i);
			  if(strLine.charAt(i)!=' ')
			  {
				  if(strLine.charAt(i)=='.')
				  {
					  beep();
					  TimeUnit.SECONDS.sleep(1);
				  }
				  
				  message= message + strLine.charAt(i);
				  //System.out.println(message);
			  }
			  else
			  {
				  System.out.print(map.get(message));
				  message=null;
				  
			  }
			  if(message=="null")
			  {
				  System.out.print(" ");
			  }
		  }
		}
		//Close the input stream
		br.close();
		} catch (Exception e) {
		  e.printStackTrace();
		}
		
		
		
		//System.out.println(recursiveMethod("hellollll"));*/
		int length=5;
		int grid[][]=new int[100][100];
		grid=spiral(grid,0,0,1,length);
		//if(length%2==1)
		//{
			//grid[length/2][length/2]=length*length;
		//}
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				System.out.print("     " + grid[i][j]+"          ");
			}
			System.out.println();
		}
		 
	}
		

	public static int[][] spiral(int[][] grid , int i, int j, int counter,int length)
	{
		int until=i;
		for(;j<length-1;j++)
		{
			grid[i][j]=counter;
			counter++;
		}
		for(;i<length-1;i++)
		{
			grid[i][j]=counter;
			counter++;
		}
		for(;j>until;j--)
		{
			grid[i][j]=counter;
			counter++;
		}
		for(;i>until;i--)
		{
			grid[i][j]=counter;
			counter++;
		}
		if(length-1>=until+1)
		grid=spiral(grid,until+1,until+1,counter,length-1);
		return grid;
	}
	public static String recursiveMethod(String sentence)
	{
		for(int i=0;i<sentence.length()-1;i++)
		{
			if(sentence.charAt(i)==sentence.charAt(i+1))
			{
				sentence = sentence.substring(0, i+1) + '-'+recursiveMethod(sentence.substring(i+1, sentence.length()));
			}
		}
		return sentence;
	}
	public static void beep()
	{
		Toolkit.getDefaultToolkit().beep();
	}
	public static HashMap<String, String> initialize(HashMap<String, String> map)
	{
		map.put("null.-", "A");
		map.put("null-...", "B");
		map.put("null-.-.", "C");
		map.put("null-..", "D");
		map.put("null.", "E");
		map.put("null..-.", "F");
		map.put("null--.", "G");
		map.put("null....", "H");
		map.put("null..", "I");
		map.put("null.---", "J");
		map.put("null-.-", "K");
		map.put("null.-..", "L");
		map.put("null--", "M");
		map.put("null-.", "N");
		map.put("null---", "O");
		map.put("null.--.", "P");
		map.put("null--.-", "Q");
		map.put("null.-.", "R");
		map.put("null...", "S");
		map.put("null-", "T");
		map.put("null..-", "U");
		map.put("null...-", "V");
		map.put("null.--", "W");
		map.put("null-..-", "X");
		map.put("null-.--", "Y");
		map.put("null--..", "Z");
		map.put("null.----", "1");
		map.put("null..---", "2");
		map.put("null...--", "3");
		map.put("null....-", "4");
		map.put("null.....", "5");
		map.put("null-....", "6");
		map.put("null--...", "7");
		map.put("null---..", "8");
		map.put("null----.", "9");
		map.put("null-----", "0");
		map.put("null/", " ");
		return map;
	}

}
///ROCK PAPER SCISSORS
/*Scanner input = new Scanner(System.in);
String playerMove;
Rock Game=new Rock();
//Game.whoWon("paper", Game.computersMove());
playerMove=input.nextLine();
while(Game.getWins()<=10)
{
	
	Game.whoWon(playerMove, Game.computersMove());
	playerMove=input.nextLine();

}
Game.finalStats();
input.close();*/

///HASHMAP
/*HashMap<String, String> map = new HashMap<>();
try{
FileInputStream fstream = new FileInputStream("textfile.txt");
BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
String strLine;
String message=null;
//String something;
//Loop through and check if a header or footer line, if not
//equate a substring to a temp variable and print it....
map=initialize(map);
while ((strLine = br.readLine()) != null)   
{
  for(int i=0;i<strLine.length();i++)
  {
	  //something=strLine.charAt(i);
	  if(strLine.charAt(i)!=' ')
	  {
		  message= message + strLine.charAt(i);
		  //System.out.println(message);
	  }
	  else
	  {
		  System.out.print(map.get(message));
		  message=null;
		  
	  }
	  if(message=="null")
	  {
		  System.out.print(" ");
	  }
  }
}
//Close the input stream
br.close();
} catch (Exception e) {
  e.printStackTrace();
}*/