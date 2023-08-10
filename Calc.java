public class Calc 
{
    private int result;
    public int sum(int n1,int n2)
    {
    	result=n1+n2;
    	return result;
    }
    public int minus(int n1,int n2)
    {
    	result=n1-n2;
    	return result;
    }
    public int div(int n1,int n2)
    {
    	result=n1/n2;
    	return result;
    }
    public int mod(int n1,int n2)
    {
        result=n1%n2;
        return result;
    }
    public static void main(String[] args) {
    	Calc obj=new Calc();
    	System.out.println(obj.sum(10,20));
    }
}