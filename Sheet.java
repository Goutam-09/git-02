class Jcp302{

    void m1(Object o){

    System.out.println("OBJECT");

    }

    void m1(A ob){

    System.out.println("A");

    }

    void m1(B ob){

    System.out.println("B");

    }

    void m1(C ob){

    System.out.println("C");

    }

    void m1(D ob){

    System.out.println("D");

    }

    public static void main(String[] args) {

    new Jcp302().m1(null);

    System.out.println("Hello World!\t");

    }

    }

    class A

    {

    };

    class B extends A

    {

    };

    class C extends B

    {

    };

    class D extends B

    {

    };