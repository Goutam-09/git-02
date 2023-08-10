class Merge2DArray
{
	public static void main(String[] args) 
	{
	  int a[][]={{2,3,4,5,6},{7,6,5,4,3}};
	  int b[][]={{1,2,3,4,5,6,7,8},{5,3,23,6,78}};
	  int m=a[0].length;
	  int n=b[0].length;

	  int arr[][]=new int[2][m+n];
	  
	  for(int i=0;i<arr.length;i++)
	  {
	  	  for(int j=0;j<n+m;j++)
	  	  {
	  	  	if(j<m){
	  	  	(arr[i][j])=a[i][j];	
	  	  	}
	  	  	else
	  	  	 (arr[i][j])=b[i][j-m];
	  	  }
	  }
	  for(int i=0;i<arr.length;i++)
	  {
	  	  for(int j=0;j<arr[i].length;j++)
	  	  {
	  	  	System.out.print(arr[i][j]+" "); 	
	  	  }
	  	  System.out.println();
	  }		
	}
}