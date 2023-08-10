import java.util.*;
class TicTacToe
{
	static char user='X';
	static char pos[]=new char[9];
	static int userCheck[]={2,2,2,2,2,2,2,2,2};
	static int winningPos[][]={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
	static boolean isActive = true;
	public static void draw()
	{
		System.out.println("__________");
		for(int i=0;i<9;i+=3)
		{
			System.out.println(pos[i]+" | "+pos[i+1]+" | "+pos[i+2]);
			System.out.println("__________");
		}
	}
	public static void checkWinnning()
	{
		for(int i[]:winningPos)
		{
			if(userCheck[i[0]]==userCheck[i[1]]&&userCheck[i[0]]==userCheck[i[2]] &&userCheck[i[0]]!=2)
			{
				draw();
				System.out.println(user+" is Winner");
				isActive = false;
			}
		}
	}
	public static void play()
	{
		System.out.println(user +" your turn !");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		if(userCheck[userInput-1]==2)
		{
			userCheck[userInput-1]=user=='O'?0:1;
			pos[userInput-1]=user;
			checkWinnning();
			user=user=='O'?'X':'O';
		}
	}
	public static void main(String[] args) 
	{ 
		int c=0;
		while(isActive)
		{
			draw();

			if(c>8)
			{
			 System.out.println("Match tie !");
			 break;
			}
			else 
			{
				play();
				c++;
			}
		}
	}
}