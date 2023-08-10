import java.util.Scanner;
class Qparameter
{
	String ques,qno,opt1,opt2,opt3,opt4;
	int userans,ans;
}
class Question
{
	Qparameter que[];
	int qcount;
	Question()
	{
		que = new Qparameter[5];
		qcount = -1;
	}
	public void getQ()
	{
		/*1._____________________________________________________________________________*/
		Qparameter q = new Qparameter();
		q = new Qparameter();
		q.qno = "Q.1";
		q.ques = "Automatic type conversion is possible in which of the possible cases ?";
		q.opt1 = "Byte to int";
		q.opt2 = "Int to long";
		q.opt3 = "Long to int";
		q.opt4 = "Short to int";
		q.ans = 2;
		que[++qcount] = q;
		/*3_______________________________________________________________________________*/
		q = new Qparameter();
		q.qno = "Q.2";
		q.ques = "When an array is passed to a method, what does the method receive ?";
		q.opt1 = "The reference of the array";
		q.opt2 = "A copy of the array";
		q.opt3 = "Length of the array";
		q.opt4 = "Copy of first element";
		q.ans = 1;
		que[++qcount] = q;
		/*3_______________________________________________________________________________*/
		q = new Qparameter();
		q.qno = "Q.3";
		q.ques = "Arrays in java are........";
		q.opt1 = "Object references";
		q.opt2 = "objects";
		q.opt3 = "Primitive data type";
		q.opt4 = "None";
		q.ans = 2;
		que[++qcount] = q;
		/*3_______________________________________________________________________________*/
		q = new Qparameter();
		q.qno = "Q.4";
		q.ques = "When is the object created with new keyword ?";
		q.opt1 = "Depends on the code";
		q.opt2 = "At compile time";
		q.opt3 = "At run time";
		q.opt4 = "None";
		q.ans = 3;
		que[++qcount] = q;
		/*3_______________________________________________________________________________*/
		q = new Qparameter();
		q.qno = "Q.5";
		q.ques = "Identify the corrected definition of a package ?";
		q.opt1 = "A package is a collection of editing tools";
		q.opt2 = "A package is a collection of classes";
		q.opt3 = "A package is a collection of classes and interfaces";
		q.opt4 = "A package is a collection of interfaces";
		q.ans = 4;
		que[++qcount] = q;
	}
	public void showQ()
	{
		getQ();
		int o,i=0;;
		char ch;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println(que[i].qno+". "+que[i].ques);
			System.out.println("A. "+que[i].opt1);
			System.out.println("B. "+que[i].opt2);
			System.out.println("C. "+que[i].opt3);
			System.out.println("D. "+que[i].opt4);
			if(que[i].userans!=0)
				System.out.println("Your Answer: "+que[i].userans);
			System.out.print("Enter your answer: ");
			try{
				  o = sc.nextInt();
				  que[i].userans= o;
			}
			catch (Exception e){}
			System.out.println("For Previous press(P)              For Next press(N)               For Submit press(S)");
			ch = sc.next().charAt(0);
			if(ch=='P'||ch=='p')
			{
				if(i!=0)
				i--;
			}
			else if(ch=='N'||ch=='n')
			{
				if(i!=qcount)
				i++;
		    }
			else if(ch=='S'||ch=='s')
			{
				if(i==qcount)
				{
					submit();
					break;
				}
			}
		}
	}
	public void submit()
	{
		int ra=0,wa=0,na=0;
		for(int i=0;i<=qcount;i++)
		{
			if(que[i].ans==que[i].userans)
				ra++;
			if(que[i].ans!=que[i].userans)
				wa++;
			else if(que[i].userans==0)
				na++;
		}
		System.out.println("Rigth Answer: "+ra);
		System.out.println("Wrong Answer: "+wa);
		System.out.println("Not Attemped: "+na);
		System.exit(0);
	}
}
class Quiz1
{
	public static void main(String[] args) 
	{
		Question obj = new Question();
		obj.showQ();	
	}
}