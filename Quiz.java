import java.util.Scanner;
class Ques
{
	String qno;
	String ques;
	String opt1,opt2,opt3,opt4;
	int ans,userAns;
}
class Qustion
{
	Ques que[];
	int qcount;
	Qustion()
	{
		que = new Ques[5];
		qcount = -1;
		getQ();
	}
	public void result()
	{
		int ra = 0,wa = 0,na = 0;
		for(int i=0;i<=qcount;i++)
		{
			if(que[i].userAns==0)
				na++;
			if(que[i].ans==que[i].userAns)
				ra++;
			else 
				wa++;
		}
		System.out.println("Right Answer: "+ra);
		System.out.println("Wrong Answer: "+wa);
		System.out.println("Not Attemp: "+na);
	}
	public void getQ()
	{
		/*1____________________________________________________________________________*/
		Ques q = new Ques();
		q.qno = "Q.1";
		q.ques = "Which member of parent class is not visible in child class ?";
		q.opt1 = "Public";
		q.opt2 = "Protected";
		q.opt3 = "Private";
		q.opt4 = "default";
		q.ans = 3;
		que[++qcount] = q;
		/*2____________________________________________________________________________*/
		 q = new Ques();
		q.qno = "Q.2";
		q.ques = "How many Primitive Data types Are there in java ?";
		q.opt1 = "4";
		q.opt2 = "8";
		q.opt3 = "6";
		q.opt4 = "9";
		q.ans = 2;
		que[++qcount] = q;
		/*3____________________________________________________________________________*/
		 q = new Ques();
		q.qno = "Q.3";
		q.ques = "Which type of method is mendetory in java ?";
		q.opt1 = "mian method";
		q.opt2 = "main method";
		q.opt3 = "main()";
		q.opt4 = "Both B and C";
		q.ans = 3;
		que[++qcount] = q;
		/*4____________________________________________________________________________*/
		 q = new Ques();
		q.qno = "Q.4";
		q.ques = "Can java Support multiple inheritance ?";
		q.opt1 = "Yes";
		q.opt2 = "No";
		q.opt3 = "Both A and B";
		q.opt4 = "No but Yes";
		q.ans = 4;
		que[++qcount] = q;
		/*5____________________________________________________________________________*/
		 q = new Ques();
		q.qno = "Q.5";
		q.ques = "Can we access non static member from static area ?";
		q.opt1 = "Yes by creating object of class";
		q.opt2 = "No";
		q.opt3 = "Yes we can access without creating object";
		q.opt4 = "None of this";
		q.ans = 1;
		que[++qcount] = q;
	} 
	public void showQ()
	{
		int qno=0;
		char ch;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int i=0;
			System.out.println(que[qno].qno+". "+que[qno].ques);
			System.out.println("A. "+que[qno].opt1);
			System.out.println("B. "+que[qno].opt2);
			System.out.println("C. "+que[qno].opt3);
			System.out.println("D. "+que[qno].opt4);
			if(que[qno].userAns!=0)
				System.out.println("Your Answer: "+que[qno].userAns);
			System.out.println("Enter your choice");
			try{
				i=sc.nextInt();
				que[qno].userAns = i;
			}
			catch(Exception e){}
			System.out.println("For Previous press(P)                For Next press(N)                  For Submit press(S)");
			ch=sc.next().charAt(0);
			if(ch=='P'||ch=='p')
			{
				if(qno!=0)
					qno--;
			}
			else if(ch=='N'||ch=='n')
			{
				if(qno!=qcount)
					qno++;
			}
			else if(ch=='S'||ch=='s')
			{
				result();
				break;
			}
		}
	}
}
class Quiz
{
	public static void main(String[] args) 
	{
		Qustion obj = new Qustion();
		obj.showQ();

	}
}