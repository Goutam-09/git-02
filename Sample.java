class Sample{

  static void m1(int a[]){

       System.out.print(" int...");

     } 

     static void m1(int a[]){

       System.out.print(" array");

     }   

     public static void main(String[] args){

      int ar[]={10,20};
       m1(10,20);
       m1(ar);
      }

     }
  